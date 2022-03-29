package com.account.repository;

import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.account.model.Account;
import com.account.model.Transaction;

public interface TransactionsRepository extends CrudRepository<Transaction, Integer> {
}
