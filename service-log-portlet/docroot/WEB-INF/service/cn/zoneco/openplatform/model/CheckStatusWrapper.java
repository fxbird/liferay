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
 * This class is a wrapper for {@link CheckStatus}.
 * </p>
 *
 * @author fxbird
 * @see CheckStatus
 * @generated
 */
public class CheckStatusWrapper implements CheckStatus,
	ModelWrapper<CheckStatus> {
	public CheckStatusWrapper(CheckStatus checkStatus) {
		_checkStatus = checkStatus;
	}

	@Override
	public Class<?> getModelClass() {
		return CheckStatus.class;
	}

	@Override
	public String getModelClassName() {
		return CheckStatus.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statusId", getStatusId());
		attributes.put("statusName", getStatusName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long statusId = (Long)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		String statusName = (String)attributes.get("statusName");

		if (statusName != null) {
			setStatusName(statusName);
		}
	}

	/**
	* Returns the primary key of this check status.
	*
	* @return the primary key of this check status
	*/
	@Override
	public long getPrimaryKey() {
		return _checkStatus.getPrimaryKey();
	}

	/**
	* Sets the primary key of this check status.
	*
	* @param primaryKey the primary key of this check status
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_checkStatus.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the status ID of this check status.
	*
	* @return the status ID of this check status
	*/
	@Override
	public long getStatusId() {
		return _checkStatus.getStatusId();
	}

	/**
	* Sets the status ID of this check status.
	*
	* @param statusId the status ID of this check status
	*/
	@Override
	public void setStatusId(long statusId) {
		_checkStatus.setStatusId(statusId);
	}

	/**
	* Returns the status name of this check status.
	*
	* @return the status name of this check status
	*/
	@Override
	public java.lang.String getStatusName() {
		return _checkStatus.getStatusName();
	}

	/**
	* Sets the status name of this check status.
	*
	* @param statusName the status name of this check status
	*/
	@Override
	public void setStatusName(java.lang.String statusName) {
		_checkStatus.setStatusName(statusName);
	}

	@Override
	public boolean isNew() {
		return _checkStatus.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_checkStatus.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _checkStatus.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_checkStatus.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _checkStatus.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _checkStatus.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_checkStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _checkStatus.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_checkStatus.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_checkStatus.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_checkStatus.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CheckStatusWrapper((CheckStatus)_checkStatus.clone());
	}

	@Override
	public int compareTo(CheckStatus checkStatus) {
		return _checkStatus.compareTo(checkStatus);
	}

	@Override
	public int hashCode() {
		return _checkStatus.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<CheckStatus> toCacheModel() {
		return _checkStatus.toCacheModel();
	}

	@Override
	public CheckStatus toEscapedModel() {
		return new CheckStatusWrapper(_checkStatus.toEscapedModel());
	}

	@Override
	public CheckStatus toUnescapedModel() {
		return new CheckStatusWrapper(_checkStatus.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _checkStatus.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _checkStatus.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_checkStatus.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CheckStatusWrapper)) {
			return false;
		}

		CheckStatusWrapper checkStatusWrapper = (CheckStatusWrapper)obj;

		if (Validator.equals(_checkStatus, checkStatusWrapper._checkStatus)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CheckStatus getWrappedCheckStatus() {
		return _checkStatus;
	}

	@Override
	public CheckStatus getWrappedModel() {
		return _checkStatus;
	}

	@Override
	public void resetOriginalValues() {
		_checkStatus.resetOriginalValues();
	}

	private CheckStatus _checkStatus;
}