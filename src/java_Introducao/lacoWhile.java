package java_Introducao;

import java.util.Scanner;

public class lacoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero = 0,somaPar=0,contImpar=0;
		
		System.out.println("Entre com um numero:");
		numero = leia.nextInt();
		
		while(numero !=0) {
			
			if(numero % 2 == 0) {
				somaPar += numero ;
				
			}else {
				contImpar ++;
			}
			System.out.println("\nEntre com um numero:");
			numero = leia.nextInt();
		}   
            System.out.println("\nSomatório dos números pares foi de:"+somaPar);
            System.out.println("\nQuantidade de números ímpar é:"+contImpar);
            
	}       

}
