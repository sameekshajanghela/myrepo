package com.capg.bankms.accountmgmt.exception;
import java.util.*;
public class AccountAlreadyExistException extends RuntimeException {
	public AccountAlreadyExistException(String msg) {
		super(msg);
}
}