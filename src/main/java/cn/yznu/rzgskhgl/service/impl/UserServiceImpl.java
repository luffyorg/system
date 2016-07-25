package cn.yznu.rzgskhgl.service.impl;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.yznu.rzgskhgl.dao.IBaseDao;
import cn.yznu.rzgskhgl.pojo.User;
import cn.yznu.rzgskhgl.service.ICommonService;
import cn.yznu.rzgskhgl.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	ICommonService commonService;

	@Override
	public User findByName(String name) {
		String hql = "from User where name=?";
		
		return (User) commonService.findHql(hql, name);
	}

}
