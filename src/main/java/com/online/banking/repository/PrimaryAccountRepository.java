package com.online.banking.userfront.repository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.userfront.domain.PrimaryAccount;

public interface PrimaryAccountRepository extends JpaRepository<PrimaryAccount, String>{
	
	@Query(value="select * from primary_account where accountNumber=?1",nativeQuery=true)
	PrimaryAccount findByAccountNumber(int accountNumber);
	
}
