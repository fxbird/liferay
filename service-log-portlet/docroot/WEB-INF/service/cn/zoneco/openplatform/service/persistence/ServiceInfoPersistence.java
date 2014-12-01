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

import cn.zoneco.openplatform.model.ServiceInfo;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the service info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see ServiceInfoPersistenceImpl
 * @see ServiceInfoUtil
 * @generated
 */
public interface ServiceInfoPersistence extends BasePersistence<ServiceInfo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServiceInfoUtil} to access the service info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the service info in the entity cache if it is enabled.
	*
	* @param serviceInfo the service info
	*/
	public void cacheResult(
		cn.zoneco.openplatform.model.ServiceInfo serviceInfo);

	/**
	* Caches the service infos in the entity cache if it is enabled.
	*
	* @param serviceInfos the service infos
	*/
	public void cacheResult(
		java.util.List<cn.zoneco.openplatform.model.ServiceInfo> serviceInfos);

	/**
	* Creates a new service info with the primary key. Does not add the service info to the database.
	*
	* @param resourceId the primary key for the new service info
	* @return the new service info
	*/
	public cn.zoneco.openplatform.model.ServiceInfo create(long resourceId);

	/**
	* Removes the service info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resourceId the primary key of the service info
	* @return the service info that was removed
	* @throws cn.zoneco.openplatform.NoSuchServiceInfoException if a service info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.ServiceInfo remove(long resourceId)
		throws cn.zoneco.openplatform.NoSuchServiceInfoException,
			com.liferay.portal.kernel.exception.SystemException;

	public cn.zoneco.openplatform.model.ServiceInfo updateImpl(
		cn.zoneco.openplatform.model.ServiceInfo serviceInfo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service info with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchServiceInfoException} if it could not be found.
	*
	* @param resourceId the primary key of the service info
	* @return the service info
	* @throws cn.zoneco.openplatform.NoSuchServiceInfoException if a service info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.ServiceInfo findByPrimaryKey(
		long resourceId)
		throws cn.zoneco.openplatform.NoSuchServiceInfoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param resourceId the primary key of the service info
	* @return the service info, or <code>null</code> if a service info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.ServiceInfo fetchByPrimaryKey(
		long resourceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service infos.
	*
	* @return the service infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cn.zoneco.openplatform.model.ServiceInfo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.ServiceInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service infos
	* @param end the upper bound of the range of service infos (not inclusive)
	* @return the range of service infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cn.zoneco.openplatform.model.ServiceInfo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.ServiceInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service infos
	* @param end the upper bound of the range of service infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cn.zoneco.openplatform.model.ServiceInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service infos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service infos.
	*
	* @return the number of service infos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}