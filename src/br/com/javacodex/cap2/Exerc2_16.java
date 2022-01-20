package br.com.javacodex.cap2;

import java.util.Scanner;

public class Exerc2_16 {

	public static void main(String[] args) {
		
		System.out.println("Comparando 2 números");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("informe o Primeiro número: ");
		int a = input.nextInt();
		
		System.out.print("informe o Segundo número: ");
		int b = input.nextInt();
		
		if(a > b) {
			System.out.printf("%d is larger", a);
		} else if (b > a) {
			System.out.printf("%d is larger", b);
		} else {
			System.out.println("These numbers are equal");
		}

		input.close();
	}

}
