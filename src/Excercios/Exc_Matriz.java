package Excercios;

import java.util.Scanner;

public class Exc_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int[][] numeros = new int[3][3];
		int linha, coluna, soma_matriz = 0, soma_diagonalp = 0;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite valor para posição[" + linha + "][" + coluna + "]:");
				numeros[linha][coluna] = leia.nextInt();

			}
		}
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					System.out.println(" O numero " + numeros[linha][coluna] + " da diagonal principal:");
					soma_diagonalp += numeros[linha][coluna];

				}

			}
		}
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha + coluna == numeros.length - 1) {
					System.out.println(" O numero " + numeros[linha][coluna] + " da diagonal secudaria");
					soma_matriz += numeros[linha][coluna];
				}
			}
		}
		System.out.println("\nNumeros da diagonal principal são: " + soma_diagonalp);
		System.out.println("\nNumeros da diagonal secundaria são: " + soma_matriz);

	}
}
