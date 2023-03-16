package java_Introducao;

import java.util.Scanner;

public class ATV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		float salario1,abono,soma;
		
		Scanner leia = new Scanner (System.in);
		 
		
		System.out.println("\nEntre com o salario1");
		salario1 = leia.nextFloat();
		System.out.println("\nEntre com o abono");
		abono = leia.nextFloat();
		
		soma = (salario1+abono);
	 
	 
		 System.out.println("\nSoma do salario de:"+soma);
		 System.out.println("\nNovo salario"+soma);

	}

}
