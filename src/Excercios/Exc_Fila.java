package Excercios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exc_Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		while (true) {
			System.out.println("********************************************************************");
			System.out.println("            1- Adicionar o cliente na fila                          ");
			System.out.println("            2- listar todos os clientes                             ");
			System.out.println("            3- chamar retirar uma pessoa da fila                    ");
			System.out.println("            0- Programa finalizado.                                 ");
			System.out.println("********************************************************************");

			opcao = leia.nextInt();
			if (opcao == 0) {
				System.out.println("Programa finalizado. ");
				leia.close();
				System.exit(0);

			}
			switch (opcao) {

			case 1:
				System.out.println("Adicionar o cliente na fila ");
				leia.nextLine();
				String nome = leia.nextLine();
				fila.add(nome);
				break;
			case 2:
				System.out.println("Listar todos os clientes " +fila+fila.size());
				;
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("Fila vazia");
				} else {
					System.out.println("Cliente " + fila.peek() + " se dirigir ao caixa");
					fila.remove();
				}

				break;
			case 0:
				System.out.println("Programa finalizado");
				break;
				
			default:
				System.out.println("Opção Invalida...");
			}
		}
	}

}
