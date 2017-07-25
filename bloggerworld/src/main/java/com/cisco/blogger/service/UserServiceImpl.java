package com.cisco.blogger.service;
import com.cisco.blogger.api.DuplicateUserException;
import com.cisco.blogger.api.User;
import com.cisco.blogger.data.UserDAO;
import com.cisco.blogger.data.UserDAOImpl;

public class UserServiceImpl implements UserService {

    UserDAO userdao = new UserDAOImpl();

	public void registerUser(User user) {
		System.out.println("in registerUser entry");
		if (ifUserExists(user.getEmailId())){
			throw new DuplicateUserException("Duplicate user register request received with email id"+ user.getEmailId());
		}
		System.out.println("in registerUser exit");
		userdao.create(user);
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public User validateUser(String emailId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean ifUserExists(String emailId)
	{
		User result = userdao.findUser(emailId);
		if (result!= null){
		   return true;
		}  
		return false;
	}
}
