package br.com.javacodex.cap2;

import java.util.Scanner;

public class Exerc2_24 {

	public static void main(String[] args) {
		System.out.println("Dos 5 n�meros, qual � o maior e qual � o menor?");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");
		int a = input.nextInt();
		System.out.print("Informe o valor de B: ");
		int b = input.nextInt();
		System.out.print("Informe o valor de C: ");
		int c = input.nextInt();
		System.out.print("Informe o valor de D: ");
		int d = input.nextInt();
		System.out.print("Informe o valor de E: ");
		int e = input.nextInt();
		
		if(a<b && a<c && a<d && a<e) {
			System.out.println("Menor Valor � A: " + a);
		} if(b<a && b<c && b<d && b<e) {
			System.out.println("Menor Valor � B: " + b);
		} if(c<a && c<b && c<d && c<e) {
			System.out.println("Menor Valor � C: " + c);
		} if(d<a && d<b && d<c && d<e) {
			System.out.println("Menor Valor � D: " + d);
		} if(e<a && e<b && e<c && e<d) {
			System.out.println("Menor Valor � E: " + e);
		}
		
		if(a>b && a>c && a>d && a>e) {
			System.out.println("Maior Valor � A: " + a);
		} if(b>a && b>c && b>d && b>e) {
			System.out.println("Maoir Valor � B: " + b);
		} if(c>a && c>b && c>d && c>e) {
			System.out.println("Maior Valor � C: " + c);
		} if(d>a && d>b && d>c && d>e) {
			System.out.println("Maior Valor � D: " + d);
		} if(e>a && e>b && e>c && e>d) {
			System.out.println("Maior Valor � E: " + e);
		}

	}

}
