package LacosDeRepeticao;


	import java.util.Scanner;

	public class Exercicio2ForeWhile {
	/*Escreva um algoritmo em Java, que leia 10 n�meros inteiros via teclado e mostre 
	 *na tela quantos n�meros s�o pares e quantos n�mero s�o �mpares. Veja o exemplo abaixo:
	 * 
	 */

	    // Exercicio 2 usando For
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);

	        int num,somaPar=0,somaImpar=0,x;


	        for (x=1;x<=10;x++)
	        {
	            System.out.println("\nEntre com um n�mero: ");
	            num = leia.nextInt();
	            if (num % 2 == 0)
	            {
	                somaPar++; // somaPar = somaPar + 1
	            }
	            else

	                {
	                    somaImpar++;
	                }

	            }
	            System.out.printf("\nTemos: "+somaPar+" n�meros pares...");
	            System.out.printf ("\nTemos: "+somaImpar+" n�meros �mpares...");
	        }
	}
}
