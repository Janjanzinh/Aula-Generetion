package java_Introducao;

import java.util.Scanner;

public class for_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia =new Scanner(System.in);
		
		int x;
		float num1  ,num2 , mutiplo=0;
		
		
		
		for(x = 10; x >=100; x++ ){
			System.out.println("Escreva o primeiro numero:");
			num1 = leia.nextFloat();
			System.out.println("Escreva o segundo numero");
			num2 = leia.nextFloat();
			mutiplo = num1+num2;
			System.out.println("\nSe o multiplo for igual a"+mutiplo);
		}if (x % 3 == 0 ) {
			
		}
			else if(x % 3 == 5){
			System.out.println("\nIntervalo ivalido");
		}else {
			
		}
		
			
			
		  
	}

}
