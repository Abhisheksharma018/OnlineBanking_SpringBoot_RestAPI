package com.online.banking.userfront.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.banking.userfront.dao.RoleDao;
import com.online.banking.userfront.domain.security.Role;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleDao roleDao; 

	@Override
	public Role findByName(String name) {
		// TODO Auto-generated method stub
		return roleDao.findByName(name);
	}

}
