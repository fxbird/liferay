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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the call log service. This utility wraps {@link CallLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see CallLogPersistence
 * @see CallLogPersistenceImpl
 * @generated
 */
public class CallLogUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(CallLog callLog) {
		getPersistence().clearCache(callLog);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CallLog> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CallLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CallLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CallLog update(CallLog callLog) throws SystemException {
		return getPersistence().update(callLog);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CallLog update(CallLog callLog, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(callLog, serviceContext);
	}

	/**
	* Caches the call log in the entity cache if it is enabled.
	*
	* @param callLog the call log
	*/
	public static void cacheResult(cn.zoneco.openplatform.model.CallLog callLog) {
		getPersistence().cacheResult(callLog);
	}

	/**
	* Caches the call logs in the entity cache if it is enabled.
	*
	* @param callLogs the call logs
	*/
	public static void cacheResult(
		java.util.List<cn.zoneco.openplatform.model.CallLog> callLogs) {
		getPersistence().cacheResult(callLogs);
	}

	/**
	* Creates a new call log with the primary key. Does not add the call log to the database.
	*
	* @param logId the primary key for the new call log
	* @return the new call log
	*/
	public static cn.zoneco.openplatform.model.CallLog create(long logId) {
		return getPersistence().create(logId);
	}

	/**
	* Removes the call log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logId the primary key of the call log
	* @return the call log that was removed
	* @throws cn.zoneco.openplatform.NoSuchCallLogException if a call log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cn.zoneco.openplatform.model.CallLog remove(long logId)
		throws cn.zoneco.openplatform.NoSuchCallLogException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(logId);
	}

	public static cn.zoneco.openplatform.model.CallLog updateImpl(
		cn.zoneco.openplatform.model.CallLog callLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(callLog);
	}

	/**
	* Returns the call log with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchCallLogException} if it could not be found.
	*
	* @param logId the primary key of the call log
	* @return the call log
	* @throws cn.zoneco.openplatform.NoSuchCallLogException if a call log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cn.zoneco.openplatform.model.CallLog findByPrimaryKey(
		long logId)
		throws cn.zoneco.openplatform.NoSuchCallLogException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(logId);
	}

	/**
	* Returns the call log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param logId the primary key of the call log
	* @return the call log, or <code>null</code> if a call log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cn.zoneco.openplatform.model.CallLog fetchByPrimaryKey(
		long logId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(logId);
	}

	/**
	* Returns all the call logs.
	*
	* @return the call logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cn.zoneco.openplatform.model.CallLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<cn.zoneco.openplatform.model.CallLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<cn.zoneco.openplatform.model.CallLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the call logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of call logs.
	*
	* @return the number of call logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CallLogPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CallLogPersistence)PortletBeanLocatorUtil.locate(cn.zoneco.openplatform.service.ClpSerializer.getServletContextName(),
					CallLogPersistence.class.getName());

			ReferenceRegistry.registerReference(CallLogUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CallLogPersistence persistence) {
	}

	private static CallLogPersistence _persistence;
}