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

import cn.zoneco.openplatform.model.ZEntity;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the z entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see ZEntityPersistenceImpl
 * @see ZEntityUtil
 * @generated
 */
public interface ZEntityPersistence extends BasePersistence<ZEntity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ZEntityUtil} to access the z entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the z entity in the entity cache if it is enabled.
	*
	* @param zEntity the z entity
	*/
	public void cacheResult(cn.zoneco.openplatform.model.ZEntity zEntity);

	/**
	* Caches the z entities in the entity cache if it is enabled.
	*
	* @param zEntities the z entities
	*/
	public void cacheResult(
		java.util.List<cn.zoneco.openplatform.model.ZEntity> zEntities);

	/**
	* Creates a new z entity with the primary key. Does not add the z entity to the database.
	*
	* @param comId the primary key for the new z entity
	* @return the new z entity
	*/
	public cn.zoneco.openplatform.model.ZEntity create(long comId);

	/**
	* Removes the z entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param comId the primary key of the z entity
	* @return the z entity that was removed
	* @throws cn.zoneco.openplatform.NoSuchZEntityException if a z entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.ZEntity remove(long comId)
		throws cn.zoneco.openplatform.NoSuchZEntityException,
			com.liferay.portal.kernel.exception.SystemException;

	public cn.zoneco.openplatform.model.ZEntity updateImpl(
		cn.zoneco.openplatform.model.ZEntity zEntity)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the z entity with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchZEntityException} if it could not be found.
	*
	* @param comId the primary key of the z entity
	* @return the z entity
	* @throws cn.zoneco.openplatform.NoSuchZEntityException if a z entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.ZEntity findByPrimaryKey(long comId)
		throws cn.zoneco.openplatform.NoSuchZEntityException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the z entity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param comId the primary key of the z entity
	* @return the z entity, or <code>null</code> if a z entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.ZEntity fetchByPrimaryKey(long comId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the z entities.
	*
	* @return the z entities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cn.zoneco.openplatform.model.ZEntity> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cn.zoneco.openplatform.model.ZEntity> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the z entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.ZEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of z entities
	* @param end the upper bound of the range of z entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of z entities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cn.zoneco.openplatform.model.ZEntity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the z entities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of z entities.
	*
	* @return the number of z entities
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}