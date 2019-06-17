package com.online.banking.userfront.controller;

import java.text.ParseException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.banking.userfront.domain.PrimaryAccount;
import com.online.banking.userfront.domain.Recipient;
import com.online.banking.userfront.domain.SavingsAccount;
import com.online.banking.userfront.domain.User;
import com.online.banking.userfront.service.TransactionService;
import com.online.banking.userfront.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/transfer")
public class TransferController {

	@Autowired
	private TransactionService transactionService;

	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST,value="/transfer/{transferFrom}/{transferTo}/{amount}/{username}",produces = "application/json")
	@ResponseBody
	public void betweenAccountPost(@PathVariable String transferFrom,@PathVariable String transferTo,@PathVariable String amount,@PathVariable String username) throws ParseException {
		
		User user = userService.findByUsername(username);
		PrimaryAccount primaryAccount = user.getPrimaryAccount();
		SavingsAccount savingsAccount = user.getSavingsAccount();
		try {
			transactionService.betweenAccountsTransfer(transferFrom, transferTo, amount, primaryAccount, savingsAccount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/recepient/{username}",produces = "application/json")
	@ResponseBody
	public void recepientPost(@PathVariable String username) throws ParseException {
		Recipient recipient = new Recipient();
		User user = userService.findByUsername(username);
		recipient.setUser(user);
		transactionService.saveRecipient(recipient);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/recepient/{recepientname}",produces = "application/json")
	@ResponseBody
	public void recepientDelete(@PathVariable String recepientname) throws ParseException {
		
		transactionService.deleteRecipientByName(recepientname);
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/transfer/{recepientname}/{accountType}/{amount}/{username}",produces = "application/json")
	@ResponseBody
	public void toSomeoneElsePost(@PathVariable String recepientname,@PathVariable String accountType,@PathVariable String amount,@PathVariable String username) throws ParseException {
		
		User user = userService.findByUsername(username);
		Recipient recipient = transactionService.findRecipientByName(recepientname);
		PrimaryAccount primaryAccount = user.getPrimaryAccount();
		SavingsAccount savingsAccount = user.getSavingsAccount();
		try {
			transactionService.toSomeoneElseTransfer(recipient, accountType, amount, primaryAccount, savingsAccount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
