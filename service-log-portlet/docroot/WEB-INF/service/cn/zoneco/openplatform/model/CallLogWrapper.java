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
 * This class is a wrapper for {@link CallLog}.
 * </p>
 *
 * @author fxbird
 * @see CallLog
 * @generated
 */
public class CallLogWrapper implements CallLog, ModelWrapper<CallLog> {
	public CallLogWrapper(CallLog callLog) {
		_callLog = callLog;
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

	/**
	* Returns the primary key of this call log.
	*
	* @return the primary key of this call log
	*/
	@Override
	public long getPrimaryKey() {
		return _callLog.getPrimaryKey();
	}

	/**
	* Sets the primary key of this call log.
	*
	* @param primaryKey the primary key of this call log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_callLog.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the log ID of this call log.
	*
	* @return the log ID of this call log
	*/
	@Override
	public long getLogId() {
		return _callLog.getLogId();
	}

	/**
	* Sets the log ID of this call log.
	*
	* @param logId the log ID of this call log
	*/
	@Override
	public void setLogId(long logId) {
		_callLog.setLogId(logId);
	}

	/**
	* Returns the user name of this call log.
	*
	* @return the user name of this call log
	*/
	@Override
	public java.lang.String getUserName() {
		return _callLog.getUserName();
	}

	/**
	* Sets the user name of this call log.
	*
	* @param userName the user name of this call log
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_callLog.setUserName(userName);
	}

	/**
	* Returns the resource name of this call log.
	*
	* @return the resource name of this call log
	*/
	@Override
	public java.lang.String getResourceName() {
		return _callLog.getResourceName();
	}

	/**
	* Sets the resource name of this call log.
	*
	* @param resourceName the resource name of this call log
	*/
	@Override
	public void setResourceName(java.lang.String resourceName) {
		_callLog.setResourceName(resourceName);
	}

	/**
	* Returns the start time of this call log.
	*
	* @return the start time of this call log
	*/
	@Override
	public java.util.Date getStartTime() {
		return _callLog.getStartTime();
	}

	/**
	* Sets the start time of this call log.
	*
	* @param startTime the start time of this call log
	*/
	@Override
	public void setStartTime(java.util.Date startTime) {
		_callLog.setStartTime(startTime);
	}

	/**
	* Returns the end time of this call log.
	*
	* @return the end time of this call log
	*/
	@Override
	public java.util.Date getEndTime() {
		return _callLog.getEndTime();
	}

	/**
	* Sets the end time of this call log.
	*
	* @param endTime the end time of this call log
	*/
	@Override
	public void setEndTime(java.util.Date endTime) {
		_callLog.setEndTime(endTime);
	}

	/**
	* Returns the log status of this call log.
	*
	* @return the log status of this call log
	*/
	@Override
	public java.lang.String getLogStatus() {
		return _callLog.getLogStatus();
	}

	/**
	* Sets the log status of this call log.
	*
	* @param logStatus the log status of this call log
	*/
	@Override
	public void setLogStatus(java.lang.String logStatus) {
		_callLog.setLogStatus(logStatus);
	}

	/**
	* Returns the log message of this call log.
	*
	* @return the log message of this call log
	*/
	@Override
	public java.lang.String getLogMessage() {
		return _callLog.getLogMessage();
	}

	/**
	* Sets the log message of this call log.
	*
	* @param logMessage the log message of this call log
	*/
	@Override
	public void setLogMessage(java.lang.String logMessage) {
		_callLog.setLogMessage(logMessage);
	}

	/**
	* Returns the user ID of this call log.
	*
	* @return the user ID of this call log
	*/
	@Override
	public long getUserId() {
		return _callLog.getUserId();
	}

	/**
	* Sets the user ID of this call log.
	*
	* @param userId the user ID of this call log
	*/
	@Override
	public void setUserId(long userId) {
		_callLog.setUserId(userId);
	}

	/**
	* Returns the user uuid of this call log.
	*
	* @return the user uuid of this call log
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callLog.getUserUuid();
	}

	/**
	* Sets the user uuid of this call log.
	*
	* @param userUuid the user uuid of this call log
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_callLog.setUserUuid(userUuid);
	}

	/**
	* Returns the resource ID of this call log.
	*
	* @return the resource ID of this call log
	*/
	@Override
	public long getResourceId() {
		return _callLog.getResourceId();
	}

	/**
	* Sets the resource ID of this call log.
	*
	* @param resourceId the resource ID of this call log
	*/
	@Override
	public void setResourceId(long resourceId) {
		_callLog.setResourceId(resourceId);
	}

	/**
	* Returns the in msg of this call log.
	*
	* @return the in msg of this call log
	*/
	@Override
	public java.lang.String getInMsg() {
		return _callLog.getInMsg();
	}

	/**
	* Sets the in msg of this call log.
	*
	* @param inMsg the in msg of this call log
	*/
	@Override
	public void setInMsg(java.lang.String inMsg) {
		_callLog.setInMsg(inMsg);
	}

	/**
	* Returns the out msg of this call log.
	*
	* @return the out msg of this call log
	*/
	@Override
	public java.lang.String getOutMsg() {
		return _callLog.getOutMsg();
	}

	/**
	* Sets the out msg of this call log.
	*
	* @param outMsg the out msg of this call log
	*/
	@Override
	public void setOutMsg(java.lang.String outMsg) {
		_callLog.setOutMsg(outMsg);
	}

	@Override
	public boolean isNew() {
		return _callLog.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_callLog.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _callLog.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_callLog.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _callLog.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _callLog.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_callLog.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _callLog.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_callLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_callLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_callLog.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CallLogWrapper((CallLog)_callLog.clone());
	}

	@Override
	public int compareTo(CallLog callLog) {
		return _callLog.compareTo(callLog);
	}

	@Override
	public int hashCode() {
		return _callLog.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<CallLog> toCacheModel() {
		return _callLog.toCacheModel();
	}

	@Override
	public CallLog toEscapedModel() {
		return new CallLogWrapper(_callLog.toEscapedModel());
	}

	@Override
	public CallLog toUnescapedModel() {
		return new CallLogWrapper(_callLog.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _callLog.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _callLog.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_callLog.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CallLogWrapper)) {
			return false;
		}

		CallLogWrapper callLogWrapper = (CallLogWrapper)obj;

		if (Validator.equals(_callLog, callLogWrapper._callLog)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CallLog getWrappedCallLog() {
		return _callLog;
	}

	@Override
	public CallLog getWrappedModel() {
		return _callLog;
	}

	@Override
	public void resetOriginalValues() {
		_callLog.resetOriginalValues();
	}

	private CallLog _callLog;
}