package br.com.javacodex.cap2;

import java.util.Scanner;

public class Exerc2_24 {

	public static void main(String[] args) {
		System.out.println("Dos 5 números, qual é o maior e qual é o menor?");
		
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
			System.out.println("Menor Valor é A: " + a);
		} if(b<a && b<c && b<d && b<e) {
			System.out.println("Menor Valor é B: " + b);
		} if(c<a && c<b && c<d && c<e) {
			System.out.println("Menor Valor é C: " + c);
		} if(d<a && d<b && d<c && d<e) {
			System.out.println("Menor Valor é D: " + d);
		} if(e<a && e<b && e<c && e<d) {
			System.out.println("Menor Valor é E: " + e);
		}
		
		if(a>b && a>c && a>d && a>e) {
			System.out.println("Maior Valor é A: " + a);
		} if(b>a && b>c && b>d && b>e) {
			System.out.println("Maoir Valor é B: " + b);
		} if(c>a && c>b && c>d && c>e) {
			System.out.println("Maior Valor é C: " + c);
		} if(d>a && d>b && d>c && d>e) {
			System.out.println("Maior Valor é D: " + d);
		} if(e>a && e>b && e>c && e>d) {
			System.out.println("Maior Valor é E: " + e);
		}

	}

}
