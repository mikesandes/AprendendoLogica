import java.util.Scanner;
public class Exercicio3 {
		
		public static void main(String[] args){
			
			int idade;
			
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite sua idade para ver sua categoria: ");
			idade=leia.nextInt();
			
			
			do {
				
				if (idade<10) {
					System.out.println("Voc� n�o est� em nenhuma categoria!");
					
				}
				
				if (idade>=10) {
					System.out.println("Voc� est� na categoria infantil");
					
			}
				if (idade<=14) {
					System.out.println("Voc� est� na categoria infantil ");
				}
				if (idade>=15) {
					System.out.println("Voc� est� na categoria Juvenil");
				
				}
				
				if (idade<=17) {
					System.out.println("Voc� est� na categoria Juvenil");
			
		        }
				
				if (idade>=18) {
					System.out.println("Voc� est� na categoria Adulto");
				}
				
				if (idade<=25) {
					System.out.println("Voc� est� na categoria adulto");
				} while (idade>26); {
					System.out.println("Voc� n�o pode participar");
					
				} while (idade>26); {
					System.out.println("Voc� n�o pode participar");
				}
			} while(idade>26);
		}
		
}

			
		
					
				
				
					
