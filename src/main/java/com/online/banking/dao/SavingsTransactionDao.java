package com.online.banking.userfront.dao;

import java.util.List;

import com.online.banking.userfront.domain.SavingsTransaction;

public interface SavingsTransactionDao {

	List<SavingsTransaction> findAll();
	void save(SavingsTransaction savingsTransaction);
}
