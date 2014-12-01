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

package cn.zoneco.openplatform.service.persistence;

import cn.zoneco.openplatform.NoSuchServiceInfoException;
import cn.zoneco.openplatform.model.ServiceInfo;
import cn.zoneco.openplatform.model.impl.ServiceInfoImpl;
import cn.zoneco.openplatform.model.impl.ServiceInfoModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the service info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see ServiceInfoPersistence
 * @see ServiceInfoUtil
 * @generated
 */
public class ServiceInfoPersistenceImpl extends BasePersistenceImpl<ServiceInfo>
	implements ServiceInfoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceInfoUtil} to access the service info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceInfoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceInfoModelImpl.ENTITY_CACHE_ENABLED,
			ServiceInfoModelImpl.FINDER_CACHE_ENABLED, ServiceInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceInfoModelImpl.ENTITY_CACHE_ENABLED,
			ServiceInfoModelImpl.FINDER_CACHE_ENABLED, ServiceInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceInfoModelImpl.ENTITY_CACHE_ENABLED,
			ServiceInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ServiceInfoPersistenceImpl() {
		setModelClass(ServiceInfo.class);
	}

	/**
	 * Caches the service info in the entity cache if it is enabled.
	 *
	 * @param serviceInfo the service info
	 */
	@Override
	public void cacheResult(ServiceInfo serviceInfo) {
		EntityCacheUtil.putResult(ServiceInfoModelImpl.ENTITY_CACHE_ENABLED,
			ServiceInfoImpl.class, serviceInfo.getPrimaryKey(), serviceInfo);

		serviceInfo.resetOriginalValues();
	}

	/**
	 * Caches the service infos in the entity cache if it is enabled.
	 *
	 * @param serviceInfos the service infos
	 */
	@Override
	public void cacheResult(List<ServiceInfo> serviceInfos) {
		for (ServiceInfo serviceInfo : serviceInfos) {
			if (EntityCacheUtil.getResult(
						ServiceInfoModelImpl.ENTITY_CACHE_ENABLED,
						ServiceInfoImpl.class, serviceInfo.getPrimaryKey()) == null) {
				cacheResult(serviceInfo);
			}
			else {
				serviceInfo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service infos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceInfoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceInfoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service info.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServiceInfo serviceInfo) {
		EntityCacheUtil.removeResult(ServiceInfoModelImpl.ENTITY_CACHE_ENABLED,
			ServiceInfoImpl.class, serviceInfo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ServiceInfo> serviceInfos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServiceInfo serviceInfo : serviceInfos) {
			EntityCacheUtil.removeResult(ServiceInfoModelImpl.ENTITY_CACHE_ENABLED,
				ServiceInfoImpl.class, serviceInfo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new service info with the primary key. Does not add the service info to the database.
	 *
	 * @param resourceId the primary key for the new service info
	 * @return the new service info
	 */
	@Override
	public ServiceInfo create(long resourceId) {
		ServiceInfo serviceInfo = new ServiceInfoImpl();

		serviceInfo.setNew(true);
		serviceInfo.setPrimaryKey(resourceId);

		return serviceInfo;
	}

	/**
	 * Removes the service info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param resourceId the primary key of the service info
	 * @return the service info that was removed
	 * @throws cn.zoneco.openplatform.NoSuchServiceInfoException if a service info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceInfo remove(long resourceId)
		throws NoSuchServiceInfoException, SystemException {
		return remove((Serializable)resourceId);
	}

	/**
	 * Removes the service info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service info
	 * @return the service info that was removed
	 * @throws cn.zoneco.openplatform.NoSuchServiceInfoException if a service info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceInfo remove(Serializable primaryKey)
		throws NoSuchServiceInfoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServiceInfo serviceInfo = (ServiceInfo)session.get(ServiceInfoImpl.class,
					primaryKey);

			if (serviceInfo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(serviceInfo);
		}
		catch (NoSuchServiceInfoException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ServiceInfo removeImpl(ServiceInfo serviceInfo)
		throws SystemException {
		serviceInfo = toUnwrappedModel(serviceInfo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(serviceInfo)) {
				serviceInfo = (ServiceInfo)session.get(ServiceInfoImpl.class,
						serviceInfo.getPrimaryKeyObj());
			}

			if (serviceInfo != null) {
				session.delete(serviceInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (serviceInfo != null) {
			clearCache(serviceInfo);
		}

		return serviceInfo;
	}

	@Override
	public ServiceInfo updateImpl(
		cn.zoneco.openplatform.model.ServiceInfo serviceInfo)
		throws SystemException {
		serviceInfo = toUnwrappedModel(serviceInfo);

		boolean isNew = serviceInfo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (serviceInfo.isNew()) {
				session.save(serviceInfo);

				serviceInfo.setNew(false);
			}
			else {
				session.merge(serviceInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ServiceInfoModelImpl.ENTITY_CACHE_ENABLED,
			ServiceInfoImpl.class, serviceInfo.getPrimaryKey(), serviceInfo);

		return serviceInfo;
	}

	protected ServiceInfo toUnwrappedModel(ServiceInfo serviceInfo) {
		if (serviceInfo instanceof ServiceInfoImpl) {
			return serviceInfo;
		}

		ServiceInfoImpl serviceInfoImpl = new ServiceInfoImpl();

		serviceInfoImpl.setNew(serviceInfo.isNew());
		serviceInfoImpl.setPrimaryKey(serviceInfo.getPrimaryKey());

		serviceInfoImpl.setResourceId(serviceInfo.getResourceId());
		serviceInfoImpl.setResourceName(serviceInfo.getResourceName());
		serviceInfoImpl.setDescription(serviceInfo.getDescription());
		serviceInfoImpl.setLogoAttId(serviceInfo.getLogoAttId());
		serviceInfoImpl.setWsdlAttId(serviceInfo.getWsdlAttId());
		serviceInfoImpl.setStatusId(serviceInfo.getStatusId());
		serviceInfoImpl.setApplyDate(serviceInfo.getApplyDate());
		serviceInfoImpl.setCreateDate(serviceInfo.getCreateDate());
		serviceInfoImpl.setCreateBy(serviceInfo.getCreateBy());
		serviceInfoImpl.setUpdateDate(serviceInfo.getUpdateDate());
		serviceInfoImpl.setUpdateBy(serviceInfo.getUpdateBy());

		return serviceInfoImpl;
	}

	/**
	 * Returns the service info with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service info
	 * @return the service info
	 * @throws cn.zoneco.openplatform.NoSuchServiceInfoException if a service info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceInfoException, SystemException {
		ServiceInfo serviceInfo = fetchByPrimaryKey(primaryKey);

		if (serviceInfo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return serviceInfo;
	}

	/**
	 * Returns the service info with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchServiceInfoException} if it could not be found.
	 *
	 * @param resourceId the primary key of the service info
	 * @return the service info
	 * @throws cn.zoneco.openplatform.NoSuchServiceInfoException if a service info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceInfo findByPrimaryKey(long resourceId)
		throws NoSuchServiceInfoException, SystemException {
		return findByPrimaryKey((Serializable)resourceId);
	}

	/**
	 * Returns the service info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service info
	 * @return the service info, or <code>null</code> if a service info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceInfo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServiceInfo serviceInfo = (ServiceInfo)EntityCacheUtil.getResult(ServiceInfoModelImpl.ENTITY_CACHE_ENABLED,
				ServiceInfoImpl.class, primaryKey);

		if (serviceInfo == _nullServiceInfo) {
			return null;
		}

		if (serviceInfo == null) {
			Session session = null;

			try {
				session = openSession();

				serviceInfo = (ServiceInfo)session.get(ServiceInfoImpl.class,
						primaryKey);

				if (serviceInfo != null) {
					cacheResult(serviceInfo);
				}
				else {
					EntityCacheUtil.putResult(ServiceInfoModelImpl.ENTITY_CACHE_ENABLED,
						ServiceInfoImpl.class, primaryKey, _nullServiceInfo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceInfoModelImpl.ENTITY_CACHE_ENABLED,
					ServiceInfoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return serviceInfo;
	}

	/**
	 * Returns the service info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param resourceId the primary key of the service info
	 * @return the service info, or <code>null</code> if a service info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceInfo fetchByPrimaryKey(long resourceId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)resourceId);
	}

	/**
	 * Returns all the service infos.
	 *
	 * @return the service infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceInfo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.ServiceInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service infos
	 * @param end the upper bound of the range of service infos (not inclusive)
	 * @return the range of service infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceInfo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the service infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.ServiceInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service infos
	 * @param end the upper bound of the range of service infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of service infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceInfo> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ServiceInfo> list = (List<ServiceInfo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICEINFO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICEINFO;

				if (pagination) {
					sql = sql.concat(ServiceInfoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServiceInfo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceInfo>(list);
				}
				else {
					list = (List<ServiceInfo>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the service infos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServiceInfo serviceInfo : findAll()) {
			remove(serviceInfo);
		}
	}

	/**
	 * Returns the number of service infos.
	 *
	 * @return the number of service infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SERVICEINFO);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the service info persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.cn.zoneco.openplatform.model.ServiceInfo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServiceInfo>> listenersList = new ArrayList<ModelListener<ServiceInfo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServiceInfo>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ServiceInfoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICEINFO = "SELECT serviceInfo FROM ServiceInfo serviceInfo";
	private static final String _SQL_COUNT_SERVICEINFO = "SELECT COUNT(serviceInfo) FROM ServiceInfo serviceInfo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "serviceInfo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServiceInfo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ServiceInfoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"resourceId", "resourceName", "description", "logoAttId",
				"wsdlAttId", "statusId", "applyDate", "createDate", "createBy",
				"updateDate", "updateBy"
			});
	private static ServiceInfo _nullServiceInfo = new ServiceInfoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServiceInfo> toCacheModel() {
				return _nullServiceInfoCacheModel;
			}
		};

	private static CacheModel<ServiceInfo> _nullServiceInfoCacheModel = new CacheModel<ServiceInfo>() {
			@Override
			public ServiceInfo toEntityModel() {
				return _nullServiceInfo;
			}
		};
}