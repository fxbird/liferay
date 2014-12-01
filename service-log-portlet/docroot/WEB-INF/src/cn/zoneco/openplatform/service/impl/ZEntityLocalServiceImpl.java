/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package cn.zoneco.openplatform.service.impl;

import cn.zoneco.openplatform.service.base.ZEntityLocalServiceBaseImpl;
import cn.zoneco.openplatform.service.persistence.ZEntityFinderUtil;
import com.liferay.ext.db.TransExecutor;

import java.util.List;

/**
 * The implementation of the z entity local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link cn.zoneco.openplatform.service.ZEntityLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author fxbird
 * @see cn.zoneco.openplatform.service.base.ZEntityLocalServiceBaseImpl
 * @see cn.zoneco.openplatform.service.ZEntityLocalServiceUtil
 */
public class ZEntityLocalServiceImpl extends ZEntityLocalServiceBaseImpl {
    public void doService(Object executor) throws Exception {
        ((TransExecutor) executor).execute();
    }

    public Object process(Object executor) throws Exception {
        return ZEntityFinderUtil.process(executor);
    }

    public Object queryFirstRecord(String sql, String description ,Object rowHandler) throws Exception {
        return ZEntityFinderUtil.queryFirstRecord(sql, description, rowHandler);
    }

    public List queryList(String sql, String description, int start, int end, Object rowHandler) throws Exception {
        return ZEntityFinderUtil.queryList(sql,description,start,end,rowHandler);
    }

    public int update(String sql, String description) throws Exception{
        return ZEntityFinderUtil.update(sql,description);
    }

    public int getRecordCount(String sql,String description) throws Exception{
        return ZEntityFinderUtil.getRecordCount(sql,description);
    }

    public Object queryPaginatedData(String sql, String description ,int start, int end,Object rowHandler) throws Exception {
        return ZEntityFinderUtil.queryPaginatedData(sql,description,start,end,rowHandler);
    }
}