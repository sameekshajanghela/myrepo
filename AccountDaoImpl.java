package com.capg.bankms.accountmgmt.dao;

import java.util.*;

import com.capg.bankms.accountmgmt.entities.Account;
import com.capg.bankms.accountmgmt.entities.Address;
import com.capg.bankms.accountmgmt.entities.Customer;
import com.capg.bankms.accountmgmt.exception.AccountAlreadyExistException;

public class AccountDaoImpl implements IAccountDao {
	
	@Override
	public String addCustomerDetails(Customer customer, Address address) {
		customer.setAddress(address);
		UserMgtStore.customerStore.put(customer.getCustomerId(), customer);
		return "customer name updated successfully";
	}

	@Override
	public boolean updateCustomerName(Account account, Customer customer) {
		if (UserMgtStore.accountStore.containsKey(account.getAccountId())) {
			account.setCustomer(customer);
			UserMgtStore.accountStore.put(account.getAccountId(), account);
			return true;
		}
		return false;

	}
	
	@Override
	public boolean updateCustomerContact(Account account, Customer customer) {
		if (!UserMgtStore.accountStore.containsKey(account.getAccountId())) {
			return false;
		}
		account.setCustomer(customer);
		UserMgtStore.customerStore.put(customer.getCustomerId(), customer);
		return true;

	}
	
	@Override
	public String updateCustomerAddress(Account account, Address address) {
		if (UserMgtStore.customerStore.containsKey(account.getCustomer().getCustomerId())) {
			UserMgtStore.customerStore.remove(account.getCustomer());
			Customer c=new Customer("475272","Sameeksha","Chhindwara","123456789412","BORPT6523B","9993773183","Female",null);
			address=new Address("154646541654684", "Trimurti Appartment", "Parasia Road", "Chhindwara", "MP","India", "480441");
			c.setAddress(address);
			UserMgtStore.customerStore.put(account.getCustomer().getCustomerId(),c);
			System.out.println("Address updated successfully");
		}
		return "address not found";

	}
	
	
	@Override
	public String addAccount(Customer customer,Address address,Account account) {
		
		if(UserMgtStore.accountStore.containsKey((account.getAccountId()))){
			throw new AccountAlreadyExistException("customer already exist");	
		}
		UserMgtStore.accountStore.put(account.getAccountId(), account);
		UserMgtStore.customerStore.put(customer.getCustomerId(),customer);		
		
		return "account added successfully";
	}
	
	

	@Override
	public String showAccountDetails(Account account) {
		if (UserMgtStore.accountStore.containsKey(account.getAccountId())) {
			return account.toString();
		}		
		return null;
	}
	

	@Override
	public Account findAccountById(String accountId) {
		if (UserMgtStore.accountStore.containsKey(accountId)) {
			return UserMgtStore.accountStore.get(accountId);
		}
		return null;
	}
	
	@Override
	public boolean deleteAccount(String accountId) {
		if (UserMgtStore.customerStore.containsKey(accountId)) {
			UserMgtStore.accountStore.remove(accountId);
			return true;
		}
		return false;

	}

}
