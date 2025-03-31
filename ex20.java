import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int entre0e100 = 0, entre101e200 = 0, maioresDe200 = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = sc.nextInt();
            
            if (numero >= 0 && numero <= 100) {
                entre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                entre101e200++;
            } else if (numero > 200) {
                maioresDe200++;
            }
        }
        
        System.out.println("Números entre 0 e 100: " + entre0e100);
        System.out.println("Números entre 101 e 200: " + entre101e200);
        System.out.println("Números maiores que 200: " + maioresDe200);
        
        sc.close();
    }
}