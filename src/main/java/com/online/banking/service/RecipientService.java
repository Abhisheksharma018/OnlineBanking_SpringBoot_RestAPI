package com.online.banking.userfront.service;

import java.util.List;

import com.online.banking.userfront.domain.Recipient;

public interface RecipientService {
	
	List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);


}
