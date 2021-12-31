package br.com.javacodex.cap4;

import javax.swing.JOptionPane;

public class Exerc4_18{

	public static void main(String[] args) {
		
		String conta = JOptionPane.showInputDialog("Informe o número da conta: ");
		int corrente = Integer.parseInt(conta);
		
		String saldoInicial = JOptionPane.showInputDialog("Informe o Saldo Inicial: ");
		int inicial = Integer.parseInt(saldoInicial);
		
		String itensComprados = JOptionPane.showInputDialog("Informe o total de compras do mês: ");
		int compras = Integer.parseInt(itensComprados);
		
		String creditoUsado = JOptionPane.showInputDialog("Informe o total do crédito do Cliente: ");
		int credito = Integer.parseInt(creditoUsado);
		
		int limiteCredito = (inicial - compras) + credito;
		String resultadoCliente = null;
		
		if (limiteCredito < 0) {
			resultadoCliente = String.format("Posição do Cliente%n Conta: %s%n' "
					+ "Saldo Inicial: %s%n "
					+ "Total de Compras do mês: %s%n "
					+ "Total do Crédito Utilizado: %s%n"
					+ "Limite de Crédito Excedido", conta, saldoInicial, itensComprados, creditoUsado);
		} else {
			String limite = Integer.toString(limiteCredito);
			resultadoCliente = String.format("Posição do Cliente%n Conta: %s%n "
					+ "Saldo Inicial: %s%n "
					+ "Total de Compras do mês: %s%n "
					+ "Total do Crédito Utilizado: %s%n"
					+ "Limite de Crédito Atualizado: %s%n", conta, saldoInicial, itensComprados, creditoUsado, limite);
		}
		
		JOptionPane.showMessageDialog(null, resultadoCliente);
	}

}
