package com.online.banking.userfront.service;


import com.online.banking.userfront.domain.PrimaryAccount;
import com.online.banking.userfront.domain.SavingsAccount;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
	SavingsAccount createSavingsAccount();
	
	void deposit(String accountType, double amount, String username);
	void withdraw(String accountType, double amount, String username);

}
