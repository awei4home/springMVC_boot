package awei.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import awei.model.User;
import awei.service.UserServiceI;
/**
 *  @author awei
 *  一般的测试方法
 */
public class TestMybatis {
	private ApplicationContext applicationContext;
	private UserServiceI userServiceI;
	@Before
	public void before() {
		//applicationContext就是spring上下文
		applicationContext = new ClassPathXmlApplicationContext(new String[] {"spring.xml", "spring-mybatis.xml"});
		userServiceI = (UserServiceI) applicationContext.getBean("userService");
	}
	

	@Test
	public void test() {
		User user = userServiceI.getUserById("1");
		System.out.println("-------->>>>>>>>>--------awei-------->>>>>>>>>>>-------------"+user);
	}
	
}
