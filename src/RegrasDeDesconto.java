public class RegrasDeDesconto {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro livro = new Livro(autor);
        livro.setValor(59.90);


        // Aqui tem um problema pois nada obriga o desenvolvedor a usar o metodo aplicaDesconto, podendo fazer
        // conforme exemplo 1 aplicando um desconto muito mairo que a nossa regra de negocio, isso acontece pois
        // nosso atributo valor da classe Livro esta publico, temos que usar o modificador de visibilidade private

        if (!livro.aplicaDesconto(0.3)){
            System.out.println("Desconto nao pode ser maior do que 30%");

        } else {
            System.out.println("Valor com desconto: " +livro.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        if (!ebook.aplicaDesconto(0.3)){
            System.out.println("Desconto no ebook nao pode er maior do que 15%");
        } else {
            System.out.println("Valor do ebook com desonto: " +ebook.getValor());
        }

    }

}
