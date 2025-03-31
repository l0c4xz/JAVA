/*******************************************************************************
 
Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.

*******************************************************************************/

import java.util.Scanner;
public class Repeticao01 {
    public static void main(String [] args) {
        int n;
        Scanner ler = new Scanner (System.in);
        
        System.out.println ("Digite um número maior que 0 ");
        n = ler.nextInt ();
        
        for (int i=0; i <= n ; i++)
        System.out.println ("Número "+ i);
        
        
    }
}