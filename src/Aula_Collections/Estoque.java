package Aula_Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			
			System.out.println("\n");
			System.out.println("\n\tMenu do estoque");
			System.out.println("\n(1) Deseja adicionar produtos do estoque? ");
			System.out.println("\n(2) Deseja remover produtos do estoque? ");
			System.out.println("\n(3) Deseja atualizar os produtos do estoque? ");
			System.out.println("\n(4) Deseja mostrar os produtos do estoque? ");
			System.out.println("\n(0) Deseja encerrar o programa do estoque ");
			System.out.println("\nDigite a sua opção:");
			op = leia.nextInt();
			
			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque");
				String produto = leia.nextLine();
				break;
			
			case 2:
			     leia.nextLine();
			     System.out.println("\nDigite o produto para remover");
			     String produtor = leia.nextLine();
			     if(estoque.contains(produtor)) {
			    	 estoque.remove(produtor);
			    	 
			     }else {
			    	 System.out.println("\nEste produto não existe!!!");
			     }
			     System.out.println("\nProdutos do estoque");
			     System.out.println(estoque);
			     break;
			     
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que queira atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar");
				String novo = leia.nextLine();
				if(estoque.contains(verifica)) {
			    	 estoque.remove(verifica);
			    	 estoque.add(novo);
			    	 
			     }else {
			    	 System.out.println("\nEste produto não existe!!!");
			     }
				System.out.println("\nProdutos do estoque");
			     System.out.println(estoque);
			     break;
			     
			case 4:
				
				System.out.println("\nProdutos do estoque");
			     System.out.println(estoque);
			     break;
			     
			case 0: 
				System.out.println("\nMuito obrigado por utilizar do nosso Sistema!!!");
				
		    default:
		    	System.out.println("\nopção Invalida: ");
			}
		
			
		}while(op !=0);

	}

}
