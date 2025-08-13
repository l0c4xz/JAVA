import java.util.Scanner;
public class ObjetoAnimal {
    public static void main(String[]arg){
        Scanner ler = new Scanner (System.in);
        String nome, especie;
        int idade;
        double peso;

        System.out.println("informe o nome do animal: ");
        nome = ler.nextLine();
        System.out.println("informe a idade do animal: ");
        idade = ler.nextInt();
        ler.nextLine();
        System.out.println("informe a especie do animal: ");
        especie = ler.nextLine();
        System.out.println ("informe o peso do animal: ");
        peso = ler.nextDouble();

        Animal animal = new Animal();
        animal.setNome(nome);
        animal.setIdade(idade);
        animal.setEspecie(especie);
        animal.setPeso(peso);

        System.out.println("animal cadastrado com sucesso");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Idade: " + animal.getIdade());
        System.out.println("Especie: " + animal.getEspecie());
        System.out.println("Peso: " + animal.getPeso());

    }
}
