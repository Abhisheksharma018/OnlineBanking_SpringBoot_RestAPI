package com.online.banking.userfront.dao;

import com.online.banking.userfront.domain.security.Role;

public interface RoleDao {

	Role findByName(String name);
	void save(Role role);
}
