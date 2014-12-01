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

import cn.zoneco.openplatform.service.CheckStatusLocalServiceUtil;
import cn.zoneco.openplatform.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fxbird
 */
public class CheckStatusClp extends BaseModelImpl<CheckStatus>
	implements CheckStatus {
	public CheckStatusClp() {
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
	public long getPrimaryKey() {
		return _statusId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStatusId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _statusId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getStatusId() {
		return _statusId;
	}

	@Override
	public void setStatusId(long statusId) {
		_statusId = statusId;

		if (_checkStatusRemoteModel != null) {
			try {
				Class<?> clazz = _checkStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusId", long.class);

				method.invoke(_checkStatusRemoteModel, statusId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusName() {
		return _statusName;
	}

	@Override
	public void setStatusName(String statusName) {
		_statusName = statusName;

		if (_checkStatusRemoteModel != null) {
			try {
				Class<?> clazz = _checkStatusRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusName", String.class);

				method.invoke(_checkStatusRemoteModel, statusName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCheckStatusRemoteModel() {
		return _checkStatusRemoteModel;
	}

	public void setCheckStatusRemoteModel(BaseModel<?> checkStatusRemoteModel) {
		_checkStatusRemoteModel = checkStatusRemoteModel;
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

		Class<?> remoteModelClass = _checkStatusRemoteModel.getClass();

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

		Object returnValue = method.invoke(_checkStatusRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CheckStatusLocalServiceUtil.addCheckStatus(this);
		}
		else {
			CheckStatusLocalServiceUtil.updateCheckStatus(this);
		}
	}

	@Override
	public CheckStatus toEscapedModel() {
		return (CheckStatus)ProxyUtil.newProxyInstance(CheckStatus.class.getClassLoader(),
			new Class[] { CheckStatus.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CheckStatusClp clone = new CheckStatusClp();

		clone.setStatusId(getStatusId());
		clone.setStatusName(getStatusName());

		return clone;
	}

	@Override
	public int compareTo(CheckStatus checkStatus) {
		long primaryKey = checkStatus.getPrimaryKey();

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

		if (!(obj instanceof CheckStatusClp)) {
			return false;
		}

		CheckStatusClp checkStatus = (CheckStatusClp)obj;

		long primaryKey = checkStatus.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{statusId=");
		sb.append(getStatusId());
		sb.append(", statusName=");
		sb.append(getStatusName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("cn.zoneco.openplatform.model.CheckStatus");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>statusId</column-name><column-value><![CDATA[");
		sb.append(getStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusName</column-name><column-value><![CDATA[");
		sb.append(getStatusName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _statusId;
	private String _statusName;
	private BaseModel<?> _checkStatusRemoteModel;
}