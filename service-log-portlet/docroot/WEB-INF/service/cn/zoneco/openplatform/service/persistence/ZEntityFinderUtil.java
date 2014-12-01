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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author fxbird
 */
public class ZEntityFinderUtil {
	public static java.lang.Object process(java.lang.Object executor)
		throws java.lang.Exception {
		return getFinder().process(executor);
	}

	public static java.lang.Object queryFirstRecord(java.lang.String sql,
		java.lang.String description, java.lang.Object rowHandler)
		throws java.lang.Exception {
		return getFinder().queryFirstRecord(sql, description, rowHandler);
	}

	public static java.util.List queryList(java.lang.String sql,
		java.lang.String description, int start, int end,
		java.lang.Object rowHandler) throws java.lang.Exception {
		return getFinder().queryList(sql, description, start, end, rowHandler);
	}

	public static java.lang.Object queryPaginatedData(java.lang.String sql,
		java.lang.String description, int start, int end,
		java.lang.Object rowHandler) throws java.lang.Exception {
		return getFinder()
				   .queryPaginatedData(sql, description, start, end, rowHandler);
	}

	public static int update(java.lang.String sql, java.lang.String description)
		throws java.lang.Exception {
		return getFinder().update(sql, description);
	}

	public static int getRecordCount(java.lang.String sql,
		java.lang.String description) throws java.lang.Exception {
		return getFinder().getRecordCount(sql, description);
	}

	public static ZEntityFinder getFinder() {
		if (_finder == null) {
			_finder = (ZEntityFinder)PortletBeanLocatorUtil.locate(cn.zoneco.openplatform.service.ClpSerializer.getServletContextName(),
					ZEntityFinder.class.getName());

			ReferenceRegistry.registerReference(ZEntityFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ZEntityFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ZEntityFinderUtil.class, "_finder");
	}

	private static ZEntityFinder _finder;
}