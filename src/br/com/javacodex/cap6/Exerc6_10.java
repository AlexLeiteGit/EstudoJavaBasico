package br.com.javacodex.cap6;

import java.util.Locale;
import java.util.Scanner;

public class Exerc6_10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o número para arredondamento: ");
		double number = input.nextDouble();
		
		double a1 = roundInteger(number);
		double a2 = roundTenths(number);
		double a3 = roundHundredths(number);
		double a4 = roundThousandths(number);
		
		System.out.println("O Valor Original é: " + number);
		System.out.println("O Valor Arredondado para inteiro é: " + a1);
		System.out.println("O Valor Arredondado para dezena é: " + a2);
		System.out.println("O Valor Arredondado para centena é: " + a3);
		System.out.println("O Valor Arredondado para milhar é: " + a4);
		
		input.close();

	}

	private static double roundInteger(double number) {

		double y = Math.floor(number);
		
		return y;
	}

	private static double roundTenths(double number) {

		double y = Math.floor(number * 10 + 0.5)/10;
		
		return y;
	}

	private static double roundHundredths(double number) {

		double y = Math.floor(number * 100 + 0.5)/100;
		
		return y;
	}

	private static double roundThousandths(double number) {
		
		double y = Math.floor(number * 1000 + 0.5)/1000;
		
		return y;
	}

}
