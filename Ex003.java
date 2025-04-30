/******************************************************************************

Exercicio 003
Faça um Programa que peça as 4 notas bimestrais e mostre a média.

*******************************************************************************/
import java.util.Scanner;
public class Ex003
{

	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int nota1, nota2, nota3, nota4;
	    double media;
		System.out.println("informe sua primeira nota: ");
		 nota1 = ler.nextInt();
		System.out.println("informe sua segunda nota: ");
		nota2 = ler.nextInt();
		System.out.println("informe sua terceira nota: ");
		nota3 = ler.nextInt();
		System.out.println("informe sua quarta nota: ");
		nota4 = ler.nextInt();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Sua media é: " + media);
	}
}
