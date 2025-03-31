import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando variáveis para somar os pesos nas faixas etárias
        int totalPeso1_10 = 0, totalPeso11_20 = 0, totalPeso21_30 = 0, totalPesoAcima31 = 0;
        int cont1_10 = 0, cont11_20 = 0, cont21_30 = 0, contAcima31 = 0;

        // Receber dados de 15 pessoas
        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o peso da " + i + "ª pessoa: ");
            double peso = scanner.nextDouble();

            // Organizando pessoas nas faixas etárias e somando os pesos
            if (idade >= 1 && idade <= 10) {
                totalPeso1_10 += peso;
                cont1_10++;
            } else if (idade >= 11 && idade <= 20) {
                totalPeso11_20 += peso;
                cont11_20++;
            } else if (idade >= 21 && idade <= 30) {
                totalPeso21_30 += peso;
                cont21_30++;
            } else if (idade > 30) {
                totalPesoAcima31 += peso;
                contAcima31++;
            }
        }

        // Calcular as médias dos pesos por faixa etária
        double mediaPeso1_10 = (cont1_10 > 0) ? (double) totalPeso1_10 / cont1_10 : 0;
        double mediaPeso11_20 = (cont11_20 > 0) ? (double) totalPeso11_20 / cont11_20 : 0;
        double mediaPeso21_30 = (cont21_30 > 0) ? (double) totalPeso21_30 / cont21_30 : 0;
        double mediaPesoAcima31 = (contAcima31 > 0) ? (double) totalPesoAcima31 / contAcima31 : 0;

        // Exibir os resultados
        System.out.println("\nMédia do peso na faixa etária de 1 a 10 anos: " + mediaPeso1_10);
        System.out.println("Média do peso na faixa etária de 11 a 20 anos: " + mediaPeso11_20);
        System.out.println("Média do peso na faixa etária de 21 a 30 anos: " + mediaPeso21_30);
        System.out.println("Média do peso na faixa etária acima de 31 anos: " + mediaPesoAcima31);

        scanner.close();
    }
}
