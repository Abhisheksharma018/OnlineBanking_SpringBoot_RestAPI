package com.online.banking.userfront.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.userfront.domain.SavingsTransaction;

public interface SavingsTransactionRepository extends JpaRepository<SavingsTransaction, String>{

}
