package br.com.javacodex.cap4;

import java.util.Locale;
import java.util.Scanner;

public class Figura4_08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 0;
		int grade = 0;
		
		
		while (grade != -1) {
			System.out.print("Enter Grade or (-1) to quit: ");
			grade = input.nextInt();
			if(grade >= 0 && grade <=100) {
				total += grade;
				gradeCounter++;
			} else {
				System.out.println("Invalid Value or no value! Do it again!");
			}
				
			}
		
		int divisor = gradeCounter;
		
		double average = (double) total / divisor;
		
		System.out.printf("%nTotal of all %d grades is %d%n", divisor, total);
		System.out.printf("%nAverage is: %.2f%n", average);

	}
	
	static final int safeAdd (int left, int right) {
		  if (right > 0 ? left > Integer.MAX_VALUE - right : left < Integer.MIN_VALUE - right) {
		    throw new ArithmeticException("Integer overflow");
		  }
		  return left + right;
		}
	

}
