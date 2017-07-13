package com.cisco.blogger.service;

import com.cisco.blogger.api.User;

public interface UserService {

	public void registerUser(User user);
	
	public User updateUser(User user);
	
	public User validateUser(String emailId, String password);
	
	
	
}
