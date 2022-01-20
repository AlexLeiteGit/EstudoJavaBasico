package br.com.javacodex.cap2;

import java.util.Scanner;

public class Exerc2_17 {

	public static void main(String[] args) {
		
		System.out.println ("Manipulando 3 Números");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor de a: ");
		int a = input.nextInt();
		
		System.out.print("Informe o valor de b: ");
		int b = input.nextInt();
		
		System.out.print("informe o valor de c: ");
		int c = input.nextInt();
		
		int soma = a + b + c;
		int media = (a + b + c)/3;
		int produto = a * b * c;
		
		System.out.printf("%d é a soma dos números %n", soma);
		System.out.printf("%d é a médias dos números %n", media);
		System.out.printf("%d é o produto dos números %n", produto);
		
		if(a < b && a < c && b < c) {
			System.out.println(a + ", " + b + ", " + c);
		} if (b < a && b < c && a < c) {
			System.out.println(b + ", " + a + ", " + c);
		} if (c < a && c < b && a < b) {
			System.out.println(c + ", " + a + ", " + b);
		} if (c < a && c < b && b < a) {
			System.out.println(c + ", " + b + ", " + a);
		}
		
		input.close();
	}
}