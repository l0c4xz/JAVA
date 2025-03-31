import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaIdades = 0;
        int maioresDeIdade = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
            int idade = sc.nextInt();
            somaIdades += idade;
            if (idade >= 18) {
                maioresDeIdade++;
            }
        }
        
        double mediaIdades = somaIdades / 20.0;
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Pessoas maiores de idade: " + maioresDeIdade);
        
        sc.close();
    }
}