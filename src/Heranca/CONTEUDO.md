# Herança

### Tópicos do segmento:

1. Como se implementa o construtor da classe derivada?
2. O  que é sobrescrita?
3. O  que é herança múltipla? Em Java é possível termos herança múltipla?
4. Variáveis declaradas com o tipo de uma superclasse podem armazenar objetos de classes derivadas?
5. As classes derivadas conseguem acessar os atributos ou métodos privados da superclasse? 
6. Quais modificadores de declaração podemos usar para que as classes derivadas enxerguem os atributos ou métodos da superclasse?
7. Se a superclasse de uma classe derivada tem mais de um construtor, qual deles será chamado pela classe derivada?
8. Como o polimorfismo é verificado a partir do uso de classes derivadas (herança)?

Toda a herança se da pelo uso da palavra reservada `extends` logo na criação da classe.


***

## Herança

Primeiramente, o que são `classes derivadas`?
- Classes derivadas são aqueleas que "derivam" de uma classe pai, ou melhor, herdam atributos e/ou métodos da classe pai. Veja o exemplo abaixo.

`Classe Pessoa --> Classe pai`

~~~java
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
~~~

`Classe Aluno --> Classe derivada/herdeira`

~~~java
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
~~~

Utilizando as funções da classe `Pessoa` atráves da classe `Aluno`:

~~~java
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
~~~

Observe que os métodos `aluno.getIdade()` e `aluno.getNome()` são métodos que vem de `Pessoa` e são herdados pela classe `Aluno`.

## 1 - Construtor de classes derivadas

Basicamente quando utilizamos atributos que estão na Classe Pai, e precisamos iniciar-los dentro da Classe Devirada, utilizamos o método `super` o qual é utilizado para se referenciar ao construtor da Classe Pai. E passamos para esse método os atributo que iremos inicializar na Classe Pai. 


~~~java
public class Pessoa() {
    private String nome;
    private int idade;

    public Pessoa(String nomeUsuario, int idadeUsuario) {
        this.nome = nomeUsuario;
        this.idade = idadeUsuario;
    }
}

public class Aluno extends Pessoa {
    private String escola;
    private String nivelEscolar;

    public Aluno(String nomeUsuario, int idadeUsuario, String escolaUsuario, String nivelEscolarUsuario) {

        super(nomeUsuario, idadeUsuario);
        this.escola = escolaUsuario;
        this.nivelEscolar = nivelEscolarUsuario;
    }
}
~~~

***

## 2 - Sobreescrita de Métodos

***

## 3 - Herança Múltipla

***

## 4 - Superclasse

***

## 5 - Classes Derivadas e métodos da Superclasse

***

## 6 - 

***

## 7 - 

***

## 8 - Polimorfismo nas classes derivadas

***