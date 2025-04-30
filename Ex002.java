/******************************************************************************

Exercicio 002
Faça um Programa que peça dois números e imprima a soma.

*******************************************************************************/
import java.util.Scanner;
public class Ex002
{

	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int numero1, numero2, soma;
		System.out.println("informe o primeiro numero: ");
		 numero1 = ler.nextInt();
		System.out.println("Informe o segundo numero: ");
		numero2 = ler.nextInt();
		soma = numero1 + numero2;
		System.out.println("a soma dos dois numeros escolhidos é de: " + soma);
	}
}
