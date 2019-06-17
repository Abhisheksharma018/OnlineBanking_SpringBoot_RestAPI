package com.online.banking.userfront.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.userfront.domain.PrimaryTransaction;

public interface PrimaryTransactionRepository extends JpaRepository<PrimaryTransaction, String> {

}
