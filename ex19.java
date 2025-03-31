import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da " + (i + 1) + "ª pessoa: ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine();  // Limpar o buffer
            
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }
        
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);
        sc.close();
    }
}