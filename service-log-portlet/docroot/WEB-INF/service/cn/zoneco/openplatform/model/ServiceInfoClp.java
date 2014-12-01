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

import cn.zoneco.openplatform.service.ClpSerializer;
import cn.zoneco.openplatform.service.ServiceInfoLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fxbird
 */
public class ServiceInfoClp extends BaseModelImpl<ServiceInfo>
	implements ServiceInfo {
	public ServiceInfoClp() {
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
	public long getPrimaryKey() {
		return _resourceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setResourceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _resourceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getResourceId() {
		return _resourceId;
	}

	@Override
	public void setResourceId(long resourceId) {
		_resourceId = resourceId;

		if (_serviceInfoRemoteModel != null) {
			try {
				Class<?> clazz = _serviceInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setResourceId", long.class);

				method.invoke(_serviceInfoRemoteModel, resourceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getResourceName() {
		return _resourceName;
	}

	@Override
	public void setResourceName(String resourceName) {
		_resourceName = resourceName;

		if (_serviceInfoRemoteModel != null) {
			try {
				Class<?> clazz = _serviceInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setResourceName", String.class);

				method.invoke(_serviceInfoRemoteModel, resourceName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_serviceInfoRemoteModel != null) {
			try {
				Class<?> clazz = _serviceInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_serviceInfoRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLogoAttId() {
		return _logoAttId;
	}

	@Override
	public void setLogoAttId(long logoAttId) {
		_logoAttId = logoAttId;

		if (_serviceInfoRemoteModel != null) {
			try {
				Class<?> clazz = _serviceInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setLogoAttId", long.class);

				method.invoke(_serviceInfoRemoteModel, logoAttId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getWsdlAttId() {
		return _wsdlAttId;
	}

	@Override
	public void setWsdlAttId(long wsdlAttId) {
		_wsdlAttId = wsdlAttId;

		if (_serviceInfoRemoteModel != null) {
			try {
				Class<?> clazz = _serviceInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setWsdlAttId", long.class);

				method.invoke(_serviceInfoRemoteModel, wsdlAttId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatusId() {
		return _statusId;
	}

	@Override
	public void setStatusId(int statusId) {
		_statusId = statusId;

		if (_serviceInfoRemoteModel != null) {
			try {
				Class<?> clazz = _serviceInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusId", int.class);

				method.invoke(_serviceInfoRemoteModel, statusId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getApplyDate() {
		return _applyDate;
	}

	@Override
	public void setApplyDate(int applyDate) {
		_applyDate = applyDate;

		if (_serviceInfoRemoteModel != null) {
			try {
				Class<?> clazz = _serviceInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setApplyDate", int.class);

				method.invoke(_serviceInfoRemoteModel, applyDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_serviceInfoRemoteModel != null) {
			try {
				Class<?> clazz = _serviceInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_serviceInfoRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreateBy() {
		return _createBy;
	}

	@Override
	public void setCreateBy(long createBy) {
		_createBy = createBy;

		if (_serviceInfoRemoteModel != null) {
			try {
				Class<?> clazz = _serviceInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_serviceInfoRemoteModel, createBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUpdateDate() {
		return _updateDate;
	}

	@Override
	public void setUpdateDate(Date updateDate) {
		_updateDate = updateDate;

		if (_serviceInfoRemoteModel != null) {
			try {
				Class<?> clazz = _serviceInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdateDate", Date.class);

				method.invoke(_serviceInfoRemoteModel, updateDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUpdateBy() {
		return _updateBy;
	}

	@Override
	public void setUpdateBy(long updateBy) {
		_updateBy = updateBy;

		if (_serviceInfoRemoteModel != null) {
			try {
				Class<?> clazz = _serviceInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdateBy", long.class);

				method.invoke(_serviceInfoRemoteModel, updateBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getServiceInfoRemoteModel() {
		return _serviceInfoRemoteModel;
	}

	public void setServiceInfoRemoteModel(BaseModel<?> serviceInfoRemoteModel) {
		_serviceInfoRemoteModel = serviceInfoRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _serviceInfoRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_serviceInfoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ServiceInfoLocalServiceUtil.addServiceInfo(this);
		}
		else {
			ServiceInfoLocalServiceUtil.updateServiceInfo(this);
		}
	}

	@Override
	public ServiceInfo toEscapedModel() {
		return (ServiceInfo)ProxyUtil.newProxyInstance(ServiceInfo.class.getClassLoader(),
			new Class[] { ServiceInfo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ServiceInfoClp clone = new ServiceInfoClp();

		clone.setResourceId(getResourceId());
		clone.setResourceName(getResourceName());
		clone.setDescription(getDescription());
		clone.setLogoAttId(getLogoAttId());
		clone.setWsdlAttId(getWsdlAttId());
		clone.setStatusId(getStatusId());
		clone.setApplyDate(getApplyDate());
		clone.setCreateDate(getCreateDate());
		clone.setCreateBy(getCreateBy());
		clone.setUpdateDate(getUpdateDate());
		clone.setUpdateBy(getUpdateBy());

		return clone;
	}

	@Override
	public int compareTo(ServiceInfo serviceInfo) {
		long primaryKey = serviceInfo.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceInfoClp)) {
			return false;
		}

		ServiceInfoClp serviceInfo = (ServiceInfoClp)obj;

		long primaryKey = serviceInfo.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{resourceId=");
		sb.append(getResourceId());
		sb.append(", resourceName=");
		sb.append(getResourceName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", logoAttId=");
		sb.append(getLogoAttId());
		sb.append(", wsdlAttId=");
		sb.append(getWsdlAttId());
		sb.append(", statusId=");
		sb.append(getStatusId());
		sb.append(", applyDate=");
		sb.append(getApplyDate());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", createBy=");
		sb.append(getCreateBy());
		sb.append(", updateDate=");
		sb.append(getUpdateDate());
		sb.append(", updateBy=");
		sb.append(getUpdateBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("cn.zoneco.openplatform.model.ServiceInfo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>resourceId</column-name><column-value><![CDATA[");
		sb.append(getResourceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resourceName</column-name><column-value><![CDATA[");
		sb.append(getResourceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logoAttId</column-name><column-value><![CDATA[");
		sb.append(getLogoAttId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wsdlAttId</column-name><column-value><![CDATA[");
		sb.append(getWsdlAttId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusId</column-name><column-value><![CDATA[");
		sb.append(getStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applyDate</column-name><column-value><![CDATA[");
		sb.append(getApplyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createBy</column-name><column-value><![CDATA[");
		sb.append(getCreateBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateDate</column-name><column-value><![CDATA[");
		sb.append(getUpdateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateBy</column-name><column-value><![CDATA[");
		sb.append(getUpdateBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _resourceId;
	private String _resourceName;
	private String _description;
	private long _logoAttId;
	private long _wsdlAttId;
	private int _statusId;
	private int _applyDate;
	private Date _createDate;
	private long _createBy;
	private Date _updateDate;
	private long _updateBy;
	private BaseModel<?> _serviceInfoRemoteModel;
}