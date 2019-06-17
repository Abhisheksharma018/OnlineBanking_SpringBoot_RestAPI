package com.online.banking.userfront.service;

import java.util.List;
import java.util.Set;

import com.online.banking.userfront.domain.User;
import com.online.banking.userfront.domain.security.UserRole;

public interface UserService {
	
	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAll();
	
	boolean checkUserExists(String username, String email);
	boolean checkUsernameExists(String username);
	boolean checkEmailExists(String email);
	
	void save(User user);
	User createUser(User user, Set<UserRole> userRoles);
	User saveUser(User user);
	void enableUser (String username);
    void disableUser (String username);
	

}
