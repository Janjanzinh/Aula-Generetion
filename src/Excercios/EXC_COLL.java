package Excercios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EXC_COLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		List<String> lista = new ArrayList<String>();

		for (int x = 0; x < 5; x++) {
			System.out.println("entre com as cores");
			String cor = leia.nextLine();
			lista.add(cor);

		}
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);

	}
     

}

     
    	 
     