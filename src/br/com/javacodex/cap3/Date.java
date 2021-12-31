package br.com.javacodex.cap3;

public class Date {
	
	private int mes;
	private int dia;
	private int ano;
	
	public Date(int dia, int mes, int ano) {
		
		if(dia >= 1 && dia <= 31) {
			this.dia = dia;
		}
		
		if(mes >=1 && mes <= 12) {
			this.mes = mes;
		}
		
		
		if(ano >= 1900) {
			this.ano = ano;
		}
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes() {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void displayDate() {		
		System.out.println(getDia() + " / " + getMes() + " / " + getAno());
	}
	
	@Override
	public String toString() {
		return getDia() + " / " + getMes() + " / " + getAno();
	}
}
