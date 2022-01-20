//Figura 9.4 - A classe CommissionEmployee representa umempregado que recebeu um
//percentual das vendas brutas

package br.com.javacodex.cap9;

public class CommissionEmployee extends Object{
	
	private String firstName;
	private String lastName;
	private String sociaslSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
//	protected String firstName;
//	protected String lastName;
//	protected String sociaslSecurityNumber;
//	protected double grossSales;
//	protected double commissionRate;
	
	public CommissionEmployee(String name, String surname, String social, double grossSales, double rate) {
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		if(rate <= 0.0) {
			throw new IllegalArgumentException("Commission rate must be >= 0.0 and < 1.0");
		}
		
		this.firstName = name;
		this.lastName = surname;
		this.sociaslSecurityNumber = social;
		this.grossSales = grossSales;
		this.commissionRate = rate;		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSociaslSecurityNumber() {
		return sociaslSecurityNumber;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		this.grossSales = grossSales;
	}

	public void setCommissionRate(double rate) {
		if(rate <= 0.0) {
			throw new IllegalArgumentException("Commission rate must be >= 0.0 and < 1.0");
		}
		this.commissionRate = rate;
	}
	
	public double earning() {
		return getCommissionRate() * getGrossSales();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "Commissionemployee", getFirstName(), getLastName(),
				"social security number", getSociaslSecurityNumber(),
				"gross sales", getGrossSales(),
				"commision rate", getCommissionRate());
	}
}
