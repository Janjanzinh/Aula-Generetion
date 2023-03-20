package java_Aula;

import java.util.Scanner;

public class array_vetor_aula_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
        float [] media = new float[3];
        float n1,n2,n3,somaMedia=0,mediaGeral=0;
        int x;
        
        for(x=0;x<=3;x++) {
        	System.out.println("\nEntre com a Primeira nota:");
        	n1 = leia.nextFloat();
        	System.out.println("nEntre com a Segunda nota:");
        	n2 = leia.nextFloat();
        	System.out.println("nEntre com a Terceira nota:");
        	n3 = leia.nextFloat();
        	
        	media [x] = (n1+n2+n3)/3;
        	System.out.println("\nSua média foi de:"+media[x]);
        	somaMedia += media[x];
        	
        	if(media[x]>=7 && media [x]==10) {
        	System.out.println("\nAluno aprovado");
        	
        	}else if(media[x]>=5 && media[x]<7); {
        		System.out.println("\nAluno em recuperação");
        		
        	} 
        		System.out.println("\nAluno reprovado");
        	}
        	
            		
        
        }
	}

        	
        
        
        
        
	


