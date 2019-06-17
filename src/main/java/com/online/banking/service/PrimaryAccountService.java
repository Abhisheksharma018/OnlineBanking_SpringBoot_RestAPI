package com.online.banking.userfront.service;

import com.online.banking.userfront.domain.PrimaryAccount;

public interface PrimaryAccountService {
	
	PrimaryAccount findByAccountNumber(int accountNumber);

}
