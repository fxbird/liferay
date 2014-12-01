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

import cn.zoneco.openplatform.model.CheckStatus;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the check status service. This utility wraps {@link CheckStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see CheckStatusPersistence
 * @see CheckStatusPersistenceImpl
 * @generated
 */
public class CheckStatusUtil {
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
	public static void clearCache(CheckStatus checkStatus) {
		getPersistence().clearCache(checkStatus);
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
	public static List<CheckStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CheckStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CheckStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CheckStatus update(CheckStatus checkStatus)
		throws SystemException {
		return getPersistence().update(checkStatus);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CheckStatus update(CheckStatus checkStatus,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(checkStatus, serviceContext);
	}

	/**
	* Caches the check status in the entity cache if it is enabled.
	*
	* @param checkStatus the check status
	*/
	public static void cacheResult(
		cn.zoneco.openplatform.model.CheckStatus checkStatus) {
		getPersistence().cacheResult(checkStatus);
	}

	/**
	* Caches the check statuses in the entity cache if it is enabled.
	*
	* @param checkStatuses the check statuses
	*/
	public static void cacheResult(
		java.util.List<cn.zoneco.openplatform.model.CheckStatus> checkStatuses) {
		getPersistence().cacheResult(checkStatuses);
	}

	/**
	* Creates a new check status with the primary key. Does not add the check status to the database.
	*
	* @param statusId the primary key for the new check status
	* @return the new check status
	*/
	public static cn.zoneco.openplatform.model.CheckStatus create(long statusId) {
		return getPersistence().create(statusId);
	}

	/**
	* Removes the check status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statusId the primary key of the check status
	* @return the check status that was removed
	* @throws cn.zoneco.openplatform.NoSuchCheckStatusException if a check status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cn.zoneco.openplatform.model.CheckStatus remove(long statusId)
		throws cn.zoneco.openplatform.NoSuchCheckStatusException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(statusId);
	}

	public static cn.zoneco.openplatform.model.CheckStatus updateImpl(
		cn.zoneco.openplatform.model.CheckStatus checkStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(checkStatus);
	}

	/**
	* Returns the check status with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchCheckStatusException} if it could not be found.
	*
	* @param statusId the primary key of the check status
	* @return the check status
	* @throws cn.zoneco.openplatform.NoSuchCheckStatusException if a check status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cn.zoneco.openplatform.model.CheckStatus findByPrimaryKey(
		long statusId)
		throws cn.zoneco.openplatform.NoSuchCheckStatusException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(statusId);
	}

	/**
	* Returns the check status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statusId the primary key of the check status
	* @return the check status, or <code>null</code> if a check status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cn.zoneco.openplatform.model.CheckStatus fetchByPrimaryKey(
		long statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(statusId);
	}

	/**
	* Returns all the check statuses.
	*
	* @return the check statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cn.zoneco.openplatform.model.CheckStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the check statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CheckStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of check statuses
	* @param end the upper bound of the range of check statuses (not inclusive)
	* @return the range of check statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cn.zoneco.openplatform.model.CheckStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the check statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CheckStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of check statuses
	* @param end the upper bound of the range of check statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of check statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<cn.zoneco.openplatform.model.CheckStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the check statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of check statuses.
	*
	* @return the number of check statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CheckStatusPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CheckStatusPersistence)PortletBeanLocatorUtil.locate(cn.zoneco.openplatform.service.ClpSerializer.getServletContextName(),
					CheckStatusPersistence.class.getName());

			ReferenceRegistry.registerReference(CheckStatusUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CheckStatusPersistence persistence) {
	}

	private static CheckStatusPersistence _persistence;
}