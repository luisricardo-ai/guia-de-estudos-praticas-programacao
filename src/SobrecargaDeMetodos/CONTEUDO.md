# Sobrecarga de Métodos

### Tópicos do segmento:

1. O que é a sobrecarga de um método?
2. O método construtor pode ser sobrecarregado?
3. O que deve ser diferente entre os métodos sobrecarregados?

## 1 - Sobrecarga de métodos

Vamos primeiramente entender o que a `sobrecarga de métodos`.

Qual a finalidade de utilizar essa técnica?

- Basicamente trata-se de criarmos 2 ou mais métodos com a **mesma nomenclatura** e, normalmente a mesma funcionalidade dentro da classe. Mas intrinsecamente a diferença entre as classes serão os **parâmetros esperados** para o funcionamento da função em questão.
- Importante lembrar também que a sobre carga pode ser também quando temos um `método que não espera nada do usuário`, e outra situação que pode esperar algo do usuário.

Veja os exemplos abaixo:

~~~java
public class Pessoa {

    private String nome;
    private int idade;
    private String estadoCivil;

    // MÉTODO CONSTRUTOR QUE ESPERA RECEBER PARÂMETROS PARA PREENCHER TODOS OS ATRIBUTOS DA CLASSE
    public Pessoa(String nomeUsuario, int idadeUsuario, String estadoCivilUsuario) {
        this.nome = nomeUsuario;
        this.idade = idadeUsuario;
        this.estadoCivil = estadoCivilUsuario;
    }

    // MÉTODO CONTRUTOR QUE ESPERA ALGUNS PARAMETROS DO USUÁRIO APENAS, E DEFINE UM ATRIBUTO COM UM VALOR DEFAULT
    public Pessoa(String nomeUsuario, int idadeUsuario) {
        this.nome = nomeUsuario;
        this.idade = idadeUsuario;
        this.estadoCivil = "Solteiro(a)";
    }
}
~~~
***

## 2 - Sobrecarga em Construtores

Como mostrado no exemplo de código acima, até mesmo o método contrutor pode ser sobrecarregado. Desde que seus parâmetros sejam diferentes. Veja o próximo exemplo, onde temos 3 contrutores.

~~~java
public class Pessoa {
    private String nome;
    private int idade;
    private String estadoCivil;

    public Pessoa() {
        this.nome = null;
        this.idade = 0;
        this.estadoCivil = null;
    }

    // DEFININDO UM VALOR DEFAULT PARA O ATRIBUTO "this.estadoCivil"
    public Pessoa(String nomeUsuario, int idadeUsuario) {
        this.nome = nomeUsuario;
        this.idade = idadeUsuario;
        this.estadoCivil = "Solteiro(a)";
    }

    public Pessoa(String nomeUsuario, int idadeUsuario, String estadoCivilUsuario) {
        this.nome = nomeUsuario;
        this.idade = idadeUsuario;
        this.estadoCivil = estadoCivilUsuario;
    }
}
~~~

- Observe que no segundo contrutor, o atributo `estadoCivil`, tem um valor padrão definido pelo próprio método, o qual não espera um valor referente a esse atributo pelo usuário.

***

## 3 - Diferença entre os métodos com sobrecarga

Qual a principal diferença entre os métodos?
- Como já comentei na no tópico `1 - Sobrecarga de métodos` a principal diferença entre esses métodos, são os parâmetros que são esperados pelo usuário, desde métodos que não esperar nada do usuário, como um construtor default `new Pessoa()` e um outro `new Pessoa(nome, idade)`.