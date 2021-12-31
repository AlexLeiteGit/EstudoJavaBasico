package br.com.javacodex.cap3;

public class Account {

	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		super();
		this.name = name;
		
		if(balance > 0.0) {
			this.balance = balance;
		}
	}
	
	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit(double depositAmount) {
		
		if(depositAmount > 0.0) {
			balance += depositAmount;
		} else {
			System.out.println("Invalid Value!");
		}
	}
	
	public void withdraw(double withdrawAmount) {
		
		if (withdrawAmount > 0.0 && withdrawAmount <= balance) {
			balance -= withdrawAmount;
		} else {
			System.out.printf("Invalid Value!%n%n");
		}
		
		if (balance > 0.0) {
			this.balance = balance;
		} else {
			System.out.printf("Withdraw amount exceeded account balance %n%n");
			}
		} 
}
