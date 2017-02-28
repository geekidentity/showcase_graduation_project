package com.geekidentity.showcase.common.service;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.geekidentity.showcase.common.query.Page;

/**
 * 基础业务逻辑接口
 * 
 * @author geekidentity
 * @date 2017年2月28日
 * @version 1.0
 *
 * @param <T>
 */
public interface BaseService<T> {

	/**
	 * 根据主键获得一个对象。
	 * 
	 * @param id
	 *            主键
	 * @return
	 */
	public T get(Serializable id);

	/**
	 * 根据主键获取一个指定类的对象。
	 * 
	 * @param clazz
	 * @param id
	 * @return
	 */
	public Object get(Class<T> clazz, Serializable id);

	/**
	 * 获取当前泛型所有的实体。
	 * 
	 * @return
	 */
	public List<T> getAll();

	/**
	 * 创建一个实体。
	 * 
	 * @param o
	 *            被创建的实体。
	 * @return 创建实体的主键。
	 */
	public Serializable create(T o);

	/**
	 * 保存一个对象。保存或者修改。
	 * 
	 * @param o
	 * @return
	 */
	public Serializable saveOrUpdate(T o);

	/**
	 * 更新一个实体。
	 * 
	 * @param o
	 *            被更新的对象。
	 */
	public void update(T o);

	/**
	 * 删除一个对象。
	 * 
	 * @param o
	 *            待删除对象。
	 * @return 删除成功与否的标志。
	 */
	public boolean remove(T o);

	/**
	 * 批量更新对象。 更新完成后，参数中的对象都变成持久化状态。
	 * 
	 * @param detachedInstances
	 *            要更新的一批对象。
	 */
	public void batchUpdate(final Collection<T> detachedInstances);

	/**
	 * 批量新增或者保存一批对象。
	 * 
	 * @param instances
	 *            待操作对象。
	 */
	public void batchSaveOrUpdate(final Collection<T> instances);

	/**
	 * 批量新增一批对象。
	 * 
	 * @param transientInstances
	 *            待新增对象。
	 */
	public void batchSave(final Collection<T> transientInstances);

	/**
	 * 批量删除一批对象。
	 * 
	 * @param persistentInstances
	 *            待删除对象。
	 */
	public void batchRemove(final Collection<T> persistentInstances);

	/**
	 * 通过hql语句查询实体。
	 * 
	 * @param hql
	 *            查询所用hql。
	 * @return 查询出的记录，记录根据hql语句的不同而不同。
	 */
	public List<T> findByHql(String hql);

	/**
	 * 通过hql语句查询实体。
	 * 
	 * @param hql
	 *            查询所用hql。
	 * @param args
	 *            参数值数组
	 * @param types
	 *            参数值类型数组
	 * @return 查询出的记录，记录根据hql语句的不同而不同。
	 */
	public List<T> findByHql(String hql, Object[] args, Type[] types);

	/**
	 * 通过sql语句查询实体。
	 * 
	 * @param sql
	 *            查询所用sql。
	 * @return 查询出的记录。
	 */
	public List<T> findBySql(String sql);

	public List<T> findBySql(String sql, Object[] args, Type[] types);

	public String findTextBySql(String qrySql);

	/**
	 * 使用带有参数的hql语句查询记录。
	 * 
	 * @param hql
	 *            查询所用hql。
	 * @param args
	 *            hql中使用的参数值。
	 * @param types
	 *            参数args一一对应的参数类型。一般使用Hibernate.STRING等常量来指定。
	 * @return
	 */
	public List<T> searchByHql(String hql, Object[] args, Type[] types);

	/**
	 * 使用带有参数的sql语句查询记录。
	 * 
	 * @param sql
	 *            查询所用sql。
	 * @param args
	 *            sql中使用的参数值。
	 * @param types
	 *            参数args一一对应的参数类型。一般使用Hibernate.STRING等常量来指定。
	 * @return
	 */
	public List<T> searchBySql(String sql, Object[] args, Type[] types);

	/**
	 * 使用带有参数的hql语句查询记录。
	 * <li>searchByHql("form Entity where entityId=? and entityName=?", new
	 * Integer(1), "zhongguo");</li>
	 * <li>searchByHql( "form Entity where entityId=? and entityName=? and
	 * entitytel=?", new Integer(1), "zhongguo", "82882828");</li>
	 * 
	 * @param hql
	 *            查询所用hql。
	 * @param values
	 *            hql中对应的参数值。
	 * @return 查询出的记录。
	 */
	public List<T> searchByHql(String hql, Object... values);

