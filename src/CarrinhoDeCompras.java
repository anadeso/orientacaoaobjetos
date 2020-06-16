public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    // Aqui temos Polimorfismo pois podemos atribuir tanbo livro fisico
    // Tando o Ebook e revista no parametro
    public void adiciona(Produto produto){

        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador++;
        this.total += produto.getValor();

    }

    public double getTotal() {
        return total;
    }

    public Produto[] getProdutos(){
        return produtos;
    }
}
