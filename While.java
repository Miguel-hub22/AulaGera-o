package LacosDeRepeticao;


	import java.util.Scanner;

	public class Exercicio2ForeWhile {
	/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre 
	 *na tela quantos números são pares e quantos número são ímpares. Veja o exemplo abaixo:
	 * 
	 */

	    // Exercicio 2 usando For
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);

	        int num,somaPar=0,somaImpar=0,x;


	        for (x=1;x<=10;x++)
	        {
	            System.out.println("\nEntre com um número: ");
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
	            System.out.printf("\nTemos: "+somaPar+" números pares...");
	            System.out.printf ("\nTemos: "+somaImpar+" números ímpares...");
	        }
	}
}
