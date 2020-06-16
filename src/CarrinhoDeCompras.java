public class CarrinhoDeCompras {

    private double total;

    // Aqui temos Polimorfismo pois podemos atribuir tanbo livro fisico
    // Tando o Ebook e revista no parametro
    public void adiciona(Produto produto){

        System.out.println("Adicionando: " + produto);
        total += produto.getValor();

    }

    public double getTotal() {
        return total;
    }
}
