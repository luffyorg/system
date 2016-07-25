package cn.yznu.rzgskhgl.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.yznu.rzgskhgl.pojo.Permission;
import cn.yznu.rzgskhgl.pojo.Role;
import cn.yznu.rzgskhgl.pojo.User;
import cn.yznu.rzgskhgl.service.ICommonService;
import cn.yznu.rzgskhgl.service.IUserService;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring-hibernate.xml")
@TransactionConfiguration(defaultRollback = false)
@Transactional
public class TestUser {
	@Autowired
	ICommonService commonService;

	@Test
	public void testSave() {
		/**
		 * tom 的角色是admin,normal jack 的角色是manger,normal rose 的角色是normall admin
		 * 的权限有add,update,query,delete manger 的权限有add,update,query normal
		 * 的权限有query
		 */

		User u1 = new User();
		u1.setUserName("tom");
		u1.setPassword("111111");
		u1.setCompany(1);
		u1.setAddress("长江师范学院");
		u1.setEstate(1);
		u1.setGender("男");
		u1.setIndustry("软件");
		u1.setMovable(1);
		u1.setTel(Long.parseLong("13100000001"));
		u1.setTotalAssets(12333343.5);
		u1.setTotalLiability(123.3);
		u1.setCreateBy("1");
		u1.setCreateDate(new Date());
		u1.setCreateName("张伟");

		User u2 = new User();
		u2.setUserName("jack");
		u2.setPassword("111111");
		u2.setCompany(1);
		u2.setAddress("长江师范学院");
		u2.setEstate(1);
		u2.setGender("男");
		u2.setIndustry("软件");
		u2.setMovable(1);
		u2.setTel(Long.parseLong("13100000001"));
		u2.setTotalAssets(12333343.5);
		u2.setTotalLiability(123.3);
		u2.setCreateBy("1");
		u2.setCreateDate(new Date());
		u2.setCreateName("张伟");

		User u3 = new User();
		u3.setUserName("rose");
		u3.setPassword("111111");
		u3.setCompany(1);
		u3.setAddress("长江师范学院");
		u3.setEstate(1);
		u3.setGender("男");
		u3.setIndustry("软件");
		u3.setMovable(1);
		u3.setTel(Long.parseLong("13100000001"));
		u3.setTotalAssets(12333343.5);
		u3.setTotalLiability(123.3);
		u3.setCreateBy("1");
		u3.setCreateDate(new Date());
		u3.setCreateName("张伟");

		Role r1 = new Role();
		r1.setRoleCode("1");
		r1.setRoleName("admin");

		Role r2 = new Role();
		r2.setRoleCode("a");
		r2.setRoleName("manager");

		Role r3 = new Role();
		r3.setRoleCode("a");
		r3.setRoleName("normal");

		Permission p1 = new Permission();
		p1.setPermissionname("delete");

		Permission p2 = new Permission();
		p2.setPermissionname("add");

		Permission p3 = new Permission();
		p3.setPermissionname("update");

		Permission p4 = new Permission();
		p4.setPermissionname("query");

		commonService.save(u1);
		commonService.save(u2);
		commonService.save(u3);
		
		commonService.save(r1);
		commonService.save(r2);
		commonService.save(r3);
		
		commonService.save(p1);
		commonService.save(p2);
		commonService.save(p3);
		commonService.save(p4);

	}

	@Test
	public void test1() {

	}
}
