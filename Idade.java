/*******************************************************************************
 
Faça um algoritmo que receba a idade
do usuário e verifique se ele tem 18 anos ou mais. Se a resposta for positiva
escrever “maior de idade”, senão “menor de idade”.

*******************************************************************************/

import java.util.Scanner;
public class Idade {
    public static void main(String [] args) {
        double a;
        Scanner ler = new Scanner (System.in);
        
        System.out.println ("Informe sua idade: ");
        a = ler.nextDouble ();
        
        if (a>= 18)
        System.out.println ("maior de idade ");
        
        else 
        System.out.println ("menor de idade ");
        
    }
}