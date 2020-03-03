package com.capg.bankms.accountmgmt.entities;

public class Branch {
String branchId;
String branchName;
String branchIFSC;
String branchAddress;
public String getBranchId() {
	return branchId;
}
public void setBranchId(String branchId) {
	this.branchId = branchId;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public String getBranchIFSC() {
	return branchIFSC;
}
public void setBranchIFSC(String branchIFSC) {
	this.branchIFSC = branchIFSC;
}
public String getBranchAddress() {
	return branchAddress;
}
public void setBranchAddress(String branchAddress) {
	this.branchAddress = branchAddress;
}
}
