package com.example.banking_transaction_servicemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.banking_transaction_servicemanagement.dto.Account;
import com.example.banking_transaction_servicemanagement.service.AccountService;


@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/saveAccount")
    public Account saveAccount(@RequestBody Account account) {
        return accountService.saveAccount(account);
    }
    @PutMapping("/updateAccountById")
    public Account updateAccountById(@RequestParam int oldAccId,@RequestBody Account newAccount) {
		return accountService.updateAccountById( oldAccId,newAccount);
	}
    
    @GetMapping("/fetchAccountById")
    public Account fetchAccountById(@RequestParam int accId) {
	    return accountService.fetchAccountById(accId);
	}
    
    @DeleteMapping("/deleteAccountById")
	public Account deleteAccountById(@RequestParam int accId ) {
		return accountService.deleteAccountById(accId);
		
	}
	@GetMapping("/fetchAllAccounts")
	public List<Account> fetchAllAccounts(){
		return accountService.fetchAllAccounts();
	}
	
	@PatchMapping("/softDeleteAccount")
	public Account softDeleteAccount(@RequestParam int accId) {
	    return accountService.softDeleteAccount(accId);
	}

}
    

