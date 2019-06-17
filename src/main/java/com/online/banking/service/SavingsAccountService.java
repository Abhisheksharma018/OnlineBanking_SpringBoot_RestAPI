package com.online.banking.userfront.service;

import com.online.banking.userfront.domain.SavingsAccount;

public interface SavingsAccountService {

	SavingsAccount findByAccountNumber (int accountNumber);
}
