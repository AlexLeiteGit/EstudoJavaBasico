package br.com.javacodex.cap7;

import java.security.SecureRandom;
import java.util.Arrays;

public class Exerc7_08 {

	public static void main(String[] args) {
		
		int[] f = new int[10];
		
		for(int counter = 0 ; counter < f.length ; counter++) {
			f[counter] = counter * 10;
		}
		
		displayInt(f);
		
		System.out.println();
		
		System.out.println("Elemento 6 do array f é " + f[6]);
		
		int[] g = new int[5];
		
		for(int counter = 0 ; counter < g.length ; counter++) {
			Arrays.fill(g, 8);
		}
		
		displayInt(g);
		
		System.out.println();
		
		double[] c = new double[100];
		
		for(int counter = 0 ; counter < c.length ; counter++) {
			c[counter] = counter * 10;
		}
		
		double soma = 0;
		
		for(double value : c) {
			soma += value;
		}
		
		System.out.println(soma);
		
		int[] a = new int[11];
		int[] b = new int[34];
		
		for(int counter = 0 ; counter < a.length ; counter++) {
			a[counter] = counter * 10 + 1;
		}
		
		System.arraycopy(a, 0, b, 0, a.length);
		 
		System.out.print("Array Original a: ");
		displayInt(a);
		System.out.println();
		System.out.print("Array Cópia b   : ");
		displayInt(b);
		System.out.println();
		
		double[] w = new double[99];
		
		SecureRandom valores = new SecureRandom();
		
		for(int counter = 0 ; counter < w.length ; counter++) {
			w[counter] = valores.nextDouble();
		}
		
		System.out.printf("O menor valor do array w é %.2f e o maior valor do array w é %.2f", minimoValor(w), maximoValor(w));

	}
	
	private static double maximoValor(double[] array) {
		
		double maximoValor = array[0];
		
		for(int i = 0 ; i < array.length  ; i++) {
			
			if(array[i] > maximoValor) {
				maximoValor = array[i];
			}
		}
		
		return maximoValor;
	}

	public static double minimoValor(double[] array) {
		
		double minimoValor = array[0];
		
		for(int i = 0 ; i < array.length  ; i++) {
			
			if(array[i] < minimoValor) {
				minimoValor = array[i];
			}
		}
		
		return minimoValor;
	}

	public static void displayInt(int[] array) {
		
		for(int value : array) {
			System.out.print(value + " ");
		}
	}
	
	public static void displayDouble(double[] array) {
		
		for(double value : array) {
			System.out.print(value + " ");
		}
	}

}
