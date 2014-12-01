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

package cn.zoneco.openplatform.model.impl;

import cn.zoneco.openplatform.model.CallLog;
import cn.zoneco.openplatform.model.CallLogModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CallLog service. Represents a row in the &quot;t_log&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link cn.zoneco.openplatform.model.CallLogModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CallLogImpl}.
 * </p>
 *
 * @author fxbird
 * @see CallLogImpl
 * @see cn.zoneco.openplatform.model.CallLog
 * @see cn.zoneco.openplatform.model.CallLogModel
 * @generated
 */
public class CallLogModelImpl extends BaseModelImpl<CallLog>
	implements CallLogModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a call log model instance should use the {@link cn.zoneco.openplatform.model.CallLog} interface instead.
	 */
	public static final String TABLE_NAME = "t_log";
	public static final Object[][] TABLE_COLUMNS = {
			{ "log_id", Types.BIGINT },
			{ "user_name", Types.VARCHAR },
			{ "resource_name", Types.VARCHAR },
			{ "start_time", Types.TIMESTAMP },
			{ "end_time", Types.TIMESTAMP },
			{ "log_status", Types.VARCHAR },
			{ "log_message", Types.VARCHAR },
			{ "user_id", Types.BIGINT },
			{ "resource_id", Types.BIGINT },
			{ "in_msg", Types.VARCHAR },
			{ "out_msg", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table t_log (log_id LONG not null primary key,user_name VARCHAR(75) null,resource_name VARCHAR(75) null,start_time DATE null,end_time DATE null,log_status VARCHAR(75) null,log_message VARCHAR(75) null,user_id LONG,resource_id LONG,in_msg VARCHAR(75) null,out_msg VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table t_log";
	public static final String ORDER_BY_JPQL = " ORDER BY callLog.logId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY t_log.log_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.cn.zoneco.openplatform.model.CallLog"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.cn.zoneco.openplatform.model.CallLog"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.cn.zoneco.openplatform.model.CallLog"));

	public CallLogModelImpl() {
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

	@Override
	public long getLogId() {
		return _logId;
	}

	@Override
	public void setLogId(long logId) {
		_logId = logId;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public String getResourceName() {
		if (_resourceName == null) {
			return StringPool.BLANK;
		}
		else {
			return _resourceName;
		}
	}

	@Override
	public void setResourceName(String resourceName) {
		_resourceName = resourceName;
	}

	@Override
	public Date getStartTime() {
		return _startTime;
	}

	@Override
	public void setStartTime(Date startTime) {
		_startTime = startTime;
	}

	@Override
	public Date getEndTime() {
		return _endTime;
	}

	@Override
	public void setEndTime(Date endTime) {
		_endTime = endTime;
	}

	@Override
	public String getLogStatus() {
		if (_logStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _logStatus;
		}
	}

	@Override
	public void setLogStatus(String logStatus) {
		_logStatus = logStatus;
	}

	@Override
	public String getLogMessage() {
		if (_logMessage == null) {
			return StringPool.BLANK;
		}
		else {
			return _logMessage;
		}
	}

	@Override
	public void setLogMessage(String logMessage) {
		_logMessage = logMessage;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
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
	}

	@Override
	public String getInMsg() {
		if (_inMsg == null) {
			return StringPool.BLANK;
		}
		else {
			return _inMsg;
		}
	}

	@Override
	public void setInMsg(String inMsg) {
		_inMsg = inMsg;
	}

	@Override
	public String getOutMsg() {
		if (_outMsg == null) {
			return StringPool.BLANK;
		}
		else {
			return _outMsg;
		}
	}

	@Override
	public void setOutMsg(String outMsg) {
		_outMsg = outMsg;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CallLog.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CallLog toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CallLog)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CallLogImpl callLogImpl = new CallLogImpl();

		callLogImpl.setLogId(getLogId());
		callLogImpl.setUserName(getUserName());
		callLogImpl.setResourceName(getResourceName());
		callLogImpl.setStartTime(getStartTime());
		callLogImpl.setEndTime(getEndTime());
		callLogImpl.setLogStatus(getLogStatus());
		callLogImpl.setLogMessage(getLogMessage());
		callLogImpl.setUserId(getUserId());
		callLogImpl.setResourceId(getResourceId());
		callLogImpl.setInMsg(getInMsg());
		callLogImpl.setOutMsg(getOutMsg());

		callLogImpl.resetOriginalValues();

		return callLogImpl;
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

		if (!(obj instanceof CallLog)) {
			return false;
		}

		CallLog callLog = (CallLog)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<CallLog> toCacheModel() {
		CallLogCacheModel callLogCacheModel = new CallLogCacheModel();

		callLogCacheModel.logId = getLogId();

		callLogCacheModel.userName = getUserName();

		String userName = callLogCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			callLogCacheModel.userName = null;
		}

		callLogCacheModel.resourceName = getResourceName();

		String resourceName = callLogCacheModel.resourceName;

		if ((resourceName != null) && (resourceName.length() == 0)) {
			callLogCacheModel.resourceName = null;
		}

		Date startTime = getStartTime();

		if (startTime != null) {
			callLogCacheModel.startTime = startTime.getTime();
		}
		else {
			callLogCacheModel.startTime = Long.MIN_VALUE;
		}

		Date endTime = getEndTime();

		if (endTime != null) {
			callLogCacheModel.endTime = endTime.getTime();
		}
		else {
			callLogCacheModel.endTime = Long.MIN_VALUE;
		}

		callLogCacheModel.logStatus = getLogStatus();

		String logStatus = callLogCacheModel.logStatus;

		if ((logStatus != null) && (logStatus.length() == 0)) {
			callLogCacheModel.logStatus = null;
		}

		callLogCacheModel.logMessage = getLogMessage();

		String logMessage = callLogCacheModel.logMessage;

		if ((logMessage != null) && (logMessage.length() == 0)) {
			callLogCacheModel.logMessage = null;
		}

		callLogCacheModel.userId = getUserId();

		callLogCacheModel.resourceId = getResourceId();

		callLogCacheModel.inMsg = getInMsg();

		String inMsg = callLogCacheModel.inMsg;

		if ((inMsg != null) && (inMsg.length() == 0)) {
			callLogCacheModel.inMsg = null;
		}

		callLogCacheModel.outMsg = getOutMsg();

		String outMsg = callLogCacheModel.outMsg;

		if ((outMsg != null) && (outMsg.length() == 0)) {
			callLogCacheModel.outMsg = null;
		}

		return callLogCacheModel;
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

	private static ClassLoader _classLoader = CallLog.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CallLog.class
		};
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
	private CallLog _escapedModel;
}