programa
{
	
	funcao inicio()
	{

	inteiro base, altura, Resultado
		escreva("Digite a base do triangulo:")
		leia(base)

		escreva("Digite a altura do triangulo:")
		leia(altura)

		Resultado = (base*altura) / 2

		se(Resultado <= 0){
			escreva("O Valor informado é inválido.\n")
			
		}

		se(Resultado >= 0){

		escreva("A area de seu triangulo é: " , Resultado)

		}


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */