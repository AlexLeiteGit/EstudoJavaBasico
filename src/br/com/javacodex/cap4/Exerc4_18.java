package br.com.javacodex.cap4;

import javax.swing.JOptionPane;

public class Exerc4_18{

	public static void main(String[] args) {
		
		String conta = JOptionPane.showInputDialog("Informe o n�mero da conta: ");
		int corrente = Integer.parseInt(conta);
		
		String saldoInicial = JOptionPane.showInputDialog("Informe o Saldo Inicial: ");
		int inicial = Integer.parseInt(saldoInicial);
		
		String itensComprados = JOptionPane.showInputDialog("Informe o total de compras do m�s: ");
		int compras = Integer.parseInt(itensComprados);
		
		String creditoUsado = JOptionPane.showInputDialog("Informe o total do cr�dito do Cliente: ");
		int credito = Integer.parseInt(creditoUsado);
		
		int limiteCredito = (inicial - compras) + credito;
		String resultadoCliente = null;
		
		if (limiteCredito < 0) {
			resultadoCliente = String.format("Posi��o do Cliente%n Conta: %s%n' "
					+ "Saldo Inicial: %s%n "
					+ "Total de Compras do m�s: %s%n "
					+ "Total do Cr�dito Utilizado: %s%n"
					+ "Limite de Cr�dito Excedido", conta, saldoInicial, itensComprados, creditoUsado);
		} else {
			String limite = Integer.toString(limiteCredito);
			resultadoCliente = String.format("Posi��o do Cliente%n Conta: %s%n "
					+ "Saldo Inicial: %s%n "
					+ "Total de Compras do m�s: %s%n "
					+ "Total do Cr�dito Utilizado: %s%n"
					+ "Limite de Cr�dito Atualizado: %s%n", conta, saldoInicial, itensComprados, creditoUsado, limite);
		}
		
		JOptionPane.showMessageDialog(null, resultadoCliente);
	}

}
