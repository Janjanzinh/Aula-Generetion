package java_Aula;

import java.util.Scanner;

public class arryMatriz_aula_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int [][] numeros = new int[3][3];
		int linha,coluna,somaMatriz=0,somaDiagonal=0;
		
		for(linha=0;linha<3;linha++) {
		 for(coluna=0; coluna<=3; linha++) {
			 System.out.println("\nEntre com um numero: ");
			 numeros[linha][coluna] = leia.nextInt();
			  somaMatriz += numeros [linha][coluna];
			  
			  if(linha == coluna) {
				  somaDiagonal += numeros[linha][coluna];
			  }
			  
		 }
	   }
		System.out.println("\nSoma dos valores da matriz:"+somaMatriz);
		System.out.println("\nSoma dos valores da matriz:"+somaDiagonal);

	}

}
