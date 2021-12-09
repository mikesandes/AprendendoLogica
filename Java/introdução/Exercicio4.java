import java.util.Scanner;
import java.math.*;
public class Exercicio4 {

	public static void main(String[] args) {
		
		float a, b, c, r, s, d;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor para A:");
		a=entrada.nextFloat();
		
		System.out.println("Digite o valor para B:");
		b=entrada.nextFloat();
		
		System.out.println("Digite o valor para C:");
		c=entrada.nextFloat();
		
		r=Math.getExponent(a+b);
		s=Math.getExponent(b+c);
		d=(r+s)/2;
		
		System.out.println("\nO resultado é: " + d);
		
		
		
		
		
		
		

		
	}

}
