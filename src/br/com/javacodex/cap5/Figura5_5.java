package br.com.javacodex.cap5;

public class Figura5_5 {

	public static void main(String[] args) {
		
		int total = 0;
		
		for (int number = 2 ; number <=20 ; number +=2) {
			System.out.printf("%d ", number);
			total += number;			
		}
		
		System.out.printf("%nA some é %d ", total);

	}

}
