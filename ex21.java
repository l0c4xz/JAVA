import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int acima50eMenos60 = 0;
        int pessoasComAlturaMenorQue150 = 0;
        double somaIdadesAlturaMenor150 = 0;
        int totalPessoasAlturaMenor150 = 0;
        int totalOlhosAzuis = 0;
        int totalPessoasRuivasSemOlhosAzuis = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
            int idade = sc.nextInt();
            
            System.out.print("Digite o peso da " + (i + 1) + "ª pessoa: ");
            double peso = sc.nextDouble();
            
            System.out.print("Digite a altura da " + (i + 1) + "ª pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();  // Limpar o buffer
            
            System.out.print("Digite a cor dos olhos (A - Azul, P - Preto, V - Verde, C - Castanho): ");
            char corOlhos = sc.nextLine().charAt(0);
            
            System.out.print("Digite a cor dos cabelos (P - Preto, C - Castanho, L - Louro, R - Ruivo): ");
            char corCabelos = sc.nextLine().charAt(0);
            
            // Condições para calcular os dados solicitados
            if (idade > 50 && peso < 60) {
                acima50eMenos60++;
            }
            
            if (altura < 1.50) {
                somaIdadesAlturaMenor150 += idade;
                totalPessoasAlturaMenor150++;
            }
            
            if (corOlhos == 'A') {
                totalOlhosAzuis++;
            }
            
            if (corCabelos == 'R' && corOlhos != 'A') {
                totalPessoasRuivasSemOlhosAzuis++;
            }
        }
        
        double mediaIdadesAlturaMenor150 = (totalPessoasAlturaMenor150 > 0) ? somaIdadesAlturaMenor150 / totalPessoasAlturaMenor150 : 0;
        double porcentagemOlhosAzuis = (totalOlhosAzuis / 20.0) * 100;
        
        System.out.println("Pessoas com idade superior a 50 anos e peso inferior a 60kg: " + acima50eMenos60);
        System.out.println("Média das idades das pessoas com altura inferior a 1,50m: " + mediaIdadesAlturaMenor150);
        System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemOlhosAzuis + "%");
        System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + totalPessoasRuivasSemOlhosAzuis);
        
        sc.close();
    }
}