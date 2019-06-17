package com.online.banking.userfront.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.banking.userfront.domain.SavingsAccount;
import com.online.banking.userfront.repository.SavingsAccountRepository;

@Repository
public class SavingsAccountDaoImpl implements SavingsAccountDao{

	@Autowired
	private SavingsAccountRepository savingsAccountRepo;
	 
	@Override
	public SavingsAccount findByAccountNumber(int accountNumber) {
		// TODO Auto-generated method stub
		return savingsAccountRepo.findByAccountNumber(accountNumber);
	}

	@Override
	public void save(SavingsAccount savingsAccount) {
		// TODO Auto-generated method stub
		savingsAccountRepo.save(savingsAccount);
	}

}
