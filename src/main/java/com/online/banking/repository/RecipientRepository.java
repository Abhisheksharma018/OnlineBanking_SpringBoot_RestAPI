package com.online.banking.userfront.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.online.banking.userfront.domain.Recipient;

public interface RecipientRepository extends JpaRepository<Recipient, String>{
	
	@Query(value="select * from recipient where recipientName=?1",nativeQuery=true)
	Recipient findByName(String recipientName);

	@Query(value="delete  from recipient where recipientName=?1",nativeQuery=true)
    void deleteByName(String recipientName);

}
