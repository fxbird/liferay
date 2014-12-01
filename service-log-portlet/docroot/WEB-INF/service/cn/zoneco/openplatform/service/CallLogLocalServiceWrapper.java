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
 * Provides a wrapper for {@link CallLogLocalService}.
 *
 * @author fxbird
 * @see CallLogLocalService
 * @generated
 */
public class CallLogLocalServiceWrapper implements CallLogLocalService,
	ServiceWrapper<CallLogLocalService> {
	public CallLogLocalServiceWrapper(CallLogLocalService callLogLocalService) {
		_callLogLocalService = callLogLocalService;
	}

	/**
	* Adds the call log to the database. Also notifies the appropriate model listeners.
	*
	* @param callLog the call log
	* @return the call log that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.CallLog addCallLog(
		cn.zoneco.openplatform.model.CallLog callLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callLogLocalService.addCallLog(callLog);
	}

	/**
	* Creates a new call log with the primary key. Does not add the call log to the database.
	*
	* @param logId the primary key for the new call log
	* @return the new call log
	*/
	@Override
	public cn.zoneco.openplatform.model.CallLog createCallLog(long logId) {
		return _callLogLocalService.createCallLog(logId);
	}

	/**
	* Deletes the call log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logId the primary key of the call log
	* @return the call log that was removed
	* @throws PortalException if a call log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.CallLog deleteCallLog(long logId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _callLogLocalService.deleteCallLog(logId);
	}

	/**
	* Deletes the call log from the database. Also notifies the appropriate model listeners.
	*
	* @param callLog the call log
	* @return the call log that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.CallLog deleteCallLog(
		cn.zoneco.openplatform.model.CallLog callLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callLogLocalService.deleteCallLog(callLog);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _callLogLocalService.dynamicQuery();
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
		return _callLogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CallLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _callLogLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CallLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _callLogLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _callLogLocalService.dynamicQueryCount(dynamicQuery);
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
		return _callLogLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public cn.zoneco.openplatform.model.CallLog fetchCallLog(long logId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callLogLocalService.fetchCallLog(logId);
	}

	/**
	* Returns the call log with the primary key.
	*
	* @param logId the primary key of the call log
	* @return the call log
	* @throws PortalException if a call log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.CallLog getCallLog(long logId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _callLogLocalService.getCallLog(logId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _callLogLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<cn.zoneco.openplatform.model.CallLog> getCallLogs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callLogLocalService.getCallLogs(start, end);
	}

	/**
	* Returns the number of call logs.
	*
	* @return the number of call logs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCallLogsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callLogLocalService.getCallLogsCount();
	}

	/**
	* Updates the call log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param callLog the call log
	* @return the call log that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.CallLog updateCallLog(
		cn.zoneco.openplatform.model.CallLog callLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callLogLocalService.updateCallLog(callLog);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _callLogLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_callLogLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _callLogLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CallLogLocalService getWrappedCallLogLocalService() {
		return _callLogLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCallLogLocalService(
		CallLogLocalService callLogLocalService) {
		_callLogLocalService = callLogLocalService;
	}

	@Override
	public CallLogLocalService getWrappedService() {
		return _callLogLocalService;
	}

	@Override
	public void setWrappedService(CallLogLocalService callLogLocalService) {
		_callLogLocalService = callLogLocalService;
	}

	private CallLogLocalService _callLogLocalService;
}