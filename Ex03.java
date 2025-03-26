/*******************************************************************************
 
Faça um algoritmo que receba três
números inteiros e mostre o maior deles. Considere que os números sempre serão
diferentes.

*******************************************************************************/

import java.util.Scanner;
public class Ex03 {
    public static void main(String [] args) {
        double a, b, c;
        Scanner ler = new Scanner (System.in);
        
        System.out.println ("Informe o primeiro número: ");
        a = ler.nextDouble ();
        
        System.out.println ("Informe o segundo número: ");
        b = ler.nextDouble ();
        
        System.out.println ("Informe o terceiro número: ");
        c = ler.nextDouble ();
        
        if (a> b & c < a) 
        System.out.println ("O maior número é: " + a);
         else if  (b > a & c < b)
        System.out.println ("O maior número é: " + b);
         else if  (c > a & b < c)
        System.out.println ("O maior número é: " + c);
        
    }
}