package com.online.banking.userfront.service;

import java.util.List;

import com.online.banking.userfront.domain.SavingsTransaction;

public interface SavingsTransactionService {
	
	List<SavingsTransaction> findAll();

}
