package com.account.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Account {
//Defining book id as primary key
	@Id
	@Column(nullable = false, unique = true)
	private String accountNo;
	@Column
	private String name;
	@Column
	private Date openingDate;

	public Account() {
	}

	public Account(String accountNo, String name, Date openingDate) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.openingDate = openingDate;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

}