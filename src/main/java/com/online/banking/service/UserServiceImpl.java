package com.online.banking.userfront.service;

import java.util.List;
import java.util.Set;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.online.banking.userfront.dao.RoleDao;
import com.online.banking.userfront.dao.UserDao;
import com.online.banking.userfront.domain.User;
import com.online.banking.userfront.domain.security.UserRole;

@Service
public class UserServiceImpl implements UserService{
	
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleDao roleDao;
	
	@Autowired
	private AccountService accountService;
	
	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.findByUsername(username);
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userDao.findByEmail(email);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public boolean checkUserExists(String username, String email) {
		if (checkUsernameExists(username) || checkEmailExists(username)) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean checkUsernameExists(String username) {
		if (null != findByUsername(username)) {
			return true;
		}

		return false;
	}

	@Override
	public boolean checkEmailExists(String email) {
		if (null != findByEmail(email)) {
			return true;
		}

		return false;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		
	}

	@Override
	public User createUser(User user, Set<UserRole> userRoles) {
		// TODO Auto-generated method stub
		User localUser = userDao.findByUsername(user.getUsername());
		if(localUser!=null) {
			LOG.info("User exist already exist with the username!!");
		}else {
			String encryptedPassword = passwordEncoder.encode(user.getPassword());
			user.setPassword(encryptedPassword);
			
			for(UserRole ur:userRoles) {
				roleDao.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			
			user.setPrimaryAccount(accountService.createPrimaryAccount());
			user.setSavingsAccount(accountService.createSavingsAccount());
			
			localUser = userDao.save(user);
		}
		return localUser;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public void enableUser(String username) {
		User user = findByUsername(username);
		user.setEnabled(true);
		userDao.save(user);
	}

	@Override
	public void disableUser(String username) {
		User user = findByUsername(username);
		user.setEnabled(false);
		System.out.println(user.isEnabled());
		userDao.save(user);
		System.out.println(username + " is disabled.");
		
	}
	

}
