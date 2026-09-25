package SIMULADO;

public class PrincipalQ3 {

    public static void main(String[] args) {

        Autor autor1 = new Autor("Louisa May Alcott", "Americana");
        Livro livro1 = new Livro("Little Women", 27.90, autor1);

        livro1.exibirDetalhes();
    }

    


}
