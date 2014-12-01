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

import cn.zoneco.openplatform.model.AttachmentInfo;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the attachment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see AttachmentInfoPersistenceImpl
 * @see AttachmentInfoUtil
 * @generated
 */
public interface AttachmentInfoPersistence extends BasePersistence<AttachmentInfo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttachmentInfoUtil} to access the attachment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the attachment info in the entity cache if it is enabled.
	*
	* @param attachmentInfo the attachment info
	*/
	public void cacheResult(
		cn.zoneco.openplatform.model.AttachmentInfo attachmentInfo);

	/**
	* Caches the attachment infos in the entity cache if it is enabled.
	*
	* @param attachmentInfos the attachment infos
	*/
	public void cacheResult(
		java.util.List<cn.zoneco.openplatform.model.AttachmentInfo> attachmentInfos);

	/**
	* Creates a new attachment info with the primary key. Does not add the attachment info to the database.
	*
	* @param attachId the primary key for the new attachment info
	* @return the new attachment info
	*/
	public cn.zoneco.openplatform.model.AttachmentInfo create(long attachId);

	/**
	* Removes the attachment info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attachId the primary key of the attachment info
	* @return the attachment info that was removed
	* @throws cn.zoneco.openplatform.NoSuchAttachmentInfoException if a attachment info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.AttachmentInfo remove(long attachId)
		throws cn.zoneco.openplatform.NoSuchAttachmentInfoException,
			com.liferay.portal.kernel.exception.SystemException;

	public cn.zoneco.openplatform.model.AttachmentInfo updateImpl(
		cn.zoneco.openplatform.model.AttachmentInfo attachmentInfo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the attachment info with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchAttachmentInfoException} if it could not be found.
	*
	* @param attachId the primary key of the attachment info
	* @return the attachment info
	* @throws cn.zoneco.openplatform.NoSuchAttachmentInfoException if a attachment info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.AttachmentInfo findByPrimaryKey(
		long attachId)
		throws cn.zoneco.openplatform.NoSuchAttachmentInfoException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the attachment info with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param attachId the primary key of the attachment info
	* @return the attachment info, or <code>null</code> if a attachment info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public cn.zoneco.openplatform.model.AttachmentInfo fetchByPrimaryKey(
		long attachId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the attachment infos.
	*
	* @return the attachment infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cn.zoneco.openplatform.model.AttachmentInfo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<cn.zoneco.openplatform.model.AttachmentInfo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the attachment infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.AttachmentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attachment infos
	* @param end the upper bound of the range of attachment infos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of attachment infos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<cn.zoneco.openplatform.model.AttachmentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the attachment infos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of attachment infos.
	*
	* @return the number of attachment infos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}