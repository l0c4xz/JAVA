import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            int numero = sc.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos números é: " + soma);
        sc.close();
    }
}