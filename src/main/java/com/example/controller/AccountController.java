package com.example.controller;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.example.service.AccountService;
import com.example.dto.AccountDto;
import com.example.service.AccountService;


@RestController
@RequestMapping("/api/accounts")
public class AccountController
{
	private AccountService accountService;
	
	public AccountController(AccountService accountService) {
	    this.accountService = accountService; // ✅ Correct
	}
	
	 @PostMapping
	    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
	        AccountDto savedAccount = accountService.createAccount(accountDto);
	        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
	 }
	 
	 @GetMapping("/{id}") 
	 
	 public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id)
	 {
		 AccountDto accountDto = accountService.getAccountById(id);
		 return ResponseEntity.ok(accountDto);
	 }
	 
	 @PutMapping("/{id}/deposit")
	 
	 public ResponseEntity<AccountDto> deposit(@PathVariable  Long id,@RequestBody Map<String,Double> request)
	 {   Double amount = request.get("amount");
		 AccountDto accountDto = accountService.deposit(id, amount);
		 return ResponseEntity.ok(accountDto);
		 
	 }
	 
}













//import com.example.service.AccountService;
//
//@RestController
//@RequestMapping("/api/accounts")
//public class AccountController {
//
//  private final AccountService accountService;
//
//  // Constructor-based Dependency Injection
//  public AccountController(AccountService accountService) {
//      this.accountService = accountService;
//  }
//
//  // Add Account Rest API
//  @PostMapping
//  public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto, 
//                                               @RequestHeader HttpHeaders headers) {
//      System.out.println("Received Content-Type: " + headers.getContentType());
//      System.out.println("Received Account DTO: " + accountDto); // Debugging
//
//      // Validate request
//      if (accountDto.getAccountHolderName() == null || accountDto.getAccountHolderName().isEmpty()) {
//          return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//      }
//
//      // Store the saved account and print it before returning
//      AccountDto savedAccount = accountService.createAccount(accountDto);
//      System.out.println("Saved Account: " + savedAccount);
//
//      return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
//  }
//}