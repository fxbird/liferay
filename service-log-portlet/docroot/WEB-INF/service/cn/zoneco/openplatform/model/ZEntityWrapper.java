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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ZEntity}.
 * </p>
 *
 * @author fxbird
 * @see ZEntity
 * @generated
 */
public class ZEntityWrapper implements ZEntity, ModelWrapper<ZEntity> {
	public ZEntityWrapper(ZEntity zEntity) {
		_zEntity = zEntity;
	}

	@Override
	public Class<?> getModelClass() {
		return ZEntity.class;
	}

	@Override
	public String getModelClassName() {
		return ZEntity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("comId", getComId());
		attributes.put("comName", getComName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long comId = (Long)attributes.get("comId");

		if (comId != null) {
			setComId(comId);
		}

		Long comName = (Long)attributes.get("comName");

		if (comName != null) {
			setComName(comName);
		}
	}

	/**
	* Returns the primary key of this z entity.
	*
	* @return the primary key of this z entity
	*/
	@Override
	public long getPrimaryKey() {
		return _zEntity.getPrimaryKey();
	}

	/**
	* Sets the primary key of this z entity.
	*
	* @param primaryKey the primary key of this z entity
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_zEntity.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the com ID of this z entity.
	*
	* @return the com ID of this z entity
	*/
	@Override
	public long getComId() {
		return _zEntity.getComId();
	}

	/**
	* Sets the com ID of this z entity.
	*
	* @param comId the com ID of this z entity
	*/
	@Override
	public void setComId(long comId) {
		_zEntity.setComId(comId);
	}

	/**
	* Returns the com name of this z entity.
	*
	* @return the com name of this z entity
	*/
	@Override
	public long getComName() {
		return _zEntity.getComName();
	}

	/**
	* Sets the com name of this z entity.
	*
	* @param comName the com name of this z entity
	*/
	@Override
	public void setComName(long comName) {
		_zEntity.setComName(comName);
	}

	@Override
	public boolean isNew() {
		return _zEntity.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_zEntity.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _zEntity.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_zEntity.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _zEntity.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _zEntity.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_zEntity.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _zEntity.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_zEntity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_zEntity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_zEntity.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ZEntityWrapper((ZEntity)_zEntity.clone());
	}

	@Override
	public int compareTo(ZEntity zEntity) {
		return _zEntity.compareTo(zEntity);
	}

	@Override
	public int hashCode() {
		return _zEntity.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ZEntity> toCacheModel() {
		return _zEntity.toCacheModel();
	}

	@Override
	public ZEntity toEscapedModel() {
		return new ZEntityWrapper(_zEntity.toEscapedModel());
	}

	@Override
	public ZEntity toUnescapedModel() {
		return new ZEntityWrapper(_zEntity.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _zEntity.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _zEntity.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_zEntity.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ZEntityWrapper)) {
			return false;
		}

		ZEntityWrapper zEntityWrapper = (ZEntityWrapper)obj;

		if (Validator.equals(_zEntity, zEntityWrapper._zEntity)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ZEntity getWrappedZEntity() {
		return _zEntity;
	}

	@Override
	public ZEntity getWrappedModel() {
		return _zEntity;
	}

	@Override
	public void resetOriginalValues() {
		_zEntity.resetOriginalValues();
	}

	private ZEntity _zEntity;
}