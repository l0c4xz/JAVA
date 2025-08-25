package modificadore;

import java.util.Scanner;
public class ObjetoPessoaAutomovel {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);

        pessoa pessoa = new pessoa();

        String nome, cor;
        int velocidade;

        System.out.println("Insira o nome do carro: ");
        nome = ler.nextLine();
        System.out.println("Insira a cor do carro: ");
        cor = ler.nextLine();
        System.out.println("Insira a velocidade do carro: ");
        velocidade = ler.nextInt();

        pessoa.comprarcarro(cor, nome, velocidade);
        automovel carro = pessoa.getAutomovel();

        System.out.println("o carro comprado foi " + carro.getNome() + "da cor " + carro.getCor() + "que atinge a velocidade de " + carro.getVelocidade() );
        ler.close();
    }
}
