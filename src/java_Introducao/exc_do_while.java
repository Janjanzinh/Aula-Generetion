package java_Introducao;

import java.util.Scanner;

public class exc_do_while {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int x = 0, resultado = 0;
	
	do { System.out.println("\nDigite um numero:");
	     x = leia.nextInt();
	     
	     if(x>=0){
	    	 resultado = resultado +x;
	    	 
	     }
		
	}while(x !=0);
	System.out.println("Resultado é:"+resultado);
  }
}	