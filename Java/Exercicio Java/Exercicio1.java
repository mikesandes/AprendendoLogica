import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int n1,n2,n3;

		Scanner leia = new Scanner(System.in);
		System.out.println("Indique o valor 1: ");
		n1=leia.nextInt();
		
		System.out.println("Indique o valor 2: ");
		n2=leia.nextInt();
		
		System.out.println("Indique o valor 3: ");
		n3=leia.nextInt();
		
		if(n1<n2) {
			System.out.println("O maior numero é: " + n2 ); 
		}
		
		if(n1>n2) {
			System.out.println("O maior numero é: " + n1 );
		}
		
		if(n1<n3) {
			System.out.println("O maior numero é: " + n3 ); 
		}
		
		
		
		
	}

}
