package ClassesAtributosMetodos;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    // MÉTODO CONSTRUTOR
    public Pessoa( String usuario_nome, int usuario_idade, String usuario_cpf) {
        this.nome = usuario_nome;
        this.idade = usuario_idade;
        this.cpf = usuario_cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }
}