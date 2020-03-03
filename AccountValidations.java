package com.capg.bankms.accountmgmt.utils;

import java.util.*;
import java.util.Date;

import com.capg.bankms.accountmgmt.entities.Account;
import com.capg.bankms.accountmgmt.entities.Address;
import com.capg.bankms.accountmgmt.entities.Customer;
import com.capg.bankms.accountmgmt.exception.InvalidAccountIdException;
import com.capg.bankms.accountmgmt.exception.InvalidAddressException;
import com.capg.bankms.accountmgmt.exception.InvalidCustomerAadharException;
import com.capg.bankms.accountmgmt.exception.InvalidCustomerContactException;
import com.capg.bankms.accountmgmt.exception.InvalidCustomerDOBException;
import com.capg.bankms.accountmgmt.exception.InvalidCustomerGenderException;
import com.capg.bankms.accountmgmt.exception.InvalidCustomerPanException;
import com.capg.bankms.accountmgmt.exception.InvalidNameException;

public class AccountValidations {
	public static void validateCustomerName(Customer customer) {
		if (customer.getCustomerName()== null || customer.getCustomerName().isEmpty() || !(customer.getCustomerName().matches("[a-zA-Z]+"))) {
			throw new InvalidNameException("Invalid Name");
		}
	}
	
	public static void validateCustomer(Customer customer) {
		validateCustomerContact(customer);
		validateCustomerAadhar(customer); 
		validateCustomerPan(customer);
		
	}

	public static void validateCustomerContact(Customer customer) {
		if (customer.getCustomerContact().length() != 10) {
			throw new InvalidCustomerContactException("Invalid Customer Contact Number");
		}

	}

	public static void validateCustomerAadhar(Customer customer) {
		if (customer.getCustomerAadhar().length() != 12) {
			throw new InvalidCustomerAadharException("Invalid Customer Aadhar Number");
		}
	}
	
	public static void validateAccountId(Account account) {
		if (account.getAccountId().length() != 12) {
			throw new InvalidAccountIdException("Invalid  Account Id!!!");
		}
	}

	public static void validateCustomerPan(Customer customer) {
		if (!(customer.getCustomerPan().matches("[A-Z] {5} [0-9] {4} [A-Z] {1} "))) {
			throw new InvalidCustomerPanException("Invalid Customer Pan Number");
		}
	}

	public static void validateCustomerDOB(Customer customer) {
		 Date dob = customer.getCustomerDob();
		 int birthYear=dob.getYear();
		 if(!(birthYear <1900)) {
			 throw new InvalidCustomerDOBException("Invalid Customer Date Of Birth");
			 
		 }
	}

	public static void validateCustomerGender(Customer customer) {
		if (!(customer.getCustomerGender().equals("Male") && customer.getCustomerGender().equals("Female"))) {
			throw new InvalidCustomerGenderException("Invalid Gender");

		}
	}

	public static void validateAddressFields(Address address) {
		if(address.getAddressLine1().matches("[a-zA-Z0-9]+[\\//.-()]")) {
			
			throw new InvalidAddressException("Invalid Address!!!!");	
			
		}
		if(address.getAddressLine2().matches("[a-zA-Z0-9]+[\\//.-()]")) {
			
			throw new InvalidAddressException("Invalid Address!!!!");
		}

        if(!(address.getAddressCountry().matches("[a-zA-Z]+"))) {
			
			throw new InvalidAddressException("Invalid Address!!!!");
		}
         if(!(address.getAddressState().matches("[a-zA-Z]+"))) {
			
			throw new InvalidAddressException("Invalid Address!!!!");
		}
         if(!(address.getAddressCity().matches("[a-zA-Z]+"))) {
 			
 			throw new InvalidAddressException("Invalid Address!!!!");
 		}
		
		if(address.getAddressZipcode().length()!=6) {
			
			throw new InvalidAddressException("Invalid Address!!!!");
			
		}
		
	}

}
