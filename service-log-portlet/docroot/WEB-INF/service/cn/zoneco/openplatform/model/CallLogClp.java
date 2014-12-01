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

import cn.zoneco.openplatform.service.CallLogLocalServiceUtil;
import cn.zoneco.openplatform.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fxbird
 */
public class CallLogClp extends BaseModelImpl<CallLog> implements CallLog {
	public CallLogClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CallLog.class;
	}

	@Override
	public String getModelClassName() {
		return CallLog.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _logId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _logId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("logId", getLogId());
		attributes.put("userName", getUserName());
		attributes.put("resourceName", getResourceName());
		attributes.put("startTime", getStartTime());
		attributes.put("endTime", getEndTime());
		attributes.put("logStatus", getLogStatus());
		attributes.put("logMessage", getLogMessage());
		attributes.put("userId", getUserId());
		attributes.put("resourceId", getResourceId());
		attributes.put("inMsg", getInMsg());
		attributes.put("outMsg", getOutMsg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long logId = (Long)attributes.get("logId");

		if (logId != null) {
			setLogId(logId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String resourceName = (String)attributes.get("resourceName");

		if (resourceName != null) {
			setResourceName(resourceName);
		}

		Date startTime = (Date)attributes.get("startTime");

		if (startTime != null) {
			setStartTime(startTime);
		}

		Date endTime = (Date)attributes.get("endTime");

		if (endTime != null) {
			setEndTime(endTime);
		}

		String logStatus = (String)attributes.get("logStatus");

		if (logStatus != null) {
			setLogStatus(logStatus);
		}

		String logMessage = (String)attributes.get("logMessage");

		if (logMessage != null) {
			setLogMessage(logMessage);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long resourceId = (Long)attributes.get("resourceId");

		if (resourceId != null) {
			setResourceId(resourceId);
		}

		String inMsg = (String)attributes.get("inMsg");

		if (inMsg != null) {
			setInMsg(inMsg);
		}

		String outMsg = (String)attributes.get("outMsg");

		if (outMsg != null) {
			setOutMsg(outMsg);
		}
	}

	@Override
	public long getLogId() {
		return _logId;
	}

	@Override
	public void setLogId(long logId) {
		_logId = logId;

		if (_callLogRemoteModel != null) {
			try {
				Class<?> clazz = _callLogRemoteModel.getClass();

				Method method = clazz.getMethod("setLogId", long.class);

				method.invoke(_callLogRemoteModel, logId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_callLogRemoteModel != null) {
			try {
				Class<?> clazz = _callLogRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_callLogRemoteModel, userName);
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

		if (_callLogRemoteModel != null) {
			try {
				Class<?> clazz = _callLogRemoteModel.getClass();

				Method method = clazz.getMethod("setResourceName", String.class);

				method.invoke(_callLogRemoteModel, resourceName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStartTime() {
		return _startTime;
	}

	@Override
	public void setStartTime(Date startTime) {
		_startTime = startTime;

		if (_callLogRemoteModel != null) {
			try {
				Class<?> clazz = _callLogRemoteModel.getClass();

				Method method = clazz.getMethod("setStartTime", Date.class);

				method.invoke(_callLogRemoteModel, startTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEndTime() {
		return _endTime;
	}

	@Override
	public void setEndTime(Date endTime) {
		_endTime = endTime;

		if (_callLogRemoteModel != null) {
			try {
				Class<?> clazz = _callLogRemoteModel.getClass();

				Method method = clazz.getMethod("setEndTime", Date.class);

				method.invoke(_callLogRemoteModel, endTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLogStatus() {
		return _logStatus;
	}

	@Override
	public void setLogStatus(String logStatus) {
		_logStatus = logStatus;

		if (_callLogRemoteModel != null) {
			try {
				Class<?> clazz = _callLogRemoteModel.getClass();

				Method method = clazz.getMethod("setLogStatus", String.class);

				method.invoke(_callLogRemoteModel, logStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLogMessage() {
		return _logMessage;
	}

	@Override
	public void setLogMessage(String logMessage) {
		_logMessage = logMessage;

		if (_callLogRemoteModel != null) {
			try {
				Class<?> clazz = _callLogRemoteModel.getClass();

				Method method = clazz.getMethod("setLogMessage", String.class);

				method.invoke(_callLogRemoteModel, logMessage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_callLogRemoteModel != null) {
			try {
				Class<?> clazz = _callLogRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_callLogRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getResourceId() {
		return _resourceId;
	}

	@Override
	public void setResourceId(long resourceId) {
		_resourceId = resourceId;

		if (_callLogRemoteModel != null) {
			try {
				Class<?> clazz = _callLogRemoteModel.getClass();

				Method method = clazz.getMethod("setResourceId", long.class);

				method.invoke(_callLogRemoteModel, resourceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInMsg() {
		return _inMsg;
	}

	@Override
	public void setInMsg(String inMsg) {
		_inMsg = inMsg;

		if (_callLogRemoteModel != null) {
			try {
				Class<?> clazz = _callLogRemoteModel.getClass();

				Method method = clazz.getMethod("setInMsg", String.class);

				method.invoke(_callLogRemoteModel, inMsg);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOutMsg() {
		return _outMsg;
	}

	@Override
	public void setOutMsg(String outMsg) {
		_outMsg = outMsg;

		if (_callLogRemoteModel != null) {
			try {
				Class<?> clazz = _callLogRemoteModel.getClass();

				Method method = clazz.getMethod("setOutMsg", String.class);

				method.invoke(_callLogRemoteModel, outMsg);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCallLogRemoteModel() {
		return _callLogRemoteModel;
	}

	public void setCallLogRemoteModel(BaseModel<?> callLogRemoteModel) {
		_callLogRemoteModel = callLogRemoteModel;
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

		Class<?> remoteModelClass = _callLogRemoteModel.getClass();

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

		Object returnValue = method.invoke(_callLogRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CallLogLocalServiceUtil.addCallLog(this);
		}
		else {
			CallLogLocalServiceUtil.updateCallLog(this);
		}
	}

	@Override
	public CallLog toEscapedModel() {
		return (CallLog)ProxyUtil.newProxyInstance(CallLog.class.getClassLoader(),
			new Class[] { CallLog.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CallLogClp clone = new CallLogClp();

		clone.setLogId(getLogId());
		clone.setUserName(getUserName());
		clone.setResourceName(getResourceName());
		clone.setStartTime(getStartTime());
		clone.setEndTime(getEndTime());
		clone.setLogStatus(getLogStatus());
		clone.setLogMessage(getLogMessage());
		clone.setUserId(getUserId());
		clone.setResourceId(getResourceId());
		clone.setInMsg(getInMsg());
		clone.setOutMsg(getOutMsg());

		return clone;
	}

	@Override
	public int compareTo(CallLog callLog) {
		long primaryKey = callLog.getPrimaryKey();

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

		if (!(obj instanceof CallLogClp)) {
			return false;
		}

		CallLogClp callLog = (CallLogClp)obj;

		long primaryKey = callLog.getPrimaryKey();

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

		sb.append("{logId=");
		sb.append(getLogId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", resourceName=");
		sb.append(getResourceName());
		sb.append(", startTime=");
		sb.append(getStartTime());
		sb.append(", endTime=");
		sb.append(getEndTime());
		sb.append(", logStatus=");
		sb.append(getLogStatus());
		sb.append(", logMessage=");
		sb.append(getLogMessage());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", resourceId=");
		sb.append(getResourceId());
		sb.append(", inMsg=");
		sb.append(getInMsg());
		sb.append(", outMsg=");
		sb.append(getOutMsg());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("cn.zoneco.openplatform.model.CallLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>logId</column-name><column-value><![CDATA[");
		sb.append(getLogId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resourceName</column-name><column-value><![CDATA[");
		sb.append(getResourceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startTime</column-name><column-value><![CDATA[");
		sb.append(getStartTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endTime</column-name><column-value><![CDATA[");
		sb.append(getEndTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logStatus</column-name><column-value><![CDATA[");
		sb.append(getLogStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logMessage</column-name><column-value><![CDATA[");
		sb.append(getLogMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resourceId</column-name><column-value><![CDATA[");
		sb.append(getResourceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inMsg</column-name><column-value><![CDATA[");
		sb.append(getInMsg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>outMsg</column-name><column-value><![CDATA[");
		sb.append(getOutMsg());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _logId;
	private String _userName;
	private String _resourceName;
	private Date _startTime;
	private Date _endTime;
	private String _logStatus;
	private String _logMessage;
	private long _userId;
	private String _userUuid;
	private long _resourceId;
	private String _inMsg;
	private String _outMsg;
	private BaseModel<?> _callLogRemoteModel;
}