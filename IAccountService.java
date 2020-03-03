package com.capg.bankms.accountmgmt.service;

import com.capg.bankms.accountmgmt.entities.Account;
import com.capg.bankms.accountmgmt.entities.Address;
import com.capg.bankms.accountmgmt.entities.Customer;

public interface IAccountService {
	boolean deleteAccount(String AccountId);

	boolean updateCustomerContact(Account account,Customer customer);
	String  updateCustomerAddress(Account account, Address address);
	String  addAccount(Customer customer,Address address, Account account);
	Account showAccountDetails(Account account);
	Account findAccountById(String accountId);

}
