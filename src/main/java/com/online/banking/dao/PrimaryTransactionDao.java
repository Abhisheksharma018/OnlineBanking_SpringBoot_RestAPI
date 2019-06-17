package com.online.banking.userfront.dao;

import java.util.List;

import com.online.banking.userfront.domain.PrimaryTransaction;

public interface PrimaryTransactionDao {
	List<PrimaryTransaction> findAll();
	void save(PrimaryTransaction primaryTransaction);
}
