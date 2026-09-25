package SIMULADO;

public class Livro {

    private String titulo;
    private double preco;
    private Autor autor;


    public Livro(String titulo, double preco, Autor autor) {

        this.titulo = titulo;

        if(preco < 0)
            System.out.println("Atribuição inválida");
        else
            this.preco = preco;

        this.autor = autor;
    }

    public void exibirDetalhes() {

        System.out.println("Título: " + this.titulo);
        System.out.println("Preço: " + this.preco);
        System.out.println("Autor: " + this.autor.getNome());

    }

}
