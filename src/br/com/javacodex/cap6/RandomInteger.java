//Figura 6.6 - Números Aleatórios em Java - JAVA: como programar - Deitel

package br.com.javacodex.cap6;

import java.security.SecureRandom;

public class RandomInteger {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		for (int counter = 1 ; counter <= 20 ; counter++) {
			int face = 1 + randomNumbers.nextInt(6);// o número um é adicionado para deixar os lançamento de dados corretos, pois do contrário seriam valores de 0 a 5.
			System.out.printf("%d ", face, args);
			
			if(counter %5 == 0) {
				System.out.println();
			}
		}
		

	}

}
