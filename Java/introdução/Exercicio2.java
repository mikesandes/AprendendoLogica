import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int anos, meses, dias, resp, sobra;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva sua idade em dias: ");
		resp = entrada.nextInt();
		
		
		
		anos=resp/365;
		sobra=resp%365;
		meses=sobra/30;
		dias=sobra%30;
		
	System.out.println("Sua idade é: "+ anos+ " anos," +meses+ " meses," + dias+ " dias.");
	
	
	
	
				

	}

}
