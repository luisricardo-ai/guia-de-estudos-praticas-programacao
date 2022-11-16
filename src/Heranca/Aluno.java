package Heranca;

public class Aluno extends Pessoa{
    private String escola;
    private String nivelEscolar;


    public Aluno(String nomeUsuario, int idadeUsuario, String escolaUsuario, String nivelEscolarUsuario) {
        super(nomeUsuario, idadeUsuario);
        this.escola = escolaUsuario;
        this.nivelEscolar = nivelEscolarUsuario;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getNivelEscolar() {
        return nivelEscolar;
    }

    public void setNivelEscolar(String nivelEscolar) {
        this.nivelEscolar = nivelEscolar;
    }
}