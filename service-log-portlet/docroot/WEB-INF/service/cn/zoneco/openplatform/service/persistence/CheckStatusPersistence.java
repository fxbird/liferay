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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the check status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see CheckStatusPersistenceImpl
 * @see CheckStatusUtil
 * @generated
 */
public interface CheckStatusPersistence extends BasePersistence<CheckStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CheckStatusUtil} to access the check status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the check status in the entity cache if it is enabled.
	*
	* @param checkStatus the check status
	*/
	public void cacheResult(
		cn.zoneco.openplatform.model.CheckStatus checkStatus);

	/**
	* Caches the check statuses in the entity cache if it is enabled.
	*
	* @param checkStatuses the check statuses
	*/
	public void cacheResult(
		java.util.List<cn.zoneco.openplatform.model.CheckStatus> checkStatuses);

	/**
	* Creates a new check status with the primary key. Does not add the check status to the database.
	*
	* @param statusId the primary key for the new check status
	* @return the new check status
	*/
	public cn.zoneco.openplatform.model.CheckStatus create(long statusId);

	/**
	* Removes the check status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statusId the primary key of the check status
	* @return the check status that was removed
	* @throws cn.zoneco.openplatform.NoSuchCheckStatusException if a check status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.CheckStatus remove(long statusId)
		throws cn.zoneco.openplatform.NoSuchCheckStatusException,
			com.liferay.portal.kernel.exception.SystemException;

	public cn.zoneco.openplatform.model.CheckStatus updateImpl(
		cn.zoneco.openplatform.model.CheckStatus checkStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the check status with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchCheckStatusException} if it could not be found.
	*
	* @param statusId the primary key of the check status
	* @return the check status
	* @throws cn.zoneco.openplatform.NoSuchCheckStatusException if a check status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.CheckStatus findByPrimaryKey(
		long statusId)
		throws cn.zoneco.openplatform.NoSuchCheckStatusException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the check status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statusId the primary key of the check status
	* @return the check status, or <code>null</code> if a check status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.CheckStatus fetchByPrimaryKey(
		long statusId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the check statuses.
	*
	* @return the check statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cn.zoneco.openplatform.model.CheckStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cn.zoneco.openplatform.model.CheckStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cn.zoneco.openplatform.model.CheckStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the check statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of check statuses.
	*
	* @return the number of check statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}