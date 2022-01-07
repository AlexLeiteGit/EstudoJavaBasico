package br.com.javacodex.cap7;

public class Exerc7_10 {

	public static void main(String[] args) {

		int[] comissao = new int[11];

		for (int counter = 0; counter < comissao.length; counter++) {
			if (counter == 10) {
				System.out.printf("%7d: ", 1000);
				int venda = (200 + (1000 * (9/100)));
				comissao[counter] = venda;
				System.out.printf(" %d", comissao[counter]);
			} else {
				if (counter > 1) {
					System.out.printf("%03d-%03d: ", (counter * 100), ((counter * 100) + 99));
					int porcentagem = ((counter * 100) + 99) * (9/100);
					int venda = 200 + porcentagem;
					comissao[counter] = venda;
					System.out.printf(" %d", comissao[counter]);
				}
			}
			System.out.println();
		}
		
		

	}

}
