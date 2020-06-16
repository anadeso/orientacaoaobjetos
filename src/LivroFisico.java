public class LivroFisico extends Livro implements Promocional {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }

    public double getTaxaImpressao(){
        return  this.getValor() * 0.05;
    }
}
