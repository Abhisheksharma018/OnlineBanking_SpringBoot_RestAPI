package com.online.banking.userfront.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.banking.userfront.dao.PrimaryTransactionDao;
import com.online.banking.userfront.domain.PrimaryTransaction;

@Service
public class PrimaryTransactionServiceImpl implements PrimaryTransactionService{

	@Autowired
	private PrimaryTransactionDao primaryTransactionDao;
	
	@Override
	public List<PrimaryTransaction> findAll() {
		// TODO Auto-generated method stub
		return primaryTransactionDao.findAll();
	}

	
}
