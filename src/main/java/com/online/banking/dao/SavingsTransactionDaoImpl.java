package com.online.banking.userfront.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.banking.userfront.domain.SavingsTransaction;
import com.online.banking.userfront.repository.SavingsAccountRepository;
import com.online.banking.userfront.repository.SavingsTransactionRepository;

@Repository
public class SavingsTransactionDaoImpl implements SavingsTransactionDao{
	
	@Autowired
	private SavingsTransactionRepository savingsTransactionRepo;

	@Override
	public List<SavingsTransaction> findAll() {
		// TODO Auto-generated method stub
		return savingsTransactionRepo.findAll();
	}

	@Override
	public void save(SavingsTransaction savingsTransaction) {
		// TODO Auto-generated method stub
		savingsTransactionRepo.save(savingsTransaction);
	}

}
