package com.capg.bankms.accountmgmt.service;

import com.capg.bankms.accountmgmt.dao.IAccountDao;
import com.capg.bankms.accountmgmt.entities.Account;
import com.capg.bankms.accountmgmt.entities.Address;
import com.capg.bankms.accountmgmt.entities.Customer;
import com.capg.bankms.accountmgmt.utils.AccountValidations;


public class AccountServiceImpl implements IAccountService {

private IAccountDao accountDao;
	
	AccountServiceImpl(IAccountDao dao){
		this.accountDao=dao;
	}

	@Override
	public boolean deleteAccount(String accountId) {
		accountDao.deleteAccount(accountId);
		return true;
	}

	@Override
	public boolean updateCustomerContact(Account account, Customer customer) {
		AccountValidations.validateCustomerContact( customer);
		AccountValidations.validateAccountId( account);
		accountDao.updateCustomerContact(account, customer);
		return true;
	}

	
	

	@Override
	public Account showAccountDetails(Account account) {
		accountDao.showAccountDetails(account);
		return account;
	}

	@Override
	public String updateCustomerAddress(Account account, Address address) {
		AccountValidations.validateAccountId( account);
		AccountValidations.validateAddressFields(address);
		accountDao.updateCustomerAddress(account, address);
		return "Update Customer Address Successfully";
	}

	@Override
	public Account findAccountById(String accountId) {
		return accountDao.findAccountById(accountId);
	}

	@Override
	public String addAccount(Customer customer, Address address, Account account) {
			AccountValidations.validateCustomerName(customer);
			AccountValidations.validateCustomerContact( customer); 
			AccountValidations.validateCustomerAadhar(customer);
			AccountValidations.validateCustomerPan(customer);
			AccountValidations.validateCustomerDOB(customer);
			AccountValidations.validateCustomerGender(customer);
			AccountValidations.validateAddressFields(address);
			customer.setAddress(address);
			accountDao.addAccount(customer, address, account);
		
		return null;
	}
	

}
