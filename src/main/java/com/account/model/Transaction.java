package com.account.model;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Transaction {
	@Id
	@Column(nullable = false, unique = true)
	@GeneratedValue
	private int id;

	//@Column(nullable = false)
	// @ForeignKey(name = "accountForeignKey", value = ConstraintMode.CONSTRAINT)
	// @ManyToOne(targetEntity = )
	//private String accountNo;
	@ManyToOne
	private Account account;

	@Column
	private String transactionType;

	@Column
	private double amount;

	public Transaction() {
		super();
	}

	public Transaction(Account account, String transactionType, double amount) {
		super();
		//this.id = id;
		this.account = account;
		this.transactionType = transactionType;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
