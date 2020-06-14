public class RegrasDeDesconto {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setValor(59.90);

        System.out.println("Valor autal: " +livro.getValor());

        // Aqui tem um problema pois nada obriga o desenvolvedor a usar
        // o metodo aplicaDesconto, podendo fazer conforme exemplo 1
        // Aplicando um desconto muito mairo que a nossa regra de negocio,
        // Isso acontece pois nosso atributo valor da classe Livro esta pub.
        // Temos que usar o modificador de visibilidade private

        if (!livro.aplicaDesconto(0.1)){
            System.out.println("Desconto nao pode ser maior do que 30%");

        } else {
            System.out.println("Valor com desconto: " +livro.getValor());
        }

        // Exemplo 1
        /*Livro livro1 = new Livro();
        livro.valor = 59.90;

        System.out.println("Valor autal: " +livro.valor);

        livro1.valor -= livro1.valor * 0.4;
        System.out.println("Valor com desconto: " +livro.valor);*/

    }

}
