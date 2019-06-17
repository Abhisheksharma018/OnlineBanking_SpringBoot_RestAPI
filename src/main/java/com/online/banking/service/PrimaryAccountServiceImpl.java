package com.online.banking.userfront.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.banking.userfront.dao.PrimaryAccountDao;
import com.online.banking.userfront.domain.PrimaryAccount;

@Service
public class PrimaryAccountServiceImpl implements PrimaryAccountService{

	@Autowired
	private PrimaryAccountDao primaryAccountDao;
	
	@Override
	public PrimaryAccount findByAccountNumber(int accountNumber) {
		// TODO Auto-generated method stub
		return primaryAccountDao.findByAccountNumber(accountNumber);
	}
	

}
