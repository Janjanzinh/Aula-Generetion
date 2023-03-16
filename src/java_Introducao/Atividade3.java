package java_Introducao;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		double  bruto, adicional,extra,descontos,liquido;
		
		System.out.println("nSalario bruto");
        bruto = leia.nextDouble();
        System.out.println("\nAdicional noturno");
		adicional = leia.nextDouble();
		System.out.println("\nHoras extra");
		extra = leia.nextDouble();
		System.out.println("\nValor de Desconto");
		descontos = leia.nextDouble();
		
		
		liquido = (bruto+adicional+extra-descontos);
		
		System.out.println("\nSalario liquido"+liquido);

	}

}
