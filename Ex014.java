/******************************************************************************

Exercicio 014
As Organizações Tabajara resolveram dar um aumento de salário aos seus
colaboradores e lhe contrataram para desenvolver o programa que calculará
os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o 
seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante :
aumento de 5% Após o aumento ser realizado,
informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
*******************************************************************************/
import java.util.Scanner;
public class Ex014
{

	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double salario, aumento, valor_aumento;
		System.out.println("informe seu salario: ");
		salario = ler.nextDouble();
		if (salario <= 280) {
		    aumento = salario *1.20;
		    valor_aumento = aumento - salario;
		    System.out.println("seu salario antes do reajuste: R$" + salario);
		    System.out.println("o porcentual aplicado no aumento foi de 20%");
		    System.out.println("o valor do aumento foi de: R$" + valor_aumento);
		    System.out.println("seu novo salario é: R$" + aumento);
		} if (salario >280 && salario <= 700) {
		    aumento = salario *1.15;
		    valor_aumento = aumento - salario;
		    System.out.println("seu salario antes do reajuste: R$" + salario);
		    System.out.println("o porcentual aplicado no aumento foi de 15%");
		    System.out.println("o valor do aumento foi de: R$" + valor_aumento);
		    System.out.println("seu novo salario é: R$" + aumento);
		} if (salario > 700 && salario <= 1500) {
		    aumento = salario *1.10;
		    valor_aumento = aumento - salario;
		    System.out.println("seu salario antes do reajuste: R$" + salario);
		    System.out.println("o porcentual aplicado no aumento foi de 10%");
		    System.out.println("o valor do aumento foi de: R$" + valor_aumento);
		    System.out.println("seu novo salario é: R$" + aumento);
		
	}if (salario > 1500) {
		    aumento = salario *1.05;
		    valor_aumento = aumento - salario;
		    System.out.println("seu salario antes do reajuste: R$" + salario);
		    System.out.println("o porcentual aplicado no aumento foi de 5%");
		    System.out.println("o valor do aumento foi de: R$" + valor_aumento);
		    System.out.println("seu novo salario é: R$" + aumento);
		
	}
}
}