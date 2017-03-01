package com.geekidentity.showcase.common.service;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.geekidentity.showcase.common.dao.BaseDao;
import com.geekidentity.showcase.common.query.Page;

/**
 * 基础数据存取对象实现类
 * @author geekidentity
 * @date 2017年3月1日
 * @version 1.0
 *
 * @param <T>
 */
public class BaseServiceImp<T> implements BaseService<T> {
	
	@Autowired
	
	protected BaseDao<T> baseDao;
	@Override
	public T get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Class<T> clazz, Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable create(T o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable saveOrUpdate(T o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(T o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remove(T o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void batchUpdate(Collection<T> detachedInstances) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void batchSaveOrUpdate(Collection<T> instances) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void batchSave(Collection<T> transientInstances) {
		baseDao.batchSave(transientInstances);
		
	}

	@Override
	public void batchRemove(Collection<T> persistentInstances) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> findByHql(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByHql(String hql, Object[] args, Type[] types) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findBySql(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findBySql(String sql, Object[] args, Type[] types) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findTextBySql(String qrySql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> searchByHql(String hql, Object[] args, Type[] types) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> searchBySql(String sql, Object[] args, Type[] types) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> searchByHql(String hql, Object... values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> searchByHql(String hql, Object[] args, Type[] types, int start, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> search(Map<String, Object> filterMap, Map<String, Object> orderMap, int start, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findBy(String name, Object value) {
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
	public List<T> findBy(Map<String, Object> filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findUniqueBy(String name, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findUniqueByHql(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

}
