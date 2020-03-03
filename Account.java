package com.capg.bankms.accountmgmt.entities;

import java.sql.Date;

public class Account {
	public static String accountId;
	private String accountHolderId;
	private String accountBranchId;
	private String accountType;
	private String accountStatus;
	private double accountBalance;
	private double accountInterest;
	private Date   lastUpdated;
	private Customer customer;
public Account() {
	
}
	



public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


public Account(String accountId, String accountHolderId, String accountBranchId, String accountType,
			String accountStatus, double accountBalance, double accountInterest, Date lastUpdated) {
		
		this.accountId = accountId;
		this.accountHolderId = accountHolderId;
		this.accountBranchId = accountBranchId;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountBalance = accountBalance;
		this.accountInterest = accountInterest;
		this.lastUpdated = lastUpdated;
	}


public String getAccountId() {
	return accountId;
}


public void setAccountId(String accountId) {
	this.accountId = accountId;
}


public String getAccountHolderId() {
	return accountHolderId;
}


public void setAccountHolderId(String accountHolderId) {
	this.accountHolderId = accountHolderId;
}


public String getAccountBranchId() {
	return accountBranchId;
}


public void setAccountBranchId(String accountBranchId) {
	this.accountBranchId = accountBranchId;
}


public String getAccountType() {
	return accountType;
}


public void setAccountType(String accountType) {
	this.accountType = accountType;
}


public String getAccountStatus() {
	return accountStatus;
}


public void setAccountStatus(String accountStatus) {
	this.accountStatus = accountStatus;
}


public double getAccountBalance() {
	return accountBalance;
}


public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}


public double getAccountInterest() {
	return accountInterest;
}


public void setAccountInterest(double accountInterest) {
	this.accountInterest = accountInterest;
}


public Date getLastUpdated() {
	return lastUpdated;
}


public void setLastUpdated(Date lastUpdated) {
	this.lastUpdated = lastUpdated;
}

}