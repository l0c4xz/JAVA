/******************************************************************************

Exercicio 005
Faça um Programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês

*******************************************************************************/
import java.util.Scanner;
public class Ex005
{

	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double D, H, total;
		System.out.println("informe quanto você ganha por hora: ");
		 D = ler.nextDouble();
		 System.out.println("Informe quantas horas trabalha por mês: ");
		 H = ler.nextDouble();
		 total = D * H;
		
		System.out.println(" seu salario no mês é de: " + total);
	}
}
