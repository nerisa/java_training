package com.lftechnology.december31;

/**
 * Write a program to test class SavingsAccount. Instantiate two savingsAccount
 * objects, saver1 and saver2, with balances of $2000.00 and $3000.00,
 * respectively. Set annualInterestRate to 4%, then calculate the monthly
 * interest and print the new balances for both savers. Then set the
 * annualInterestRate to 5%, calculate the next month's interest and print the
 * new balances for both savers.
 * 
 * @author nerisa
 * 
 */
public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00f);
		SavingsAccount saver2 = new SavingsAccount(3000.00f);
		SavingsAccount.modifyInterestRate(4);
		System.out.println("4% interest rate month");
		saver1.calculateMonthlyInterset();
		saver1.displayBalance();
		saver2.calculateMonthlyInterset();
		saver2.displayBalance();
		SavingsAccount.modifyInterestRate(5);
		System.out.println("5% interest rate month");
		saver1.calculateMonthlyInterset();
		saver1.displayBalance();
		saver2.calculateMonthlyInterset();
		saver2.displayBalance();

	}

}

/**
 * Create class SavingsAccount. Use a static variable annualInterestRate to
 * store the annual interest rate for all account holders. Each object of the
 * class contains a private instance variable savingsBalance indicating the
 * amount the saver currently has on deposit. Provide method
 * calculateMonthlyInterest to calculate the monthly interest by multiplying the
 * savingsBalance by annualInterestRate divided by 12. This interest should be
 * added to savingsBalance. Provide a static method modifyInterestRate that sets
 * the annualInterestRate to a new value.
 * 
 * @author nerisa
 * 
 */
class SavingsAccount {
	private static float annualInterestRate = 0.0f;
	private float savingsBalance = 0.0f;

	public SavingsAccount(float savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public void setBalance(float balance) {
		this.savingsBalance = balance;
	}

	public void calculateMonthlyInterset() {
		float interest = 0;
		interest = (float) annualInterestRate * savingsBalance / 12;
		System.out.println("Your monthly interest=" + interest);
		savingsBalance += interest;
	}

	public void displayBalance() {
		System.out.println("Your current balance: Rs." + savingsBalance);
	}

	public static void modifyInterestRate(float changedRate) {
		annualInterestRate = changedRate;
	}

}
