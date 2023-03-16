package java_Introducao;

import java.util.Scanner;

public class Ola_Mundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String nome = "Janilson Alves";
        int idade = 25,x=7;
        double altura = 1.76,nota1,nota2,nota3,media;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("\nO seu nome é:"+nome+"\n sobre nome...");
        System.out.println("\nSua idade é:"+altura+"anos de vida...");
        System.out.println("\nSua idade é:"+idade+"metros");
        
        System.out.println("\nEntre com a primeira nota");
        nota1 = leia.nextDouble();
        System.out.println("\nEntre com a segunda nota");
        nota2 = leia.nextDouble();
        System.out.println("\nEntre com a terceira nota");
        nota3 = leia.nextDouble();
        
        media = (nota1+nota2+nota3)/3;
        
        System.out.println("\nMédia aritmética foi de:"+media);
        System.out.printf("\nMédia aritmética foi de:%.2f",media);
        nota1 = Math.sqrt(nota2);
        nota2 = Math.pow(nota3,3);
        x = idade % x;
        
	}

}
