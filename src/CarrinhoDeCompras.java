public class CarrinhoDeCompras {

    private double total;

    // Aqui temos Polimorfismo pois podemos atribuir tanbo livro fisico
    // Tando o Ebook no parametro
    public void adiciona(Livro livro){

        System.out.println("Adicionando: " + livro);
        livro.aplicaDesconto(0.40);
        total += livro.getValor();

    }

    public double getTotal() {
        return total;
    }
}
