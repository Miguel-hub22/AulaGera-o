package LacosDeRepeticao;

public class ForDooWhile {

		import java.util.Scanner;



		    public static void main(String[] args) {
		        Scanner leia = new Scanner (System.in);
		        int soma=0,numero;
		        System.out.println("Digite um n�mero: ");

		        do 
		            {
		            numero = leia.nextInt();
		                if (numero>0)
		                {
		                    soma = numero + soma;
		                }
		            }
		        while (numero!= 0);
		        System.out.println("\nA soma dos n�meros digitados foi: "+soma);

		    

		}
		   /////////////////////////////////////////////////////////////////////////////////////////////////////
		    
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
						System.out.printf("\nM�dia: %3.2f",media);
						somaMedia += media; // somaMedia = somaMedia + media
					}
					mediaGeral = somaMedia / 4;
					System.out.println("\nM�dia Geral: "+mediaGeral);

				}

			}
		}

		    
		    
		    ////////////////////////////////////////////////////////////////////////////////////////////////////////
			

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



