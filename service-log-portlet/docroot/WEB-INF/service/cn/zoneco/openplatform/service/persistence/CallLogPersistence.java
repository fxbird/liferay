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

import cn.zoneco.openplatform.model.CallLog;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the call log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see CallLogPersistenceImpl
 * @see CallLogUtil
 * @generated
 */
public interface CallLogPersistence extends BasePersistence<CallLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CallLogUtil} to access the call log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the call log in the entity cache if it is enabled.
	*
	* @param callLog the call log
	*/
	public void cacheResult(cn.zoneco.openplatform.model.CallLog callLog);

	/**
	* Caches the call logs in the entity cache if it is enabled.
	*
	* @param callLogs the call logs
	*/
	public void cacheResult(
		java.util.List<cn.zoneco.openplatform.model.CallLog> callLogs);

	/**
	* Creates a new call log with the primary key. Does not add the call log to the database.
	*
	* @param logId the primary key for the new call log
	* @return the new call log
	*/
	public cn.zoneco.openplatform.model.CallLog create(long logId);

	/**
	* Removes the call log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logId the primary key of the call log
	* @return the call log that was removed
	* @throws cn.zoneco.openplatform.NoSuchCallLogException if a call log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.CallLog remove(long logId)
		throws cn.zoneco.openplatform.NoSuchCallLogException,
			com.liferay.portal.kernel.exception.SystemException;

	public cn.zoneco.openplatform.model.CallLog updateImpl(
		cn.zoneco.openplatform.model.CallLog callLog)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the call log with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchCallLogException} if it could not be found.
	*
	* @param logId the primary key of the call log
	* @return the call log
	* @throws cn.zoneco.openplatform.NoSuchCallLogException if a call log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.CallLog findByPrimaryKey(long logId)
		throws cn.zoneco.openplatform.NoSuchCallLogException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the call log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param logId the primary key of the call log
	* @return the call log, or <code>null</code> if a call log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.CallLog fetchByPrimaryKey(long logId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the call logs.
	*
	* @return the call logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cn.zoneco.openplatform.model.CallLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the call logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CallLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of call logs
	* @param end the upper bound of the range of call logs (not inclusive)
	* @return the range of call logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cn.zoneco.openplatform.model.CallLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the call logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CallLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of call logs
	* @param end the upper bound of the range of call logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of call logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cn.zoneco.openplatform.model.CallLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the call logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of call logs.
	*
	* @return the number of call logs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}