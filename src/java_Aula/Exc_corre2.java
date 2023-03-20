package java_Aula;

import java.util.Scanner;

public class Exc_corre2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] dado = new int [10];
		int  quantMaior=0, soma_L=0, x;
        float media_L;
        
        Scanner leia = new Scanner(System.in);
        
        
        
        for(x=0; x<10;x++) {
        	dado [x] = leia.nextInt();
        	while (dado[x]<1 || dado[x]>6) {
        		
        	}
        	System.out.println("\nDigite o valor do lancamento");
          	soma_L  += dado [x];
        	
        	
        	}
            if(dado[x] == 6) {
            	quantMaior++;	
        }
    		
	}
       
}
