package awei.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import awei.model.User;
import awei.service.UserServiceI;
/**
 *  @author awei
 *  用spring方法测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestMybatisSpringMethod {
	private static final Logger logger = Logger.getLogger(TestMybatisSpringMethod.class);
	
	private UserServiceI userServiceI;

	public UserServiceI getUserServiceI() {
		return userServiceI;
	}

	@Autowired
	public void setUserServiceI(UserServiceI userServiceI) {
		this.userServiceI = userServiceI;
	}


	/**
	 * 测试用日志打成字符串，比较清晰
	 */
	@Test
	public void getUserByIdTest() {
		User user = userServiceI.getUserById("1");
		logger.info("-------->>>>>>>>>--------awei-------->>>>>>>>>>>-------------"+user);
		logger.info("-------->>>>>>>>>--------awei-------->>>>>>>>>>>-------------"+JSON.toJSONStringWithDateFormat(user, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	@Test
	public void getAllTest() {
		List<User> list = userServiceI.getAll();
		logger.info("-------->>>>>>>>>--------awei-------->>>>>>>>>>>-------------"+list);
		logger.info("-------->>>>>>>>>--------awei-------->>>>>>>>>>>-------------"+JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
	}
}
