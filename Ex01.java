/*******************************************************************************
 
Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.

*******************************************************************************/

import java.util.Scanner;
public class Ex01 {
    public static void main(String [] args) {
        double a, b, med;
        Scanner ler = new Scanner (System.in);
        
        System.out.println ("Informe a nota da primeira prova (0-10) ");
        a = ler.nextDouble ();
        
        System.out.println ("Informe a nota da segunda prova (0-10) ");
        b = ler.nextDouble ();
        
        med = (a + b) / 2;
        
        System.out.println (" Sua media é de: " + med);
        
    }
}