	/**
	 * 使用带有参数的hql语句分页查询记录。
	 * <p />
	 * for example: searchByHql("form Entity where entityId=? and entityName=?"
	 * , new Object[2]{"1", "zhongguo"} , new Type[2]{Hibernate.Integer,
	 * Hibernate.STRING} , 0, 10);
	 * 
	 * @param hql
	 *            查询所用hql。
	 * @param args
	 *            hql中使用的参数值。
	 * @param types
	 *            参数args一一对应的参数类型。一般使用Hibernate.STRING等常量来指定。
	 * @param start
	 *            查询的起始记录数，从0计数。
	 * @param pageSize
	 *            分页大小。
	 * @return
	 */
	public Page<T> searchByHql(String hql, Object[] args, Type[] types, int start, int pageSize);

	/**
	 * 根据制定的条件，分页查询泛型指定的实体。
	 * 
	 * @param filterMap
	 *            查询的条件，属性名到属性值的映射。
	 * @param orderMap
	 *            排序条件，属性名到asc/desc的映射。
	 * @param start
	 *            查询的起始记录数，从0计数。
	 * @param pageSize
	 *            分页大小。
	 * @return 封装好的Page对象。
	 * 
	 * @see com.tinet.ccic.wm.commons.dao.BaseDao#findBy(Map, Map, int, int)
	 */
	public Page<T> search(Map<String, Object> filterMap, Map<String, Object> orderMap, int start, int pageSize);

	/**
	 * 通过一个属性查找。
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public List<T> findBy(String name, Object value);

	/**
	 * 使用hql查询，缓存查询结果。
	 * 
	 * @author louxue
	 * @param hql
	 *            hql语句。
	 * @return 返回Object数组的list。
	 */
	public List<T> findByHqlCache(String hql);

	/**
	 * 使用动态赋值的hql查询。
	 * 
	 * @author louxue
	 * @param qryHql
	 *            查询的hql语句。
	 * @param args
	 *            hql动态赋值参数取值数组。
	 * @param types
	 *            hql动态赋值参数类型数组。
	 * @return 返回查询结果list。
	 */
	public List<T> findByHqlCache(String qryHql, Object[] args, Type[] types);

	/**
	 * 根据某一个属性以及属性值获取对象，缓存查询结果。
	 * 
	 * @param name
	 *            属性名。
	 * @param value
	 *            属性值。
	 */
	public List<T> findByCache(String name, Object value);

	/**
	 * 根据某一个属性以及属性值获取唯一的一个对象，缓存查询结果。
	 * 
	 * @param name
	 *            属性名。
	 * @param value
	 *            属性值。
	 */
	public T findUniqueByCache(String name, Object value);

	/**
	 * 根据查询过滤条件和排序条件进行查询，查询条件使用默认的取查询参数属性与值相等的比较方法。
	 * 
	 * @author louxue
	 * @param filterMap
	 *            过滤条件，name-value对，name为泛型T对应实体的属性名，value为取值。
	 * @param orderMap
	 *            排序条件。
	 * @return 返回查询结果list对象。
	 */
	public List<T> findByCache(Map<String, Object> filterMap, Map<String, Object> orderMap);

	/**
	 * 通过filter中设置的查询条件来查询一批实体。
	 * <p>
	 * 实体的查询条件由{@link BaseDaoImp#setUpCriteria(Criteria, Map)}
	 * 来设置，setUpCriteria默认的实现方法是将map中的条件都设置为相等。
	 * 
	 * @param filter
	 *            Map，查询条件，由属性到值的映射。
	 */
	public List<T> findBy(Map<String, Object> filter);

	/**
	 * 根据属性名和属性值查询一个实体。 查询条件是name=value，如果可查出多条记录，则抛出异常。
	 * 
	 * @param name
	 *            属性名称
	 * @param value
	 *            属性值
	 * @return 符合条件的唯一泛型对象
	 */
	public T findUniqueBy(String name, Object value);

	public Object findUniqueByHql(String hql);
}
