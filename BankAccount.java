package com.perscholas.java_basics.banking_application;

public class BankAccount {
	private String name;
	private int ssn;
	private String address;
	private String bankName;
	private int routingNumber;
	private int accountNumber;
	private double balance;
	private double interestRate;
	private String dateCreated;
	
	public BankAccount() {
	}

	public BankAccount(String name, int ssn, String address, String bankName, int routingNumber, int accountNumber,
			double balance, double interestRate, String dateCreated) {
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.bankName = bankName;
		this.routingNumber = routingNumber;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		String accType = getClass().getSimpleName();
		String result = String.format("%-20s [%-20s%-10s%-30s%-10s%-10d%-10d%10.2f%10.2f%15s]", 
				accType, name, ssn, address, bankName, routingNumber, accountNumber, balance, interestRate, dateCreated);
		return result;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
}