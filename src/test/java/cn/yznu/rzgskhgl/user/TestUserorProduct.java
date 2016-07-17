package cn.yznu.rzgskhgl.user;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.yznu.rzgskhgl.pojo.User;
import cn.yznu.rzgskhgl.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring-hibernate.xml")
@TransactionConfiguration(defaultRollback = false)
@Transactional
public class TestUserorProduct {
	@Autowired
	IUserService userService;

	@Test
	public void testSave() {
		User u1 = new User();
		u1.setName("张伟");
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
		
	}
}
