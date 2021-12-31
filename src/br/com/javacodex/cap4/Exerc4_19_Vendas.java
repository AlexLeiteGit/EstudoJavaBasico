package br.com.javacodex.cap4;

public class Exerc4_19_Vendas {
	
	private int item;
	private double valor;
	
	public Exerc4_19_Vendas(int item) {
		this.item = item;
		
		if(item == 1) {
			this.valor = 239.99;
		} if (item == 2) {
			this.valor = 129.75;
		} if (item == 3) {
			this.valor = 99.95;
		} if(item == 4) {
			this.valor = 350.89;
		}
	}
	
	public int getItem() {
		return item;
	}
	
	public void setItem(int item) {
		this.item = item;
	}

	public double getValor() {
		return valor;
	}
	
	public String toString() {
		return "Item: " + getItem() + " / " + "Valor: R$" + getValor();
				
	}

}
