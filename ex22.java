import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando variáveis
        int totalIdade = 0;
        int totalIdadeMulheres = 0;
        int totalIdadeHomens = 0;
        int contMulheres = 0;
        int contHomens = 0;

        // Receber dados de 7 pessoas
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o sexo (M/F) da " + i + "ª pessoa: ");
            char sexo = scanner.next().charAt(0);

            // Soma a idade geral
            totalIdade += idade;

            // Soma as idades específicas por sexo
            if (sexo == 'F' || sexo == 'f') {
                totalIdadeMulheres += idade;
                contMulheres++;
            } else if (sexo == 'M' || sexo == 'm') {
                totalIdadeHomens += idade;
                contHomens++;
            }
        }

        // Cálculo das médias
        double mediaGeral = (double) totalIdade / 7;
        double mediaMulheres = (contMulheres > 0) ? (double) totalIdadeMulheres / contMulheres : 0;
        double mediaHomens = (contHomens > 0) ? (double) totalIdadeHomens / contHomens : 0;

        // Exibir os resultados
        System.out.println("\nMédia de idade do grupo: " + mediaGeral);
        System.out.println("Média de idade das mulheres: " + mediaMulheres);
        System.out.println("Média de idade dos homens: " + mediaHomens);

        scanner.close();
    }
}
