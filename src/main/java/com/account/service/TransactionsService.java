package com.account.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.account.model.Account;
import com.account.model.Transaction;
import com.account.repository.AccountsRepository;
import com.account.repository.TransactionsRepository;

//defining the business logic
@Service
public class TransactionsService {
	@Autowired
	TransactionsRepository transactionsRepository;

//getting all books record by using the method findaAll() of CrudRepository
	public List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactionsRepository.findAll().forEach(transactions1 -> transactions.add(transactions1));
		return transactions;
	}

//getting a specific record by using the method findById() of CrudRepository
	public Transaction getTransactionsById(int id) {
		return transactionsRepository.findById(id).get();
	}

//saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Transaction transaction) {
		transactionsRepository.save(transaction);
	}

//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		transactionsRepository.deleteById(id);
	}

//updating a record
	public void update(Transaction transaction, int tranactionid) {
		transactionsRepository.save(transaction);
	}

}