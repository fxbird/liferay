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

import cn.zoneco.openplatform.model.CheckStatus;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CheckStatus in entity cache.
 *
 * @author fxbird
 * @see CheckStatus
 * @generated
 */
public class CheckStatusCacheModel implements CacheModel<CheckStatus>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{statusId=");
		sb.append(statusId);
		sb.append(", statusName=");
		sb.append(statusName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CheckStatus toEntityModel() {
		CheckStatusImpl checkStatusImpl = new CheckStatusImpl();

		checkStatusImpl.setStatusId(statusId);

		if (statusName == null) {
			checkStatusImpl.setStatusName(StringPool.BLANK);
		}
		else {
			checkStatusImpl.setStatusName(statusName);
		}

		checkStatusImpl.resetOriginalValues();

		return checkStatusImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		statusId = objectInput.readLong();
		statusName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(statusId);

		if (statusName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusName);
		}
	}

	public long statusId;
	public String statusName;
}