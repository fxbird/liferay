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

import cn.zoneco.openplatform.service.ClpSerializer;
import cn.zoneco.openplatform.service.ZEntityLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fxbird
 */
public class ZEntityClp extends BaseModelImpl<ZEntity> implements ZEntity {
	public ZEntityClp() {
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

		if (_zEntityRemoteModel != null) {
			try {
				Class<?> clazz = _zEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setComId", long.class);

				method.invoke(_zEntityRemoteModel, comId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getComName() {
		return _comName;
	}

	@Override
	public void setComName(long comName) {
		_comName = comName;

		if (_zEntityRemoteModel != null) {
			try {
				Class<?> clazz = _zEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setComName", long.class);

				method.invoke(_zEntityRemoteModel, comName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getZEntityRemoteModel() {
		return _zEntityRemoteModel;
	}

	public void setZEntityRemoteModel(BaseModel<?> zEntityRemoteModel) {
		_zEntityRemoteModel = zEntityRemoteModel;
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

		Class<?> remoteModelClass = _zEntityRemoteModel.getClass();

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

		Object returnValue = method.invoke(_zEntityRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ZEntityLocalServiceUtil.addZEntity(this);
		}
		else {
			ZEntityLocalServiceUtil.updateZEntity(this);
		}
	}

	@Override
	public ZEntity toEscapedModel() {
		return (ZEntity)ProxyUtil.newProxyInstance(ZEntity.class.getClassLoader(),
			new Class[] { ZEntity.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ZEntityClp clone = new ZEntityClp();

		clone.setComId(getComId());
		clone.setComName(getComName());

		return clone;
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

		if (!(obj instanceof ZEntityClp)) {
			return false;
		}

		ZEntityClp zEntity = (ZEntityClp)obj;

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

	private long _comId;
	private long _comName;
	private BaseModel<?> _zEntityRemoteModel;
}