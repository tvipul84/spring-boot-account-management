package com.account.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.account.model.Account;
import com.account.model.Transaction;
import com.account.repository.TransactionsRepository;
import com.account.service.AccountsService;
import com.account.service.TransactionsService;

//mark class as Controller
@RestController
public class AccountsController {
//autowire the BooksService class
	@Autowired
	AccountsService accountsService;
	
	@Autowired
	TransactionsService transactionsService;

//	@GetMapping("/home")
//creating a get mapping that retrieves all the books detail from the database 
	@GetMapping("/account")
	private List<Account> getAllAccounts() {
		Account account = new Account("vipul1234", "vipul", new Date());
		accountsService.saveOrUpdate(account);
		Transaction transaction = new Transaction(account,"cr",10000);
		transactionsService.saveOrUpdate(transaction);
		// booksService.saveOrUpdate(new Accounts(1, "Java", "Vipul",100));
		return accountsService.getAllAccounts();
	}
	@GetMapping("/transactions")
	private List<Transaction> getAllTransactions(){
		return transactionsService.getAllTransactions();
	}
//creating a get mapping that retrieves the detail of a specific book
	@GetMapping("/account/{accountno}")
	private Account getBooks(@PathVariable("accountno") String accountno) {
		return accountsService.getAccountsById(accountno);
	}

//creating a delete mapping that deletes a specified book
	@DeleteMapping("/account/{accountno}")
	private void deleteBook(@PathVariable("accountno") String accountno) {
		accountsService.delete(accountno);
	}

//creating post mapping that post the book detail in the database
	@PostMapping("/accounts")
	private String saveAccount(@RequestBody Account accounts) {
		accountsService.saveOrUpdate(accounts);
		return accounts.getAccountNo();
	}

//creating put mapping that updates the book detail 
	@PutMapping("/accounts")
	private Account update(@RequestBody Account accounts) {
		accountsService.saveOrUpdate(accounts);
		return accounts;
	}
}
