package br.com.javacodex.cap3;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the employee name: ");
		String name = input.nextLine();
		
		System.out.print("Enter the employee surname: ");
		String surname = input.nextLine();
		
		System.out.print("Enter employee's Anual Salary: ");
		double anualSalary = input.nextDouble();
		
		Employee employee1 = new Employee(name, surname, anualSalary);
		
		input.nextLine();
		
		System.out.print("Enter the employee name: ");
		name = input.nextLine();
		
		System.out.print("Enter the employee surname: ");
		surname = input.nextLine();
		
		System.out.print("Enter employee's Anual Salary: ");
		anualSalary = input.nextDouble();
		
		Employee employee2 = new Employee(name, surname, anualSalary);
		
		System.out.printf("%n%s %s earn $%.2f per year!%n%n", employee1.getName(), employee1.getSurname(), employee1.getSalary());
		System.out.printf("%n%s %s earn $%.2f per year!%n%n", employee2.getName(), employee2.getSurname(), employee2.getSalary());
		
		System.out.print("Informe raise percentage for employee1: ");
		double percentage = input.nextDouble();
		
		employee1.raise(percentage);
		
		System.out.print("Informe raise percentage for employee2: ");
		percentage = input.nextDouble();
		
		employee2.raise(percentage);
		
		System.out.printf("%n%s %s earn $%.2f per year!%n%n", employee1.getName(), employee1.getSurname(), employee1.getSalary());
		System.out.printf("%n%s %s earn $%.2f per year!%n%n", employee2.getName(), employee2.getSurname(), employee2.getSalary());

	}

}
