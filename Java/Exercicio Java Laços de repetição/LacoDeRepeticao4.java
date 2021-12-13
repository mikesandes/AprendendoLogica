import java.util.Scanner;

public class LacoDeRepeticao4 {

	public static void main(String[] args) {
		int idade = 0,calma=0,nervosa=0,agressivo=0,feminino=0,masculino=0,outros=0;
        int c=0,n=0,N=0,a=0,A=0,C=0,o=0,O=0,sexo=0,es=0,f=0,F=0,m=0,M=0;
        int nervosas40=0,calmas18=0,totalpessoas=0,homenagre=0,mulheragre=0,outroscalm=0;
        
        	Scanner entrada = new Scanner(System.in);
        	while(totalpessoas<3)	{		
        System.out.println("Digite a sua idade ");
        idade=entrada.nextInt();
        System.out.println("Digite o sexo (1)masculino/(2)feminino/(3)utros");
        sexo=entrada.nextInt();
        System.out.println("Digite se estado piscicologico (1)calma(o)/(2)nervosa(o)(3)agressivo(a)");
        es=entrada.nextInt();
        
        if(idade>0) {
        	totalpessoas=totalpessoas+1;
        }
        if(es==1 ) {
        	calma=calma+1;
        }
        if(es==2) {
        	nervosa=nervosa+1;
        }
         if(es==3) {
        	 agressivo=agressivo+1;
         }
        if(sexo==1) {
        	masculino=masculino+1;
        }
        if(sexo==2) {
        	feminino=feminino+1;
        }
        if(sexo==3) {
        	outros=outros+1;
        }
        if(idade>40 && es==2) {
        	nervosas40=nervosas40+1;
        }
        if(idade<18 && es==1) {
        	calmas18=calmas18+1;
        }if(sexo==1  && es==3) {
        	homenagre=homenagre+1;
        }if(sexo==2  && es==2) {
        	mulheragre=mulheragre+1;
        }if(sexo==325 && es==1) {
        	outroscalm=outroscalm+1;
        }
         
        
        System.out.println("O numeros de pessoas calmas "+calma);
        System.out.println("O numero de mulher nervosas "+mulheragre);
        System.out.println("O numero de homens  agressivos  "+agressivo);
        System.out.println("O numero de pessoas "+outroscalm);
        System.out.println("O numero de pessoas com mais de 40 nervosas sao "+nervosas40);
        System.out.println("O numero de pessoas calmas com menos de 18 sao "+calmas18);
	}

	}
	
}
