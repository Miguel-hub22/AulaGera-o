programa {

  funcao inicio() {
//ExercÃ­cio 1

    inteiro numero
    inteiro contador = 1

    escreva("Digite um número (1 - 10): ")
    leia(numero)

    faca{
      escreva("\n", numero, " x ", contador, " = ", numero * contador)
      contador++
    }enquanto(contador <= 10)

//Exercicio 2

    inteiro firstNumber
    inteiro secoundNumber

    para(inteiro x = 0; x < 4; x++){
      inteiro eCrescente = 1
      escreva("\nDigite o primeiro número do intervalo: ")
      leia(firstNumber)
      escreva("\nDigite o segundo número do intervalo: ")
      leia(secoundNumber)

      se(firstNumber < secoundNumber e firstNumber % 3 == 0)
        escreva("\n",firstNumber, " é múltiplo de 5 e 3")
      senao se(firstNumber < secoundNumber e firstNumber % 3 != 0)
        escreva("\n",firstNumber, " não é múltiplo de 5 e 3")
      senao
        escreva("Intervalo inválido!")

      se(firstNumber < secoundNumber e secoundNumber % 3 == 0)
        escreva("\n", secoundNumber, " é múltiplo de 5 e 3")
      senao se(firstNumber < secoundNumber e secoundNumber % 3 != 0)
        escreva("\n", secoundNumber, " não é múltiplo de 5 e 3")
    }
    }
    }
