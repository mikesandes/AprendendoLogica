import java.util.Scanner;

public class LacoDeRepeticao3 {

	public static void main(String[] args) {
		
		int i=0,ia=0,ib=0;
	      Scanner entrada = new Scanner(System.in);
	      
	      
	      
	      while(i!=99) {
	      System.out.println("Digite sua idade ");
		  i=entrada.nextInt();
	      
	      
	    	 if(i<21) 
	    	 {ia=ia+1;}
	    	 if(i>50){
	    		 ib=ib+1;
	    	 }
	    	    
	    	  
	    		 System.out.println("Pessoas com 21 anos s�o: "+ia );
	    		 System.out.println("Pessoas com mais de 50 s�o: "+ib );
	    	 }
	    	    
	      System.out.println("Voce precisa digitar idade menor que 99 ");
		}

	}


