package cn.zoneco.openplatform.bo;

import cn.zoneco.openplatform.model.CallLog;
import cn.zoneco.openplatform.model.impl.CallLogImpl;
import cn.zoneco.openplatform.service.ZEntityLocalServiceUtil;
import com.liferay.ext.db.BeanRowHandler;
import com.liferay.ext.db.PaginationDataSet;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import cn.zoneco.openplatform.model.bean.ServiceVO;

import java.util.List;

public class ServiceBO {
    private static Log log = LogFactoryUtil.getLog(ServiceBO.class);
    public static PaginationDataSet findServices(int start, int end) throws Exception {
        String sql="SELECT\n" +
                "    t_resource.resource_id,\n" +
                "    t_resource.resource_name,\n" +
                "    t_resource.resource_description,\n" +
                "    t_resource.apply_date,\n" +
                "    t_status.status_name\n" +
                "FROM\n" +
                "    t_resource\n" +
                "LEFT JOIN t_status ON t_resource.status_id = t_status.status_id";

        int count= ZEntityLocalServiceUtil.getRecordCount(sql, "query count of service");
        List<ServiceVO> serviceVOList=ZEntityLocalServiceUtil.queryList(sql,"query list of service",start,end,
              new BeanRowHandler("resourceId,resourceName,description,applyDate,statusName",ServiceVO.class)) ;
        PaginationDataSet pds=new PaginationDataSet();
        pds.setPagedDataList(serviceVOList);
        pds.setRecordCount(count);
        return pds;
    }

    public static ServiceVO findService(long resourceId) throws Exception {
        String sql="SELECT\n" +
                "    t_resource.resource_id,\n" +
                "    t_resource.resource_name,\n" +
                "    t_resource.resource_description,\n" +
                "    t_resource.apply_date,\n" +
                "    t_status.status_name\n" +
                "FROM\n" +
                "    t_resource\n" +
                "LEFT JOIN t_status ON t_resource.status_id = t_status.status_id\n"+
                "where t_resource.resource_id = "+resourceId;

        List<ServiceVO> serviceVOList=ZEntityLocalServiceUtil.queryList(sql,"query list of service",-1,-1,
                new BeanRowHandler("resourceId,resourceName,description,applyDate,statusName",ServiceVO.class)) ;

        if (serviceVOList.isEmpty()){
            return null;
        }else{
            return serviceVOList.get(0);
        }
    }


    public static PaginationDataSet findCallLogByResourceId(long resourceId,int start,int end) throws Exception {
        String sql="SELECT\n" +
                "    cl.start_time,\n" +
                "    cl.end_time,\n" +
                "    cl.in_msg,\n" +
                "    cl.out_msg,\n" +
                "    cl.log_status,\n" +
                "    cl.log_message\n" +
                "FROM\n" +
                "    t_log AS cl\n" +
                "WHERE\n" +
                "    cl.resource_id = "+resourceId;

        int count= ZEntityLocalServiceUtil.getRecordCount(sql,"query count of call log");
        List<CallLog> callLogs=ZEntityLocalServiceUtil.queryList(sql,"query list of call log",start,end,
                new BeanRowHandler("startTime,endTime,inMsg,outMsg,logStatus,logMessage",CallLogImpl.class)) ;

        PaginationDataSet pds=new PaginationDataSet();
        pds.setPagedDataList(callLogs);
        pds.setRecordCount(count);


        return pds;
    }
}
