
@@ -0,0 +1,46 @@
programa {
  função  inicio () {
    //Exercício 01
    número inteiro
    cadeia parOuImpar
    cadeia negativaOuPositivo

    escreva ( "Digite um numero: " )
    leia (número)

    se (número % 2 == 0 )
      parOuImpar = "par"
    senao
      parOuImpar = "impar"

    se (número < 0 )
      negativoOuPositivo = "negativo"
    senao
      negativoOuPositivo = "positivo"

    escreva ( "\nO Número " + numero + " é " + parOuImpar + " e " + negativoOuPositivo)

    //Exercício 03
    idade inteira

    cadeia votoFacutativo
    cadeia aptaAVotar = "está apta a votar"

    escreva ( "\nDigite a idade: " )
    leia (idade)

    se ((idade >= 16  e idade < 18 ) ou (idade >= 65 )) {
      votoFacutativo = "eo voto é facultativo"
    }
    senao  se (idade >= 18  e idade < 65 ) {
      votoFacutativo = "eo voto é obrigatório"
    }
    senao {
      aptaAVotar = "não está apto a votar"
      votoFacutativo = ""
    }

    escreva ( "\nA pessoa" + aptaAVotar + votoFacutativo + "." )

  }
