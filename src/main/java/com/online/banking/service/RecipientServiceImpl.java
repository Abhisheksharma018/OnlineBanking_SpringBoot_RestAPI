package com.online.banking.userfront.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.banking.userfront.dao.RecipientDao;
import com.online.banking.userfront.domain.Recipient;

@Service
public class RecipientServiceImpl  implements RecipientService{
	
	@Autowired
	private RecipientDao recipientDao;

	@Override
	public List<Recipient> findAll() {
		// TODO Auto-generated method stub
		return recipientDao.findAll();
	}

	@Override
	public Recipient findByName(String recipientName) {
		// TODO Auto-generated method stub
		return recipientDao.findByName(recipientName);
	}

	@Override
	public void deleteByName(String recipientName) {
		// TODO Auto-generated method stub
		recipientDao.deleteByName(recipientName);
		
	}

}
