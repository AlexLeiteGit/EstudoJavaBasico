package br.com.javacodex.cap3;

import java.util.Locale;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account account1 = new Account ("Jane Green", 50.00);
		Account account2 = new Account ("John Blue", -7.33);
		
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("Enter withdraw amount for account1: ");
		double withdrawAmount = input.nextDouble();
		System.out.printf("%nwithdrawing %.2f to account1 balance%n%n", depositAmount);
		account1.withdraw(withdrawAmount);
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("Enter withdraw amount for account2: ");
		withdrawAmount = input.nextDouble();
		System.out.printf("%nwithdrawing %.2f to account2 balance%n%n", depositAmount);
		account2.withdraw(withdrawAmount);
		
		displayAccount(account1);
		displayAccount(account2);

	}
	
	public static void displayAccount(Account accountToDisplay) {
		System.out.printf("%s balance: $%.2f%n%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}

}
