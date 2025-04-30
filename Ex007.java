/******************************************************************************

Exercicio 007
Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

*******************************************************************************/
import java.util.Scanner;
public class Ex007
{

	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double H, P;
		System.out.println("informe sua altura (M): ");
		 H = ler.nextDouble();
		 P = (72.7*H) - 58;
		
		System.out.println("seu peso ideal é: " + P);
	}
}
