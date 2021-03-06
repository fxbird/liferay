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
import cn.zoneco.openplatform.service.CheckStatusLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the CheckStatus service. Represents a row in the &quot;t_status&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CheckStatusImpl}.
 * </p>
 *
 * @author fxbird
 * @see CheckStatusImpl
 * @see cn.zoneco.openplatform.model.CheckStatus
 * @generated
 */
public abstract class CheckStatusBaseImpl extends CheckStatusModelImpl
	implements CheckStatus {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a check status model instance should use the {@link CheckStatus} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CheckStatusLocalServiceUtil.addCheckStatus(this);
		}
		else {
			CheckStatusLocalServiceUtil.updateCheckStatus(this);
		}
	}
}