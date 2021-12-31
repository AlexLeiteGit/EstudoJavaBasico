package br.com.javacodex.cap5;

import java.util.Scanner;

public class Exerc5_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com o valor a fatorar: ");
		int fator = input.nextInt();
		
		fatoracao(fator);

		
		System.out.printf("%n%nO resultado da fatoração de %d é %d%n%n", fator, fatoracao(fator));

	}
	
	public static int fatoracao(int elemento) {
		
		int contador = elemento;
		
		while (contador >= 1) {
		while (elemento > 1) {
			if(elemento > 1) {
			elemento *= (elemento-1);
			elemento--;
		}
		if (elemento == 1) {
			elemento *= 1;
		}		
		contador--;
		}
		}
		
		return elemento;
	}

}
