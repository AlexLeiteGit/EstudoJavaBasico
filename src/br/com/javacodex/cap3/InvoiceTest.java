package br.com.javacodex.cap3;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the numer of the item to be bought: ");
		String number = input.nextLine();
		
		System.out.print("Enter the quantity to be bought: ");
		int qtt = input.nextInt();
		
		System.out.print("Enter the price: ");
		double price = input.nextDouble();
		
		Invoice invoice = new Invoice(qtt, price);
		
		System.out.printf("The total Amount is: $%.2f", invoice.getInvoiceAmount(qtt, price));

	}

}
