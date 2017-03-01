package com.geekidentity.showcase.common.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.sql.QuerySelect;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.geekidentity.showcase.common.query.Page;

public abstract class BaseDaoImp<T> extends HibernateDaoSupport implements BaseDao<T> {
	
	
	public BaseDaoImp() {
	}
	
	@Autowired
	private void setSessionFactoryOverride(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	@Override
	public T get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable create(T pojo) {
		return getHibernateTemplate().save(pojo);
	}

	@Override
	public Serializable saveOrUpdate(T o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(T pojo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void batchUpdate(Collection<T> detachedInstances) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void batchSaveOrUpdate(Collection<T> instances) {
	}

	@Override
	public void batchSave(Collection<T> transientInstances) {
		getHibernateTemplate().executeWithNativeSession(new HibernateCallback<T>() {

			@Override
			public T doInHibernate(Session session) throws HibernateException {
				if (!CollectionUtils.isEqualCollection(transientInstances, CollectionUtils.EMPTY_COLLECTION)) {
					int max = CollectionUtils.size(transientInstances);
					int i = 0;
					for (T t : transientInstances) {
						session.save(t);
						if ((i != 0 && i % 30 == 0) || i == max -1) {
							session.flush();
							session.clear();
						}
						i++;
					}
				}
				return null;
			}
			
		});
	}

	@Override
	public void batchRemove(Collection<T> persistentInstances) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remove(T pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object findUniqueBy(Class<T> pojoClass, Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findUniqueBy(String name, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findBy(String name, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findBy(String name, Object value, boolean cacheable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findBy(Map<String, Object> filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByCache(Map<String, Object> filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findBy(Map<String, Object> filter, String setUpCriteriaMethod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> findBy(Map<String, Object> filterMap, Map<String, Object> orderMap, int start, int pageSize,
			String setUpCriteriaMethodName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> findByCriteria(QuerySelect querySelect, Map<String, Object> orderMap, int start, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> findBy(Map<String, Object> filterMap, Map<String, Object> orderMap, int start, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> findBy(Map<String, Object> filterMap, int start, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findUniqueByHql(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByHql(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findBySql(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> findByHql(String qryHql, int start, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> findByHql(String qryHql, Object[] args, Type[] values, int start, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByHql(String qryHql, Object[] args, Type[] types) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByString(String hql, Object... values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findBySql(String qrySql, Object[] args, Type[] types) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> findBySql(String sql, int start, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> findBySql(String sql, Object[] args, Type[] types, int start, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int executeHQL(String hql, Object... values) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int executeSQL(String sql, Object... values) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String findTextBySql(String qrySql, Object[] args, Type[] types) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findTextBySql(String qrySql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByHqlCache(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByHqlCache(String qryHql, Object[] args, Type[] types) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findBySqlCache(String qrySql, Object[] args, Type[] types, String[] columnAlias,
			Type[] columnTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByCache(String name, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findUniqueByCache(String name, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByCache(Map<String, Object> filterMap, Map<String, Object> orderMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByCache(Map<String, Object> filterMap, Map<String, Object> orderMap,
			String setUpCriteriaMethod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void evict(Serializable id) {
		// TODO Auto-generated method stub
		
	}

}
