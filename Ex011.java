/******************************************************************************

Exercicio 011
Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou 
negativo.

*******************************************************************************/
import java.util.Scanner;
public class Ex011
{

	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double n1, n2;
		System.out.println("informe o numero: ");
		n1 = ler.nextDouble();
		if (n1 > 0) {
		    System.out.println("O numero é positivo");
		} if (n1 == 0){
		    System.out.println("O numero é nulo");
		} if (n1 <0) {
		    System.out.println("o numero é negativo");
		}
		
	}
}
