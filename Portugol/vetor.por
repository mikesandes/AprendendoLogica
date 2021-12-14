programa
{
	
	funcao inicio()
	{
		inteiro n[5],x=0, maior=0
		
		para(x=0;x<5;x++)
		{ escreva("Digite um valor: ")
			leia(n[x])	}
           
            para(x=0;x<5;x++)
		{ escreva("\t", n[x])}  
	    
	     para(x=0;x<5;x++)
                   se(n[x]>maior)
	      
	      {   maior=n[x]}
  escreva("\nO maior valor digitado foi: ",maior)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */