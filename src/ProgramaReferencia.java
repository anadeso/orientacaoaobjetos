public class ProgramaReferencia {

    public static void main(String[] args) {

        // Referencia de memoria
        Autor autor = new Autor();
        autor.nome = "Rodrigo";

        Livro livro = new Livro();
        livro.autor = autor;

        livro.autor.nome = "Guilherme";

        System.out.println(autor.nome);
    }
}
