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

import cn.zoneco.openplatform.NoSuchCallLogException;
import cn.zoneco.openplatform.model.CallLog;
import cn.zoneco.openplatform.model.impl.CallLogImpl;
import cn.zoneco.openplatform.model.impl.CallLogModelImpl;

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
 * The persistence implementation for the call log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see CallLogPersistence
 * @see CallLogUtil
 * @generated
 */
public class CallLogPersistenceImpl extends BasePersistenceImpl<CallLog>
	implements CallLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CallLogUtil} to access the call log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CallLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CallLogModelImpl.ENTITY_CACHE_ENABLED,
			CallLogModelImpl.FINDER_CACHE_ENABLED, CallLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CallLogModelImpl.ENTITY_CACHE_ENABLED,
			CallLogModelImpl.FINDER_CACHE_ENABLED, CallLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CallLogModelImpl.ENTITY_CACHE_ENABLED,
			CallLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CallLogPersistenceImpl() {
		setModelClass(CallLog.class);
	}

	/**
	 * Caches the call log in the entity cache if it is enabled.
	 *
	 * @param callLog the call log
	 */
	@Override
	public void cacheResult(CallLog callLog) {
		EntityCacheUtil.putResult(CallLogModelImpl.ENTITY_CACHE_ENABLED,
			CallLogImpl.class, callLog.getPrimaryKey(), callLog);

		callLog.resetOriginalValues();
	}

	/**
	 * Caches the call logs in the entity cache if it is enabled.
	 *
	 * @param callLogs the call logs
	 */
	@Override
	public void cacheResult(List<CallLog> callLogs) {
		for (CallLog callLog : callLogs) {
			if (EntityCacheUtil.getResult(
						CallLogModelImpl.ENTITY_CACHE_ENABLED,
						CallLogImpl.class, callLog.getPrimaryKey()) == null) {
				cacheResult(callLog);
			}
			else {
				callLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all call logs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CallLogImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CallLogImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the call log.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CallLog callLog) {
		EntityCacheUtil.removeResult(CallLogModelImpl.ENTITY_CACHE_ENABLED,
			CallLogImpl.class, callLog.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CallLog> callLogs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CallLog callLog : callLogs) {
			EntityCacheUtil.removeResult(CallLogModelImpl.ENTITY_CACHE_ENABLED,
				CallLogImpl.class, callLog.getPrimaryKey());
		}
	}

	/**
	 * Creates a new call log with the primary key. Does not add the call log to the database.
	 *
	 * @param logId the primary key for the new call log
	 * @return the new call log
	 */
	@Override
	public CallLog create(long logId) {
		CallLog callLog = new CallLogImpl();

		callLog.setNew(true);
		callLog.setPrimaryKey(logId);

		return callLog;
	}

	/**
	 * Removes the call log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param logId the primary key of the call log
	 * @return the call log that was removed
	 * @throws cn.zoneco.openplatform.NoSuchCallLogException if a call log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallLog remove(long logId)
		throws NoSuchCallLogException, SystemException {
		return remove((Serializable)logId);
	}

	/**
	 * Removes the call log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the call log
	 * @return the call log that was removed
	 * @throws cn.zoneco.openplatform.NoSuchCallLogException if a call log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallLog remove(Serializable primaryKey)
		throws NoSuchCallLogException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CallLog callLog = (CallLog)session.get(CallLogImpl.class, primaryKey);

			if (callLog == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCallLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(callLog);
		}
		catch (NoSuchCallLogException nsee) {
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
	protected CallLog removeImpl(CallLog callLog) throws SystemException {
		callLog = toUnwrappedModel(callLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(callLog)) {
				callLog = (CallLog)session.get(CallLogImpl.class,
						callLog.getPrimaryKeyObj());
			}

			if (callLog != null) {
				session.delete(callLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (callLog != null) {
			clearCache(callLog);
		}

		return callLog;
	}

	@Override
	public CallLog updateImpl(cn.zoneco.openplatform.model.CallLog callLog)
		throws SystemException {
		callLog = toUnwrappedModel(callLog);

		boolean isNew = callLog.isNew();

		Session session = null;

		try {
			session = openSession();

			if (callLog.isNew()) {
				session.save(callLog);

				callLog.setNew(false);
			}
			else {
				session.merge(callLog);
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

		EntityCacheUtil.putResult(CallLogModelImpl.ENTITY_CACHE_ENABLED,
			CallLogImpl.class, callLog.getPrimaryKey(), callLog);

		return callLog;
	}

	protected CallLog toUnwrappedModel(CallLog callLog) {
		if (callLog instanceof CallLogImpl) {
			return callLog;
		}

		CallLogImpl callLogImpl = new CallLogImpl();

		callLogImpl.setNew(callLog.isNew());
		callLogImpl.setPrimaryKey(callLog.getPrimaryKey());

		callLogImpl.setLogId(callLog.getLogId());
		callLogImpl.setUserName(callLog.getUserName());
		callLogImpl.setResourceName(callLog.getResourceName());
		callLogImpl.setStartTime(callLog.getStartTime());
		callLogImpl.setEndTime(callLog.getEndTime());
		callLogImpl.setLogStatus(callLog.getLogStatus());
		callLogImpl.setLogMessage(callLog.getLogMessage());
		callLogImpl.setUserId(callLog.getUserId());
		callLogImpl.setResourceId(callLog.getResourceId());
		callLogImpl.setInMsg(callLog.getInMsg());
		callLogImpl.setOutMsg(callLog.getOutMsg());

		return callLogImpl;
	}

	/**
	 * Returns the call log with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the call log
	 * @return the call log
	 * @throws cn.zoneco.openplatform.NoSuchCallLogException if a call log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCallLogException, SystemException {
		CallLog callLog = fetchByPrimaryKey(primaryKey);

		if (callLog == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCallLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return callLog;
	}

	/**
	 * Returns the call log with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchCallLogException} if it could not be found.
	 *
	 * @param logId the primary key of the call log
	 * @return the call log
	 * @throws cn.zoneco.openplatform.NoSuchCallLogException if a call log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallLog findByPrimaryKey(long logId)
		throws NoSuchCallLogException, SystemException {
		return findByPrimaryKey((Serializable)logId);
	}

	/**
	 * Returns the call log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the call log
	 * @return the call log, or <code>null</code> if a call log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallLog fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CallLog callLog = (CallLog)EntityCacheUtil.getResult(CallLogModelImpl.ENTITY_CACHE_ENABLED,
				CallLogImpl.class, primaryKey);

		if (callLog == _nullCallLog) {
			return null;
		}

		if (callLog == null) {
			Session session = null;

			try {
				session = openSession();

				callLog = (CallLog)session.get(CallLogImpl.class, primaryKey);

				if (callLog != null) {
					cacheResult(callLog);
				}
				else {
					EntityCacheUtil.putResult(CallLogModelImpl.ENTITY_CACHE_ENABLED,
						CallLogImpl.class, primaryKey, _nullCallLog);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CallLogModelImpl.ENTITY_CACHE_ENABLED,
					CallLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return callLog;
	}

	/**
	 * Returns the call log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param logId the primary key of the call log
	 * @return the call log, or <code>null</code> if a call log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallLog fetchByPrimaryKey(long logId) throws SystemException {
		return fetchByPrimaryKey((Serializable)logId);
	}

	/**
	 * Returns all the call logs.
	 *
	 * @return the call logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CallLog> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the call logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CallLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of call logs
	 * @param end the upper bound of the range of call logs (not inclusive)
	 * @return the range of call logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CallLog> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the call logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.CallLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of call logs
	 * @param end the upper bound of the range of call logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of call logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CallLog> findAll(int start, int end,
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

		List<CallLog> list = (List<CallLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CALLLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CALLLOG;

				if (pagination) {
					sql = sql.concat(CallLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CallLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CallLog>(list);
				}
				else {
					list = (List<CallLog>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the call logs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CallLog callLog : findAll()) {
			remove(callLog);
		}
	}

	/**
	 * Returns the number of call logs.
	 *
	 * @return the number of call logs
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

				Query q = session.createQuery(_SQL_COUNT_CALLLOG);

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
	 * Initializes the call log persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.cn.zoneco.openplatform.model.CallLog")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CallLog>> listenersList = new ArrayList<ModelListener<CallLog>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CallLog>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CallLogImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CALLLOG = "SELECT callLog FROM CallLog callLog";
	private static final String _SQL_COUNT_CALLLOG = "SELECT COUNT(callLog) FROM CallLog callLog";
	private static final String _ORDER_BY_ENTITY_ALIAS = "callLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CallLog exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CallLogPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"logId", "userName", "resourceName", "startTime", "endTime",
				"logStatus", "logMessage", "userId", "resourceId", "inMsg",
				"outMsg"
			});
	private static CallLog _nullCallLog = new CallLogImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CallLog> toCacheModel() {
				return _nullCallLogCacheModel;
			}
		};

	private static CacheModel<CallLog> _nullCallLogCacheModel = new CacheModel<CallLog>() {
			@Override
			public CallLog toEntityModel() {
				return _nullCallLog;
			}
		};
}