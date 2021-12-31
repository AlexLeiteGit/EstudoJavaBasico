package br.com.javacodex.cap5;

import java.util.Locale;
import java.util.Scanner;

public class Figura5_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o depósito inicial: ");
		double inicial = input.nextDouble();
		
		System.out.print("informe a taxa de juros anual: ");
		double taxa = input.nextDouble();
		
		double totalAnual = inicial;
		
		System.out.printf("%-7s%-20s %n", "Year", "Amount on deposit");
		
		for(int i = 1 ; i <= 10 ; i++) {
			totalAnual = inicial * Math.pow((1+(taxa/100)), i);
			System.out.printf("%-7d%,-20.2f%n", i, totalAnual);
		}
		
		input.close();

	}

}
