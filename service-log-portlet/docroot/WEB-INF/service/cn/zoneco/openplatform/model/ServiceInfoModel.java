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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ServiceInfo service. Represents a row in the &quot;t_resource&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link cn.zoneco.openplatform.model.impl.ServiceInfoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link cn.zoneco.openplatform.model.impl.ServiceInfoImpl}.
 * </p>
 *
 * @author fxbird
 * @see ServiceInfo
 * @see cn.zoneco.openplatform.model.impl.ServiceInfoImpl
 * @see cn.zoneco.openplatform.model.impl.ServiceInfoModelImpl
 * @generated
 */
public interface ServiceInfoModel extends BaseModel<ServiceInfo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a service info model instance should use the {@link ServiceInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this service info.
	 *
	 * @return the primary key of this service info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this service info.
	 *
	 * @param primaryKey the primary key of this service info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the resource ID of this service info.
	 *
	 * @return the resource ID of this service info
	 */
	public long getResourceId();

	/**
	 * Sets the resource ID of this service info.
	 *
	 * @param resourceId the resource ID of this service info
	 */
	public void setResourceId(long resourceId);

	/**
	 * Returns the resource name of this service info.
	 *
	 * @return the resource name of this service info
	 */
	@AutoEscape
	public String getResourceName();

	/**
	 * Sets the resource name of this service info.
	 *
	 * @param resourceName the resource name of this service info
	 */
	public void setResourceName(String resourceName);

	/**
	 * Returns the description of this service info.
	 *
	 * @return the description of this service info
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this service info.
	 *
	 * @param description the description of this service info
	 */
	public void setDescription(String description);

	/**
	 * Returns the logo att ID of this service info.
	 *
	 * @return the logo att ID of this service info
	 */
	public long getLogoAttId();

	/**
	 * Sets the logo att ID of this service info.
	 *
	 * @param logoAttId the logo att ID of this service info
	 */
	public void setLogoAttId(long logoAttId);

	/**
	 * Returns the wsdl att ID of this service info.
	 *
	 * @return the wsdl att ID of this service info
	 */
	public long getWsdlAttId();

	/**
	 * Sets the wsdl att ID of this service info.
	 *
	 * @param wsdlAttId the wsdl att ID of this service info
	 */
	public void setWsdlAttId(long wsdlAttId);

	/**
	 * Returns the status ID of this service info.
	 *
	 * @return the status ID of this service info
	 */
	public int getStatusId();

	/**
	 * Sets the status ID of this service info.
	 *
	 * @param statusId the status ID of this service info
	 */
	public void setStatusId(int statusId);

	/**
	 * Returns the apply date of this service info.
	 *
	 * @return the apply date of this service info
	 */
	public int getApplyDate();

	/**
	 * Sets the apply date of this service info.
	 *
	 * @param applyDate the apply date of this service info
	 */
	public void setApplyDate(int applyDate);

	/**
	 * Returns the create date of this service info.
	 *
	 * @return the create date of this service info
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this service info.
	 *
	 * @param createDate the create date of this service info
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the create by of this service info.
	 *
	 * @return the create by of this service info
	 */
	public long getCreateBy();

	/**
	 * Sets the create by of this service info.
	 *
	 * @param createBy the create by of this service info
	 */
	public void setCreateBy(long createBy);

	/**
	 * Returns the update date of this service info.
	 *
	 * @return the update date of this service info
	 */
	public Date getUpdateDate();

	/**
	 * Sets the update date of this service info.
	 *
	 * @param updateDate the update date of this service info
	 */
	public void setUpdateDate(Date updateDate);

	/**
	 * Returns the update by of this service info.
	 *
	 * @return the update by of this service info
	 */
	public long getUpdateBy();

	/**
	 * Sets the update by of this service info.
	 *
	 * @param updateBy the update by of this service info
	 */
	public void setUpdateBy(long updateBy);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ServiceInfo serviceInfo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ServiceInfo> toCacheModel();

	@Override
	public ServiceInfo toEscapedModel();

	@Override
	public ServiceInfo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}