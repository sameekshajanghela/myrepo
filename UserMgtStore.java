package com.capg.bankms.accountmgmt.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.bankms.accountmgmt.entities.Account;
import com.capg.bankms.accountmgmt.entities.Customer;

public class UserMgtStore {
	public static Map<String, Account> accountStore = new HashMap<>();
	public static Map<String, Customer> customerStore = new HashMap<>();

}
