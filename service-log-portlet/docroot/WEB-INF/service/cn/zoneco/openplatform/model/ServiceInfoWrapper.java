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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ServiceInfo}.
 * </p>
 *
 * @author fxbird
 * @see ServiceInfo
 * @generated
 */
public class ServiceInfoWrapper implements ServiceInfo,
	ModelWrapper<ServiceInfo> {
	public ServiceInfoWrapper(ServiceInfo serviceInfo) {
		_serviceInfo = serviceInfo;
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceInfo.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("resourceId", getResourceId());
		attributes.put("resourceName", getResourceName());
		attributes.put("description", getDescription());
		attributes.put("logoAttId", getLogoAttId());
		attributes.put("wsdlAttId", getWsdlAttId());
		attributes.put("statusId", getStatusId());
		attributes.put("applyDate", getApplyDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("updateDate", getUpdateDate());
		attributes.put("updateBy", getUpdateBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long resourceId = (Long)attributes.get("resourceId");

		if (resourceId != null) {
			setResourceId(resourceId);
		}

		String resourceName = (String)attributes.get("resourceName");

		if (resourceName != null) {
			setResourceName(resourceName);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long logoAttId = (Long)attributes.get("logoAttId");

		if (logoAttId != null) {
			setLogoAttId(logoAttId);
		}

		Long wsdlAttId = (Long)attributes.get("wsdlAttId");

		if (wsdlAttId != null) {
			setWsdlAttId(wsdlAttId);
		}

		Integer statusId = (Integer)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		Integer applyDate = (Integer)attributes.get("applyDate");

		if (applyDate != null) {
			setApplyDate(applyDate);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long createBy = (Long)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}

		Date updateDate = (Date)attributes.get("updateDate");

		if (updateDate != null) {
			setUpdateDate(updateDate);
		}

		Long updateBy = (Long)attributes.get("updateBy");

		if (updateBy != null) {
			setUpdateBy(updateBy);
		}
	}

	/**
	* Returns the primary key of this service info.
	*
	* @return the primary key of this service info
	*/
	@Override
	public long getPrimaryKey() {
		return _serviceInfo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service info.
	*
	* @param primaryKey the primary key of this service info
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_serviceInfo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the resource ID of this service info.
	*
	* @return the resource ID of this service info
	*/
	@Override
	public long getResourceId() {
		return _serviceInfo.getResourceId();
	}

	/**
	* Sets the resource ID of this service info.
	*
	* @param resourceId the resource ID of this service info
	*/
	@Override
	public void setResourceId(long resourceId) {
		_serviceInfo.setResourceId(resourceId);
	}

	/**
	* Returns the resource name of this service info.
	*
	* @return the resource name of this service info
	*/
	@Override
	public java.lang.String getResourceName() {
		return _serviceInfo.getResourceName();
	}

	/**
	* Sets the resource name of this service info.
	*
	* @param resourceName the resource name of this service info
	*/
	@Override
	public void setResourceName(java.lang.String resourceName) {
		_serviceInfo.setResourceName(resourceName);
	}

	/**
	* Returns the description of this service info.
	*
	* @return the description of this service info
	*/
	@Override
	public java.lang.String getDescription() {
		return _serviceInfo.getDescription();
	}

	/**
	* Sets the description of this service info.
	*
	* @param description the description of this service info
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_serviceInfo.setDescription(description);
	}

	/**
	* Returns the logo att ID of this service info.
	*
	* @return the logo att ID of this service info
	*/
	@Override
	public long getLogoAttId() {
		return _serviceInfo.getLogoAttId();
	}

	/**
	* Sets the logo att ID of this service info.
	*
	* @param logoAttId the logo att ID of this service info
	*/
	@Override
	public void setLogoAttId(long logoAttId) {
		_serviceInfo.setLogoAttId(logoAttId);
	}

	/**
	* Returns the wsdl att ID of this service info.
	*
	* @return the wsdl att ID of this service info
	*/
	@Override
	public long getWsdlAttId() {
		return _serviceInfo.getWsdlAttId();
	}

	/**
	* Sets the wsdl att ID of this service info.
	*
	* @param wsdlAttId the wsdl att ID of this service info
	*/
	@Override
	public void setWsdlAttId(long wsdlAttId) {
		_serviceInfo.setWsdlAttId(wsdlAttId);
	}

	/**
	* Returns the status ID of this service info.
	*
	* @return the status ID of this service info
	*/
	@Override
	public int getStatusId() {
		return _serviceInfo.getStatusId();
	}

	/**
	* Sets the status ID of this service info.
	*
	* @param statusId the status ID of this service info
	*/
	@Override
	public void setStatusId(int statusId) {
		_serviceInfo.setStatusId(statusId);
	}

	/**
	* Returns the apply date of this service info.
	*
	* @return the apply date of this service info
	*/
	@Override
	public int getApplyDate() {
		return _serviceInfo.getApplyDate();
	}

	/**
	* Sets the apply date of this service info.
	*
	* @param applyDate the apply date of this service info
	*/
	@Override
	public void setApplyDate(int applyDate) {
		_serviceInfo.setApplyDate(applyDate);
	}

	/**
	* Returns the create date of this service info.
	*
	* @return the create date of this service info
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _serviceInfo.getCreateDate();
	}

	/**
	* Sets the create date of this service info.
	*
	* @param createDate the create date of this service info
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_serviceInfo.setCreateDate(createDate);
	}

	/**
	* Returns the create by of this service info.
	*
	* @return the create by of this service info
	*/
	@Override
	public long getCreateBy() {
		return _serviceInfo.getCreateBy();
	}

	/**
	* Sets the create by of this service info.
	*
	* @param createBy the create by of this service info
	*/
	@Override
	public void setCreateBy(long createBy) {
		_serviceInfo.setCreateBy(createBy);
	}

	/**
	* Returns the update date of this service info.
	*
	* @return the update date of this service info
	*/
	@Override
	public java.util.Date getUpdateDate() {
		return _serviceInfo.getUpdateDate();
	}

	/**
	* Sets the update date of this service info.
	*
	* @param updateDate the update date of this service info
	*/
	@Override
	public void setUpdateDate(java.util.Date updateDate) {
		_serviceInfo.setUpdateDate(updateDate);
	}

	/**
	* Returns the update by of this service info.
	*
	* @return the update by of this service info
	*/
	@Override
	public long getUpdateBy() {
		return _serviceInfo.getUpdateBy();
	}

	/**
	* Sets the update by of this service info.
	*
	* @param updateBy the update by of this service info
	*/
	@Override
	public void setUpdateBy(long updateBy) {
		_serviceInfo.setUpdateBy(updateBy);
	}

	@Override
	public boolean isNew() {
		return _serviceInfo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_serviceInfo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _serviceInfo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_serviceInfo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _serviceInfo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _serviceInfo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_serviceInfo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _serviceInfo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_serviceInfo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_serviceInfo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_serviceInfo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceInfoWrapper((ServiceInfo)_serviceInfo.clone());
	}

	@Override
	public int compareTo(ServiceInfo serviceInfo) {
		return _serviceInfo.compareTo(serviceInfo);
	}

	@Override
	public int hashCode() {
		return _serviceInfo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ServiceInfo> toCacheModel() {
		return _serviceInfo.toCacheModel();
	}

	@Override
	public ServiceInfo toEscapedModel() {
		return new ServiceInfoWrapper(_serviceInfo.toEscapedModel());
	}

	@Override
	public ServiceInfo toUnescapedModel() {
		return new ServiceInfoWrapper(_serviceInfo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _serviceInfo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _serviceInfo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceInfo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceInfoWrapper)) {
			return false;
		}

		ServiceInfoWrapper serviceInfoWrapper = (ServiceInfoWrapper)obj;

		if (Validator.equals(_serviceInfo, serviceInfoWrapper._serviceInfo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServiceInfo getWrappedServiceInfo() {
		return _serviceInfo;
	}

	@Override
	public ServiceInfo getWrappedModel() {
		return _serviceInfo;
	}

	@Override
	public void resetOriginalValues() {
		_serviceInfo.resetOriginalValues();
	}

	private ServiceInfo _serviceInfo;
}