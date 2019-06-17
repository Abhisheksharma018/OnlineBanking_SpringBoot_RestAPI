package com.online.banking.userfront.dao;

import com.online.banking.userfront.domain.PrimaryAccount;

public interface PrimaryAccountDao {
	
	PrimaryAccount findByAccountNumber(int accountNumber);
	void save(PrimaryAccount primaryAccount);
}
