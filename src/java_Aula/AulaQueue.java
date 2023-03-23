package java_Aula;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class AulaQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> fila = new LinkedList<Integer>();

		for (int x = 0; x <= 10; x++) {
			fila.add(x);

		}
		System.out.println("\nElementos da fila" + fila);
		System.out.println("\nRemovendo um elemento da fila " + fila.remove());
		System.out.println("\nElementos da fila " + fila);
		System.out.println("\nAdicionando um elemento na fila " + fila.add(11));
		System.out.println("\nElementos da fila " + fila);
		System.out.println("\nPegar o primeiro elemento da fila" + fila.peek());
		System.out.println("\nPegar o tamanho da fila" + fila.size());
		System.out.println("\nChecar se o Elemento 4 existe na fila? " + fila.contains(35));
		System.out.println("\nExisbir e retirar o primeiro elemento da fila " + fila.poll());
		System.out.println("\nElementos da fila" + fila);

		Iterator<Integer> iterator = fila.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.hasNext());
			break;
		}
		System.out.println("\nLimpar a fila");
		fila.clear();
		System.out.println("fila vazia?" + fila.isEmpty());

	}

}
