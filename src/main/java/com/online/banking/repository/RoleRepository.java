package com.online.banking.userfront.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.online.banking.userfront.domain.security.Role;

public interface RoleRepository extends JpaRepository<Role, String>{
	
	@Query(value="select * from role where name=?1",nativeQuery=true)
	Role findByName(String name);

}
