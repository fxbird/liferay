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
import cn.zoneco.openplatform.model.ServiceInfoModel;

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

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ServiceInfo service. Represents a row in the &quot;t_resource&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link cn.zoneco.openplatform.model.ServiceInfoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ServiceInfoImpl}.
 * </p>
 *
 * @author fxbird
 * @see ServiceInfoImpl
 * @see cn.zoneco.openplatform.model.ServiceInfo
 * @see cn.zoneco.openplatform.model.ServiceInfoModel
 * @generated
 */
public class ServiceInfoModelImpl extends BaseModelImpl<ServiceInfo>
	implements ServiceInfoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a service info model instance should use the {@link cn.zoneco.openplatform.model.ServiceInfo} interface instead.
	 */
	public static final String TABLE_NAME = "t_resource";
	public static final Object[][] TABLE_COLUMNS = {
			{ "resource_id", Types.BIGINT },
			{ "resource_name", Types.VARCHAR },
			{ "resource_description", Types.VARCHAR },
			{ "logo_att_id", Types.BIGINT },
			{ "wsdl_att_id", Types.BIGINT },
			{ "status_id", Types.INTEGER },
			{ "apply_date", Types.INTEGER },
			{ "create_date", Types.TIMESTAMP },
			{ "create_by", Types.BIGINT },
			{ "update_date", Types.TIMESTAMP },
			{ "update_by", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table t_resource (resource_id LONG not null primary key,resource_name VARCHAR(75) null,resource_description VARCHAR(75) null,logo_att_id LONG,wsdl_att_id LONG,status_id INTEGER,apply_date INTEGER,create_date DATE null,create_by LONG,update_date DATE null,update_by LONG)";
	public static final String TABLE_SQL_DROP = "drop table t_resource";
	public static final String ORDER_BY_JPQL = " ORDER BY serviceInfo.resourceId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY t_resource.resource_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.cn.zoneco.openplatform.model.ServiceInfo"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.cn.zoneco.openplatform.model.ServiceInfo"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.cn.zoneco.openplatform.model.ServiceInfo"));

	public ServiceInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _resourceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setResourceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _resourceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceInfo.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("resourceId", getResourceId());
		attributes.put("resourceName", getResourceName());
		attributes.put("description", getDescription());
		attributes.put("logoAttId", getLogoAttId());
		attributes.put("wsdlAttId", getWsdlAttId());
		attributes.put("statusId", getStatusId());
		attributes.put("applyDate", getApplyDate());
		attributes.put("createDate", getCreateDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("updateDate", getUpdateDate());
		attributes.put("updateBy", getUpdateBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long resourceId = (Long)attributes.get("resourceId");

		if (resourceId != null) {
			setResourceId(resourceId);
		}

		String resourceName = (String)attributes.get("resourceName");

		if (resourceName != null) {
			setResourceName(resourceName);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long logoAttId = (Long)attributes.get("logoAttId");

		if (logoAttId != null) {
			setLogoAttId(logoAttId);
		}

		Long wsdlAttId = (Long)attributes.get("wsdlAttId");

		if (wsdlAttId != null) {
			setWsdlAttId(wsdlAttId);
		}

		Integer statusId = (Integer)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		Integer applyDate = (Integer)attributes.get("applyDate");

		if (applyDate != null) {
			setApplyDate(applyDate);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long createBy = (Long)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}

		Date updateDate = (Date)attributes.get("updateDate");

		if (updateDate != null) {
			setUpdateDate(updateDate);
		}

		Long updateBy = (Long)attributes.get("updateBy");

		if (updateBy != null) {
			setUpdateBy(updateBy);
		}
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
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public long getLogoAttId() {
		return _logoAttId;
	}

	@Override
	public void setLogoAttId(long logoAttId) {
		_logoAttId = logoAttId;
	}

	@Override
	public long getWsdlAttId() {
		return _wsdlAttId;
	}

	@Override
	public void setWsdlAttId(long wsdlAttId) {
		_wsdlAttId = wsdlAttId;
	}

	@Override
	public int getStatusId() {
		return _statusId;
	}

	@Override
	public void setStatusId(int statusId) {
		_statusId = statusId;
	}

	@Override
	public int getApplyDate() {
		return _applyDate;
	}

	@Override
	public void setApplyDate(int applyDate) {
		_applyDate = applyDate;
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
	public Date getUpdateDate() {
		return _updateDate;
	}

	@Override
	public void setUpdateDate(Date updateDate) {
		_updateDate = updateDate;
	}

	@Override
	public long getUpdateBy() {
		return _updateBy;
	}

	@Override
	public void setUpdateBy(long updateBy) {
		_updateBy = updateBy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ServiceInfo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ServiceInfo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ServiceInfo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ServiceInfoImpl serviceInfoImpl = new ServiceInfoImpl();

		serviceInfoImpl.setResourceId(getResourceId());
		serviceInfoImpl.setResourceName(getResourceName());
		serviceInfoImpl.setDescription(getDescription());
		serviceInfoImpl.setLogoAttId(getLogoAttId());
		serviceInfoImpl.setWsdlAttId(getWsdlAttId());
		serviceInfoImpl.setStatusId(getStatusId());
		serviceInfoImpl.setApplyDate(getApplyDate());
		serviceInfoImpl.setCreateDate(getCreateDate());
		serviceInfoImpl.setCreateBy(getCreateBy());
		serviceInfoImpl.setUpdateDate(getUpdateDate());
		serviceInfoImpl.setUpdateBy(getUpdateBy());

		serviceInfoImpl.resetOriginalValues();

		return serviceInfoImpl;
	}

	@Override
	public int compareTo(ServiceInfo serviceInfo) {
		long primaryKey = serviceInfo.getPrimaryKey();

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

		if (!(obj instanceof ServiceInfo)) {
			return false;
		}

		ServiceInfo serviceInfo = (ServiceInfo)obj;

		long primaryKey = serviceInfo.getPrimaryKey();

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
	public CacheModel<ServiceInfo> toCacheModel() {
		ServiceInfoCacheModel serviceInfoCacheModel = new ServiceInfoCacheModel();

		serviceInfoCacheModel.resourceId = getResourceId();

		serviceInfoCacheModel.resourceName = getResourceName();

		String resourceName = serviceInfoCacheModel.resourceName;

		if ((resourceName != null) && (resourceName.length() == 0)) {
			serviceInfoCacheModel.resourceName = null;
		}

		serviceInfoCacheModel.description = getDescription();

		String description = serviceInfoCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			serviceInfoCacheModel.description = null;
		}

		serviceInfoCacheModel.logoAttId = getLogoAttId();

		serviceInfoCacheModel.wsdlAttId = getWsdlAttId();

		serviceInfoCacheModel.statusId = getStatusId();

		serviceInfoCacheModel.applyDate = getApplyDate();

		Date createDate = getCreateDate();

		if (createDate != null) {
			serviceInfoCacheModel.createDate = createDate.getTime();
		}
		else {
			serviceInfoCacheModel.createDate = Long.MIN_VALUE;
		}

		serviceInfoCacheModel.createBy = getCreateBy();

		Date updateDate = getUpdateDate();

		if (updateDate != null) {
			serviceInfoCacheModel.updateDate = updateDate.getTime();
		}
		else {
			serviceInfoCacheModel.updateDate = Long.MIN_VALUE;
		}

		serviceInfoCacheModel.updateBy = getUpdateBy();

		return serviceInfoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{resourceId=");
		sb.append(getResourceId());
		sb.append(", resourceName=");
		sb.append(getResourceName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", logoAttId=");
		sb.append(getLogoAttId());
		sb.append(", wsdlAttId=");
		sb.append(getWsdlAttId());
		sb.append(", statusId=");
		sb.append(getStatusId());
		sb.append(", applyDate=");
		sb.append(getApplyDate());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", createBy=");
		sb.append(getCreateBy());
		sb.append(", updateDate=");
		sb.append(getUpdateDate());
		sb.append(", updateBy=");
		sb.append(getUpdateBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("cn.zoneco.openplatform.model.ServiceInfo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>resourceId</column-name><column-value><![CDATA[");
		sb.append(getResourceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resourceName</column-name><column-value><![CDATA[");
		sb.append(getResourceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logoAttId</column-name><column-value><![CDATA[");
		sb.append(getLogoAttId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wsdlAttId</column-name><column-value><![CDATA[");
		sb.append(getWsdlAttId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusId</column-name><column-value><![CDATA[");
		sb.append(getStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applyDate</column-name><column-value><![CDATA[");
		sb.append(getApplyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createBy</column-name><column-value><![CDATA[");
		sb.append(getCreateBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateDate</column-name><column-value><![CDATA[");
		sb.append(getUpdateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateBy</column-name><column-value><![CDATA[");
		sb.append(getUpdateBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ServiceInfo.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ServiceInfo.class
		};
	private long _resourceId;
	private String _resourceName;
	private String _description;
	private long _logoAttId;
	private long _wsdlAttId;
	private int _statusId;
	private int _applyDate;
	private Date _createDate;
	private long _createBy;
	private Date _updateDate;
	private long _updateBy;
	private ServiceInfo _escapedModel;
}