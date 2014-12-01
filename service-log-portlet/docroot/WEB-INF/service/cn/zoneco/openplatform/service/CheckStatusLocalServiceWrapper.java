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

package cn.zoneco.openplatform.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CheckStatusLocalService}.
 *
 * @author fxbird
 * @see CheckStatusLocalService
 * @generated
 */
public class CheckStatusLocalServiceWrapper implements CheckStatusLocalService,
	ServiceWrapper<CheckStatusLocalService> {
	public CheckStatusLocalServiceWrapper(
		CheckStatusLocalService checkStatusLocalService) {
		_checkStatusLocalService = checkStatusLocalService;
	}

	/**
	* Adds the check status to the database. Also notifies the appropriate model listeners.
	*
	* @param checkStatus the check status
	* @return the check status that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.CheckStatus addCheckStatus(
		cn.zoneco.openplatform.model.CheckStatus checkStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.addCheckStatus(checkStatus);
	}

	/**
	* Creates a new check status with the primary key. Does not add the check status to the database.
	*
	* @param statusId the primary key for the new check status
	* @return the new check status
	*/
	@Override
	public cn.zoneco.openplatform.model.CheckStatus createCheckStatus(
		long statusId) {
		return _checkStatusLocalService.createCheckStatus(statusId);
	}

	/**
	* Deletes the check status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statusId the primary key of the check status
	* @return the check status that was removed
	* @throws PortalException if a check status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.CheckStatus deleteCheckStatus(
		long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.deleteCheckStatus(statusId);
	}

	/**
	* Deletes the check status from the database. Also notifies the appropriate model listeners.
	*
	* @param checkStatus the check status
	* @return the check status that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.CheckStatus deleteCheckStatus(
		cn.zoneco.openplatform.model.CheckStatus checkStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.deleteCheckStatus(checkStatus);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _checkStatusLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CheckStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CheckStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public cn.zoneco.openplatform.model.CheckStatus fetchCheckStatus(
		long statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.fetchCheckStatus(statusId);
	}

	/**
	* Returns the check status with the primary key.
	*
	* @param statusId the primary key of the check status
	* @return the check status
	* @throws PortalException if a check status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.CheckStatus getCheckStatus(
		long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.getCheckStatus(statusId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<cn.zoneco.openplatform.model.CheckStatus> getCheckStatuses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.getCheckStatuses(start, end);
	}

	/**
	* Returns the number of check statuses.
	*
	* @return the number of check statuses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCheckStatusesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.getCheckStatusesCount();
	}

	/**
	* Updates the check status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param checkStatus the check status
	* @return the check status that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.CheckStatus updateCheckStatus(
		cn.zoneco.openplatform.model.CheckStatus checkStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _checkStatusLocalService.updateCheckStatus(checkStatus);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _checkStatusLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_checkStatusLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _checkStatusLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CheckStatusLocalService getWrappedCheckStatusLocalService() {
		return _checkStatusLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCheckStatusLocalService(
		CheckStatusLocalService checkStatusLocalService) {
		_checkStatusLocalService = checkStatusLocalService;
	}

	@Override
	public CheckStatusLocalService getWrappedService() {
		return _checkStatusLocalService;
	}

	@Override
	public void setWrappedService(
		CheckStatusLocalService checkStatusLocalService) {
		_checkStatusLocalService = checkStatusLocalService;
	}

	private CheckStatusLocalService _checkStatusLocalService;
}