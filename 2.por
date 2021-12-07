programa{

	funcao inicio (){

		inteiro diaA, mesA, anoA, dia, mes, ano, dias = 0
		cadeia nome

		diaA = 29
		mesA = 11
		anoA = 2021

		escreva("insira seu nome:")
		leia(nome)

		escreva("Olá  " + nome, "..." )

		escreva("\nDigite a sua data de nascimento EX: dd mm aaaa:")
		leia(dia, mes, ano)

		enquanto (ano < anoA ou mes < mesA ou dia < diaA  ) {
			dias++
			dia++
			se (dia > 30){
				dia = 1
				mes++
				se (mes > 12){
					ano++
					mes = 1 
					
				}
			}
		}
		escreva("Olá ", nome,"\nvocê viveu " ,dias, " dias na sua vida.")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */