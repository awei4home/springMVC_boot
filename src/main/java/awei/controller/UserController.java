package awei.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import awei.model.User;
import awei.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController {
	private UserServiceI userService;
	

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	/**
	 * 访问方法     http://127.0.0.1:8080/springMVC/userController/0/shouUser.do    --->>>0表示参数
	 * @param userId
	 * @param request
	 * @return
	 */
	@RequestMapping("{userId}/shouUser")
	public String showUser(@PathVariable String userId, HttpServletRequest request) {		//告诉他userId是变量
		User user = userService.getUserById(userId);
		request.setAttribute("user", user);
		System.out.println("--------------->>>>>>>>>>>-------进入showUser------>>>>>>>>>>>>>>>>>>--------------");
		return "showUser";		//这是要返回到的视图页面
	}
}
