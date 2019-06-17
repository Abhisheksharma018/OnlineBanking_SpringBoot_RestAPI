package com.online.banking.userfront.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.banking.userfront.domain.Appointment;
import com.online.banking.userfront.domain.PrimaryAccount;
import com.online.banking.userfront.domain.PrimaryTransaction;
import com.online.banking.userfront.domain.SavingsAccount;
import com.online.banking.userfront.domain.SavingsTransaction;
import com.online.banking.userfront.domain.User;
import com.online.banking.userfront.service.AccountService;
import com.online.banking.userfront.service.AppointmentService;
import com.online.banking.userfront.service.TransactionService;
import com.online.banking.userfront.service.UserService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private AccountService accountService;

	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private AppointmentService appointmentService;
	
	@RequestMapping(method = RequestMethod.GET,value="/primaryAccount/{username}",produces = "application/json")
	@ResponseBody
	public PrimaryAccount primaryAccount(@PathVariable String username) {
		User user = userService.findByUsername(username);
		PrimaryAccount primaryAccount = user.getPrimaryAccount();
		
		return primaryAccount;
	}	
	
	@RequestMapping(method = RequestMethod.GET,value="/primaryTransaction/{username}",produces = "application/json")
	@ResponseBody
	public List<PrimaryTransaction> primaryTransaction(@PathVariable String username) {
		List<PrimaryTransaction> primaryTransactionList = transactionService
				.findPrimaryTransactionList(username);

		return primaryTransactionList;
	}	

	@RequestMapping(method = RequestMethod.GET,value="/savingsAccount/{username}",produces = "application/json")
	@ResponseBody
	public SavingsAccount savingsAccount(@PathVariable String username) {
		User user = userService.findByUsername(username);
		SavingsAccount savingsAccount = user.getSavingsAccount();
		
		return savingsAccount;
	}	
	
	@RequestMapping(method = RequestMethod.GET,value="/savingsTransaction/{username}",produces = "application/json")
	@ResponseBody
	public List<SavingsTransaction> savingsTransaction(@PathVariable String username) {
		List<SavingsTransaction> savingsTransactionList = transactionService
				.findSavingsTransactionList(username);

		return savingsTransactionList;
	}	
	
	@RequestMapping(method = RequestMethod.POST,value="/deposit/{username}/{accountType}/{amount}",produces = "application/json")
	@ResponseBody
	public void depositPost(@PathVariable String username,@PathVariable String accountType,@PathVariable String amount) {
		
		accountService.deposit(accountType,Double.parseDouble(amount), username);
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/withdraw/{username}/{accountType}/{amount}",produces = "application/json")
	@ResponseBody
	public void withdrawPost(@PathVariable String username,@PathVariable String accountType,@PathVariable String amount) {
		
		accountService.withdraw(accountType,Double.parseDouble(amount), username);
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/appointment/{date}/{username}/{location}",produces = "application/json")
	@ResponseBody
	public void createAppointmentPost(@PathVariable String date,@PathVariable String username,@PathVariable String location) throws ParseException {
		
		Appointment appointment = new Appointment();
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Date d1 = format1.parse(date);
		appointment.setDate(d1);
		
		User user = userService.findByUsername(username);
		appointment.setUser(user);

		appointmentService.createAppointment(appointment);
		
	}
	
}
