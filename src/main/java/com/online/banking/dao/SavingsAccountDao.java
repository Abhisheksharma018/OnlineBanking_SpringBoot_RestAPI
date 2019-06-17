package com.online.banking.userfront.dao;

import com.online.banking.userfront.domain.SavingsAccount;

public interface SavingsAccountDao {
	SavingsAccount findByAccountNumber (int accountNumber);
	
	void save(SavingsAccount savingsAccount);
}
