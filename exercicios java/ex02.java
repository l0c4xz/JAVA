import java.util.Scanner;
public class ex02 {
        public static void main (String[] args) {
            Scanner ler = new Scanner(System.in);
            int a, b, c;
            System.out.print("informe o primeiro numero:");
            a = ler.nextInt();
            System.out.print("informe o segundo numero:");
            b = ler.nextInt();
            System.out.print("informe o terceiro numero:");
            c = ler.nextInt();
            if (a > b && a > c) {
                System.out.println("o primeiro valor é o maior");
            } else if (b > a && b> c) {
                System.out.println("o segundo valor é o maior");
            } else if (c> a && c > b){
                System.out.println ("o terceiro valor é o maior");
            }else if (a == b && a==c){
                System.out.println("os valores sao iguais");
            }else{
                System.out.println("invalido");
            }

        }
    }


