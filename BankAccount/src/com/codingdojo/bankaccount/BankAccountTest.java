package com.codingdojo.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		
	/// created 3 users objects
		
	BankAccount user1 = new BankAccount();
	BankAccount user2 =new BankAccount();
	BankAccount user3 = new BankAccount();
	
	// depositing money to the specific users
	
	user1.accountDeposit("checking", 5000.00);
	user2.accountDeposit("checking", 500.00);
	user3.accountDeposit("savings", 1000.00);
	
	/// withdrawing money from users account 
		
	user1.accountWithdrawal("checking", 70.00);
	user2.accountWithdrawal("checking", 50.00);
	user3.accountWithdrawal("savings", 500.00);

	/// Each user's totoal balance
	user1.myBalance();
	user2.myBalance();
	user3.myBalance();
	}
}
