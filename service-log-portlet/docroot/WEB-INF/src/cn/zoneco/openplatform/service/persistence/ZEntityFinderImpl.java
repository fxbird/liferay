package cn.zoneco.openplatform.service.persistence;

import com.liferay.ext.db.PaginationDataSet;
import com.liferay.ext.db.RowHandler;
import com.liferay.ext.db.SqlExecutor;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.liferay.portal.kernel.dao.orm.Type;

public class ZEntityFinderImpl extends BasePersistenceImpl implements ZEntityFinder{
    private static Log log = LogFactoryUtil.getLog(ZEntityFinderImpl.class);

    public Object process(Object executor) throws Exception {
    	SqlExecutor  sqlExecutor=null;
        try{
            sqlExecutor = (SqlExecutor)executor;
            sqlExecutor.setDialect(getDialect());
            sqlExecutor.setSession(openSession());
            return sqlExecutor.process();
        } catch (Exception e) {
            throw e;
        } finally {
            closeSession(sqlExecutor.getSession());
        }

    }

    public Object queryFirstRecord(String sql, String description ,Object rowHandler) throws Exception {
        checkDescription(description);

        Session session = null;
        try {
            log.debug("------query sql of '"+description+"'------\n"+sql);
            session = openSession();
            SQLQuery q = session.createSQLQuery(sql);

            q.setCacheable(false);

            List<Object[]> recordList = (List<Object[]>) QueryUtil.list(q, getDialect(), -1, -1);
            if (recordList.size()>0){
                return ((RowHandler)rowHandler).handle(recordList.get(0));
            } else{
                return null;
            }

        } catch (Exception e) {
            log.error(e);
            throw e;
        } finally {
            closeSession(session);
        }
    }
    
    public List queryList(String sql, String description ,int start, int end,Object rowHandler) throws Exception {
    	checkDescription(description);
    	
    	Session session = null;
        try {
            log.debug("------query sql of '"+description+"'------\n"+sql);
            session = openSession();
            SQLQuery q = session.createSQLQuery(sql);

            q.setCacheable(false);
            
            List<Object[]> recordList = (List<Object[]>) QueryUtil.list(q, getDialect(), start, end);
            List results = new ArrayList();
            
            for (Object[] record : recordList) {
				results.add(((RowHandler)rowHandler).handle(record));
			}
            
            return  results;
           
        } catch (Exception e) {
        	log.error(e);
            throw e;
        } finally {
            closeSession(session);
        }
    	
    }

    public Object queryPaginatedData(String sql, String description ,int start, int end,Object rowHandler) throws Exception {
        PaginationDataSet paginationDataSet=new PaginationDataSet();
        paginationDataSet.setPagedDataList(queryList(sql,description,start,end,rowHandler));
        paginationDataSet.setRecordCount(getRecordCount(sql,description));

        return paginationDataSet;
    }

    public int update(String sql, String description) throws Exception{
    	checkDescription(description);
    	
    	Session session = null;
        try {
            log.debug("------update sql of '"+description+"'------\n"+sql);
            session = openSession();
            SQLQuery q = session.createSQLQuery(sql);

            q.setCacheable(false);

            return  q.executeUpdate();
           
        } catch (Exception e) {
        	log.error(e);
            throw e;
        } finally {
            closeSession(session);
        }
    }
    

    public int getRecordCount(String sql,String description) throws Exception{
    	checkDescription(description);
    	
        Session session = null;
        try {
            session = openSession();
            String finalSql = "select count(*) cnt from (" + sql + ") d";
            log.debug("------count sql of '"+description+"'-------\n"+finalSql);
            SQLQuery q = session.createSQLQuery(finalSql);
            q.setCacheable(false);
            q.addScalar("cnt", Type.INTEGER);

            Iterator<Integer> itr = q.iterate();

            if (itr.hasNext()) {
                Integer count = itr.next();

                if (count != null) {
                    return count;
                }
            }

            return 0;
        } catch (Exception e) {
            throw e;
        } finally {
            closeSession(session);
        }
    }



    private void checkDescription(String description) {
		if (StringUtils.isEmpty(description)){
    		throw new IllegalArgumentException("Description can be empty!");
    	}
	}

}
