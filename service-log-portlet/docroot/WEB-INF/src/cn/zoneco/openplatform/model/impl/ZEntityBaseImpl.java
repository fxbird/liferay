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
import cn.zoneco.openplatform.service.ZEntityLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the ZEntity service. Represents a row in the &quot;sl_ZEntity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ZEntityImpl}.
 * </p>
 *
 * @author fxbird
 * @see ZEntityImpl
 * @see cn.zoneco.openplatform.model.ZEntity
 * @generated
 */
public abstract class ZEntityBaseImpl extends ZEntityModelImpl
	implements ZEntity {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a z entity model instance should use the {@link ZEntity} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ZEntityLocalServiceUtil.addZEntity(this);
		}
		else {
			ZEntityLocalServiceUtil.updateZEntity(this);
		}
	}
}