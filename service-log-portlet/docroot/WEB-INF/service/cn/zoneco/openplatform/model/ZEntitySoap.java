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
public class ZEntitySoap implements Serializable {
	public static ZEntitySoap toSoapModel(ZEntity model) {
		ZEntitySoap soapModel = new ZEntitySoap();

		soapModel.setComId(model.getComId());
		soapModel.setComName(model.getComName());

		return soapModel;
	}

	public static ZEntitySoap[] toSoapModels(ZEntity[] models) {
		ZEntitySoap[] soapModels = new ZEntitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ZEntitySoap[][] toSoapModels(ZEntity[][] models) {
		ZEntitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ZEntitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ZEntitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ZEntitySoap[] toSoapModels(List<ZEntity> models) {
		List<ZEntitySoap> soapModels = new ArrayList<ZEntitySoap>(models.size());

		for (ZEntity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ZEntitySoap[soapModels.size()]);
	}

	public ZEntitySoap() {
	}

	public long getPrimaryKey() {
		return _comId;
	}

	public void setPrimaryKey(long pk) {
		setComId(pk);
	}

	public long getComId() {
		return _comId;
	}

	public void setComId(long comId) {
		_comId = comId;
	}

	public long getComName() {
		return _comName;
	}

	public void setComName(long comName) {
		_comName = comName;
	}

	private long _comId;
	private long _comName;
}