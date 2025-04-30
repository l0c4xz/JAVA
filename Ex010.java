/******************************************************************************

Exercicio 010
Faça um Programa que peça dois números e imprima o maior deles.

*******************************************************************************/
import java.util.Scanner;
public class Ex010
{

	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double n1, n2;
		System.out.println("informe o primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("informe o segundo numero: ");
		n2 = ler.nextDouble();
		if (n1 > n2) {
		    System.out.println("O " + n1 + " é maior");
		} else {
		    System.out.println("O " + n2 + " é o maior");
		}
		
	}
}
