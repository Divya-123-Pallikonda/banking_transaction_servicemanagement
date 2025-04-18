package com.example.banking_transaction_servicemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banking_transaction_servicemanagement.dao.AccountDao;
import com.example.banking_transaction_servicemanagement.dto.Account;


@Service
public class AccountService {

	@Autowired
	  AccountDao accountDao;
	

	public Account saveAccount(Account account) {
        return accountDao.saveAccount(account);
    }
	
	public Account updateAccountById(int oldAccId,Account newAccount) {
		return accountDao.updateAccountById( oldAccId,newAccount);
	}
	
	public Account fetchAccountById(int accId) {
	    return accountDao.fetchAccountById(accId);
	}
    
	public Account deleteAccountById(int accId) {
		return accountDao.deleteAccountById(accId);
		
	}
	
	public List<Account> fetchAllAccounts(){
		return accountDao.fetchAllAccounts();
	}
	public Account softDeleteAccount(int accId) {
	    return accountDao.softDeleteAccount(accId);
	}

}
