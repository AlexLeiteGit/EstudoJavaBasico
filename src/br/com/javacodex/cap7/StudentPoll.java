//figura 7.8 - Student Poll

package br.com.javacodex.cap7;

import java.security.SecureRandom;

public class StudentPoll {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
		int[] poll = new int[20];
		
		for(int counter = 0 ; counter < poll.length ; counter++) {
			++poll[1 + randomNumbers.nextInt(5)];
		}
		
		int[] response = new int[6];
		
		for(int e : poll) {
			System.out.println(e);
		}
		
		System.out.printf("%s%10s%n", "Grade", "Frequency");
		
		for (int grade = 1 ; grade < response.length ; grade++) {
			++response[poll[grade]];
			System.out.printf("%4d%10d%n", grade, poll[grade]);
		}

	}

}
