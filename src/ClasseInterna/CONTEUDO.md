# Classes Internas

## Tópicos do segmento:

1. Quando é conveniente criar uma classe interna?
2. As classes internas têm acesso aos atributos privados da classe hospedeira? o que é classe hospedeira?
3. Uma classe interna pode ser privada? se for privada é possível instanciar (new) essa classe?

***

## 1 - Uso das Classes Internas

***

## 2 - Acessos da Classe Interna

As Classes Internas possuem acesso aos atributos e métodos da Classe Hospedeira, desde que eles sejam `static`.

Classe Hospedeira nada mais é do que a Classe, que terá uma ou mais classes internamentes.

~~~java
// CLASSE QUE IRÁ CARREGAR UMA OU MAIS CLASSES INTERNAS
public class ClasseHospedeira {
    
    void executar() {
        ClasseInterna classe = new ClasseInterna();
        classe.metodoInterno();
    }

    // CLASSE INTERNA
    class ClasseInterna {
        public void metodoInterno() {
            System.out.println("Método executado");
        }
    }
}
~~~

***

## 3 - Encapsulamento da Classe Interna