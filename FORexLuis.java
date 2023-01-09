package LacosDeRepeticao;

public class FORexLuis 
	

	import java.util.Scanner;{
{

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			float n1,n2,n3,media,somaMedia=0,mediaGeral;
			int x;
			
			for(x=1;x<=4;x++) {
				System.out.println("\nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
				System.out.println("\nEntre com a segunda nota: ");
				n2 = leia.nextFloat();
				System.out.println("\nEntre com a terceira nota: ");
				n3 = leia.nextFloat();
				
				media = (n1+n2+n3)/3;
				System.out.printf("\nMédia: %3.2f",media);
				somaMedia += media; // somaMedia = somaMedia + media
			}
			mediaGeral = somaMedia / 4;
			System.out.println("\nMédia Geral: "+mediaGeral);

		}

	}
}




\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


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
