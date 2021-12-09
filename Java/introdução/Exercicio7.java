import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		float a,b,c,d,i,f,x,y, rep;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Entre com os valores de A, B, C, D, E e F: ");
		a=entrada.nextFloat();
		b=entrada.nextFloat();
		a=entrada.nextFloat();
		c=entrada.nextFloat();
		d=entrada.nextFloat();
		i=entrada.nextFloat();
		f=entrada.nextFloat();
		x=entrada.nextFloat();
		y=entrada.nextFloat();
		
		x=(c*i-b*f)/(a*i-b*d);
		y=(a*f-c*d)/(a*i-b*d);
		
		System.out.println("\nOs Valores de X e Y são respectivamente: " +x+ " e " +y);
		
		
	
		
		
		
		

	}

}
