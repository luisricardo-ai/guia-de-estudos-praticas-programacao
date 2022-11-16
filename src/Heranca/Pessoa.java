package Heranca;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nomeUsuario, int idadeUsuario) {
        this.nome = nomeUsuario;
        this.idade = idadeUsuario;
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
}
