package com.online.banking.userfront.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.online.banking.userfront.domain.User;

public interface UserRepository extends JpaRepository<User, String>{

	@Query(value="select * from user where username=?1",nativeQuery=true)
	User findByUsername(String username);
	
	@Query(value="select * from user where email=?1",nativeQuery=true)
	User findByEmail(String email);
}
