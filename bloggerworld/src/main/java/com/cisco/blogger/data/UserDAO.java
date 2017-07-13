package com.cisco.blogger.data;

import com.cisco.blogger.api.User;

public interface UserDAO {

	public User create(User user);

	public User updateUser(User user);

	public User validateUser(String emailId, String password);

}
