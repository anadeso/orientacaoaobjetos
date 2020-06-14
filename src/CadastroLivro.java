public class CadastroLivro {
    public static void main(String[] args) {

        // Criando objeto Autor e automaticamente espaco na memoria
        Autor autorCriado = new Autor();
        autorCriado.nome = "Rodrigo Turini";
        autorCriado.email = "rodrigo.turini@caelum.com.br";
        autorCriado.cpf = "123.456.789.10";

        // Criar objeto e automaticamente espaco na memoria
        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recurso da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978.85.66250-6";

        // Associando o objeto autorCriado ao nosso livro
        livro.autor = autorCriado;

        livro.mostraDetalhes();

        Autor outroAutorCriado = new Autor();
        outroAutorCriado.nome = "Paulo Silveira";
        outroAutorCriado.email = "paulo.silveira@caelum.com.br";
        outroAutorCriado.cpf = "321.543.645.33";

        Livro outroLivro = new Livro();
        livro.nome = "Lógica de programação";
        livro.descricao = "Crie seus primeiros programas";
        livro.valor = 59.90;
        livro.isbn = "978.85.66250-6";

        // Associando o objeto outroAutorCriado ao nosso outroLivro
        outroLivro.autor = outroAutorCriado;

        livro.mostraDetalhes();
    }
}
