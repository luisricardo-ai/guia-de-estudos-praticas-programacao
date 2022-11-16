# Classes, Atributos e Métodos

### Tópicos do segmento: 

1. Qual a finalidade do método construtor?
2. Por que os atributos idealmente devem ser privados?
3. Qual a finalidade dos métodos getters e setters?
4. Uma classe concreta pode conter métodos abstratos?
5. Quando uma classe tem mais de um método construtor, qual deles é usado para criar novos objetos?

# 1 - Método Construtor

Primeiramente precisamos definir o que é um `método construtor`.

O que é um `método contrutor`?
- É um Método cujo leva o memso nome da classe em questão, sem indicar **nenhum tipo de retorno** quando utilizado. Podendo receber parâmetros do usuário para funcionalidades da classe.

Qual a sua finalidade?
- Inicializar os atributos da classe em questão, que podem ser passados através dos parâmetros do método. 
- Garantir a `integridade` desses atributos.

## **Exemplo** de Método Construtor para classe `Pessoa`:
***
~~~java
public class Pessoa {
    // ATRIBUTOS DA CLASSE PESSOA
    String nome;
    int idade;

    // MÉTODO CONSTRUTOR
    public Pessoa( String usuario_nome, int usuario_idade) {
        nome = usuario_nome;
        idade = usuario_idade;
    }
}
~~~~

# 2 - Encapsulamento

O que é `Encapsulamento`?
- Encapsulamento é uma forma der controlar os acessos aos atributos e métodos de dentro da classe. Sendo uma opção tanto para garantir a `segurança dos dados` quanto a `intergridade` dos mesmos (Atributos).

## Vejamos um exemplo:

~~~java
public class App {
    public static void main(String[] args) {
        // Atributos que o usuário deseja inserir
        String nome = "Luis";
        int idade = 15;
        
        // Instanciação
        Pessoa aluno = new Pessoa(nome, idade);
    }    
}
~~~

Após a criação do objeto `aluno`, o `nome` e a `idade` do mesmo foram definidos.

Porém como não definimos os métodos como `private`, podemos acessar diretamente esses métodos através do objeto e **alterá-los diretamente sem nenhuma validação os segurança do dados**, como mostrado abaixo:

~~~java
public class App {
    public static void main(String[] args) {
        // Atributos que o usuário deseja inserir
        String nome = "Luis";
        int idade = 15;
        
        // Instanciação
        Pessoa aluno = new Pessoa(nome, idade);

        // Mudança na idade do aluno, tornando assim um maior de idade na perspectiva do código
        aluno.idade = 18;
    }    
}
~~~

Note que isso só é possível pois não definimos nosso atributo como `private` portanto seu modo "default" é `public`. E qualquer pessoa pode mudar o valor do atributo. A correção para essa situação seria dessa maneira:

~~~java
public class Pessoa {
    private String nome;
    private int idade;

    // MÉTODO CONSTRUTOR
    public Pessoa( String usuario_nome, int usuario_idade) {
        nome = usuario_nome;
        idade = usuario_idade;
    }
}

public class App {
    public static void main(String[] args) {
        String nome = "Luis";
        int idade = 15;
        
        Pessoa aluno = new Pessoa(nome, idade);

        // Assim que executado o sistema dará um erro
        aluno.idade = 18;
    }    
}
~~~

E partir de agora só conseguiremos acessar/mudar esses atributos através de `getters` e `setters`.

***

O que são `Atributos`?
- Um atributo é uma forma de tangibilizar uma característica de uma classe. Como na classe `Pessoa`, onde temos os atributos **nome** que é uma `String` e a **idade** que é um tipo `int`.

Por que os atributos idealmente devem ser privados?
- Para que assim exista uma maior segurança no fornecimento e consumo dos dados da classe. Além de providenciar um isolamento ainda melhor dos métodos, assim podendo fazer melhor uso de `getters` e `setters` para a governança desses dados, ou seja, das validações de consumo e alteração.

# 3 - Métodos Getters e Setters

O que é são `getters`?

- São métodos que normalmente estão presentes dentro da classe em questão, e temo função retornar algum conteúdo, seja ele um valor de um atributo ou junção de alguns atributos. E também para garantir que o usuário possa verificar somente aquilo que realmente será preciso, criando assim uma forma de `governança dos dados`.

O que são `setters`

- São métodos normalmente presentes dentro da classe em questão, e tem como função validar parâmetros passados pelo usuário para servir aos atributos, somente se cumprirem com o que está sendo esperado de valor. E logicamente eles devem existir somente para aquilo que realmente possa ser mudado no futuro;

## **Exemplos** na classe pessoa

* `Getters`
~~~java
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa( String usuario_nome, int usuario_idade, String usuario_cpf) {
        this.nome = usuario_nome;
        this.idade = usuario_idade;
        this.cpf = usuario_cpf;
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
~~~

* `Setters`

~~~java
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
}
~~~

# 4 - Classes concretas e Métodos Abstratos


# 5 - Construtores de uama Classe

Quando uma classe tem `mais de um método construtor`, qual deles é usado para criar novos objetos?

- Aquele que mais se adequar aos parâmetros que o usuário irá fornecer

***

## Irei abordar a questão da `Subrecargas de Métodos no Segmento 2`
