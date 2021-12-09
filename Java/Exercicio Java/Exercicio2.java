import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int n1,n2,n3, t;

		Scanner leia = new Scanner(System.in);
		System.out.println("Indique o valor 1: ");
		n1=leia.nextInt();
		
		System.out.println("Indique o valor 2: ");
		n2=leia.nextInt();
		
		System.out.println("Indique o valor 3: ");
		n3=leia.nextInt();
		
		do {
			
			if (n1 > n3) {
				t = n1;
				n1 = n3;
				n3 = t;
				}
			
			if (n1 > n2) {
				t = n1;
				n1 = n2;
				n2 = t;
				}
			
			if (n2 > n3) {
				t = n2;
				n2 = n3;
				n3 = t;
				
				} 
				
		} while(n1 > n3 && n1 > 2 && n2 > n3 );
		
		System.out.println("A ordem dos numeros informados são: " + "\t" +n1 +"\t" +  n2 + "\t" + n3);
	
	}
	
	


}
