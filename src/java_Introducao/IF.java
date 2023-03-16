package java_Introducao;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leia = new Scanner(System.in);
		
		float numA,numB,soma,comparador; 
		
		System.out.println("\nPrimeiro valor:");
		numA = leia.nextFloat();
		System.out.println("\nSegundo valor:");
		numB = leia.nextFloat();
		
		soma = (numA+numB);
		System.out.println("\nValor da soma:"+soma);
		System.out.println("\n comparar o resultado:");
		comparador = leia.nextFloat();
		
		if(soma>comparador){
		System.out.println("\nO numero é maior!");
			
		}else if(soma<comparador){
			System.out.println("/no numero é menor!");
		}
		
		
		

	}

}
