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

import cn.zoneco.openplatform.NoSuchZEntityException;
import cn.zoneco.openplatform.model.ZEntity;
import cn.zoneco.openplatform.model.impl.ZEntityImpl;
import cn.zoneco.openplatform.model.impl.ZEntityModelImpl;

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

/**
 * The persistence implementation for the z entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see ZEntityPersistence
 * @see ZEntityUtil
 * @generated
 */
public class ZEntityPersistenceImpl extends BasePersistenceImpl<ZEntity>
	implements ZEntityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ZEntityUtil} to access the z entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ZEntityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ZEntityModelImpl.ENTITY_CACHE_ENABLED,
			ZEntityModelImpl.FINDER_CACHE_ENABLED, ZEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ZEntityModelImpl.ENTITY_CACHE_ENABLED,
			ZEntityModelImpl.FINDER_CACHE_ENABLED, ZEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ZEntityModelImpl.ENTITY_CACHE_ENABLED,
			ZEntityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ZEntityPersistenceImpl() {
		setModelClass(ZEntity.class);
	}

	/**
	 * Caches the z entity in the entity cache if it is enabled.
	 *
	 * @param zEntity the z entity
	 */
	@Override
	public void cacheResult(ZEntity zEntity) {
		EntityCacheUtil.putResult(ZEntityModelImpl.ENTITY_CACHE_ENABLED,
			ZEntityImpl.class, zEntity.getPrimaryKey(), zEntity);

		zEntity.resetOriginalValues();
	}

	/**
	 * Caches the z entities in the entity cache if it is enabled.
	 *
	 * @param zEntities the z entities
	 */
	@Override
	public void cacheResult(List<ZEntity> zEntities) {
		for (ZEntity zEntity : zEntities) {
			if (EntityCacheUtil.getResult(
						ZEntityModelImpl.ENTITY_CACHE_ENABLED,
						ZEntityImpl.class, zEntity.getPrimaryKey()) == null) {
				cacheResult(zEntity);
			}
			else {
				zEntity.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all z entities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ZEntityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ZEntityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the z entity.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ZEntity zEntity) {
		EntityCacheUtil.removeResult(ZEntityModelImpl.ENTITY_CACHE_ENABLED,
			ZEntityImpl.class, zEntity.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ZEntity> zEntities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ZEntity zEntity : zEntities) {
			EntityCacheUtil.removeResult(ZEntityModelImpl.ENTITY_CACHE_ENABLED,
				ZEntityImpl.class, zEntity.getPrimaryKey());
		}
	}

	/**
	 * Creates a new z entity with the primary key. Does not add the z entity to the database.
	 *
	 * @param comId the primary key for the new z entity
	 * @return the new z entity
	 */
	@Override
	public ZEntity create(long comId) {
		ZEntity zEntity = new ZEntityImpl();

		zEntity.setNew(true);
		zEntity.setPrimaryKey(comId);

		return zEntity;
	}

	/**
	 * Removes the z entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param comId the primary key of the z entity
	 * @return the z entity that was removed
	 * @throws cn.zoneco.openplatform.NoSuchZEntityException if a z entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ZEntity remove(long comId)
		throws NoSuchZEntityException, SystemException {
		return remove((Serializable)comId);
	}

	/**
	 * Removes the z entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the z entity
	 * @return the z entity that was removed
	 * @throws cn.zoneco.openplatform.NoSuchZEntityException if a z entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ZEntity remove(Serializable primaryKey)
		throws NoSuchZEntityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ZEntity zEntity = (ZEntity)session.get(ZEntityImpl.class, primaryKey);

			if (zEntity == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchZEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(zEntity);
		}
		catch (NoSuchZEntityException nsee) {
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
	protected ZEntity removeImpl(ZEntity zEntity) throws SystemException {
		zEntity = toUnwrappedModel(zEntity);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(zEntity)) {
				zEntity = (ZEntity)session.get(ZEntityImpl.class,
						zEntity.getPrimaryKeyObj());
			}

			if (zEntity != null) {
				session.delete(zEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (zEntity != null) {
			clearCache(zEntity);
		}

		return zEntity;
	}

	@Override
	public ZEntity updateImpl(cn.zoneco.openplatform.model.ZEntity zEntity)
		throws SystemException {
		zEntity = toUnwrappedModel(zEntity);

		boolean isNew = zEntity.isNew();

		Session session = null;

		try {
			session = openSession();

			if (zEntity.isNew()) {
				session.save(zEntity);

				zEntity.setNew(false);
			}
			else {
				session.merge(zEntity);
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

		EntityCacheUtil.putResult(ZEntityModelImpl.ENTITY_CACHE_ENABLED,
			ZEntityImpl.class, zEntity.getPrimaryKey(), zEntity);

		return zEntity;
	}

	protected ZEntity toUnwrappedModel(ZEntity zEntity) {
		if (zEntity instanceof ZEntityImpl) {
			return zEntity;
		}

		ZEntityImpl zEntityImpl = new ZEntityImpl();

		zEntityImpl.setNew(zEntity.isNew());
		zEntityImpl.setPrimaryKey(zEntity.getPrimaryKey());

		zEntityImpl.setComId(zEntity.getComId());
		zEntityImpl.setComName(zEntity.getComName());

		return zEntityImpl;
	}

	/**
	 * Returns the z entity with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the z entity
	 * @return the z entity
	 * @throws cn.zoneco.openplatform.NoSuchZEntityException if a z entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ZEntity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchZEntityException, SystemException {
		ZEntity zEntity = fetchByPrimaryKey(primaryKey);

		if (zEntity == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchZEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return zEntity;
	}

	/**
	 * Returns the z entity with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchZEntityException} if it could not be found.
	 *
	 * @param comId the primary key of the z entity
	 * @return the z entity
	 * @throws cn.zoneco.openplatform.NoSuchZEntityException if a z entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ZEntity findByPrimaryKey(long comId)
		throws NoSuchZEntityException, SystemException {
		return findByPrimaryKey((Serializable)comId);
	}

	/**
	 * Returns the z entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the z entity
	 * @return the z entity, or <code>null</code> if a z entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ZEntity fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ZEntity zEntity = (ZEntity)EntityCacheUtil.getResult(ZEntityModelImpl.ENTITY_CACHE_ENABLED,
				ZEntityImpl.class, primaryKey);

		if (zEntity == _nullZEntity) {
			return null;
		}

		if (zEntity == null) {
			Session session = null;

			try {
				session = openSession();

				zEntity = (ZEntity)session.get(ZEntityImpl.class, primaryKey);

				if (zEntity != null) {
					cacheResult(zEntity);
				}
				else {
					EntityCacheUtil.putResult(ZEntityModelImpl.ENTITY_CACHE_ENABLED,
						ZEntityImpl.class, primaryKey, _nullZEntity);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ZEntityModelImpl.ENTITY_CACHE_ENABLED,
					ZEntityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return zEntity;
	}

	/**
	 * Returns the z entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param comId the primary key of the z entity
	 * @return the z entity, or <code>null</code> if a z entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ZEntity fetchByPrimaryKey(long comId) throws SystemException {
		return fetchByPrimaryKey((Serializable)comId);
	}

	/**
	 * Returns all the z entities.
	 *
	 * @return the z entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ZEntity> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the z entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.ZEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of z entities
	 * @param end the upper bound of the range of z entities (not inclusive)
	 * @return the range of z entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ZEntity> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the z entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.ZEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of z entities
	 * @param end the upper bound of the range of z entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of z entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ZEntity> findAll(int start, int end,
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

		List<ZEntity> list = (List<ZEntity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ZENTITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ZENTITY;

				if (pagination) {
					sql = sql.concat(ZEntityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ZEntity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ZEntity>(list);
				}
				else {
					list = (List<ZEntity>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the z entities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ZEntity zEntity : findAll()) {
			remove(zEntity);
		}
	}

	/**
	 * Returns the number of z entities.
	 *
	 * @return the number of z entities
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

				Query q = session.createQuery(_SQL_COUNT_ZENTITY);

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

	/**
	 * Initializes the z entity persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.cn.zoneco.openplatform.model.ZEntity")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ZEntity>> listenersList = new ArrayList<ModelListener<ZEntity>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ZEntity>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ZEntityImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ZENTITY = "SELECT zEntity FROM ZEntity zEntity";
	private static final String _SQL_COUNT_ZENTITY = "SELECT COUNT(zEntity) FROM ZEntity zEntity";
	private static final String _ORDER_BY_ENTITY_ALIAS = "zEntity.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ZEntity exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ZEntityPersistenceImpl.class);
	private static ZEntity _nullZEntity = new ZEntityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ZEntity> toCacheModel() {
				return _nullZEntityCacheModel;
			}
		};

	private static CacheModel<ZEntity> _nullZEntityCacheModel = new CacheModel<ZEntity>() {
			@Override
			public ZEntity toEntityModel() {
				return _nullZEntity;
			}
		};
}