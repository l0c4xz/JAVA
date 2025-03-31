import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
        sc.close();
    }
}