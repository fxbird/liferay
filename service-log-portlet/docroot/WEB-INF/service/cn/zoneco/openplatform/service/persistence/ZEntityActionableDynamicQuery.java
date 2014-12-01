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

package cn.zoneco.openplatform.service.persistence;

import cn.zoneco.openplatform.model.ZEntity;
import cn.zoneco.openplatform.service.ZEntityLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author fxbird
 * @generated
 */
public abstract class ZEntityActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public ZEntityActionableDynamicQuery() throws SystemException {
		setBaseLocalService(ZEntityLocalServiceUtil.getService());
		setClass(ZEntity.class);

		setClassLoader(cn.zoneco.openplatform.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("comId");
	}
}