/******************************************************************************

Exercicio 004
Faça um Programa que converta metros para centímetros.

*******************************************************************************/
import java.util.Scanner;
public class Ex004
{

	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double cen, met;
		System.out.println("informe o tamanho em metro: ");
		 met = ler.nextDouble();
		 cen = met * 100;
		
		System.out.println("o tamanho em centimetro é: " + cen);
	}
}
