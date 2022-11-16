package SobrecargaDeMetodos;
public class Pessoa {
    private String nome;
    private int idade;
    private String estadoCivil;

    public Pessoa() {
        this.nome = null;
        this.idade = 0;
        this.estadoCivil = null;
    }

    // MÉTODO CONTRUTOR QUE ESPERA ALGUNS PARAMETROS DO USUÁRIO APENAS, E DEFINE UM ATRIBUTO COM UM VALOR DEFAULT
    public Pessoa(String nomeUsuario, int idadeUsuario) {
        this.nome = nomeUsuario;
        this.idade = idadeUsuario;
        this.estadoCivil = "Solteiro(a)";
    }

    // MÉTODO CONSTRUTOR QUE ESPERA RECEBER PARÂMETROS PARA PREENCHER TODOS OS ATRIBUTOS DA CLASSE
    public Pessoa(String nomeUsuario, int idadeUsuario, String estadoCivilUsuario) {
        this.nome = nomeUsuario;
        this.idade = idadeUsuario;
        this.estadoCivil = estadoCivilUsuario;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    
}