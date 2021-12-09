import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		float cf, dist, imp, cc;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva o valore de fábrica do veículo ");
		cf=entrada.nextFloat();
		
		dist=(float) (cf*0.28);
		imp=(float) (cf*0.45);
		cc=cf+dist+imp;
		
		System.out.println("\nO Valor de venda do veículo é: " + cc);
		
	}

}
