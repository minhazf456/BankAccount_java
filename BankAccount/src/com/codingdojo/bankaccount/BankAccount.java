package com.codingdojo.bankaccount;

import java.util.Random;

public class BankAccount {
	
	//Attributes
	private String accountNumber = "";
	private Double checkingBalance = 0.0;
	private Double savingsBalance = 0.0;
	private static int accountsCreated = 0;
	private static Double totalMoney = 0.0;
	
	//Constructors
	public BankAccount() {
		String accountNumber = newAccountNumber();
		Double checkingBalance = 0.0;
		Double savingsBalance = 0.0;
		accountsCreated +=1;
		System.out.println("New user's account number: " + accountNumber + ".");
		System.out.println("Total Numebr of accounts created: " + accountsCreated + ".");		
	}
	
	//Getters
	public Double getCheckingBalance() {
		return checkingBalance;
	}
	public Double getSavingsBalance() {
		return savingsBalance;
	}

//	//Setters
	
	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;	
	}
	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	//Methods for the entire bank accounts transactions
	
	private String newAccountNumber() {
		String numberTable = "0123456789";
		String randomNumber = "";
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			char num = numberTable.charAt(rand.nextInt(10));
			randomNumber += num;
		}
		accountNumber = randomNumber;
		return randomNumber;	
	}
	
	public void accountDeposit(String type, Double depositAmount) {
		if (type=="checking") {
			this.setCheckingBalance(getCheckingBalance()+depositAmount);
			totalMoney += depositAmount;
		}
		else if (type == "savings") {
			setSavingsBalance(getSavingsBalance() + depositAmount);
			totalMoney += depositAmount;			
		}
		else {
			System.out.println("Please select your authorised account type");
		}
		
	}

	
	public void accountWithdrawal(String type, Double withdrawalAmount) {
		if(type == "checking") {
			if(getCheckingBalance() < withdrawalAmount) {
				System.out.println("You Have Insufficient balance please return once you deposit!");
			}
			else {
			setCheckingBalance(getCheckingBalance() - withdrawalAmount);
			totalMoney -= withdrawalAmount;
			}
		}
		if(type == "savings") {
			if(getSavingsBalance() < withdrawalAmount) {
				System.out.println("PLease comeback once you have enough money!");
			}
			else {
			setSavingsBalance(getSavingsBalance() - withdrawalAmount);
			totalMoney -= withdrawalAmount;
			}
		}
	}
	public Double myBalance() {
		Double totalBalance = checkingBalance + savingsBalance;
		System.out.println(totalBalance);
		return totalBalance;
	}
}
