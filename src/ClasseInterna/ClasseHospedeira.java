package ClasseInterna;

// CLASSE QUE IRÁ CARREGAR UMA OU MAIS CLASSES INTERNAS
public class ClasseHospedeira {
    
    static String atributo = "Meu atributo";

    void executar() {
        ClasseInterna classe = new ClasseInterna();
        classe.metodoInterno();
    }

    public static String getAtributo() {
        return atributo;
    }

    // CLASSE INTERNA
    class ClasseInterna {
        public void metodoInterno() {
            System.out.println(ClasseHospedeira.getAtributo());
        }
    }
}
