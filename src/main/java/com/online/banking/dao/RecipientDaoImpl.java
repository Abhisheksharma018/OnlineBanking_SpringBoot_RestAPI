package com.online.banking.userfront.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.banking.userfront.domain.Recipient;
import com.online.banking.userfront.repository.RecipientRepository;

@Repository
public class RecipientDaoImpl implements RecipientDao{
	
	@Autowired
	private RecipientRepository recipientRepo;

	@Override
	public List<Recipient> findAll() {
		// TODO Auto-generated method stub
		return recipientRepo.findAll();
	}

	@Override
	public Recipient findByName(String recipientName) {
		// TODO Auto-generated method stub
		return recipientRepo.findByName(recipientName);
	}

	@Override
	public void deleteByName(String recipientName) {
		// TODO Auto-generated method stub
		recipientRepo.deleteByName(recipientName);
		
	}

	@Override
	public Recipient save(Recipient recepient) {
		// TODO Auto-generated method stub
		return recipientRepo.save(recepient);
	}

}
