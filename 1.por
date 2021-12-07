programa{

	funcao inicio (){

real sem1, sem2, sem3, sem4, Media
cadeia nome

escreva("Olá Alune! Digite seu nome para continuar:")
leia(nome)

escreva("Seja bem vinde!\n", nome, ", vamos calcular sua média?\n")

escreva("Semestre 1:")
leia(sem1)

escreva("Semestre 2:")
leia(sem2)

escreva("Semestre 3:")
leia(sem3)

escreva("Semestre 4:")
leia(sem4)

Media = (sem1+sem2+sem3+sem4) / 4


escreva("Sua média é de: " , Media , " no semestre\n") 
se (Media >= 5 )
escreva("Parabéns, você foi aprovado!!")
se ( Media <= 5)
escreva("Procure a instituição para recomeçar o ano perdido")
		
		 
}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 182; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */