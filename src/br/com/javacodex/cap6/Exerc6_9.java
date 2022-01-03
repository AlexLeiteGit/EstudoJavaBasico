package br.com.javacodex.cap6;

import java.util.Locale;
import java.util.Scanner;

public class Exerc6_9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor com ponto flutuante: ");
		double valorOriginal = input.nextDouble();
		
		double valorArredondado = Math.floor(valorOriginal);
		
		System.out.printf("O valor arredondado de %.2f é %.2f!", valorOriginal, valorArredondado);
		
		input.close();

	}

}
