package com.account.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.account.model.Account;
import com.account.model.Transaction;
import com.account.repository.AccountsRepository;

//defining the business logic
@Service
public class AccountsService {
	@Autowired
	AccountsRepository accoutsRepository;

//getting all books record by using the method findaAll() of CrudRepository
	public List<Account> getAllAccounts() {
		List<Account> books = new ArrayList<Account>();
		accoutsRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}

//getting a specific record by using the method findById() of CrudRepository
	public Account getAccountsById(String id) {
		return accoutsRepository.findById(id).get();
	}

//saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Account accounts) {
		accoutsRepository.save(accounts);
	}

//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(String id) {
		accoutsRepository.deleteById(id);
	}

//updating a record
	public void update(Account accounts, int bookid) {
		accoutsRepository.save(accounts);
	}

}