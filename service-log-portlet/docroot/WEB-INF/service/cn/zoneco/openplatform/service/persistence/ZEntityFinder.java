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

/**
 * @author fxbird
 */
public interface ZEntityFinder {
	public java.lang.Object process(java.lang.Object executor)
		throws java.lang.Exception;

	public java.lang.Object queryFirstRecord(java.lang.String sql,
		java.lang.String description, java.lang.Object rowHandler)
		throws java.lang.Exception;

	public java.util.List queryList(java.lang.String sql,
		java.lang.String description, int start, int end,
		java.lang.Object rowHandler) throws java.lang.Exception;

	public java.lang.Object queryPaginatedData(java.lang.String sql,
		java.lang.String description, int start, int end,
		java.lang.Object rowHandler) throws java.lang.Exception;

	public int update(java.lang.String sql, java.lang.String description)
		throws java.lang.Exception;

	public int getRecordCount(java.lang.String sql, java.lang.String description)
		throws java.lang.Exception;
}