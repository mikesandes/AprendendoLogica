import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		float n1, n2, n3, m;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com as médias: ");
		n1=entrada.nextFloat();
		n2=entrada.nextFloat();
		n3=entrada.nextFloat();
		
		n1=n1*2;
		n2=n2*3;
		n3=n3*5;
		
		m= (n1+n2+n3)/10;
		
		System.out.println("A média ponderada é: " + m);
				
		
		
		

	}

}
