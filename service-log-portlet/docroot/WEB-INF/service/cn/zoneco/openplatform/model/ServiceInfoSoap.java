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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author fxbird
 * @generated
 */
public class ServiceInfoSoap implements Serializable {
	public static ServiceInfoSoap toSoapModel(ServiceInfo model) {
		ServiceInfoSoap soapModel = new ServiceInfoSoap();

		soapModel.setResourceId(model.getResourceId());
		soapModel.setResourceName(model.getResourceName());
		soapModel.setDescription(model.getDescription());
		soapModel.setLogoAttId(model.getLogoAttId());
		soapModel.setWsdlAttId(model.getWsdlAttId());
		soapModel.setStatusId(model.getStatusId());
		soapModel.setApplyDate(model.getApplyDate());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setCreateBy(model.getCreateBy());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setUpdateBy(model.getUpdateBy());

		return soapModel;
	}

	public static ServiceInfoSoap[] toSoapModels(ServiceInfo[] models) {
		ServiceInfoSoap[] soapModels = new ServiceInfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServiceInfoSoap[][] toSoapModels(ServiceInfo[][] models) {
		ServiceInfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServiceInfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServiceInfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServiceInfoSoap[] toSoapModels(List<ServiceInfo> models) {
		List<ServiceInfoSoap> soapModels = new ArrayList<ServiceInfoSoap>(models.size());

		for (ServiceInfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServiceInfoSoap[soapModels.size()]);
	}

	public ServiceInfoSoap() {
	}

	public long getPrimaryKey() {
		return _resourceId;
	}

	public void setPrimaryKey(long pk) {
		setResourceId(pk);
	}

	public long getResourceId() {
		return _resourceId;
	}

	public void setResourceId(long resourceId) {
		_resourceId = resourceId;
	}

	public String getResourceName() {
		return _resourceName;
	}

	public void setResourceName(String resourceName) {
		_resourceName = resourceName;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getLogoAttId() {
		return _logoAttId;
	}

	public void setLogoAttId(long logoAttId) {
		_logoAttId = logoAttId;
	}

	public long getWsdlAttId() {
		return _wsdlAttId;
	}

	public void setWsdlAttId(long wsdlAttId) {
		_wsdlAttId = wsdlAttId;
	}

	public int getStatusId() {
		return _statusId;
	}

	public void setStatusId(int statusId) {
		_statusId = statusId;
	}

	public int getApplyDate() {
		return _applyDate;
	}

	public void setApplyDate(int applyDate) {
		_applyDate = applyDate;
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

	public Date getUpdateDate() {
		return _updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		_updateDate = updateDate;
	}

	public long getUpdateBy() {
		return _updateBy;
	}

	public void setUpdateBy(long updateBy) {
		_updateBy = updateBy;
	}

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
}