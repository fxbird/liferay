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
 * Provides a wrapper for {@link AttachmentInfoLocalService}.
 *
 * @author fxbird
 * @see AttachmentInfoLocalService
 * @generated
 */
public class AttachmentInfoLocalServiceWrapper
	implements AttachmentInfoLocalService,
		ServiceWrapper<AttachmentInfoLocalService> {
	public AttachmentInfoLocalServiceWrapper(
		AttachmentInfoLocalService attachmentInfoLocalService) {
		_attachmentInfoLocalService = attachmentInfoLocalService;
	}

	/**
	* Adds the attachment info to the database. Also notifies the appropriate model listeners.
	*
	* @param attachmentInfo the attachment info
	* @return the attachment info that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.AttachmentInfo addAttachmentInfo(
		cn.zoneco.openplatform.model.AttachmentInfo attachmentInfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentInfoLocalService.addAttachmentInfo(attachmentInfo);
	}

	/**
	* Creates a new attachment info with the primary key. Does not add the attachment info to the database.
	*
	* @param attachId the primary key for the new attachment info
	* @return the new attachment info
	*/
	@Override
	public cn.zoneco.openplatform.model.AttachmentInfo createAttachmentInfo(
		long attachId) {
		return _attachmentInfoLocalService.createAttachmentInfo(attachId);
	}

	/**
	* Deletes the attachment info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attachId the primary key of the attachment info
	* @return the attachment info that was removed
	* @throws PortalException if a attachment info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.AttachmentInfo deleteAttachmentInfo(
		long attachId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentInfoLocalService.deleteAttachmentInfo(attachId);
	}

	/**
	* Deletes the attachment info from the database. Also notifies the appropriate model listeners.
	*
	* @param attachmentInfo the attachment info
	* @return the attachment info that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.AttachmentInfo deleteAttachmentInfo(
		cn.zoneco.openplatform.model.AttachmentInfo attachmentInfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentInfoLocalService.deleteAttachmentInfo(attachmentInfo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attachmentInfoLocalService.dynamicQuery();
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
		return _attachmentInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.AttachmentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _attachmentInfoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.AttachmentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _attachmentInfoLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _attachmentInfoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _attachmentInfoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public cn.zoneco.openplatform.model.AttachmentInfo fetchAttachmentInfo(
		long attachId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentInfoLocalService.fetchAttachmentInfo(attachId);
	}

	/**
	* Returns the attachment info with the primary key.
	*
	* @param attachId the primary key of the attachment info
	* @return the attachment info
	* @throws PortalException if a attachment info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.AttachmentInfo getAttachmentInfo(
		long attachId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentInfoLocalService.getAttachmentInfo(attachId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the attachment infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.AttachmentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attachment infos
	* @param end the upper bound of the range of attachment infos (not inclusive)
	* @return the range of attachment infos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<cn.zoneco.openplatform.model.AttachmentInfo> getAttachmentInfos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentInfoLocalService.getAttachmentInfos(start, end);
	}

	/**
	* Returns the number of attachment infos.
	*
	* @return the number of attachment infos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAttachmentInfosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentInfoLocalService.getAttachmentInfosCount();
	}

	/**
	* Updates the attachment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param attachmentInfo the attachment info
	* @return the attachment info that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.AttachmentInfo updateAttachmentInfo(
		cn.zoneco.openplatform.model.AttachmentInfo attachmentInfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentInfoLocalService.updateAttachmentInfo(attachmentInfo);
	}

	@Override
	public cn.zoneco.openplatform.model.AttachmentInfoAttContentBlobModel getAttContentBlobModel(
		java.io.Serializable primaryKey)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentInfoLocalService.getAttContentBlobModel(primaryKey);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _attachmentInfoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_attachmentInfoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _attachmentInfoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AttachmentInfoLocalService getWrappedAttachmentInfoLocalService() {
		return _attachmentInfoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAttachmentInfoLocalService(
		AttachmentInfoLocalService attachmentInfoLocalService) {
		_attachmentInfoLocalService = attachmentInfoLocalService;
	}

	@Override
	public AttachmentInfoLocalService getWrappedService() {
		return _attachmentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AttachmentInfoLocalService attachmentInfoLocalService) {
		_attachmentInfoLocalService = attachmentInfoLocalService;
	}

	private AttachmentInfoLocalService _attachmentInfoLocalService;
}