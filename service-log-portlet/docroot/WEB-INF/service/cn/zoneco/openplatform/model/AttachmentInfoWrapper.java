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

package cn.zoneco.openplatform.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AttachmentInfo}.
 * </p>
 *
 * @author fxbird
 * @see AttachmentInfo
 * @generated
 */
public class AttachmentInfoWrapper implements AttachmentInfo,
	ModelWrapper<AttachmentInfo> {
	public AttachmentInfoWrapper(AttachmentInfo attachmentInfo) {
		_attachmentInfo = attachmentInfo;
	}

	@Override
	public Class<?> getModelClass() {
		return AttachmentInfo.class;
	}

	@Override
	public String getModelClassName() {
		return AttachmentInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attachId", getAttachId());
		attributes.put("oriName", getOriName());
		attributes.put("saveName", getSaveName());
		attributes.put("typeCode", getTypeCode());
		attributes.put("attContent", getAttContent());
		attributes.put("extName", getExtName());
		attributes.put("createDate", getCreateDate());
		attributes.put("createBy", getCreateBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attachId = (Long)attributes.get("attachId");

		if (attachId != null) {
			setAttachId(attachId);
		}

		String oriName = (String)attributes.get("oriName");

		if (oriName != null) {
			setOriName(oriName);
		}

		String saveName = (String)attributes.get("saveName");

		if (saveName != null) {
			setSaveName(saveName);
		}

		String typeCode = (String)attributes.get("typeCode");

		if (typeCode != null) {
			setTypeCode(typeCode);
		}

		Blob attContent = (Blob)attributes.get("attContent");

		if (attContent != null) {
			setAttContent(attContent);
		}

		String extName = (String)attributes.get("extName");

		if (extName != null) {
			setExtName(extName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long createBy = (Long)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}
	}

	/**
	* Returns the primary key of this attachment info.
	*
	* @return the primary key of this attachment info
	*/
	@Override
	public long getPrimaryKey() {
		return _attachmentInfo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this attachment info.
	*
	* @param primaryKey the primary key of this attachment info
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_attachmentInfo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the attach ID of this attachment info.
	*
	* @return the attach ID of this attachment info
	*/
	@Override
	public long getAttachId() {
		return _attachmentInfo.getAttachId();
	}

	/**
	* Sets the attach ID of this attachment info.
	*
	* @param attachId the attach ID of this attachment info
	*/
	@Override
	public void setAttachId(long attachId) {
		_attachmentInfo.setAttachId(attachId);
	}

	/**
	* Returns the ori name of this attachment info.
	*
	* @return the ori name of this attachment info
	*/
	@Override
	public java.lang.String getOriName() {
		return _attachmentInfo.getOriName();
	}

	/**
	* Sets the ori name of this attachment info.
	*
	* @param oriName the ori name of this attachment info
	*/
	@Override
	public void setOriName(java.lang.String oriName) {
		_attachmentInfo.setOriName(oriName);
	}

	/**
	* Returns the save name of this attachment info.
	*
	* @return the save name of this attachment info
	*/
	@Override
	public java.lang.String getSaveName() {
		return _attachmentInfo.getSaveName();
	}

	/**
	* Sets the save name of this attachment info.
	*
	* @param saveName the save name of this attachment info
	*/
	@Override
	public void setSaveName(java.lang.String saveName) {
		_attachmentInfo.setSaveName(saveName);
	}

	/**
	* Returns the type code of this attachment info.
	*
	* @return the type code of this attachment info
	*/
	@Override
	public java.lang.String getTypeCode() {
		return _attachmentInfo.getTypeCode();
	}

	/**
	* Sets the type code of this attachment info.
	*
	* @param typeCode the type code of this attachment info
	*/
	@Override
	public void setTypeCode(java.lang.String typeCode) {
		_attachmentInfo.setTypeCode(typeCode);
	}

	/**
	* Returns the att content of this attachment info.
	*
	* @return the att content of this attachment info
	*/
	@Override
	public java.sql.Blob getAttContent() {
		return _attachmentInfo.getAttContent();
	}

	/**
	* Sets the att content of this attachment info.
	*
	* @param attContent the att content of this attachment info
	*/
	@Override
	public void setAttContent(java.sql.Blob attContent) {
		_attachmentInfo.setAttContent(attContent);
	}

	/**
	* Returns the ext name of this attachment info.
	*
	* @return the ext name of this attachment info
	*/
	@Override
	public java.lang.String getExtName() {
		return _attachmentInfo.getExtName();
	}

	/**
	* Sets the ext name of this attachment info.
	*
	* @param extName the ext name of this attachment info
	*/
	@Override
	public void setExtName(java.lang.String extName) {
		_attachmentInfo.setExtName(extName);
	}

	/**
	* Returns the create date of this attachment info.
	*
	* @return the create date of this attachment info
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _attachmentInfo.getCreateDate();
	}

	/**
	* Sets the create date of this attachment info.
	*
	* @param createDate the create date of this attachment info
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_attachmentInfo.setCreateDate(createDate);
	}

	/**
	* Returns the create by of this attachment info.
	*
	* @return the create by of this attachment info
	*/
	@Override
	public long getCreateBy() {
		return _attachmentInfo.getCreateBy();
	}

	/**
	* Sets the create by of this attachment info.
	*
	* @param createBy the create by of this attachment info
	*/
	@Override
	public void setCreateBy(long createBy) {
		_attachmentInfo.setCreateBy(createBy);
	}

	@Override
	public boolean isNew() {
		return _attachmentInfo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_attachmentInfo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _attachmentInfo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_attachmentInfo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _attachmentInfo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _attachmentInfo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_attachmentInfo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _attachmentInfo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_attachmentInfo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_attachmentInfo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_attachmentInfo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AttachmentInfoWrapper((AttachmentInfo)_attachmentInfo.clone());
	}

	@Override
	public int compareTo(AttachmentInfo attachmentInfo) {
		return _attachmentInfo.compareTo(attachmentInfo);
	}

	@Override
	public int hashCode() {
		return _attachmentInfo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<AttachmentInfo> toCacheModel() {
		return _attachmentInfo.toCacheModel();
	}

	@Override
	public AttachmentInfo toEscapedModel() {
		return new AttachmentInfoWrapper(_attachmentInfo.toEscapedModel());
	}

	@Override
	public AttachmentInfo toUnescapedModel() {
		return new AttachmentInfoWrapper(_attachmentInfo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _attachmentInfo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _attachmentInfo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_attachmentInfo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AttachmentInfoWrapper)) {
			return false;
		}

		AttachmentInfoWrapper attachmentInfoWrapper = (AttachmentInfoWrapper)obj;

		if (Validator.equals(_attachmentInfo,
					attachmentInfoWrapper._attachmentInfo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AttachmentInfo getWrappedAttachmentInfo() {
		return _attachmentInfo;
	}

	@Override
	public AttachmentInfo getWrappedModel() {
		return _attachmentInfo;
	}

	@Override
	public void resetOriginalValues() {
		_attachmentInfo.resetOriginalValues();
	}

	private AttachmentInfo _attachmentInfo;
}