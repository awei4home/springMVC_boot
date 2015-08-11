package awei.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import awei.model.User;
import awei.service.UserServiceI;
/**
 *  @author awei
 *  用spring方法测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestMybatisSpringMethod {
	private UserServiceI userServiceI;

	public UserServiceI getUserServiceI() {
		return userServiceI;
	}

	@Autowired
	public void setUserServiceI(UserServiceI userServiceI) {
		this.userServiceI = userServiceI;
	}


	@Test
	public void test() {
		User user = userServiceI.getUserById("1");
		System.out.println("-------->>>>>>>>>--------awei-------->>>>>>>>>>>-------------"+user);
	}
	
}
