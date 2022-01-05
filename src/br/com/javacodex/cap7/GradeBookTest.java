package br.com.javacodex.cap7;

public class GradeBookTest {

	public static void main(String[] args) {
		
		int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		
		GradeBook myGradeBook = new GradeBook("Cs101 Introduction to Java Programming", gradesArray);
		
		System.out.printf("Welcome tothe grade book for%n%s%n%n", myGradeBook.getCourseName());
		
		myGradeBook.processGrades();

	}

}
