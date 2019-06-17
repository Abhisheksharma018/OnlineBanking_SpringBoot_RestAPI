package com.online.banking.userfront.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.banking.userfront.dao.SavingsTransactionDao;
import com.online.banking.userfront.domain.SavingsTransaction;

@Service
public class SavingsTransactionServiceImpl implements SavingsTransactionService{

	@Autowired
	private SavingsTransactionDao savingsTransactionDao;
	
	@Override
	public List<SavingsTransaction> findAll() {
		// TODO Auto-generated method stub
		return savingsTransactionDao.findAll();
	}
	

}
