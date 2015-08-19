package awei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import awei.dao.UserMapper;
import awei.model.User;

@Service("userService")
public class UserServiceImpl implements UserServiceI {
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	
	@Autowired		//将UserMapper注入进来，
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User getUserById(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}


	@Override
	public List<User> getAll() {
		return userMapper.getAll();
	}

}
