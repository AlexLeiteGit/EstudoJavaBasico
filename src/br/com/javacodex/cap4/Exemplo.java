package br.com.javacodex.cap4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exemplo {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
				
		lista.add("Josefa Maria da Silva");
		lista.add("Henrique Viana Carvalho");
		lista.add("José Francisco da Silva");
		
		String nomes = "";
		for(String nome : lista){
			nomes += nome+"\n";
		}
		JOptionPane.showMessageDialog(null, nomes);
	}

}
