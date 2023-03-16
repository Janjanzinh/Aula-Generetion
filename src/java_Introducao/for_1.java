package java_Introducao;

import java.util.Scanner;

public class for_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int x, num1 = 0, num2 = 0, res1 = 0, res2 = 0;

		System.out.println("\nEntre com primeiro numero");
		num1 = leia.nextInt();
		System.out.println("\nEntre com Segundo numero");
		num2 = leia.nextInt();

		if (num1 < num2) {
		 for(x = num1;x <= num2; x++ ) {
			 
		 
		    res1 = x % 3; 
		    res2 = x % 5;
		    
		if(res1 == 0 && res2==0) {
			System.out.println(x+"Numero é Multiplo");
		}	
		} 

		} else {
			System.out.println("intervalo invalido");
			

		}
	}
}
