import java.util.Scanner;

class Exercicio1 {

	public static void main(String[] args) {
		
		int anos, meses, dias;
		int resp;
		
		Scanner entrada  = new Scanner(System.in);
		System.out.println("Quantos anos voc� tem: ");
		anos = entrada.nextInt();
		
		System.out.println("Quantos meses voc� tem: ");
		meses = entrada.nextInt();
		
		System.out.println("Quantos dias voc� tem: ");
		dias = entrada.nextInt();
		
		
		
		resp = anos*365+meses*30+dias;
		
		System.out.println("Idade em Dias " + resp);
		
		
		
		
		
				
		
		
		
		
		
	;
	}

}
