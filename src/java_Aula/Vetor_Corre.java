package java_Aula;

import java.util.Scanner;

public class Vetor_Corre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vet = new int [5];
		int MaiorPont = 0, x;
		
		Scanner ler = new Scanner (System.in);
		
		for(x = 0; x<5; x++) {
			System.out.println("\nEntre com um valor");
			vet[x] = ler.nextInt();
			 
			if(MaiorPont <vet[x]) {
				MaiorPont = vet[x];
				System.out.println("\nA maior pontução: "+MaiorPont);
			}
			
		}

	}

}
