package com.online.banking.userfront.service;

import java.util.List;

import com.online.banking.userfront.domain.PrimaryTransaction;

public interface PrimaryTransactionService {

	List<PrimaryTransaction> findAll();
}
