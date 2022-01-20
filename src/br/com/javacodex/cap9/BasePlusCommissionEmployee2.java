//Figura 9.8 - Membros private da superclasse não podem ser acessados em uma subclasse.

package br.com.javacodex.cap9;

public class BasePlusCommissionEmployee2 extends CommissionEmployee{
	
//	private String firstName;
//	private String lastName;
//	private String sociaslSecurityNumber;
//	private double grossSales;
//	private double commissionRate;
	private double baseSalary;
	
	public BasePlusCommissionEmployee2(String name, String surname, String social, double grossSales, double rate, double baseSalary) {
//		if(grossSales < 0.0) {
//			throw new IllegalArgumentException("Gross sales must be >= 0.0");
//		}
//		if(rate <= 0.0) {
//			throw new IllegalArgumentException("Commission rate must be >= 0.0 and < 1.0");
//		}
		
		super(name, surname, social, grossSales, rate);
		
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}
		
//		this.firstName = name;
//		this.lastName = surname;
//		this.sociaslSecurityNumber = social;
//		this.grossSales = grossSales;
//		this.commissionRate = rate;
		this.baseSalary = baseSalary;
	}

//	public String getFirstName() {
//		return firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public String getSociaslSecurityNumber() {
//		return sociaslSecurityNumber;
//	}
//
//	public double getGrossSales() {
//		return grossSales;
//	}
//
//	public double getCommissionRate() {
//		return commissionRate;
//	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

//	public void setGrossSales(double grossSales) {
//		if(grossSales < 0.0) {
//			throw new IllegalArgumentException("Gross sales must be >= 0.0");
//		}
//		this.grossSales = grossSales;
//	}
//
//	public void setCommissionRate(double rate) {
//		if(rate <= 0.0) {
//			throw new IllegalArgumentException("Commission rate must be >= 0.0 and < 1.0");
//		}
//		this.commissionRate = rate;
//	}
	
	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}
	@Override
	public double earning() {
		return getBaseSalary() + super.earning();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%n%s: %.2f", "base-salaried",
				super.toString(), "base salary", getBaseSalary());
	}
}
