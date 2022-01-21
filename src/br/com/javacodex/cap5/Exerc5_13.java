package br.com.javacodex.cap5;

import java.util.Scanner;

public class Exerc5_13 {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Entre com o valor a fatorar: ");
//		int fator = input.nextInt();
//		
//		fatoracao(fator);
//
//		
//		System.out.printf("%n%nO resultado da fatoração de %d é %d%n%n", fator, fatoracao(fator));

		double x = 5; // aqui criamos uma variável que irá armazenar o numero do fatorial
		double f = x; // aqui criamos outra var. Será o resultado temporário da multiplicação

		while (x > 1){ // Enquanto x for menor que 1 faça o que está entre as chaves

		  f = f *(x-1); // A variável temporária ira receber o resultado da multiplicação dela, pelo valor de x menos 1
		  
		  x--; // aqui decrementamos o valor de x em um, no final do loop
		  
		}
		
		System.out.println(f); // Esse comando imprime o valor de f. O último será o valor final do Fatorial.
		
	}
	
//	public static int fatoracao(int elemento) {
//		
//		int contador = elemento;
//		
//		while (contador >= 1) {
//		while (elemento > 1) {
//			if(elemento > 1) {
//			elemento *= (elemento-1);
//			elemento--;
//		}
//		if (elemento == 1) {
//			elemento *= 1;
//		}		
//		contador--;
//		}
//		}
//		
//		return elemento;
//	}

}
