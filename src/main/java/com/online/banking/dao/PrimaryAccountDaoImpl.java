package com.online.banking.userfront.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.banking.userfront.domain.PrimaryAccount;
import com.online.banking.userfront.repository.PrimaryAccountRepository;


@Repository
public class PrimaryAccountDaoImpl implements PrimaryAccountDao{
	
	@Autowired
	private PrimaryAccountRepository primaryAccountRepo;

	@Override
	public PrimaryAccount findByAccountNumber(int accountNumber) {
		// TODO Auto-generated method stub
		return primaryAccountRepo.findByAccountNumber(accountNumber);
	}

	@Override
	public void save(PrimaryAccount primaryAccount) {
		// TODO Auto-generated method stub
		primaryAccountRepo.save(primaryAccount);
	}

}
