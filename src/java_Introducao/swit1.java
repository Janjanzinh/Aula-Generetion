package java_Introducao;

import java.io.InputStream;
import java.util.Scanner;
public class swit1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int ca,quantidade;
		double total = 0;
		
		
		System.out.println("\nEscolha o seu pedido");
		
		
		System.out.println("\n\t\tCardapio");
		System.out.println("\n1- CACHORRO QUENTE");
		System.out.println("\n2- X-SALADA");
		System.out.println("\n3- X-BACON");
		System.out.println("\n4- BAURU");
		System.out.println("\n5- REFRIGERANTE");
		System.out.println("\n5- SUCO DE LARANJA");
		System.out.println("\nDigite a sua opção:");
		
		ca = leia.nextInt();
		System.out.println("\nQuantidade do produto");
		quantidade = leia.nextInt();
		
		
        switch(ca) {
		
		case 1:
			System.out.println("\nCACHORRO QUENTE");
			total = quantidade*10;
			break;
			
		case 2:
			System.out.println("\nX-SALADA");
			total = quantidade*15;
			break;
		case 3:
			System.out.println("\nX-BACON");
			total = quantidade*18;
			break;
		case 4:
			System.out.println("\nBAURU");
			total = quantidade*12;
			break;
		case 5:
			System.out.println("\nREFRIGERANTE");
			total = quantidade*8;
			break;
		case 6:
			System.out.println("\nSUCO DE LARANJA");
			total = quantidade*13;
			break;
		default:
			System.out.println("\nOpção invalida...");
			
			break;
			
			
			
			}
        System.out.println(total);

}

	
	

}	
	


	

