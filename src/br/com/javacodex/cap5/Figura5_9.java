package br.com.javacodex.cap5;

import java.util.Locale;
import java.util.Scanner;

public class Figura5_9 {

	public static void main(String[] args) {
		
		int nota = 0;
		double soma = 0;
		double media = 0;
		int contadorNotas = 0;
		int contadorA = 0;
		int contadorB = 0;
		int contadorC = 0;
		int contadorD = 0;
		int contadorF = 0;
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n   %s%n   %s%n%n", "Enter the integer grades in the range 0-100", "Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux?Mac OS X type <Ctrl> d then press Enter", "On windows type <Ctrl> z then press Enter");
		
		System.out.print("Informe a nota da aluno: ");
		
		
		while (input.hasNext()) {
			
			nota = input.nextInt();
			soma += nota;
			contadorNotas++;
			
			switch(nota/10) {
			
			case 10:
			case 9:
				contadorA++;
				break;
			case 8:
				contadorB++;
				break;
			case 7:
				contadorC++;
				break;
			case 6:
				contadorD++;
				break;
			default:
				contadorF++;
				break;			
			}			
		}
		
		System.out.printf("%nRelatório de Notas:%n");
		
		if(contadorNotas != 0) {
			
			media = soma / contadorNotas;
			
			System.out.printf("Total de %d notas cadastradas é %.2f%n", contadorNotas, soma);
			System.out.printf("Média da Turma é %.2f%n", media);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Números de estudantes que receberam cada nota:", "A: ", contadorA,
					"B: ", contadorB, "C: ", contadorC, "D: ", contadorD, "F: ", contadorF);		
		} else {
			System.out.printf("Nenhuma nota cadastrada");
		}

	}

}
