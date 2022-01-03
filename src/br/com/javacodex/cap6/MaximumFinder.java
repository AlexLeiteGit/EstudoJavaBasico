//Figura 6.3 - Capítulo 6 - Java: Como programar

package br.com.javacodex.cap6;

import java.util.Scanner;

public class MaximumFinder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three floating-point values separetes by space: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
//		double result = maximum(number1, number2, number3);
		
		double result = Math.max(number1, Math.max(number2, number3));
		
		System.out.println("Maximum is: " + result);

	}

//	public static double maximum(double number1, double number2, double number3) {
//		
//		double maximumValue = number1;
//		
//		if (number2 > maximumValue) {
//			maximumValue = number2;
//		}
//		
//		if (number3 > maximumValue) {
//			maximumValue = number3;
//		}
//		
//		return maximumValue;
//	}

}
