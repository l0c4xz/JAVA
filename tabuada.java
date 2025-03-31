import java.util.Scanner;
public class tabuada {
    public static void main(String [] args) {
        int n;
        Scanner ler = new Scanner (System.in);
        
        System.out.println ("Digite um número para ver a tabuada ");
        n = ler.nextInt ();
        System.out.println (" o numero escolhido para a tabuada foi: " + n  );
        for (int i = 1; i <= 10 ; i++){
        int resultado = n * i;
        System.out.println (n + " x " + i + "=" + resultado);
    }
        
    }
}