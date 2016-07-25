package cn.yznu.rzgskhgl.service;

import cn.yznu.rzgskhgl.pojo.User;

public interface IUserService extends ICommonService{
	
	public User findByName(String name);
}
