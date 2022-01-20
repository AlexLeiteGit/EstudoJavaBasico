package br.com.javacodex.cap2;

import java.util.Scanner;

public class Exerc2_26 {

	public static void main(String[] args) {
		
		System.out.println("A é multiplo de B?");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");
		int a = input.nextInt();
		System.out.print("Informe o valor de B: ");
		int b = input.nextInt();
		
		if(a%b == 0) {
			System.out.printf("A é multiplo de B %n");
		} else {
			System.out.printf("A não é multiplo de B %n");
		}

		input.close();

	}

}
