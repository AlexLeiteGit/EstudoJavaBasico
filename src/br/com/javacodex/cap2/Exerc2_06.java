package br.com.javacodex.cap2;

import java.util.Scanner;

public class Exerc2_06 {

	public static void main(String[] args) {
		
		System.out.println("Calcule o produto de 3 números");
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int result;
		
		System.out.print("Insira o valor de x: ");
		x = input.nextInt();
		System.out.print("Insira o valor de y: ");
		y = input.nextInt();
		System.out.print("Insira o valor de z: ");
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.printf("%s%d%n", "Product is ", result);
		System.out.printf("Product is %d%n", result);

		input.close();
	}

}
