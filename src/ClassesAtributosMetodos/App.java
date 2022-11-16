package ClassesAtributosMetodos;

public class App {
    public static void main(String[] args) {
        // Atributos que o usuário deseja inserir
        String nome = "Luis";
        int idade = 15;
        String cpf = "000.000.000-00";
        
        // Instanciação
        Pessoa aluno = new Pessoa(nome, idade, cpf);

        System.out.println(aluno.getNome() + ";" + aluno.getIdade() + ";" + aluno.getCpf());
    }    
}