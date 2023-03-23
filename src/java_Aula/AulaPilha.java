package java_Aula;

import java.util.Iterator;
import java.util.Stack;

public class AulaPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("prato verde");
		pilha.push("prato vermelho");
		pilha.push("prato preto");
		pilha.push("prato preto");
		pilha.push("prato preto");
		
		System.out.println("\nElementos da pilha "+pilha);
		System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());
		System.out.println("\nElementos da pilha "+pilha);
		System.out.println("\nElemento no topo da pilha "+pilha.peek());
		System.out.println("\nAdicionar um elemento na pilha"+pilha.push(" prato roxo"));
		System.out.println("\nTamanho da pilha: "+pilha.size());
		System.out.println("\nVerificar um elemento na pilha "+pilha.contains ( " prato preto"));
		System.out.println("\nExibir todos os elementos da pilha ");
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		
			
		}
		

	}

}
