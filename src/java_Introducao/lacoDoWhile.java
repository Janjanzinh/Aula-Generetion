package java_Introducao;

import java.util.Scanner;

public class lacoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int tabuada,x=1,resultado;
		
		System.out.println("\nDigite a tabuada que deseja visualizar:");
		tabuada = leia.nextInt();
		
		do {
			resultado = tabuada * x;
			System.out.println("\n"+tabuada+" X "+x+" = "+resultado);
			x++;
			
		}while(x<=10);
		
		
	

	}

}
