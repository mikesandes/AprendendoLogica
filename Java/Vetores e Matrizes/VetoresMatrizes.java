package VetoresMatriz;

import java.util.Scanner;

public class VetoresMatrizes {

	public static void main(String[] args) {
		
		int vetor[],maior=0,insert;
		vetor=new int [5];
		
		try (Scanner entrada = new Scanner(System.in)) {
			for (insert=0;insert<5;insert++) {
				System.out.println("Digite um numero:");
				vetor [insert] = entrada.nextInt();
			}
		}
		
		for (insert=0;insert<5;insert++) {
			if (vetor[insert]>maior) {
				maior=vetor[insert];
			}
		}
		
		System.out.println("O maior número é: " + maior);
		
	}

}
