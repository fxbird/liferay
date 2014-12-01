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
 * Provides a wrapper for {@link ZEntityLocalService}.
 *
 * @author fxbird
 * @see ZEntityLocalService
 * @generated
 */
public class ZEntityLocalServiceWrapper implements ZEntityLocalService,
	ServiceWrapper<ZEntityLocalService> {
	public ZEntityLocalServiceWrapper(ZEntityLocalService zEntityLocalService) {
		_zEntityLocalService = zEntityLocalService;
	}

	/**
	* Adds the z entity to the database. Also notifies the appropriate model listeners.
	*
	* @param zEntity the z entity
	* @return the z entity that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.ZEntity addZEntity(
		cn.zoneco.openplatform.model.ZEntity zEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _zEntityLocalService.addZEntity(zEntity);
	}

	/**
	* Creates a new z entity with the primary key. Does not add the z entity to the database.
	*
	* @param comId the primary key for the new z entity
	* @return the new z entity
	*/
	@Override
	public cn.zoneco.openplatform.model.ZEntity createZEntity(long comId) {
		return _zEntityLocalService.createZEntity(comId);
	}

	/**
	* Deletes the z entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param comId the primary key of the z entity
	* @return the z entity that was removed
	* @throws PortalException if a z entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.ZEntity deleteZEntity(long comId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _zEntityLocalService.deleteZEntity(comId);
	}

	/**
	* Deletes the z entity from the database. Also notifies the appropriate model listeners.
	*
	* @param zEntity the z entity
	* @return the z entity that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.ZEntity deleteZEntity(
		cn.zoneco.openplatform.model.ZEntity zEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _zEntityLocalService.deleteZEntity(zEntity);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _zEntityLocalService.dynamicQuery();
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
		return _zEntityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.ZEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _zEntityLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.ZEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _zEntityLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _zEntityLocalService.dynamicQueryCount(dynamicQuery);
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
		return _zEntityLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public cn.zoneco.openplatform.model.ZEntity fetchZEntity(long comId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _zEntityLocalService.fetchZEntity(comId);
	}

	/**
	* Returns the z entity with the primary key.
	*
	* @param comId the primary key of the z entity
	* @return the z entity
	* @throws PortalException if a z entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.ZEntity getZEntity(long comId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _zEntityLocalService.getZEntity(comId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _zEntityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the z entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.ZEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of z entities
	* @param end the upper bound of the range of z entities (not inclusive)
	* @return the range of z entities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<cn.zoneco.openplatform.model.ZEntity> getZEntities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _zEntityLocalService.getZEntities(start, end);
	}

	/**
	* Returns the number of z entities.
	*
	* @return the number of z entities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getZEntitiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _zEntityLocalService.getZEntitiesCount();
	}

	/**
	* Updates the z entity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param zEntity the z entity
	* @return the z entity that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public cn.zoneco.openplatform.model.ZEntity updateZEntity(
		cn.zoneco.openplatform.model.ZEntity zEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _zEntityLocalService.updateZEntity(zEntity);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _zEntityLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_zEntityLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _zEntityLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public void doService(java.lang.Object executor) throws java.lang.Exception {
		_zEntityLocalService.doService(executor);
	}

	@Override
	public java.lang.Object process(java.lang.Object executor)
		throws java.lang.Exception {
		return _zEntityLocalService.process(executor);
	}

	@Override
	public java.lang.Object queryFirstRecord(java.lang.String sql,
		java.lang.String description, java.lang.Object rowHandler)
		throws java.lang.Exception {
		return _zEntityLocalService.queryFirstRecord(sql, description,
			rowHandler);
	}

	@Override
	public java.util.List queryList(java.lang.String sql,
		java.lang.String description, int start, int end,
		java.lang.Object rowHandler) throws java.lang.Exception {
		return _zEntityLocalService.queryList(sql, description, start, end,
			rowHandler);
	}

	@Override
	public int update(java.lang.String sql, java.lang.String description)
		throws java.lang.Exception {
		return _zEntityLocalService.update(sql, description);
	}

	@Override
	public int getRecordCount(java.lang.String sql, java.lang.String description)
		throws java.lang.Exception {
		return _zEntityLocalService.getRecordCount(sql, description);
	}

	@Override
	public java.lang.Object queryPaginatedData(java.lang.String sql,
		java.lang.String description, int start, int end,
		java.lang.Object rowHandler) throws java.lang.Exception {
		return _zEntityLocalService.queryPaginatedData(sql, description, start,
			end, rowHandler);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ZEntityLocalService getWrappedZEntityLocalService() {
		return _zEntityLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedZEntityLocalService(
		ZEntityLocalService zEntityLocalService) {
		_zEntityLocalService = zEntityLocalService;
	}

	@Override
	public ZEntityLocalService getWrappedService() {
		return _zEntityLocalService;
	}

	@Override
	public void setWrappedService(ZEntityLocalService zEntityLocalService) {
		_zEntityLocalService = zEntityLocalService;
	}

	private ZEntityLocalService _zEntityLocalService;
}