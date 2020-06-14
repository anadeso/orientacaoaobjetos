public class CadastroLivro {
    public static void main(String[] args) {

        // Criando objeto Autor e automaticamente espaco na memoria
        Autor autorCriado = new Autor();
        autorCriado.setNome("Rodrigo Turini");
        autorCriado.setEmail("rodrigo.turini@caelum.com.br");
        autorCriado.setCpf("123.456.789.10");

        // Criar objeto e automaticamente espaco na memoria
        Livro livro = new Livro(autorCriado);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recurso da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978.85.66250-6");

        // Associando o objeto autorCriado ao nosso livro
        livro.setAutor(autorCriado);
        livro.mostraDetalhes();

        Autor outroAutorCriado = new Autor();
        outroAutorCriado.setNome("Paulo Silveira");
        outroAutorCriado.setEmail("paulo.silveira@caelum.com.br");
        outroAutorCriado.setCpf("321.543.645.33");

        Livro outroLivro = new Livro(outroAutorCriado);
        livro.setNome("Lógica de programação");
        livro.setDescricao("Crie seus primeiros programas");
        livro.setValor(59.90);
        livro.setIsbn( "978.85.66250-6");

        // Associando o objeto outroAutorCriado ao nosso outroLivro
        outroLivro.setAutor(outroAutorCriado);
        livro.mostraDetalhes();
    }
}
