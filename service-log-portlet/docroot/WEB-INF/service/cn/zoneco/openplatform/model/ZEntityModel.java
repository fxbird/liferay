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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ZEntity service. Represents a row in the &quot;sl_ZEntity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link cn.zoneco.openplatform.model.impl.ZEntityModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link cn.zoneco.openplatform.model.impl.ZEntityImpl}.
 * </p>
 *
 * @author fxbird
 * @see ZEntity
 * @see cn.zoneco.openplatform.model.impl.ZEntityImpl
 * @see cn.zoneco.openplatform.model.impl.ZEntityModelImpl
 * @generated
 */
public interface ZEntityModel extends BaseModel<ZEntity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a z entity model instance should use the {@link ZEntity} interface instead.
	 */

	/**
	 * Returns the primary key of this z entity.
	 *
	 * @return the primary key of this z entity
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this z entity.
	 *
	 * @param primaryKey the primary key of this z entity
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the com ID of this z entity.
	 *
	 * @return the com ID of this z entity
	 */
	public long getComId();

	/**
	 * Sets the com ID of this z entity.
	 *
	 * @param comId the com ID of this z entity
	 */
	public void setComId(long comId);

	/**
	 * Returns the com name of this z entity.
	 *
	 * @return the com name of this z entity
	 */
	public long getComName();

	/**
	 * Sets the com name of this z entity.
	 *
	 * @param comName the com name of this z entity
	 */
	public void setComName(long comName);

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
	public int compareTo(ZEntity zEntity);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ZEntity> toCacheModel();

	@Override
	public ZEntity toEscapedModel();

	@Override
	public ZEntity toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}