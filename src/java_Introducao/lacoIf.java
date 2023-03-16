package java_Introducao;

import java.util.Scanner;

public class lacoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, media;
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		System.out.printf("\nMédia aritmética foi de:%.2f",media);//4.5
		
		if(media>=7&&media<=10){
		System.out.println("\nAluno aprovado!!!");
		
		}else if(media>=5&&media<=7) {
		  System.out.println("\nAluno de exame!!!");
		 
		}
		else {
			System.out.println("\nAluno reprovado");
		}
		System.out.println("\n\t\tMenu de elogios");
		System.out.println("\n1- Família Feliz");
		System.out.println("\n2- Família Acolhedora");
		System.out.println("\n3- Família Está de parabéns");
		System.out.println("\n4- Família Nota 10");
		System.out.println("\n5- Família é Show");
		System.out.println("\nDigite a sua opção:");
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println("\n Feliz");
			break;
		case 2:
			System.out.println("\nAcolhedora");
			break;
		case 3:
			System.out.println("\nEstá de parabéns");
			break;
		case 4:
			System.out.println("\nNota 10");
			break;
		case 5:
			System.out.println("\nÉ Show");
			break;
		default:
			System.out.println("\nOpção invalida...");
		}   
	
	}

}
