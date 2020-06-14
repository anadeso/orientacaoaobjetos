public class ProgramaReferencia {

    public static void main(String[] args) {

        // Referencia de memoria
        Autor autor = new Autor();
        autor.setNome("Rodrigo");

        Livro livro = new Livro();
        livro.setNome(autor.getNome());

        livro.setNome("Guilherme");

        System.out.println(autor.getNome());
    }
}
