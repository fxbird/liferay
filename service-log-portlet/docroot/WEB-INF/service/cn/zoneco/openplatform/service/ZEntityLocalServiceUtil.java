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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ZEntity. This utility wraps
 * {@link cn.zoneco.openplatform.service.impl.ZEntityLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author fxbird
 * @see ZEntityLocalService
 * @see cn.zoneco.openplatform.service.base.ZEntityLocalServiceBaseImpl
 * @see cn.zoneco.openplatform.service.impl.ZEntityLocalServiceImpl
 * @generated
 */
public class ZEntityLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link cn.zoneco.openplatform.service.impl.ZEntityLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the z entity to the database. Also notifies the appropriate model listeners.
	*
	* @param zEntity the z entity
	* @return the z entity that was added
	* @throws SystemException if a system exception occurred
	*/
	public static cn.zoneco.openplatform.model.ZEntity addZEntity(
		cn.zoneco.openplatform.model.ZEntity zEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addZEntity(zEntity);
	}

	/**
	* Creates a new z entity with the primary key. Does not add the z entity to the database.
	*
	* @param comId the primary key for the new z entity
	* @return the new z entity
	*/
	public static cn.zoneco.openplatform.model.ZEntity createZEntity(long comId) {
		return getService().createZEntity(comId);
	}

	/**
	* Deletes the z entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param comId the primary key of the z entity
	* @return the z entity that was removed
	* @throws PortalException if a z entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cn.zoneco.openplatform.model.ZEntity deleteZEntity(long comId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteZEntity(comId);
	}

	/**
	* Deletes the z entity from the database. Also notifies the appropriate model listeners.
	*
	* @param zEntity the z entity
	* @return the z entity that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static cn.zoneco.openplatform.model.ZEntity deleteZEntity(
		cn.zoneco.openplatform.model.ZEntity zEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteZEntity(zEntity);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static cn.zoneco.openplatform.model.ZEntity fetchZEntity(long comId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchZEntity(comId);
	}

	/**
	* Returns the z entity with the primary key.
	*
	* @param comId the primary key of the z entity
	* @return the z entity
	* @throws PortalException if a z entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static cn.zoneco.openplatform.model.ZEntity getZEntity(long comId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getZEntity(comId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<cn.zoneco.openplatform.model.ZEntity> getZEntities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getZEntities(start, end);
	}

	/**
	* Returns the number of z entities.
	*
	* @return the number of z entities
	* @throws SystemException if a system exception occurred
	*/
	public static int getZEntitiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getZEntitiesCount();
	}

	/**
	* Updates the z entity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param zEntity the z entity
	* @return the z entity that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static cn.zoneco.openplatform.model.ZEntity updateZEntity(
		cn.zoneco.openplatform.model.ZEntity zEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateZEntity(zEntity);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void doService(java.lang.Object executor)
		throws java.lang.Exception {
		getService().doService(executor);
	}

	public static java.lang.Object process(java.lang.Object executor)
		throws java.lang.Exception {
		return getService().process(executor);
	}

	public static java.lang.Object queryFirstRecord(java.lang.String sql,
		java.lang.String description, java.lang.Object rowHandler)
		throws java.lang.Exception {
		return getService().queryFirstRecord(sql, description, rowHandler);
	}

	public static java.util.List queryList(java.lang.String sql,
		java.lang.String description, int start, int end,
		java.lang.Object rowHandler) throws java.lang.Exception {
		return getService().queryList(sql, description, start, end, rowHandler);
	}

	public static int update(java.lang.String sql, java.lang.String description)
		throws java.lang.Exception {
		return getService().update(sql, description);
	}

	public static int getRecordCount(java.lang.String sql,
		java.lang.String description) throws java.lang.Exception {
		return getService().getRecordCount(sql, description);
	}

	public static java.lang.Object queryPaginatedData(java.lang.String sql,
		java.lang.String description, int start, int end,
		java.lang.Object rowHandler) throws java.lang.Exception {
		return getService()
				   .queryPaginatedData(sql, description, start, end, rowHandler);
	}

	public static void clearService() {
		_service = null;
	}

	public static ZEntityLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ZEntityLocalService.class.getName());

			if (invokableLocalService instanceof ZEntityLocalService) {
				_service = (ZEntityLocalService)invokableLocalService;
			}
			else {
				_service = new ZEntityLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ZEntityLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ZEntityLocalService service) {
	}

	private static ZEntityLocalService _service;
}