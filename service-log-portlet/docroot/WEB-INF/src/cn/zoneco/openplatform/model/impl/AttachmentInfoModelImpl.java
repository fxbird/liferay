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
import cn.zoneco.openplatform.model.AttachmentInfoAttContentBlobModel;
import cn.zoneco.openplatform.model.AttachmentInfoModel;
import cn.zoneco.openplatform.service.AttachmentInfoLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Blob;
import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the AttachmentInfo service. Represents a row in the &quot;t_attachment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link cn.zoneco.openplatform.model.AttachmentInfoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AttachmentInfoImpl}.
 * </p>
 *
 * @author fxbird
 * @see AttachmentInfoImpl
 * @see cn.zoneco.openplatform.model.AttachmentInfo
 * @see cn.zoneco.openplatform.model.AttachmentInfoModel
 * @generated
 */
public class AttachmentInfoModelImpl extends BaseModelImpl<AttachmentInfo>
	implements AttachmentInfoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a attachment info model instance should use the {@link cn.zoneco.openplatform.model.AttachmentInfo} interface instead.
	 */
	public static final String TABLE_NAME = "t_attachment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "attach_id", Types.BIGINT },
			{ "ori_name", Types.VARCHAR },
			{ "save_name", Types.VARCHAR },
			{ "type_code", Types.VARCHAR },
			{ "att_content", Types.BLOB },
			{ "ext_name", Types.VARCHAR },
			{ "create_date", Types.TIMESTAMP },
			{ "create_by", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table t_attachment (attach_id LONG not null primary key,ori_name VARCHAR(75) null,save_name VARCHAR(75) null,type_code VARCHAR(75) null,att_content BLOB,ext_name VARCHAR(75) null,create_date DATE null,create_by LONG)";
	public static final String TABLE_SQL_DROP = "drop table t_attachment";
	public static final String ORDER_BY_JPQL = " ORDER BY attachmentInfo.attachId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY t_attachment.attach_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.cn.zoneco.openplatform.model.AttachmentInfo"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.cn.zoneco.openplatform.model.AttachmentInfo"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.cn.zoneco.openplatform.model.AttachmentInfo"));

	public AttachmentInfoModelImpl() {
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
	public Class<?> getModelClass() {
		return AttachmentInfo.class;
	}

	@Override
	public String getModelClassName() {
		return AttachmentInfo.class.getName();
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
	}

	@Override
	public String getOriName() {
		if (_oriName == null) {
			return StringPool.BLANK;
		}
		else {
			return _oriName;
		}
	}

	@Override
	public void setOriName(String oriName) {
		_oriName = oriName;
	}

	@Override
	public String getSaveName() {
		if (_saveName == null) {
			return StringPool.BLANK;
		}
		else {
			return _saveName;
		}
	}

	@Override
	public void setSaveName(String saveName) {
		_saveName = saveName;
	}

	@Override
	public String getTypeCode() {
		if (_typeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _typeCode;
		}
	}

	@Override
	public void setTypeCode(String typeCode) {
		_typeCode = typeCode;
	}

	@Override
	public Blob getAttContent() {
		if (_attContentBlobModel == null) {
			try {
				_attContentBlobModel = AttachmentInfoLocalServiceUtil.getAttContentBlobModel(getPrimaryKey());
			}
			catch (Exception e) {
			}
		}

		Blob blob = null;

		if (_attContentBlobModel != null) {
			blob = _attContentBlobModel.getAttContentBlob();
		}

		return blob;
	}

	@Override
	public void setAttContent(Blob attContent) {
		if (_attContentBlobModel == null) {
			_attContentBlobModel = new AttachmentInfoAttContentBlobModel(getPrimaryKey(),
					attContent);
		}
		else {
			_attContentBlobModel.setAttContentBlob(attContent);
		}
	}

	@Override
	public String getExtName() {
		if (_extName == null) {
			return StringPool.BLANK;
		}
		else {
			return _extName;
		}
	}

	@Override
	public void setExtName(String extName) {
		_extName = extName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public long getCreateBy() {
		return _createBy;
	}

	@Override
	public void setCreateBy(long createBy) {
		_createBy = createBy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			AttachmentInfo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AttachmentInfo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AttachmentInfo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AttachmentInfoImpl attachmentInfoImpl = new AttachmentInfoImpl();

		attachmentInfoImpl.setAttachId(getAttachId());
		attachmentInfoImpl.setOriName(getOriName());
		attachmentInfoImpl.setSaveName(getSaveName());
		attachmentInfoImpl.setTypeCode(getTypeCode());
		attachmentInfoImpl.setExtName(getExtName());
		attachmentInfoImpl.setCreateDate(getCreateDate());
		attachmentInfoImpl.setCreateBy(getCreateBy());

		attachmentInfoImpl.resetOriginalValues();

		return attachmentInfoImpl;
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

		if (!(obj instanceof AttachmentInfo)) {
			return false;
		}

		AttachmentInfo attachmentInfo = (AttachmentInfo)obj;

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
	public void resetOriginalValues() {
		AttachmentInfoModelImpl attachmentInfoModelImpl = this;

		attachmentInfoModelImpl._attContentBlobModel = null;
	}

	@Override
	public CacheModel<AttachmentInfo> toCacheModel() {
		AttachmentInfoCacheModel attachmentInfoCacheModel = new AttachmentInfoCacheModel();

		attachmentInfoCacheModel.attachId = getAttachId();

		attachmentInfoCacheModel.oriName = getOriName();

		String oriName = attachmentInfoCacheModel.oriName;

		if ((oriName != null) && (oriName.length() == 0)) {
			attachmentInfoCacheModel.oriName = null;
		}

		attachmentInfoCacheModel.saveName = getSaveName();

		String saveName = attachmentInfoCacheModel.saveName;

		if ((saveName != null) && (saveName.length() == 0)) {
			attachmentInfoCacheModel.saveName = null;
		}

		attachmentInfoCacheModel.typeCode = getTypeCode();

		String typeCode = attachmentInfoCacheModel.typeCode;

		if ((typeCode != null) && (typeCode.length() == 0)) {
			attachmentInfoCacheModel.typeCode = null;
		}

		attachmentInfoCacheModel.extName = getExtName();

		String extName = attachmentInfoCacheModel.extName;

		if ((extName != null) && (extName.length() == 0)) {
			attachmentInfoCacheModel.extName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			attachmentInfoCacheModel.createDate = createDate.getTime();
		}
		else {
			attachmentInfoCacheModel.createDate = Long.MIN_VALUE;
		}

		attachmentInfoCacheModel.createBy = getCreateBy();

		return attachmentInfoCacheModel;
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

	private static ClassLoader _classLoader = AttachmentInfo.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			AttachmentInfo.class
		};
	private long _attachId;
	private String _oriName;
	private String _saveName;
	private String _typeCode;
	private AttachmentInfoAttContentBlobModel _attContentBlobModel;
	private String _extName;
	private Date _createDate;
	private long _createBy;
	private AttachmentInfo _escapedModel;
}