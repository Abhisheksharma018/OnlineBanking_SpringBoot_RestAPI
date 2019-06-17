package com.online.banking.userfront.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.online.banking.userfront.domain.SavingsAccount;

public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, String>{

	@Query(value="select * from savings_account where accountNumber=?1",nativeQuery=true)
	SavingsAccount findByAccountNumber (int accountNumber);
}
