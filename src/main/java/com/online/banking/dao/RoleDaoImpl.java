package com.online.banking.userfront.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.banking.userfront.domain.security.Role;
import com.online.banking.userfront.repository.RoleRepository;

@Repository
public class RoleDaoImpl implements RoleDao{
	
	@Autowired
	private RoleRepository roleRepo;

	@Override
	public Role findByName(String name) {
		// TODO Auto-generated method stub
		return roleRepo.findByName(name);
	}

	@Override
	public void save(Role role) {
		// TODO Auto-generated method stub
		roleRepo.save(role);
	}

}
