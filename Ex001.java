/******************************************************************************

Exercicio 001
Faça um Programa que peça um número e então mostre a mensagem O número informado
foi [número].

*******************************************************************************/
import java.util.Scanner;
public class Main
{

	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
		System.out.println("informe algum numero: ");
		int numero = ler.nextInt();
		System.out.println("O numero informado foi: " + numero);
	}
}
