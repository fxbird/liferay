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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CallLog in entity cache.
 *
 * @author fxbird
 * @see CallLog
 * @generated
 */
public class CallLogCacheModel implements CacheModel<CallLog>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{logId=");
		sb.append(logId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", resourceName=");
		sb.append(resourceName);
		sb.append(", startTime=");
		sb.append(startTime);
		sb.append(", endTime=");
		sb.append(endTime);
		sb.append(", logStatus=");
		sb.append(logStatus);
		sb.append(", logMessage=");
		sb.append(logMessage);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", resourceId=");
		sb.append(resourceId);
		sb.append(", inMsg=");
		sb.append(inMsg);
		sb.append(", outMsg=");
		sb.append(outMsg);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CallLog toEntityModel() {
		CallLogImpl callLogImpl = new CallLogImpl();

		callLogImpl.setLogId(logId);

		if (userName == null) {
			callLogImpl.setUserName(StringPool.BLANK);
		}
		else {
			callLogImpl.setUserName(userName);
		}

		if (resourceName == null) {
			callLogImpl.setResourceName(StringPool.BLANK);
		}
		else {
			callLogImpl.setResourceName(resourceName);
		}

		if (startTime == Long.MIN_VALUE) {
			callLogImpl.setStartTime(null);
		}
		else {
			callLogImpl.setStartTime(new Date(startTime));
		}

		if (endTime == Long.MIN_VALUE) {
			callLogImpl.setEndTime(null);
		}
		else {
			callLogImpl.setEndTime(new Date(endTime));
		}

		if (logStatus == null) {
			callLogImpl.setLogStatus(StringPool.BLANK);
		}
		else {
			callLogImpl.setLogStatus(logStatus);
		}

		if (logMessage == null) {
			callLogImpl.setLogMessage(StringPool.BLANK);
		}
		else {
			callLogImpl.setLogMessage(logMessage);
		}

		callLogImpl.setUserId(userId);
		callLogImpl.setResourceId(resourceId);

		if (inMsg == null) {
			callLogImpl.setInMsg(StringPool.BLANK);
		}
		else {
			callLogImpl.setInMsg(inMsg);
		}

		if (outMsg == null) {
			callLogImpl.setOutMsg(StringPool.BLANK);
		}
		else {
			callLogImpl.setOutMsg(outMsg);
		}

		callLogImpl.resetOriginalValues();

		return callLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		logId = objectInput.readLong();
		userName = objectInput.readUTF();
		resourceName = objectInput.readUTF();
		startTime = objectInput.readLong();
		endTime = objectInput.readLong();
		logStatus = objectInput.readUTF();
		logMessage = objectInput.readUTF();
		userId = objectInput.readLong();
		resourceId = objectInput.readLong();
		inMsg = objectInput.readUTF();
		outMsg = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(logId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (resourceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resourceName);
		}

		objectOutput.writeLong(startTime);
		objectOutput.writeLong(endTime);

		if (logStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(logStatus);
		}

		if (logMessage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(logMessage);
		}

		objectOutput.writeLong(userId);
		objectOutput.writeLong(resourceId);

		if (inMsg == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inMsg);
		}

		if (outMsg == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(outMsg);
		}
	}

	public long logId;
	public String userName;
	public String resourceName;
	public long startTime;
	public long endTime;
	public String logStatus;
	public String logMessage;
	public long userId;
	public long resourceId;
	public String inMsg;
	public String outMsg;
}