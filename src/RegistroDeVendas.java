public class RegistroDeVendas {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Teste-Driven Development");
        fisico.setValor(59.90);

        if (fisico.aplicaDescontoDe10Porcento()){
            System.out.println("Valor agora é " + fisico.getValor());
        }
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Teste-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adiciona(fisico);
        carrinhoDeCompras.adiciona(ebook);

        Produto[] produtos = carrinhoDeCompras.getProdutos();

       // for (int i = 0; i <  produtos.length; i++){
        for (Produto produto : produtos) {
            //Produto produto = produtos[i];
            if (produto != null) {
                System.out.println(produto.getValor());
            }
        }

        System.out.println("Total " + carrinhoDeCompras.getTotal());
    }
}
