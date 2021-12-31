package br.com.javacodex.cap2;

public class Exerc2_31 {

	public static void main(String[] args) {
		
		System.out.print("Number\tSquare\tCube\t\n");
		 int x = 0;
		 while (x<=10) {
			int a = (int) Math.pow(x, 2);
			int b = (int) Math.pow(x, 3);
			 System.out.println(x + "\t" + a + "\t" + b + "\t");
			x++;
		 }
		

	}

}
