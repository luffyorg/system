package cn.yznu.rzgskhgl.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.yznu.rzgskhgl.dao.IBaseDao;
import cn.yznu.rzgskhgl.service.ICommonService;

@SuppressWarnings("rawtypes")
@Service("commonService")
@Transactional
public class CommonServiceimpl implements ICommonService {
	@Autowired
	IBaseDao baseDao;

	@Override
	public <T> Serializable save(T entity) {
		return baseDao.save(entity);
	}

	@Override
	public <T> void batchSave(List<T> entitys) {
		baseDao.batchSave(entitys);

	}

	@Override
	public <T> void batchUpdate(List<T> entitys) {
		baseDao.batchUpdate(entitys);

	}

	@Override
	public <T> void saveOrUpdate(T entity) {

		baseDao.saveOrUpdate(entity);
	}

	@Override
	public <T> T get(Class<T> entityName, Serializable id) {
		return baseDao.get(entityName, id);
	}

	@Override
	public <T> void delete(T entitiy) {
		baseDao.delete(entitiy);

	}

	@Override
	public <T> T findUniqueByProperty(Class<T> entityClass, String propertyName, Object value) {
		return baseDao.findUniqueByProperty(entityClass, propertyName, value);
	}

	@Override
	public <T> List<T> findByProperty(Class<T> entityClass, String propertyName, Object value) {
		return baseDao.findByProperty(entityClass, propertyName, value);
	}

	@Override
	public <T> List<T> loadAll(Class<T> entityClass) {
		return baseDao.loadAll(entityClass);
	}

	@Override
	public <T> T getEntity(Class entityName, Serializable id) {
		return baseDao.getEntity(entityName, id);
	}

	@Override
	public <T> void deleteEntityById(Class<T> entityName, Serializable id) {
		baseDao.deleteEntityById(entityName, id);
	}

	@Override
	public <T> void deleteAllEntitie(Collection<T> entitys) {
		baseDao.deleteAllEntitie(entitys);
	}

	@Override
	public <T> void updateEntitie(T pojo) {
		baseDao.updateEntitie(pojo);
	}

	@Override
	public <T> void updateEntityById(Class entityName, Serializable id) {
		baseDao.updateEntityById(entityName, id);
	}

	@Override
	public <T> int getCount(Class<T> clazz) {
		return baseDao.getCount(clazz);
	}

	@Override
	public <T> List<T> findHql(String hql, Object... param) {
		return baseDao.findHql(hql, param);
	}

	@Override
	public <T> List<T> findHql(Class<T> class1, String hql) {
		return baseDao.findHql(class1, hql);
	}

	@Override
	public Integer executeHql(String hql) {
		return baseDao.executeHql(hql);
	}

	@Override
	public Integer executeHql(String hql, Object... param) {
		return baseDao.executeHql(hql, param);
	}

}
