package com.online.banking.userfront.dao;

import java.util.List;

import com.online.banking.userfront.domain.User;

public interface UserDao {
	
	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAll();
	User save(User user);
	

}
