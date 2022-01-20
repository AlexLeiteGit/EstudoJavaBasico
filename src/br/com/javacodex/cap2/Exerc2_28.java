package br.com.javacodex.cap2;

import java.util.Scanner;

public class Exerc2_28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o raio da circunferência: ");
		int r = input.nextInt();
		
		float diametro = 2 * r;
		float circunferencia = (float) (2 * r * Math.PI);
		float area = (float) (Math.pow(r, 2) * Math.PI);
		
		System.out.printf("A circunferencia mede: %f%n", circunferencia);
		System.out.printf("A área da cicunferencia é: %f%n", area);

		input.close();
	}

}
