package com.online.banking.userfront.dao;

import java.util.List;

import com.online.banking.userfront.domain.Recipient;

public interface RecipientDao {
	List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
    
    Recipient save(Recipient recepient);

}
