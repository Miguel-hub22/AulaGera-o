programa
{
	
	inclua biblioteca Matematica
-->mat
	
	funcao inicio()
	{
		
real n1,n2,n3,ma,somaMedia=0.0,mediaGeral
		inteiro x

		para(x=1;x<=4;x++) //x++ é a mesma coisa que x = x + 1
		{
			escreva("\nEntre com a primeira nota: ")
			leia(n1)
			escreva("\nEntre com a segunda nota: ")
			leia(n2)
			escreva("\nEntre com a terceira nota: ")
			leia(n3)
			ma = (n1+n2+n3) / 3 // 7.5 6.5 5
			escreva("\nMédia aritmética do alune ",x," : ",mat.arredondar(ma,2))
			somaMedia = somaMedia + ma
		}
		mediaGeral = somaMedia / 4
		escreva("\nMédia geral da turma foi de: ",mat.arredondar(mediaGeral,2))
	}



///

{
	
	funcao inicio()
	{
		inteiro codigo,quantidade
		real valor_total

		escreva("\n\t\t Menu de lanches")
		escreva("\n 1 - Cachorro Quente - R$10,00")
		escreva("\n 2 - X-Salada - R$15,00")
		escreva("\n 3 - X-Bacon - R$18,00")
		escreva("\n 4 - Bauru - R$12,00")
		escreva("\n 5 - Refrigerante - R$8,00")
		escreva("\n 6 - Suco de Laranja - R$13,00")
		escreva("\nDigite o código da sua compra: ")
		leia(codigo)
		escreva("\nDigite a quantidade desse produto: ")
		leia(quantidade)
		escolha(codigo)
		{
			caso 1:
			valor_total = quantidade * 10.00
			escreva("\nVocê comprou ",quantidade," Cachorro Quente e vai pagar R$ ",valor_total)
			pare
			caso 2:
			valor_total = quantidade * 15.00
			escreva("\nVocê comprou X-Salada e vai pagar R$ ",valor_total)
			pare
			caso 3:
			valor_total = quantidade * 18.00
			escreva("\nVocê comprou X-Bacon e vai pagar R$ ",valor_total)
			pare
			caso 4:
			valor_total = quantidade * 12.00
			escreva("\nVocê comprou Bauru e vai pagar R$ ",valor_total)
			pare
			caso 5:
			valor_total = quantidade * 8.00
			escreva("\nVocê comprou Refrigerante e vai pagar R$ ",valor_total)
			pare
			caso 6:
			valor_total = quantidade * 13.00
			escreva("\nVocê comprou Suco de Laranja e vai pagarR$ ",valor_total)
			pare
			caso contrario:
			escreva("\nCódigo inválido!!!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 613; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */