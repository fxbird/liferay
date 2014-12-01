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

import cn.zoneco.openplatform.model.AttachmentInfo;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttachmentInfo in entity cache.
 *
 * @author fxbird
 * @see AttachmentInfo
 * @generated
 */
public class AttachmentInfoCacheModel implements CacheModel<AttachmentInfo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{attachId=");
		sb.append(attachId);
		sb.append(", oriName=");
		sb.append(oriName);
		sb.append(", saveName=");
		sb.append(saveName);
		sb.append(", typeCode=");
		sb.append(typeCode);
		sb.append(", extName=");
		sb.append(extName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", createBy=");
		sb.append(createBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttachmentInfo toEntityModel() {
		AttachmentInfoImpl attachmentInfoImpl = new AttachmentInfoImpl();

		attachmentInfoImpl.setAttachId(attachId);

		if (oriName == null) {
			attachmentInfoImpl.setOriName(StringPool.BLANK);
		}
		else {
			attachmentInfoImpl.setOriName(oriName);
		}

		if (saveName == null) {
			attachmentInfoImpl.setSaveName(StringPool.BLANK);
		}
		else {
			attachmentInfoImpl.setSaveName(saveName);
		}

		if (typeCode == null) {
			attachmentInfoImpl.setTypeCode(StringPool.BLANK);
		}
		else {
			attachmentInfoImpl.setTypeCode(typeCode);
		}

		if (extName == null) {
			attachmentInfoImpl.setExtName(StringPool.BLANK);
		}
		else {
			attachmentInfoImpl.setExtName(extName);
		}

		if (createDate == Long.MIN_VALUE) {
			attachmentInfoImpl.setCreateDate(null);
		}
		else {
			attachmentInfoImpl.setCreateDate(new Date(createDate));
		}

		attachmentInfoImpl.setCreateBy(createBy);

		attachmentInfoImpl.resetOriginalValues();

		return attachmentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attachId = objectInput.readLong();
		oriName = objectInput.readUTF();
		saveName = objectInput.readUTF();
		typeCode = objectInput.readUTF();
		extName = objectInput.readUTF();
		createDate = objectInput.readLong();
		createBy = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(attachId);

		if (oriName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(oriName);
		}

		if (saveName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(saveName);
		}

		if (typeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeCode);
		}

		if (extName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(createBy);
	}

	public long attachId;
	public String oriName;
	public String saveName;
	public String typeCode;
	public String extName;
	public long createDate;
	public long createBy;
}