//Figura 6.10 - Sobrecarga de Métodos.

package br.com.javacodex.cap6;

import java.util.Locale;

public class MethodOverload {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Square od integer 7 is %d%n", square(7));
		System.out.printf("Square od double 7.5 is %f%n", square(7.5));

	}

	private static int square(int intValue) {
		
		System.out.printf("%nCalled square with int argument%d%n", intValue);
		
		return intValue * intValue;
	}
	
	private static double square(double doubleValue) {

		System.out.printf("%nCalled square with int argument%f%n", doubleValue);

		return doubleValue * doubleValue;
	}

}
