package com.example.service.impl;



import org.springframework.stereotype.Service;

import com.example.dto.AccountDto;
import com.example.entity.Account;
import com.example.mapper.AccountMapper;
import com.example.repository.AccountRepository;
import com.example.service.AccountService;

@Service

 public class AccountServiceImpl implements AccountService 
 {
	 private AccountRepository accountRepository;
	 
	 public AccountServiceImpl(AccountRepository accountRepository)
	 {
		 this.accountRepository = accountRepository;
	 }
	 
	 @Override
	 
	 public AccountDto createAccount(AccountDto accountDto)
	 {
		 Account account = AccountMapper.mapToAccount(accountDto);
		 Account savedAccount = accountRepository.save(account);
		 return AccountMapper.mapToAccountDto(savedAccount);
	 }

	@Override
	public AccountDto getAccountById(Long id) {
		// TODO Auto-generated method stub
		
		Account	account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exists"));
		return AccountMapper.mapToAccountDto(account);
	}

	@Override
	public AccountDto deposit(Long id, double amount) {
		// TODO Auto-generated method stub	

		Account	account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exists"));
		
	//	 double currentBalance = Optional.ofNullable(account.getBalance()).orElse(0.0);
		double total = account.getBalance() + amount;
		// double total = currentBalance + amount;
		account.setBalance(total);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}
 }




