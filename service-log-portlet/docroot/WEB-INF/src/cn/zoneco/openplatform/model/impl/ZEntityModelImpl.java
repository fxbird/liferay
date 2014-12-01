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

import cn.zoneco.openplatform.model.ZEntity;
import cn.zoneco.openplatform.model.ZEntityModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ZEntity service. Represents a row in the &quot;sl_ZEntity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link cn.zoneco.openplatform.model.ZEntityModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ZEntityImpl}.
 * </p>
 *
 * @author fxbird
 * @see ZEntityImpl
 * @see cn.zoneco.openplatform.model.ZEntity
 * @see cn.zoneco.openplatform.model.ZEntityModel
 * @generated
 */
public class ZEntityModelImpl extends BaseModelImpl<ZEntity>
	implements ZEntityModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a z entity model instance should use the {@link cn.zoneco.openplatform.model.ZEntity} interface instead.
	 */
	public static final String TABLE_NAME = "sl_ZEntity";
	public static final Object[][] TABLE_COLUMNS = {
			{ "comId", Types.BIGINT },
			{ "comName", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table sl_ZEntity (comId LONG not null primary key,comName LONG)";
	public static final String TABLE_SQL_DROP = "drop table sl_ZEntity";
	public static final String ORDER_BY_JPQL = " ORDER BY zEntity.comId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sl_ZEntity.comId ASC";
	public static final String DATA_SOURCE = "no_data_source";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.cn.zoneco.openplatform.model.ZEntity"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.cn.zoneco.openplatform.model.ZEntity"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.cn.zoneco.openplatform.model.ZEntity"));

	public ZEntityModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _comId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setComId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _comId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ZEntity.class;
	}

	@Override
	public String getModelClassName() {
		return ZEntity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("comId", getComId());
		attributes.put("comName", getComName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long comId = (Long)attributes.get("comId");

		if (comId != null) {
			setComId(comId);
		}

		Long comName = (Long)attributes.get("comName");

		if (comName != null) {
			setComName(comName);
		}
	}

	@Override
	public long getComId() {
		return _comId;
	}

	@Override
	public void setComId(long comId) {
		_comId = comId;
	}

	@Override
	public long getComName() {
		return _comName;
	}

	@Override
	public void setComName(long comName) {
		_comName = comName;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ZEntity.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ZEntity toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ZEntity)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ZEntityImpl zEntityImpl = new ZEntityImpl();

		zEntityImpl.setComId(getComId());
		zEntityImpl.setComName(getComName());

		zEntityImpl.resetOriginalValues();

		return zEntityImpl;
	}

	@Override
	public int compareTo(ZEntity zEntity) {
		long primaryKey = zEntity.getPrimaryKey();

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

		if (!(obj instanceof ZEntity)) {
			return false;
		}

		ZEntity zEntity = (ZEntity)obj;

		long primaryKey = zEntity.getPrimaryKey();

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
	public CacheModel<ZEntity> toCacheModel() {
		ZEntityCacheModel zEntityCacheModel = new ZEntityCacheModel();

		zEntityCacheModel.comId = getComId();

		zEntityCacheModel.comName = getComName();

		return zEntityCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{comId=");
		sb.append(getComId());
		sb.append(", comName=");
		sb.append(getComName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("cn.zoneco.openplatform.model.ZEntity");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>comId</column-name><column-value><![CDATA[");
		sb.append(getComId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comName</column-name><column-value><![CDATA[");
		sb.append(getComName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ZEntity.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ZEntity.class
		};
	private long _comId;
	private long _comName;
	private ZEntity _escapedModel;
}