package br.com.javacodex.cap6;

import java.util.Locale;
import java.util.Scanner;

public class Exerc6_8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int horas = 0;
		double valorFinal = 0.0;
		double soma = 0.0;
		
		Scanner input = new Scanner(System.in);
				
		while(input.hasNext()) {
		System.out.print("Informe as horas de permanencia: ");
		horas = input.nextInt();
		valorFinal = calculateCharges(horas);
		System.out.printf("O cliente deve pagar %f%n", valorFinal);
		soma += valorFinal;
		}
		
		input.close();
		
		System.out.printf("Valor total do dia é %f%n", soma);
	}
	
	public static double calculateCharges(int horas) {
		
		double tarifaMinima = 2.00;
		double tarifaMaxima = 10.00;
		double adicional = 0.50;
		
		double charge = 0;
		
		if (horas <= 3) {
			charge = tarifaMinima;
		}
		
		if ((horas > 3) && (horas < 24)) {
			charge = tarifaMinima + ((horas - 3) * adicional);
		}
		
		if (horas >= 24) {
			charge = tarifaMaxima;
		}
		return charge;
	}

}
