package br.com.javacodex.cap3;

public class Invoice {
	
	private String number;
	private String description;
	private int qtt;
	private double price;
	
	public Invoice(String number, String description, int qtt, double price) {
		super();
		this.number = number;
		this.description = description;
		this.qtt = qtt;
		this.price = price;
	}

	public Invoice(int qtt, double price) {
		super();
		this.qtt = qtt;
		this.price = price;
	}



	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQtt() {
		return qtt;
	}

	public void setQtt(int qtt) {
		this.qtt = qtt;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getInvoiceAmount(int qtt, double price) {
		
		double total = 0.0;
		
		if (qtt < 0) {
			qtt = 0;
			total = qtt * price;
		} else {
			total = qtt * price;
		}
		
		if (price < 0) {
			price = 0.0;
			total = qtt * price;
		} else {
			total = qtt * price;
		}
		
		return total;
	}

}
