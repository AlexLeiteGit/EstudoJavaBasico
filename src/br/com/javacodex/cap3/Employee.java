package br.com.javacodex.cap3;

public class Employee {
	
	private String name;
	private String surname;
	private double salaryAnual;
	
	public Employee(String name, String surname, double salaryAnual) {
		this.name = name;
		this.surname = name;
		if (salaryAnual >= 0.0) {
			this.salaryAnual = salaryAnual;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getSalary() {
		return salaryAnual;
	}

	public void setSalary(double salary) {
		this.salaryAnual = salary;
	}
	
	public void raise(double raise) {
		
		this.salaryAnual += (salaryAnual * (raise/100));
	}
	
	
	
	@Override
	public String toString() {
		return "Name: " 
				+ getName() 
				+ "\n" 
				+ "Surname: " 
				+ getSurname() 
				+ "Anual Salary: "
				+ getSalary();
	}

	

}
