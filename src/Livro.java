
import javax.swing.*;

public class Livro {

    // Atributos da classe
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    // Composicao, quando uma classe pode ter outra classe como atributo.
    private Autor autor;

    // Sobrecarda  (OVERLOADED) de construtor
    public Livro() {
        this.isbn = "000-00-00000-00-0";
    }

    // O valor ISBN so sera inicializado quando o construtor com um Autor fosse chamado
    // Para isso podemos encadear a chamada dos construtorres utilizando a palavra reservada this
    public Livro(Autor autor) {
        this();
        this.autor = autor;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

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

    public boolean aplicaDesconto(double porcentagem){
        // this, atributo dessa classe Livro, usamos para evitar ambiguiade

        if (porcentagem > 0.3){
            System.out.println("Desconto nao pode ser maior do que 30%");
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    // Verificar se existe um autor ou nao
    public boolean temAutor(){
        return this.autor != null;
    }

}
