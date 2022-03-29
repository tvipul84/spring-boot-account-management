package com.account.repository;

import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.account.model.Account;

public interface AccountsRepository extends CrudRepository<Account, String> {
}
