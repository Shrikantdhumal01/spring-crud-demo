package com.example.service;

import com.example.dto.AccountDto;
//import com.example.entity.Account;


public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccountById(Long id);
	
	AccountDto deposit(Long id, double amount);
	
	 
}
	
	


