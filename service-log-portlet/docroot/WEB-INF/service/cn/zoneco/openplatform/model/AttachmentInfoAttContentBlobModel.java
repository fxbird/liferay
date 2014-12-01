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

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the attContent column in AttachmentInfo.
 *
 * @author fxbird
 * @see AttachmentInfo
 * @generated
 */
public class AttachmentInfoAttContentBlobModel {
	public AttachmentInfoAttContentBlobModel() {
	}

	public AttachmentInfoAttContentBlobModel(long attachId) {
		_attachId = attachId;
	}

	public AttachmentInfoAttContentBlobModel(long attachId, Blob attContentBlob) {
		_attachId = attachId;
		_attContentBlob = attContentBlob;
	}

	public long getAttachId() {
		return _attachId;
	}

	public void setAttachId(long attachId) {
		_attachId = attachId;
	}

	public Blob getAttContentBlob() {
		return _attContentBlob;
	}

	public void setAttContentBlob(Blob attContentBlob) {
		_attContentBlob = attContentBlob;
	}

	private long _attachId;
	private Blob _attContentBlob;
}