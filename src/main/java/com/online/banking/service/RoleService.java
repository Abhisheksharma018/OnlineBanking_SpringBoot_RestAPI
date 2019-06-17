package com.online.banking.userfront.service;

import com.online.banking.userfront.domain.security.Role;

public interface RoleService {
	
	Role findByName(String name);
}
