package LacosDeRepeticao;

public class DOO {
	
	import java.util.Scanner;



	    public static void main(String[] args) {
	        Scanner leia = new Scanner (System.in);
	        int soma=0,numero;
	        System.out.println("Digite um número: ");

	        do 
	            {
	            numero = leia.nextInt();
	                if (numero>0)
	                {
	                    soma = numero + soma;
	                }
	            }
	        while (numero!= 0);
	        System.out.println("\nA soma dos números digitados foi: "+soma);

	    }

	}
}
