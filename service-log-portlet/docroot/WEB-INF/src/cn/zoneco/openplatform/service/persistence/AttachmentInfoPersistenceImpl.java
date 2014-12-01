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

import cn.zoneco.openplatform.NoSuchAttachmentInfoException;
import cn.zoneco.openplatform.model.AttachmentInfo;
import cn.zoneco.openplatform.model.impl.AttachmentInfoImpl;
import cn.zoneco.openplatform.model.impl.AttachmentInfoModelImpl;

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
 * The persistence implementation for the attachment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author fxbird
 * @see AttachmentInfoPersistence
 * @see AttachmentInfoUtil
 * @generated
 */
public class AttachmentInfoPersistenceImpl extends BasePersistenceImpl<AttachmentInfo>
	implements AttachmentInfoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AttachmentInfoUtil} to access the attachment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AttachmentInfoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AttachmentInfoModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentInfoModelImpl.FINDER_CACHE_ENABLED,
			AttachmentInfoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AttachmentInfoModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentInfoModelImpl.FINDER_CACHE_ENABLED,
			AttachmentInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AttachmentInfoModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AttachmentInfoPersistenceImpl() {
		setModelClass(AttachmentInfo.class);
	}

	/**
	 * Caches the attachment info in the entity cache if it is enabled.
	 *
	 * @param attachmentInfo the attachment info
	 */
	@Override
	public void cacheResult(AttachmentInfo attachmentInfo) {
		EntityCacheUtil.putResult(AttachmentInfoModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentInfoImpl.class, attachmentInfo.getPrimaryKey(),
			attachmentInfo);

		attachmentInfo.resetOriginalValues();
	}

	/**
	 * Caches the attachment infos in the entity cache if it is enabled.
	 *
	 * @param attachmentInfos the attachment infos
	 */
	@Override
	public void cacheResult(List<AttachmentInfo> attachmentInfos) {
		for (AttachmentInfo attachmentInfo : attachmentInfos) {
			if (EntityCacheUtil.getResult(
						AttachmentInfoModelImpl.ENTITY_CACHE_ENABLED,
						AttachmentInfoImpl.class, attachmentInfo.getPrimaryKey()) == null) {
				cacheResult(attachmentInfo);
			}
			else {
				attachmentInfo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all attachment infos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AttachmentInfoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AttachmentInfoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the attachment info.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttachmentInfo attachmentInfo) {
		EntityCacheUtil.removeResult(AttachmentInfoModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentInfoImpl.class, attachmentInfo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AttachmentInfo> attachmentInfos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AttachmentInfo attachmentInfo : attachmentInfos) {
			EntityCacheUtil.removeResult(AttachmentInfoModelImpl.ENTITY_CACHE_ENABLED,
				AttachmentInfoImpl.class, attachmentInfo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new attachment info with the primary key. Does not add the attachment info to the database.
	 *
	 * @param attachId the primary key for the new attachment info
	 * @return the new attachment info
	 */
	@Override
	public AttachmentInfo create(long attachId) {
		AttachmentInfo attachmentInfo = new AttachmentInfoImpl();

		attachmentInfo.setNew(true);
		attachmentInfo.setPrimaryKey(attachId);

		return attachmentInfo;
	}

	/**
	 * Removes the attachment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attachId the primary key of the attachment info
	 * @return the attachment info that was removed
	 * @throws cn.zoneco.openplatform.NoSuchAttachmentInfoException if a attachment info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AttachmentInfo remove(long attachId)
		throws NoSuchAttachmentInfoException, SystemException {
		return remove((Serializable)attachId);
	}

	/**
	 * Removes the attachment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attachment info
	 * @return the attachment info that was removed
	 * @throws cn.zoneco.openplatform.NoSuchAttachmentInfoException if a attachment info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AttachmentInfo remove(Serializable primaryKey)
		throws NoSuchAttachmentInfoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AttachmentInfo attachmentInfo = (AttachmentInfo)session.get(AttachmentInfoImpl.class,
					primaryKey);

			if (attachmentInfo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttachmentInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(attachmentInfo);
		}
		catch (NoSuchAttachmentInfoException nsee) {
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
	protected AttachmentInfo removeImpl(AttachmentInfo attachmentInfo)
		throws SystemException {
		attachmentInfo = toUnwrappedModel(attachmentInfo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attachmentInfo)) {
				attachmentInfo = (AttachmentInfo)session.get(AttachmentInfoImpl.class,
						attachmentInfo.getPrimaryKeyObj());
			}

			if (attachmentInfo != null) {
				session.delete(attachmentInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (attachmentInfo != null) {
			clearCache(attachmentInfo);
		}

		return attachmentInfo;
	}

	@Override
	public AttachmentInfo updateImpl(
		cn.zoneco.openplatform.model.AttachmentInfo attachmentInfo)
		throws SystemException {
		attachmentInfo = toUnwrappedModel(attachmentInfo);

		boolean isNew = attachmentInfo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (attachmentInfo.isNew()) {
				session.save(attachmentInfo);

				attachmentInfo.setNew(false);
			}
			else {
				session.evict(attachmentInfo);
				session.saveOrUpdate(attachmentInfo);
			}

			session.flush();
			session.clear();
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

		EntityCacheUtil.putResult(AttachmentInfoModelImpl.ENTITY_CACHE_ENABLED,
			AttachmentInfoImpl.class, attachmentInfo.getPrimaryKey(),
			attachmentInfo);

		attachmentInfo.resetOriginalValues();

		return attachmentInfo;
	}

	protected AttachmentInfo toUnwrappedModel(AttachmentInfo attachmentInfo) {
		if (attachmentInfo instanceof AttachmentInfoImpl) {
			return attachmentInfo;
		}

		AttachmentInfoImpl attachmentInfoImpl = new AttachmentInfoImpl();

		attachmentInfoImpl.setNew(attachmentInfo.isNew());
		attachmentInfoImpl.setPrimaryKey(attachmentInfo.getPrimaryKey());

		attachmentInfoImpl.setAttachId(attachmentInfo.getAttachId());
		attachmentInfoImpl.setOriName(attachmentInfo.getOriName());
		attachmentInfoImpl.setSaveName(attachmentInfo.getSaveName());
		attachmentInfoImpl.setTypeCode(attachmentInfo.getTypeCode());
		attachmentInfoImpl.setAttContent(attachmentInfo.getAttContent());
		attachmentInfoImpl.setExtName(attachmentInfo.getExtName());
		attachmentInfoImpl.setCreateDate(attachmentInfo.getCreateDate());
		attachmentInfoImpl.setCreateBy(attachmentInfo.getCreateBy());

		return attachmentInfoImpl;
	}

	/**
	 * Returns the attachment info with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the attachment info
	 * @return the attachment info
	 * @throws cn.zoneco.openplatform.NoSuchAttachmentInfoException if a attachment info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AttachmentInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttachmentInfoException, SystemException {
		AttachmentInfo attachmentInfo = fetchByPrimaryKey(primaryKey);

		if (attachmentInfo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttachmentInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return attachmentInfo;
	}

	/**
	 * Returns the attachment info with the primary key or throws a {@link cn.zoneco.openplatform.NoSuchAttachmentInfoException} if it could not be found.
	 *
	 * @param attachId the primary key of the attachment info
	 * @return the attachment info
	 * @throws cn.zoneco.openplatform.NoSuchAttachmentInfoException if a attachment info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AttachmentInfo findByPrimaryKey(long attachId)
		throws NoSuchAttachmentInfoException, SystemException {
		return findByPrimaryKey((Serializable)attachId);
	}

	/**
	 * Returns the attachment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attachment info
	 * @return the attachment info, or <code>null</code> if a attachment info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AttachmentInfo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AttachmentInfo attachmentInfo = (AttachmentInfo)EntityCacheUtil.getResult(AttachmentInfoModelImpl.ENTITY_CACHE_ENABLED,
				AttachmentInfoImpl.class, primaryKey);

		if (attachmentInfo == _nullAttachmentInfo) {
			return null;
		}

		if (attachmentInfo == null) {
			Session session = null;

			try {
				session = openSession();

				attachmentInfo = (AttachmentInfo)session.get(AttachmentInfoImpl.class,
						primaryKey);

				if (attachmentInfo != null) {
					cacheResult(attachmentInfo);
				}
				else {
					EntityCacheUtil.putResult(AttachmentInfoModelImpl.ENTITY_CACHE_ENABLED,
						AttachmentInfoImpl.class, primaryKey,
						_nullAttachmentInfo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AttachmentInfoModelImpl.ENTITY_CACHE_ENABLED,
					AttachmentInfoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return attachmentInfo;
	}

	/**
	 * Returns the attachment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attachId the primary key of the attachment info
	 * @return the attachment info, or <code>null</code> if a attachment info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AttachmentInfo fetchByPrimaryKey(long attachId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)attachId);
	}

	/**
	 * Returns all the attachment infos.
	 *
	 * @return the attachment infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AttachmentInfo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attachment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.AttachmentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of attachment infos
	 * @param end the upper bound of the range of attachment infos (not inclusive)
	 * @return the range of attachment infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AttachmentInfo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attachment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cn.zoneco.openplatform.model.impl.AttachmentInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of attachment infos
	 * @param end the upper bound of the range of attachment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attachment infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AttachmentInfo> findAll(int start, int end,
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

		List<AttachmentInfo> list = (List<AttachmentInfo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ATTACHMENTINFO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ATTACHMENTINFO;

				if (pagination) {
					sql = sql.concat(AttachmentInfoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AttachmentInfo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AttachmentInfo>(list);
				}
				else {
					list = (List<AttachmentInfo>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the attachment infos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AttachmentInfo attachmentInfo : findAll()) {
			remove(attachmentInfo);
		}
	}

	/**
	 * Returns the number of attachment infos.
	 *
	 * @return the number of attachment infos
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

				Query q = session.createQuery(_SQL_COUNT_ATTACHMENTINFO);

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
	 * Initializes the attachment info persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.cn.zoneco.openplatform.model.AttachmentInfo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AttachmentInfo>> listenersList = new ArrayList<ModelListener<AttachmentInfo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AttachmentInfo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AttachmentInfoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ATTACHMENTINFO = "SELECT attachmentInfo FROM AttachmentInfo attachmentInfo";
	private static final String _SQL_COUNT_ATTACHMENTINFO = "SELECT COUNT(attachmentInfo) FROM AttachmentInfo attachmentInfo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "attachmentInfo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AttachmentInfo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AttachmentInfoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"attachId", "oriName", "saveName", "typeCode", "attContent",
				"extName", "createDate", "createBy"
			});
	private static AttachmentInfo _nullAttachmentInfo = new AttachmentInfoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AttachmentInfo> toCacheModel() {
				return _nullAttachmentInfoCacheModel;
			}
		};

	private static CacheModel<AttachmentInfo> _nullAttachmentInfoCacheModel = new CacheModel<AttachmentInfo>() {
			@Override
			public AttachmentInfo toEntityModel() {
				return _nullAttachmentInfo;
			}
		};
}