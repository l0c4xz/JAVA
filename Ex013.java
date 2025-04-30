/******************************************************************************

Exercicio 013
Faça um Programa que leia três números e mostre o maior deles.

*******************************************************************************/
import java.util.Scanner;
public class Ex013
{

	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double n1, n2, n3;
		System.out.println("informe o primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("informe o segundo numero: ");
		n2 = ler.nextDouble();
		System.out.println ("informe o terceiro numero: ");
		n3 = ler.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
		    System.out.println("o primeiro numero é o maior ");
		} if (n2 > n1 && n2 > n3){
		    System.out.println("o segundo numero é o maior ");
		} if (n3 > n2 && n3 > n1) {
		    System.out.println("o terceiro numero é o maior ");
		}
		
	}
}
