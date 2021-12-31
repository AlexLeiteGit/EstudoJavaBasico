package br.com.javacodex.cap5;

public class Exerc5_12 {

	public static void main(String[] args) {
		
		int produto = 1;
		
		for(int i = 1 ; i <= 15 ; i++) {
			if(i%2 != 0) {
				produto *= i;
			}
		}
		
		System.out.printf("%nO produto dos números ímpares de 1 a 15 é %d%n%n", produto);

	}

}
