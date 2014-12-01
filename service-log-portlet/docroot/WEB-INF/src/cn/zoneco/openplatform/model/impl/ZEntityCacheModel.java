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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ZEntity in entity cache.
 *
 * @author fxbird
 * @see ZEntity
 * @generated
 */
public class ZEntityCacheModel implements CacheModel<ZEntity>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{comId=");
		sb.append(comId);
		sb.append(", comName=");
		sb.append(comName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ZEntity toEntityModel() {
		ZEntityImpl zEntityImpl = new ZEntityImpl();

		zEntityImpl.setComId(comId);
		zEntityImpl.setComName(comName);

		zEntityImpl.resetOriginalValues();

		return zEntityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		comId = objectInput.readLong();
		comName = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(comId);
		objectOutput.writeLong(comName);
	}

	public long comId;
	public long comName;
}