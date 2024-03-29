package com.online.banking.userfront.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

@Entity
public class SavingsAccount {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int accountNumber;
	private BigDecimal accountBalance;

	@OneToMany(mappedBy="savingsAccount",cascade=CascadeType.ALL,fetch=FetchType.LAZY )
	private List<SavingsTransaction> savingsTransactionList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<SavingsTransaction> getSavingsTransactionList() {
		return savingsTransactionList;
	}

	public void setSavingsTransactionList(List<SavingsTransaction> savingsTransactionList) {
		this.savingsTransactionList = savingsTransactionList;
	}
	
	
	
}
