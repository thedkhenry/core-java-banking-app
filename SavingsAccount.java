package com.perscholas.java_basics.banking_application;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(String name, int ssn, String address, String bankName, int routingNumber, int accountNumber,
			double balance, double interestRate, String dateCreated) {
		super(name, ssn, address, bankName, routingNumber, accountNumber, balance, interestRate, dateCreated);
	}
}