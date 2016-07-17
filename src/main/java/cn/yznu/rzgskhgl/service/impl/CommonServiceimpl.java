package cn.yznu.rzgskhgl.service.impl;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.yznu.rzgskhgl.service.ICommonService;


@Service("commonService")
@Transactional
public class CommonServiceimpl  implements ICommonService{

	@Override
	public <T> Serializable save(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void batchSave(List<T> entitys) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void batchUpdate(List<T> entitys) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void saveOrUpdate(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T get(Class<T> entityName, Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void delete(T entitiy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T findUniqueByProperty(Class<T> entityClass, String propertyName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findByProperty(Class<T> entityClass, String propertyName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> loadAll(Class<T> entityClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getEntity(Class entityName, Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void deleteEntityById(Class<T> entityName, Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void deleteAllEntitie(Collection<T> entitys) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void updateEntitie(T pojo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void updateEntityById(Class entityName, Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> int getCount(Class<T> clazz) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> List<T> findHql(String hql, Object... param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findHql(Class<T> class1, String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer executeHql(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer executeHql(String hql, Object... param) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
