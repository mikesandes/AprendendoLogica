import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		
		int ev, h, m, s, r;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o tempo de dura��o em segundos: ");
		ev=entrada.nextInt();
		
		h=ev/3600;
		r=ev%3600;
		m=r/60;
		s=r%60;
		
		System.out.println("\nO tempo de dura��o � " + h + " horas," + m + " minutos e " + s + " segundos!");
		
		
		
		
		

	}

}
