package Excercios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exc_Collections_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int op;
		
		ArrayList<Integer> minhalista = new ArrayList<Integer>();

		ArrayList <Integer> minhalista1;
		 
		minhalista.add(0);
		minhalista.add(2);
		minhalista.add(5);
		minhalista.add(1);
		minhalista.add(3);
		minhalista.add(4);
		minhalista.add(9);
		minhalista.add(7);
		minhalista.add(8);
		minhalista.add(10);
		minhalista.add(6);
		System.out.println("\nEscolha a posição");
		op = leia.nextInt();
		
		int posicao = minhalista.indexOf(op);
		
		if(posicao !=1) {
			
			System.out.println("\nO numero "+op+"está na posição: "+posicao);
		}else {
			System.out.println("\nPosição"+op+"não foi encontrado!!");
		}
		
				
	}

}
