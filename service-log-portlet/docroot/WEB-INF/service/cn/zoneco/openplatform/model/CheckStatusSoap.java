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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author fxbird
 * @generated
 */
public class CheckStatusSoap implements Serializable {
	public static CheckStatusSoap toSoapModel(CheckStatus model) {
		CheckStatusSoap soapModel = new CheckStatusSoap();

		soapModel.setStatusId(model.getStatusId());
		soapModel.setStatusName(model.getStatusName());

		return soapModel;
	}

	public static CheckStatusSoap[] toSoapModels(CheckStatus[] models) {
		CheckStatusSoap[] soapModels = new CheckStatusSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CheckStatusSoap[][] toSoapModels(CheckStatus[][] models) {
		CheckStatusSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CheckStatusSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CheckStatusSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CheckStatusSoap[] toSoapModels(List<CheckStatus> models) {
		List<CheckStatusSoap> soapModels = new ArrayList<CheckStatusSoap>(models.size());

		for (CheckStatus model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CheckStatusSoap[soapModels.size()]);
	}

	public CheckStatusSoap() {
	}

	public long getPrimaryKey() {
		return _statusId;
	}

	public void setPrimaryKey(long pk) {
		setStatusId(pk);
	}

	public long getStatusId() {
		return _statusId;
	}

	public void setStatusId(long statusId) {
		_statusId = statusId;
	}

	public String getStatusName() {
		return _statusName;
	}

	public void setStatusName(String statusName) {
		_statusName = statusName;
	}

	private long _statusId;
	private String _statusName;
}