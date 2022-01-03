//Figura 6.8 - Escope de declarações

package br.com.javacodex.cap6;

public class Scope {
	
	private static int x = 1;

	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.printf("local x in main is %d%n", x);
		
		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.printf("local x in main is %d%n", x);

	}

	private static void useField() {
		
		System.out.printf("%nfield x on entereing method useField is %d%n", x);
		x *= 10;
		System.out.printf("%nfield x before entereing method useField is %d%n", x);
	}

	private static void useLocalVariable() {
		
		int x = 25;
		System.out.printf("%nlocal x on entereing method useLocalVariable is %d%n", x);
		++x;
		System.out.printf("%nlocal x before entereing method useLocalVariable is %d%n", x);
		
	}

}
