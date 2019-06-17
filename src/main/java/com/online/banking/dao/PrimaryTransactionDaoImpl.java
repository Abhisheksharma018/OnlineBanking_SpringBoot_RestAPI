package com.online.banking.userfront.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.banking.userfront.domain.PrimaryTransaction;
import com.online.banking.userfront.repository.PrimaryTransactionRepository;

@Repository
public class PrimaryTransactionDaoImpl implements PrimaryTransactionDao {

	@Autowired
	private PrimaryTransactionRepository primaryTransactionRepo;
	
	@Override
	public List<PrimaryTransaction> findAll() {
		// TODO Auto-generated method stub
		return primaryTransactionRepo.findAll();
	}

	@Override
	public void save(PrimaryTransaction primaryTransaction) {
		// TODO Auto-generated method stub
		primaryTransactionRepo.save(primaryTransaction);
		
	}

}
