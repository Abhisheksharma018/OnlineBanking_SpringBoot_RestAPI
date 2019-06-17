package com.online.banking.userfront.dao;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.banking.userfront.domain.User;
import com.online.banking.userfront.domain.security.UserRole;
import com.online.banking.userfront.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepo.findByUsername(username);
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.findByEmail(email);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	

}
