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
//		System.out.printf("%n%nO resultado da fatora��o de %d � %d%n%n", fator, fatoracao(fator));

		double x = 5; // aqui criamos uma vari�vel que ir� armazenar o numero do fatorial
		double f = x; // aqui criamos outra var. Ser� o resultado tempor�rio da multiplica��o

		while (x > 1){ // Enquanto x for menor que 1 fa�a o que est� entre as chaves

		  f = f *(x-1); // A vari�vel tempor�ria ira receber o resultado da multiplica��o dela, pelo valor de x menos 1
		  
		  x--; // aqui decrementamos o valor de x em um, no final do loop
		  
		}
		
		System.out.println(f); // Esse comando imprime o valor de f. O �ltimo ser� o valor final do Fatorial.
		
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
