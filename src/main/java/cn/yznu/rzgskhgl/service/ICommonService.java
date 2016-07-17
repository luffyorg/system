package cn.yznu.rzgskhgl.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;


public interface ICommonService {
	/**
	 * 保存实体
	 * @param entity 实体类
	 * @return
	 */
	public <T> Serializable save(T entity);
	/**
	 * 批量保存实体
	 * @param entitys 实体集合
	 */
	public <T> void batchSave(List<T> entitys);
	/**
	 * 批量更新
	 * @param entitys 实体集合
	 */
	public <T> void batchUpdate(List<T> entitys);
	/**
	 * 保存或者更新实体
	 * @param entity 实体类
	 */
	public <T> void saveOrUpdate(T entity);
	/**
	 * 根据id得到实体
	 * @param entityName 实体类名称
	 * @param id 实体类的id
	 * @return
	 */
	public <T> T get(Class<T> entityName, Serializable id);
	
	/**
	 * 删除
	 * @param entitiy 实体
	 */
	public <T> void delete(T entitiy);
	/**
	 * 根据属性找到单一实体
	 * @param entityClass 实体类
	 * @param propertyName 属性名称
	 * @param value 属性值
	 * @return 实体
	 */
	public <T> T findUniqueByProperty(Class<T> entityClass, String propertyName, Object value);
	/**
	 * 根据属性找到实体类的集合
	 * @param entityClass
	 * @param propertyName 属性
	 * @param value 值
	 * @return 实体集合
	 */
	public <T> List<T> findByProperty(Class<T> entityClass, String propertyName, Object value);
	/**
	 * 加载全部实体
	 * @param entityClass
	 * @return
	 */
	public <T> List<T> loadAll(final Class<T> entityClass);
	/**
	 * 得到实体
	 * @param entityName
	 * @param id
	 * @return 实体类
	 */
	public <T> T getEntity(Class entityName, Serializable id);
	/**
	 * 删除实体根据id
	 * @param entityName
	 * @param id
	 */
	public <T> void deleteEntityById(Class<T> entityName, Serializable id);
	/**
	 * 删除全部实体
	 * @param entitys
	 */
	public <T> void deleteAllEntitie(Collection<T> entitys);
	/**
	 * 更新实体
	 * @param pojo
	 */
	public <T> void updateEntitie(T pojo);
	/**
	 * 根据id更新实体
	 * @param entityName
	 * @param id 
	 */
	
	public <T> void updateEntityById(Class entityName, Serializable id);
	
	/**
	 * 查询总记录数
	 * @param clazz
	 * @return
	 */
	public <T> int getCount(Class<T> clazz);

	public <T> List<T> findHql(String hql, Object... param);
	/**
	 * 根据hql语句找到实体集合
	 * @param class1 
	 * @param hql
	 * @return list集合
	 */
	public <T> List<T> findHql(final Class<T> class1, String hql);
	/**
	 * 查询记录条数
	 * @param hql HQL语句
	 * @return 记录总条数
	 */
	public Integer executeHql(String hql);
	/**
	 * 根据参数查找记录
	 * @param hql HQL语句
	 * @param param 参数
	 * @return 记录条数
	 */
	public Integer executeHql(String hql, Object... param);
	    
}
