package com.capg.bankms.accountmgmt.entities;

import java.sql.Date;

public class Customer {
	
		
	public Customer() {
		
		
	}






	private String customerId;
	public static String customerName;
	public static String customerAddress;
	private String customerAadhar;
	private String customerPan;
	public static String customerContact;
	private String customerGender;
	private Date customerDob;
	private Address address;


	

	
	public Address getAddress() {
		return address;
	}






	public void setAddress(Address address) {
		this.address = address;
	}






	public Customer(String customerId,String customerName,String customerAddress,
	String customerAadhar,String customerPan,String customerContact,String customerGender,Date customerDob) {
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerAadhar=customerAadhar;
		this.customerPan=customerPan;
		this.customerContact=customerContact;
		this.customerGender=customerGender;
		this.customerDob=customerDob;
		

}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerAadhar == null) ? 0 : customerAadhar.hashCode());
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + ((customerContact == null) ? 0 : customerContact.hashCode());
		result = prime * result + ((customerDob == null) ? 0 : customerDob.hashCode());
		result = prime * result + ((customerGender == null) ? 0 : customerGender.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((customerPan == null) ? 0 : customerPan.hashCode());
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerAadhar == null) {
			if (other.customerAadhar != null)
				return false;
		} else if (!customerAadhar.equals(other.customerAadhar))
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerContact == null) {
			if (other.customerContact != null)
				return false;
		} else if (!customerContact.equals(other.customerContact))
			return false;
		if (customerDob == null) {
			if (other.customerDob != null)
				return false;
		} else if (!customerDob.equals(other.customerDob))
			return false;
		if (customerGender == null) {
			if (other.customerGender != null)
				return false;
		} else if (!customerGender.equals(other.customerGender))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerPan == null) {
			if (other.customerPan != null)
				return false;
		} else if (!customerPan.equals(other.customerPan))
			return false;
		return true;
	}






	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerContact=" + customerContact + "]";
	}






	public String getCustomerId() {
		return customerId;
	}






	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}






	public String getCustomerName() {
		return customerName;
	}






	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}






	public String getCustomerAddress() {
		return customerAddress;
	}






	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}






	public String getCustomerAadhar() {
		return customerAadhar;
	}






	public void setCustomerAadhar(String customerAadhar) {
		this.customerAadhar = customerAadhar;
	}






	public String getCustomerPan() {
		return customerPan;
	}






	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}






	public String getCustomerContact() {
		return customerContact;
	}






	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}






	public String getCustomerGender() {
		return customerGender;
	}






	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}






	public Date getCustomerDob() {
		return customerDob;
	}






	public void setCustomerDob(Date customerDob) {
		this.customerDob = customerDob;
	}
}