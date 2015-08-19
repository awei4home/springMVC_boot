package awei.service;

import java.util.List;

import awei.model.User;

public interface UserServiceI {
	public User getUserById(String userId);
	
	public List<User> getAll();
}
