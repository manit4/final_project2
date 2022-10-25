package com.cohart.service;

import java.util.List;

import com.cohart.repository.UserRepository;
import com.cohart.to.User;

public class UserService {

//	public boolean validateUser(String username, String password) throws Exception {
//
//		UserRepository userRepository = new UserRepository();
//
//		boolean validatedUserStatus = userRepository.validateUserCredentials(username, password);
//		
//		return validatedUserStatus;
//	}

	public User validateUser(String username, String password) throws Exception {

		UserRepository userRepository = new UserRepository();

		User user = userRepository.validateUserCredentials(username, password);
		
		return user;
	}
	
	public List<User> getAllUsers() throws Exception {
		
		UserRepository userDao = new UserRepository();
		
		List<User> users = userDao.getUsers();
		
		return users;
	}
	
}
