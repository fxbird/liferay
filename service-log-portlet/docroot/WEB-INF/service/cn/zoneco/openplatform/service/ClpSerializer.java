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

package cn.zoneco.openplatform.service;

import cn.zoneco.openplatform.model.AttachmentInfoClp;
import cn.zoneco.openplatform.model.CallLogClp;
import cn.zoneco.openplatform.model.CheckStatusClp;
import cn.zoneco.openplatform.model.ServiceInfoClp;
import cn.zoneco.openplatform.model.ZEntityClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fxbird
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"service-log-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"service-log-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "service-log-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(AttachmentInfoClp.class.getName())) {
			return translateInputAttachmentInfo(oldModel);
		}

		if (oldModelClassName.equals(CallLogClp.class.getName())) {
			return translateInputCallLog(oldModel);
		}

		if (oldModelClassName.equals(CheckStatusClp.class.getName())) {
			return translateInputCheckStatus(oldModel);
		}

		if (oldModelClassName.equals(ServiceInfoClp.class.getName())) {
			return translateInputServiceInfo(oldModel);
		}

		if (oldModelClassName.equals(ZEntityClp.class.getName())) {
			return translateInputZEntity(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputAttachmentInfo(BaseModel<?> oldModel) {
		AttachmentInfoClp oldClpModel = (AttachmentInfoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAttachmentInfoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCallLog(BaseModel<?> oldModel) {
		CallLogClp oldClpModel = (CallLogClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCallLogRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCheckStatus(BaseModel<?> oldModel) {
		CheckStatusClp oldClpModel = (CheckStatusClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCheckStatusRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputServiceInfo(BaseModel<?> oldModel) {
		ServiceInfoClp oldClpModel = (ServiceInfoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getServiceInfoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputZEntity(BaseModel<?> oldModel) {
		ZEntityClp oldClpModel = (ZEntityClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getZEntityRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"cn.zoneco.openplatform.model.impl.AttachmentInfoImpl")) {
			return translateOutputAttachmentInfo(oldModel);
		}

		if (oldModelClassName.equals(
					"cn.zoneco.openplatform.model.impl.CallLogImpl")) {
			return translateOutputCallLog(oldModel);
		}

		if (oldModelClassName.equals(
					"cn.zoneco.openplatform.model.impl.CheckStatusImpl")) {
			return translateOutputCheckStatus(oldModel);
		}

		if (oldModelClassName.equals(
					"cn.zoneco.openplatform.model.impl.ServiceInfoImpl")) {
			return translateOutputServiceInfo(oldModel);
		}

		if (oldModelClassName.equals(
					"cn.zoneco.openplatform.model.impl.ZEntityImpl")) {
			return translateOutputZEntity(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"cn.zoneco.openplatform.NoSuchAttachmentInfoException")) {
			return new cn.zoneco.openplatform.NoSuchAttachmentInfoException();
		}

		if (className.equals("cn.zoneco.openplatform.NoSuchCallLogException")) {
			return new cn.zoneco.openplatform.NoSuchCallLogException();
		}

		if (className.equals(
					"cn.zoneco.openplatform.NoSuchCheckStatusException")) {
			return new cn.zoneco.openplatform.NoSuchCheckStatusException();
		}

		if (className.equals(
					"cn.zoneco.openplatform.NoSuchServiceInfoException")) {
			return new cn.zoneco.openplatform.NoSuchServiceInfoException();
		}

		if (className.equals("cn.zoneco.openplatform.NoSuchZEntityException")) {
			return new cn.zoneco.openplatform.NoSuchZEntityException();
		}

		return throwable;
	}

	public static Object translateOutputAttachmentInfo(BaseModel<?> oldModel) {
		AttachmentInfoClp newModel = new AttachmentInfoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAttachmentInfoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCallLog(BaseModel<?> oldModel) {
		CallLogClp newModel = new CallLogClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCallLogRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCheckStatus(BaseModel<?> oldModel) {
		CheckStatusClp newModel = new CheckStatusClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCheckStatusRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputServiceInfo(BaseModel<?> oldModel) {
		ServiceInfoClp newModel = new ServiceInfoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setServiceInfoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputZEntity(BaseModel<?> oldModel) {
		ZEntityClp newModel = new ZEntityClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setZEntityRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}