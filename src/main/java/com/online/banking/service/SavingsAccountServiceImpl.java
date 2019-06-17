package com.online.banking.userfront.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.banking.userfront.dao.SavingsAccountDao;
import com.online.banking.userfront.domain.SavingsAccount;

@Service
public class SavingsAccountServiceImpl implements SavingsAccountService{
	
	@Autowired
	private SavingsAccountDao savingsAccountDao;

	@Override
	public SavingsAccount findByAccountNumber(int accountNumber) {
		// TODO Auto-generated method stub
		return savingsAccountDao.findByAccountNumber(accountNumber);
	}

}
