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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author fxbird
 * @generated
 */
public class CallLogSoap implements Serializable {
	public static CallLogSoap toSoapModel(CallLog model) {
		CallLogSoap soapModel = new CallLogSoap();

		soapModel.setLogId(model.getLogId());
		soapModel.setUserName(model.getUserName());
		soapModel.setResourceName(model.getResourceName());
		soapModel.setStartTime(model.getStartTime());
		soapModel.setEndTime(model.getEndTime());
		soapModel.setLogStatus(model.getLogStatus());
		soapModel.setLogMessage(model.getLogMessage());
		soapModel.setUserId(model.getUserId());
		soapModel.setResourceId(model.getResourceId());
		soapModel.setInMsg(model.getInMsg());
		soapModel.setOutMsg(model.getOutMsg());

		return soapModel;
	}

	public static CallLogSoap[] toSoapModels(CallLog[] models) {
		CallLogSoap[] soapModels = new CallLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CallLogSoap[][] toSoapModels(CallLog[][] models) {
		CallLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CallLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CallLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CallLogSoap[] toSoapModels(List<CallLog> models) {
		List<CallLogSoap> soapModels = new ArrayList<CallLogSoap>(models.size());

		for (CallLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CallLogSoap[soapModels.size()]);
	}

	public CallLogSoap() {
	}

	public long getPrimaryKey() {
		return _logId;
	}

	public void setPrimaryKey(long pk) {
		setLogId(pk);
	}

	public long getLogId() {
		return _logId;
	}

	public void setLogId(long logId) {
		_logId = logId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getResourceName() {
		return _resourceName;
	}

	public void setResourceName(String resourceName) {
		_resourceName = resourceName;
	}

	public Date getStartTime() {
		return _startTime;
	}

	public void setStartTime(Date startTime) {
		_startTime = startTime;
	}

	public Date getEndTime() {
		return _endTime;
	}

	public void setEndTime(Date endTime) {
		_endTime = endTime;
	}

	public String getLogStatus() {
		return _logStatus;
	}

	public void setLogStatus(String logStatus) {
		_logStatus = logStatus;
	}

	public String getLogMessage() {
		return _logMessage;
	}

	public void setLogMessage(String logMessage) {
		_logMessage = logMessage;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getResourceId() {
		return _resourceId;
	}

	public void setResourceId(long resourceId) {
		_resourceId = resourceId;
	}

	public String getInMsg() {
		return _inMsg;
	}

	public void setInMsg(String inMsg) {
		_inMsg = inMsg;
	}

	public String getOutMsg() {
		return _outMsg;
	}

	public void setOutMsg(String outMsg) {
		_outMsg = outMsg;
	}

	private long _logId;
	private String _userName;
	private String _resourceName;
	private Date _startTime;
	private Date _endTime;
	private String _logStatus;
	private String _logMessage;
	private long _userId;
	private long _resourceId;
	private String _inMsg;
	private String _outMsg;
}