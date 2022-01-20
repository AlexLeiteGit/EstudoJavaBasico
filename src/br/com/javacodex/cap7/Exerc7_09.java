package br.com.javacodex.cap7;

public class Exerc7_09 {

	public static void main(String[] args) {

		int[][] t = new int[2][3];

		for (int row = 0; row < t.length; row++) {
			for (int column = 0; column < t[row].length; column++) {
				t[row][column] = (row + column) * 10 + 10;
			}
		}

//	    for (int row =0; row < t.length ; row++) {
//	    	System.out.printf("%da. linha: ", (row+1));
//	      for (int column = 0 ; column < t[row].length ; column++) {
//	        System.out.printf("%d ", t[0][column]);
//	      }
//	    System.out.printf("\n");

		// Resposta da letra (e) do exercício
		for (int row = 0; row < 1; row++) {
			System.out.printf("%da. linha: ", (row + 1));
			for (int column = 0; column < t[row].length; column++) {
				System.out.printf("%d ", t[row][column]);
			}
		}

		System.out.println();

		// Resposta da letra (f) do exercício
		for (int row = 1; row < 2; row++) {
			System.out.printf("%da. linha: ", (row + 1));
			for (int column = 0; column < t[row].length; column++) {
				System.out.printf("%d ", t[row][column]);
			}
		}

		System.out.println();

		// Resposta da letra (g) do exercício
		for (int row = 0; row < 1; row++) {
			for (int column = 0; column < t[row].length; column++) {
				if (column == 1) {
					t[row][column] = 0;
				} else {
					t[row][column] = (row + column) * 10 + 10;
				}
			}
		}

		for (int row = 0; row < 1; row++) {
			System.out.printf("%da. linha: ", (row + 1));
			for (int column = 0; column < t[row].length; column++) {
				System.out.printf("%d ", t[0][column]);
			}
			System.out.printf("\n");
		}

		// Resposta da letra (h) do exercício
		for (int row = 0; row < t.length; row++) {
			for (int column = 0; column < t[row].length; column++) {
				t[row][column] = 0;
			}
		}

		for (int row = 0; row < t.length; row++) {
			System.out.printf("%da. linha: ", (row + 1));
			for (int column = 0; column < t[row].length; column++) {
				System.out.printf("%d ", t[0][column]);
			}
			System.out.println();

			// resposta da letra (i)
			for (int x = 0; x < t.length; x++) {
				for (int y = 0; y < t.length; y++) {
					t[x][y] = 0;
				}
			}

			for (row = 0; row < t.length; row++) {
				System.out.printf("%da. linha: ", (row + 1));
				for (int column = 0; column < t[row].length; column++) {
					System.out.printf("%d ", t[row][column]);
				}
				System.out.printf("\n");

			}
		}
	}
}

