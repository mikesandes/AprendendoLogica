import java.util.Scanner;

public class LacoDeRepeticao5 {
	
	public static void main(String[] args) {
        int x=0,number=0;
        do {
        	Scanner entrada = new Scanner(System.in);
        	System.out.println("Digite um numero:");
        	x=entrada.nextInt();
        	number=x+number;
        }while(x!=0);
        
        System.out.println("O total é de: "+number);
	}

}
