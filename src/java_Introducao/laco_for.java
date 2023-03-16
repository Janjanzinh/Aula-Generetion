package java_Introducao;

import java.util.Scanner;

public class laco_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,media,somaMedia=0,mediaGeral=0;
        int x;
        String nome;
        
        for(x=1;x<=3;x++) { // x++ é a mesma coisa que x = x+1
        	System.out.println("Entre com o nome do aluno");
        	nome =  leia.nextLine();
        	leia.nextLine();
        	System.out.println("Entre com a primeiro nota");
        	n1 = leia.nextFloat();
        	System.out.println("Entre com a segunda nota");
        	n2 = leia.nextFloat();
        	System.out.println("Entre com a terceira nota");
        	n3 = leia.nextFloat();
        	media = (n1+n2+n3)/3;
        	somaMedia += media;
        	System.out.println("\nA media do aluno: "+nome+"\tfoi de:"+media);
	}
           System.out.println(mediaGeral);
        System.out.printf("A media geral da turma foi de: %.2f",mediaGeral);
  }
}
