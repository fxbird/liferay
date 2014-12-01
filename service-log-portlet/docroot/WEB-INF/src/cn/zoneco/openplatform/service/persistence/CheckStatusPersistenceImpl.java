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

import cn.zoneco.openplatform.NoSuchCheckStatusException;
import cn.zoneco.openplatform.model.CheckStatus;
import cn.zoneco.openplatform.model.impl.CheckStatusImpl;
import cn.zoneco.openplatform.model.impl.CheckStatusModelImpl;

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
 * The persistence implementation for the check status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see CheckStatusPersistence
 * @see CheckStatusUtil
 * @generated
 */
public class CheckStatusPersistenceImpl extends BasePersistenceImpl<CheckStatus>
	implements CheckStatusPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CheckStatusUtil} to access the check status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CheckStatusImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CheckStatusModelImpl.ENTITY_CACHE_ENABLED,
			CheckStatusModelImpl.FINDER_CACHE_ENABLED, CheckStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CheckStatusModelImpl.ENTITY_CACHE_ENABLED,
			CheckStatusModelImpl.FINDER_CACHE_ENABLED, CheckStatusImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CheckStatusModelImpl.ENTITY_CACHE_ENABLED,
			CheckStatusModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CheckStatusPersistenceImpl() {
		setModelClass(CheckStatus.class);
	}

	/**
	 * Caches the check status in the entity cache if it is enabled.
	 *
	 * @param checkStatus the check status
	 */
	@Override
	public void cacheResult(CheckStatus checkStatus) {
		EntityCacheUtil.putResult(CheckStatusModelImpl.ENTITY_CACHE_ENABLED,
			CheckStatusImpl.class, checkStatus.getPrimaryKey(), checkStatus);

		checkStatus.resetOriginalValues();
	}

	/**
	 * Caches the check statuses in the entity cache if it is enabled.
	 *
	 * @param checkStatuses the check statuses
	 */
	@Override
	public void cacheResult(List<CheckStatus> checkStatuses) {
		for (CheckStatus checkStatus : checkStatuses) {
			if (EntityCacheUtil.getResult(
						CheckStatusModelImpl.ENTITY_CACHE_ENABLED,
						CheckStatusImpl.class, checkStatus.getPrimaryKey()) == null) {
				cacheResult(checkStatus);
			}
			else {
				checkStatus.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all check statuses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CheckStatusImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CheckStatusImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the check status.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CheckStatus checkStatus) {
		EntityCacheUtil.removeResult(CheckStatusModelImpl.ENTITY_CACHE_ENABLED,
			CheckStatusImpl.class, checkStatus.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CheckStatus> checkStatuses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CheckStatus checkStatus : checkStatuses) {
			EntityCacheUtil.removeResult(CheckStatusModelImpl.ENTITY_CACHE_ENABLED,
				CheckStatusImpl.class, checkStatus.getPrimaryKey());
		}
	}

	/**
	 * Creates a new check status with the primary key. Does not add the check status to the database.
	 *
	 * @param statusId the primary key for the new check status
	 * @return the new check status
	 */
	@Override
	public CheckStatus create(long statusId) {
		CheckStatus checkStatus = new CheckStatusImpl();

		checkStatus.setNew(true);
		checkStatus.setPrimaryKey(statusId);

		return checkStatus;
	}

	/**
	 * Removes the check status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param statusId the primary key of the check status
	 * @return the check status that was removed
	 * @throws cn.zoneco.openplatform.NoSuchCheckStatusException if a check status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CheckStatus remove(long statusId)
		throws NoSuchCheckStatusException, SystemException {
		return remove((Serializable)statusId);
	}

	/**
	 * Removes the check status with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the check status
	 * @return the check status that was removed
	 * @throws cn.zoneco.openplatform.NoSuchCheckStatusException if a check status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CheckStatus remove(Serializable primaryKey)
		throws NoSuchCheckStatusException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CheckStatus checkStatus = (CheckStatus)session.get(CheckStatusImpl.class,
					primaryKey);

			if (checkStatus == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCheckStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(checkStatus);
		}
		catch (NoSuchCheckStatusException nsee) {
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
	protected CheckStatus removeImpl(CheckStatus checkStatus)
		throws SystemException {
		checkStatus = toUnwrappedModel(checkStatus);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(checkStatus)) {
				checkStatus = (CheckStatus)session.get(CheckStatusImpl.class,
						checkStatus.getPrimaryKeyObj());
			}

			if (checkStatus != null) {
				session.delete(checkStatus);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (checkStatus != null) {
			clearCache(checkStatus);
		}

		return checkStatus;
	}

	@Override
	public CheckStatus updateImpl(
		cn.zoneco.openplatform.model.CheckStatus checkStatus)
		throws SystemException {
		checkStatus = toUnwrappedModel(checkStatus);

		boolean isNew = checkStatus.isNew();

		Session session = null;

		try {
			session = openSession();

			if (checkStatus.isNew()) {
				session.save(checkStatus);

				checkStatus.setNew(false);
			}
			else {
				session.merge(checkStatus);
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

		EntityCacheUtil.putResult(CheckStatusModelImpl.ENTITY_CACHE_ENABLED,
			CheckStatusImpl.class, checkStatus.getPrimaryKey(), checkStatus);

		return checkStatus;
	}

	protected CheckStatus toUnwrappedModel(CheckStatus checkStatus) {
		if (checkStatus instanceof CheckStatusImpl) {
			return checkStatus;
		}

		CheckStatusImpl checkStatusImpl = new CheckStatusImpl();

		checkStatusImpl.setNew(checkStatus.isNew());
		checkStatusImpl.setPrimaryKey(checkStatus.getPrimaryKey());

		checkStatusImpl.setStatusId(checkStatus.getStatusId());
		checkStatusImpl.setStatusName(checkStatus.getStatusName());

		return checkStatusImpl;
	}

	/**
	 * Returns the check status with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the check status
	 * @return the check status
	 * @throws cn.zoneco.openplatform.NoSuchCheckStatusException if a check status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CheckStatus findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCheckStatusException, SystemException {
		CheckStatus checkStatus = fetchByPrimaryKey(primaryKey);

		if (checkStatus == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCheckStatusException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return checkStatus;
	}

	/**
	 * Returns the check status with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchCheckStatusException} if it could not be found.
	 *
	 * @param statusId the primary key of the check status
	 * @return the check status
	 * @throws cn.zoneco.openplatform.NoSuchCheckStatusException if a check status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CheckStatus findByPrimaryKey(long statusId)
		throws NoSuchCheckStatusException, SystemException {
		return findByPrimaryKey((Serializable)statusId);
	}

	/**
	 * Returns the check status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the check status
	 * @return the check status, or <code>null</code> if a check status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CheckStatus fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CheckStatus checkStatus = (CheckStatus)EntityCacheUtil.getResult(CheckStatusModelImpl.ENTITY_CACHE_ENABLED,
				CheckStatusImpl.class, primaryKey);

		if (checkStatus == _nullCheckStatus) {
			return null;
		}

		if (checkStatus == null) {
			Session session = null;

			try {
				session = openSession();

				checkStatus = (CheckStatus)session.get(CheckStatusImpl.class,
						primaryKey);

				if (checkStatus != null) {
					cacheResult(checkStatus);
				}
				else {
					EntityCacheUtil.putResult(CheckStatusModelImpl.ENTITY_CACHE_ENABLED,
						CheckStatusImpl.class, primaryKey, _nullCheckStatus);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CheckStatusModelImpl.ENTITY_CACHE_ENABLED,
					CheckStatusImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return checkStatus;
	}

	/**
	 * Returns the check status with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param statusId the primary key of the check status
	 * @return the check status, or <code>null</code> if a check status with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CheckStatus fetchByPrimaryKey(long statusId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)statusId);
	}

	/**
	 * Returns all the check statuses.
	 *
	 * @return the check statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CheckStatus> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the check statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CheckStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of check statuses
	 * @param end the upper bound of the range of check statuses (not inclusive)
	 * @return the range of check statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CheckStatus> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the check statuses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CheckStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of check statuses
	 * @param end the upper bound of the range of check statuses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of check statuses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CheckStatus> findAll(int start, int end,
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

		List<CheckStatus> list = (List<CheckStatus>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CHECKSTATUS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CHECKSTATUS;

				if (pagination) {
					sql = sql.concat(CheckStatusModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CheckStatus>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CheckStatus>(list);
				}
				else {
					list = (List<CheckStatus>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the check statuses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CheckStatus checkStatus : findAll()) {
			remove(checkStatus);
		}
	}

	/**
	 * Returns the number of check statuses.
	 *
	 * @return the number of check statuses
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

				Query q = session.createQuery(_SQL_COUNT_CHECKSTATUS);

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
	 * Initializes the check status persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.cn.zoneco.openplatform.model.CheckStatus")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CheckStatus>> listenersList = new ArrayList<ModelListener<CheckStatus>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CheckStatus>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CheckStatusImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CHECKSTATUS = "SELECT checkStatus FROM CheckStatus checkStatus";
	private static final String _SQL_COUNT_CHECKSTATUS = "SELECT COUNT(checkStatus) FROM CheckStatus checkStatus";
	private static final String _ORDER_BY_ENTITY_ALIAS = "checkStatus.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CheckStatus exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CheckStatusPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"statusId", "statusName"
			});
	private static CheckStatus _nullCheckStatus = new CheckStatusImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CheckStatus> toCacheModel() {
				return _nullCheckStatusCacheModel;
			}
		};

	private static CacheModel<CheckStatus> _nullCheckStatusCacheModel = new CacheModel<CheckStatus>() {
			@Override
			public CheckStatus toEntityModel() {
				return _nullCheckStatus;
			}
		};
}