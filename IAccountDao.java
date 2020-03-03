package com.capg.bankms.accountmgmt.dao;

import com.capg.bankms.accountmgmt.entities.Account;
import com.capg.bankms.accountmgmt.entities.Address;
import com.capg.bankms.accountmgmt.entities.Customer;

public interface IAccountDao {
	boolean deleteAccount(String accountId);
	boolean updateCustomerName(Account account,Customer customer);
	boolean updateCustomerContact(Account account,Customer customer);
	String  updateCustomerAddress(Account account,Address address);
	String  addCustomerDetails(Customer customer,Address address);
	String  addAccount(Customer customer,Address address, Account account);
	String showAccountDetails(Account account);
    Account findAccountById(String accountId);
}
