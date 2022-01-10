//Figura 8.8 - Classe Employee com referencia a outros objetos

package br.com.javacodex.cap8;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	public Employee(String name, String surname, Date birth, Date hire) {
		this.firstName = name;
		this.lastName = surname;
		this.birthDate = birth;
		this.hireDate = hire;
	}
	
	public String toString() {
		return String.format("%s,  %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
	}

}
