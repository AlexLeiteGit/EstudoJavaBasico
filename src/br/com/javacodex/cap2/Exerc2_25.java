package br.com.javacodex.cap2;

import java.util.Scanner;

public class Exerc2_25 {

	public static void main(String[] args) {
		
		System.out.println("O n�mero inserido � PAR ou IMPAR?");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o n�mero: ");
		int a = input.nextInt();
		
		if(a%2 == 0) {
			System.out.println("O n�mero � PAR");
		} else {
			System.out.println("O n�mero � IMPAR");
		}

	}

}
