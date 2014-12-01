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

import cn.zoneco.openplatform.service.AttachmentInfoLocalServiceUtil;
import cn.zoneco.openplatform.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fxbird
 */
public class AttachmentInfoClp extends BaseModelImpl<AttachmentInfo>
	implements AttachmentInfo {
	public AttachmentInfoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AttachmentInfo.class;
	}

	@Override
	public String getModelClassName() {
		return AttachmentInfo.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _attachId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAttachId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _attachId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attachId", getAttachId());
		attributes.put("oriName", getOriName());
		attributes.put("saveName", getSaveName());
		attributes.put("typeCode", getTypeCode());
		attributes.put("attContent", getAttContent());
		attributes.put("extName", getExtName());
		attributes.put("createDate", getCreateDate());
		attributes.put("createBy", getCreateBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attachId = (Long)attributes.get("attachId");

		if (attachId != null) {
			setAttachId(attachId);
		}

		String oriName = (String)attributes.get("oriName");

		if (oriName != null) {
			setOriName(oriName);
		}

		String saveName = (String)attributes.get("saveName");

		if (saveName != null) {
			setSaveName(saveName);
		}

		String typeCode = (String)attributes.get("typeCode");

		if (typeCode != null) {
			setTypeCode(typeCode);
		}

		Blob attContent = (Blob)attributes.get("attContent");

		if (attContent != null) {
			setAttContent(attContent);
		}

		String extName = (String)attributes.get("extName");

		if (extName != null) {
			setExtName(extName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long createBy = (Long)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}
	}

	@Override
	public long getAttachId() {
		return _attachId;
	}

	@Override
	public void setAttachId(long attachId) {
		_attachId = attachId;

		if (_attachmentInfoRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachId", long.class);

				method.invoke(_attachmentInfoRemoteModel, attachId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOriName() {
		return _oriName;
	}

	@Override
	public void setOriName(String oriName) {
		_oriName = oriName;

		if (_attachmentInfoRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setOriName", String.class);

				method.invoke(_attachmentInfoRemoteModel, oriName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSaveName() {
		return _saveName;
	}

	@Override
	public void setSaveName(String saveName) {
		_saveName = saveName;

		if (_attachmentInfoRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setSaveName", String.class);

				method.invoke(_attachmentInfoRemoteModel, saveName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTypeCode() {
		return _typeCode;
	}

	@Override
	public void setTypeCode(String typeCode) {
		_typeCode = typeCode;

		if (_attachmentInfoRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setTypeCode", String.class);

				method.invoke(_attachmentInfoRemoteModel, typeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Blob getAttContent() {
		return _attContent;
	}

	@Override
	public void setAttContent(Blob attContent) {
		_attContent = attContent;

		if (_attachmentInfoRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setAttContent", Blob.class);

				method.invoke(_attachmentInfoRemoteModel, attContent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExtName() {
		return _extName;
	}

	@Override
	public void setExtName(String extName) {
		_extName = extName;

		if (_attachmentInfoRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setExtName", String.class);

				method.invoke(_attachmentInfoRemoteModel, extName);
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

		if (_attachmentInfoRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_attachmentInfoRemoteModel, createDate);
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

		if (_attachmentInfoRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateBy", long.class);

				method.invoke(_attachmentInfoRemoteModel, createBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAttachmentInfoRemoteModel() {
		return _attachmentInfoRemoteModel;
	}

	public void setAttachmentInfoRemoteModel(
		BaseModel<?> attachmentInfoRemoteModel) {
		_attachmentInfoRemoteModel = attachmentInfoRemoteModel;
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

		Class<?> remoteModelClass = _attachmentInfoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_attachmentInfoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AttachmentInfoLocalServiceUtil.addAttachmentInfo(this);
		}
		else {
			AttachmentInfoLocalServiceUtil.updateAttachmentInfo(this);
		}
	}

	@Override
	public AttachmentInfo toEscapedModel() {
		return (AttachmentInfo)ProxyUtil.newProxyInstance(AttachmentInfo.class.getClassLoader(),
			new Class[] { AttachmentInfo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AttachmentInfoClp clone = new AttachmentInfoClp();

		clone.setAttachId(getAttachId());
		clone.setOriName(getOriName());
		clone.setSaveName(getSaveName());
		clone.setTypeCode(getTypeCode());
		clone.setAttContent(getAttContent());
		clone.setExtName(getExtName());
		clone.setCreateDate(getCreateDate());
		clone.setCreateBy(getCreateBy());

		return clone;
	}

	@Override
	public int compareTo(AttachmentInfo attachmentInfo) {
		long primaryKey = attachmentInfo.getPrimaryKey();

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

		if (!(obj instanceof AttachmentInfoClp)) {
			return false;
		}

		AttachmentInfoClp attachmentInfo = (AttachmentInfoClp)obj;

		long primaryKey = attachmentInfo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{attachId=");
		sb.append(getAttachId());
		sb.append(", oriName=");
		sb.append(getOriName());
		sb.append(", saveName=");
		sb.append(getSaveName());
		sb.append(", typeCode=");
		sb.append(getTypeCode());
		sb.append(", attContent=");
		sb.append(getAttContent());
		sb.append(", extName=");
		sb.append(getExtName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", createBy=");
		sb.append(getCreateBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("cn.zoneco.openplatform.model.AttachmentInfo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>attachId</column-name><column-value><![CDATA[");
		sb.append(getAttachId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oriName</column-name><column-value><![CDATA[");
		sb.append(getOriName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>saveName</column-name><column-value><![CDATA[");
		sb.append(getSaveName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeCode</column-name><column-value><![CDATA[");
		sb.append(getTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attContent</column-name><column-value><![CDATA[");
		sb.append(getAttContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extName</column-name><column-value><![CDATA[");
		sb.append(getExtName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createBy</column-name><column-value><![CDATA[");
		sb.append(getCreateBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _attachId;
	private String _oriName;
	private String _saveName;
	private String _typeCode;
	private Blob _attContent;
	private String _extName;
	private Date _createDate;
	private long _createBy;
	private BaseModel<?> _attachmentInfoRemoteModel;
}