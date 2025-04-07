import java.util.Scanner;
public class ex26
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    int numero = 0;
	    int n;
	    System.out.println("escolha um numero");
	    n = scanner.nextInt();
	    
	    while (numero <= n) {
	        System.out.println(numero);
	          numero ++;
	    }
	}
}
