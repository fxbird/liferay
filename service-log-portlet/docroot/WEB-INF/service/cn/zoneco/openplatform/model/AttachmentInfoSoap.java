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

import java.sql.Blob;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author fxbird
 * @generated
 */
public class AttachmentInfoSoap implements Serializable {
	public static AttachmentInfoSoap toSoapModel(AttachmentInfo model) {
		AttachmentInfoSoap soapModel = new AttachmentInfoSoap();

		soapModel.setAttachId(model.getAttachId());
		soapModel.setOriName(model.getOriName());
		soapModel.setSaveName(model.getSaveName());
		soapModel.setTypeCode(model.getTypeCode());
		soapModel.setAttContent(model.getAttContent());
		soapModel.setExtName(model.getExtName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setCreateBy(model.getCreateBy());

		return soapModel;
	}

	public static AttachmentInfoSoap[] toSoapModels(AttachmentInfo[] models) {
		AttachmentInfoSoap[] soapModels = new AttachmentInfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AttachmentInfoSoap[][] toSoapModels(AttachmentInfo[][] models) {
		AttachmentInfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AttachmentInfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AttachmentInfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AttachmentInfoSoap[] toSoapModels(List<AttachmentInfo> models) {
		List<AttachmentInfoSoap> soapModels = new ArrayList<AttachmentInfoSoap>(models.size());

		for (AttachmentInfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AttachmentInfoSoap[soapModels.size()]);
	}

	public AttachmentInfoSoap() {
	}

	public long getPrimaryKey() {
		return _attachId;
	}

	public void setPrimaryKey(long pk) {
		setAttachId(pk);
	}

	public long getAttachId() {
		return _attachId;
	}

	public void setAttachId(long attachId) {
		_attachId = attachId;
	}

	public String getOriName() {
		return _oriName;
	}

	public void setOriName(String oriName) {
		_oriName = oriName;
	}

	public String getSaveName() {
		return _saveName;
	}

	public void setSaveName(String saveName) {
		_saveName = saveName;
	}

	public String getTypeCode() {
		return _typeCode;
	}

	public void setTypeCode(String typeCode) {
		_typeCode = typeCode;
	}

	public Blob getAttContent() {
		return _attContent;
	}

	public void setAttContent(Blob attContent) {
		_attContent = attContent;
	}

	public String getExtName() {
		return _extName;
	}

	public void setExtName(String extName) {
		_extName = extName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getCreateBy() {
		return _createBy;
	}

	public void setCreateBy(long createBy) {
		_createBy = createBy;
	}

	private long _attachId;
	private String _oriName;
	private String _saveName;
	private String _typeCode;
	private Blob _attContent;
	private String _extName;
	private Date _createDate;
	private long _createBy;
}