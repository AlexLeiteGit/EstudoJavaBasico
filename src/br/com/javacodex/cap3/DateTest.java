package br.com.javacodex.cap3;

import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter day: ");
//		int day = input.nextInt();
//		
//		System.out.print("Enter month: ");
//		int month = input.nextInt();
//		
//		System.out.print("Enter year: ");
//		int year = input.nextInt();
		
		String day = JOptionPane.showInputDialog("Enter day: ");
		int day2 = Integer.parseInt(day);
		
		String month = JOptionPane.showInputDialog("Enter month: ");
		int month2 = Integer.parseInt(month);
		
		String year = JOptionPane.showInputDialog("Enter year: ");
		int year2 = Integer.parseInt(year);
		
		Date data = new Date(day2, month2, year2);
		
//		data.displayDate();
		
		JOptionPane.showMessageDialog(null, data.toString());

	}

}
