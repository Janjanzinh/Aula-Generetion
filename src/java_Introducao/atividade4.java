package java_Introducao;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double num1, num2,num3,num4,calculo;
		
		System.out.println("\nPrimeiro numero");
		num1 = leia.nextDouble();
		System.out.println("\nSegundo numero");
		num2 = leia.nextDouble();
		System.out.println("\nTerceiro numero");
		num3 = leia.nextDouble();
		System.out.println("\nQuarto numero");
		num4 = leia.nextDouble();
		
		
		calculo = (num1+num2+num3+num4);
		calculo = (num1*num2)-(num3*num4);
		
		System.out.println("\nResultado dos calculos"+calculo);
	

	}

}
