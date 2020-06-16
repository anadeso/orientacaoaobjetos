public class LivroFisico extends Livro {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDesconto(double porcentagem) {
        return false;
    }

    public double getTaxaImpressao(){
        return  this.getValor() * 0.05;
    }
}
