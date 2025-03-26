/*******************************************************************************
 
A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
bônus recebido por ele.

*******************************************************************************/

import java.util.Scanner;
public class Ex04{
    public static void main(String [] args) {
        double sal, temp, bonus1, bonus2;
        Scanner ler = new Scanner (System.in);
        
        System.out.println ("Informe seu salario: ");
        sal = ler.nextDouble ();
        
        System.out.println ("Informe quanto tempo voce trabalha na empresa: ");
        temp = ler.nextDouble ();
        bonus1 = sal * 1.10;
        bonus2 = sal * 1.20;
        
        if (temp >= 5) 
        System.out.println ("seu salario subiu para: " + bonus2);
         else
        System.out.println ("seu salario subiu para : " + bonus1);

        
    }
}