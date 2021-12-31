package br.com.javacodex.cap5;

import java.util.Scanner;

public class Exerc5_11 {

	public static void main(String[] args) {
		
//		String input = JOptionPane.showInputDialog("Informe a quantida de números a serem inseridos:");
//		int qtd = Integer.parseInt(input);
//		
//
//		String valor = null;
//		int elemento1 = 0;
//		int elemento2 = 0;
//		int menor = 0;
//		String menorFinal = null;
//		
//		valor = JOptionPane.showInputDialog("Informe o valor:");
//		elemento1 = Integer.parseInt(valor);
//		
//		while(qtd > 0) {
//						
//			elemento2 = elemento1;
//			
//			valor = JOptionPane.showInputDialog("Informe o valor:");
//			elemento1 = Integer.parseInt(valor);
//
//			
//			if (elemento1 > elemento2) {
//				menor = elemento2;
//			} else {
//				menor = elemento1;
//			}
//			
//			menorFinal = String.valueOf(menor);
//			
//			qtd--;
//		}
//		
//		String message = String.format("O menor valor apresentados foi ", menorFinal);
//		
//		JOptionPane.showMessageDialog(null, message);
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de valores: ");
		int qtd = input.nextInt();
		
		System.out.print("entre com o valor: ");
		int elemento1 = input.nextInt();
		
		int menorFinal = 0;
		
		while (qtd > 0) {
			
			int elemento2 = elemento1;
			
			System.out.print("entre com o valor: ");
			elemento1 = input.nextInt();
			
			int menor = 0;
			
			if (elemento1 > elemento2) {
				menor = elemento2;
			} else {
				menor = elemento1;
			}
			
			menorFinal = menor;
			
			qtd--;
			
		}
		
		System.out.printf("%n%nO menor valor é %d%n%n", menorFinal);
		
	}

}
