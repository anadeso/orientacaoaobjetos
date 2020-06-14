
import javax.swing.*;

public class Livro {

    // Atributos da classe
    public String nome;
    public String descricao;
    public double valor;
    public String isbn;
    // Composicao, quando uma classe pode ter outra classe como atributo.
    public Autor autor;

    void mostraDetalhes(){
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println();

        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }

        System.out.println("---");
    }

    public void aplicaDesconto(double porcentagem){
        // this, atributo dessa classe Livro, usamos para evitar ambiguiade
        this.valor -= this.valor * porcentagem;

    }

    // Verificar se existe um autor ou nao
    public boolean temAutor(){
        return this.autor != null;
    }

}
