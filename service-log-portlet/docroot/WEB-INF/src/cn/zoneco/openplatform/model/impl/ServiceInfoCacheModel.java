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

import cn.zoneco.openplatform.model.ServiceInfo;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ServiceInfo in entity cache.
 *
 * @author fxbird
 * @see ServiceInfo
 * @generated
 */
public class ServiceInfoCacheModel implements CacheModel<ServiceInfo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{resourceId=");
		sb.append(resourceId);
		sb.append(", resourceName=");
		sb.append(resourceName);
		sb.append(", description=");
		sb.append(description);
		sb.append(", logoAttId=");
		sb.append(logoAttId);
		sb.append(", wsdlAttId=");
		sb.append(wsdlAttId);
		sb.append(", statusId=");
		sb.append(statusId);
		sb.append(", applyDate=");
		sb.append(applyDate);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", createBy=");
		sb.append(createBy);
		sb.append(", updateDate=");
		sb.append(updateDate);
		sb.append(", updateBy=");
		sb.append(updateBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServiceInfo toEntityModel() {
		ServiceInfoImpl serviceInfoImpl = new ServiceInfoImpl();

		serviceInfoImpl.setResourceId(resourceId);

		if (resourceName == null) {
			serviceInfoImpl.setResourceName(StringPool.BLANK);
		}
		else {
			serviceInfoImpl.setResourceName(resourceName);
		}

		if (description == null) {
			serviceInfoImpl.setDescription(StringPool.BLANK);
		}
		else {
			serviceInfoImpl.setDescription(description);
		}

		serviceInfoImpl.setLogoAttId(logoAttId);
		serviceInfoImpl.setWsdlAttId(wsdlAttId);
		serviceInfoImpl.setStatusId(statusId);
		serviceInfoImpl.setApplyDate(applyDate);

		if (createDate == Long.MIN_VALUE) {
			serviceInfoImpl.setCreateDate(null);
		}
		else {
			serviceInfoImpl.setCreateDate(new Date(createDate));
		}

		serviceInfoImpl.setCreateBy(createBy);

		if (updateDate == Long.MIN_VALUE) {
			serviceInfoImpl.setUpdateDate(null);
		}
		else {
			serviceInfoImpl.setUpdateDate(new Date(updateDate));
		}

		serviceInfoImpl.setUpdateBy(updateBy);

		serviceInfoImpl.resetOriginalValues();

		return serviceInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		resourceId = objectInput.readLong();
		resourceName = objectInput.readUTF();
		description = objectInput.readUTF();
		logoAttId = objectInput.readLong();
		wsdlAttId = objectInput.readLong();
		statusId = objectInput.readInt();
		applyDate = objectInput.readInt();
		createDate = objectInput.readLong();
		createBy = objectInput.readLong();
		updateDate = objectInput.readLong();
		updateBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(resourceId);

		if (resourceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resourceName);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(logoAttId);
		objectOutput.writeLong(wsdlAttId);
		objectOutput.writeInt(statusId);
		objectOutput.writeInt(applyDate);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(createBy);
		objectOutput.writeLong(updateDate);
		objectOutput.writeLong(updateBy);
	}

	public long resourceId;
	public String resourceName;
	public String description;
	public long logoAttId;
	public long wsdlAttId;
	public int statusId;
	public int applyDate;
	public long createDate;
	public long createBy;
	public long updateDate;
	public long updateBy;
}