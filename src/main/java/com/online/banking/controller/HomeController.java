package com.online.banking.userfront.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.banking.userfront.dao.RoleDao;
import com.online.banking.userfront.domain.User;
import com.online.banking.userfront.domain.security.UserRole;
import com.online.banking.userfront.service.UserService;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);
	
	
	@Autowired
	private UserService userService;

	@Autowired
	private RoleDao roleDao;
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public User signupPost(@RequestBody User user) {
		
		
		if (userService.checkUserExists(user.getUsername(), user.getEmail())) {

			if (userService.checkEmailExists(user.getEmail())) {
				LOG.info("User exist with the given email Id!!");
			}

			if (userService.checkUsernameExists(user.getUsername())) {
				LOG.info("User exist with the given userName!!");
			}

			return user;
		} else {
			Set<UserRole> userRoles = new HashSet<>();
			userRoles.add(new UserRole(user, roleDao.findByName("ROLE_USER")));

			userService.createUser(user, userRoles);

			return user;
		}
		
		
		
	}
	
	@RequestMapping(value = "/login/{userName}/{password}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public User getProfile(@RequestBody User user) {
		
		
		return user;
		
	}
	

}
