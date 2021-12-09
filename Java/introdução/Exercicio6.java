import java.util.Scanner;
import java.math.*;

public class Exercicio6 {

	public static void main(String[] args) {
		
		float x1, x2, y1, y2;
		double d;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com as coordanadas do ponto de partida: ");
		x1=entrada.nextFloat();
		y1=entrada.nextFloat();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Entre com as Coordenadas do destino: ");
		x2=entrada2.nextFloat();
		y2=entrada2.nextFloat();
		
		d=Math.pow(y2, 2)-(x2)+Math.pow(x1, 2)-(y1);
		
		
		System.out.println("A distancia entre os dois pontos é: " + d + " Metros.");
		
		
		
		

	}

}
