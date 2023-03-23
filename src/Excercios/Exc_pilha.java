package Excercios;

import java.util.Scanner;
import java.util.Stack;

public class Exc_pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> pilha = new Stack();
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*******************************************************");
			System.out.println("           1- Adicionar o livro na pilha               ");
			System.out.println("           2- Listar todos os produtos na pilha        ");
			System.out.println("           3- Retirar um livro da pilha                ");
			System.out.println("           0- Programa finalizado...                   ");
			System.out.println("*******************************************************");

			opcao = leia.nextInt();
			if (opcao == 0) {
				System.out.println("Programa finalizado. ");
				leia.close();
				System.exit(0);

			}

			switch (opcao) {

			case 1:
				System.out.println("Adicionar o livro na pilha: ");
			    leia.nextLine();
			    String nome = leia.nextLine();
			    pilha.push(nome);
				break;
			case 2:
				System.out.println("Lista dos Livros"+pilha);
				break;
			case 3:
				if(pilha.isEmpty()) {
					System.out.println("Pilha vazia");
				}else {
					System.out.println("Retirar"+pilha.peek()+ " livro da pilha: "+pilha);
					pilha.pop();
				}				
				break;

			case 0:
				System.out.println("Programa finalizado.");
				System.exit(0);
				break;
								
			default:
				System.out.println("Opção Invalida...");
			}
			
		}

	}
}