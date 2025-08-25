package modificadore;

public class pessoa{
    private String nome;
    private int idade;
    private String profissao;
    private automovel automovel;

    public void comprarcarro (String cor, String nome, int velocidade) {
        automovel = new automovel();
        automovel.setCor(cor);
        automovel.setNome(nome);
        automovel.setVelocidade(velocidade);

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(automovel automovel) {
        this.automovel = automovel;
    }
}