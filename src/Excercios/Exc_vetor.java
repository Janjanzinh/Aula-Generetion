package Excercios;

import java.util.Scanner;

public class Exc_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int [10];
		int posicao,x,cont =0;
			
		 for (x=0; x<10;x++) {
			 System.out.println("Digite o "+(x+1)+"°-posição\nnumero:");
			 vetor[x] = leia.nextInt();
		}
		 System.out.println("\nDigite a posição:");
		 posicao =  leia.nextInt();
		 
		 for(x=0; x <10; x++) {
			if( posicao == vetor[x] ) {
				System.out.println("O numero: "+posicao+"está na localização:"+(x+1));
			}
		 }
	}
}	
			
			
				
	


