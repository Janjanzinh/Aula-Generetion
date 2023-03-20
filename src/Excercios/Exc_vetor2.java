package Excercios;

import java.util.Scanner;

public class Exc_vetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int [] vetor = new int [10];
		int impar = 0, par = 0,soma = 0,media = 0, x;
		
		for(x=0; x<10;x++) {
			System.out.println("Entre com um numero:");
			vetor [x] = leia.nextInt();
			soma+=vetor[x];
			media = (soma+vetor[x])/2;
			
			
		}
		System.out.println("Numeros pares:");
		 for(x=0; x<10;x++) {
		 if(vetor[x] % 2==0) {
			 System.out.println(vetor[x]);
			 
			 
		 }
		
	    }
		 System.out.println("Numeros impares:");
		 for(x=0; x<10;x++) {
		 if(vetor[x] % 2 !=0) {
			 System.out.println(vetor[x]);
	  }
		 
    }
		 
		 System.out.println("\nSoma dos vetores:" +soma);
		 System.out.println("\nMédia dos vetores:"+media);
  }
}

