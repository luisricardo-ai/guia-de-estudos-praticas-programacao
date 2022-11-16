package Heranca;

public class App {
    public static void main(String[] args) {
    
        String nome = "Luis";
        int idade = 18;
        String escola = "Instituto Federal";
        String nivel = "3º ano E.M.";

        Aluno aluno = new Aluno(nome, idade, escola, nivel);

        System.out.println(aluno.getIdade() + ";" + aluno.getNome());
    }
}
