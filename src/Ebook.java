public class Ebook extends Livro{

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    // Sobrescrevendo o metodo da super classe Livro
    @Override
    public boolean aplicaDesconto(double porcentagem) {

        if (porcentagem > 0.15){
            return false;
        }
        // chamamos o metodo getter e setter do atributo valor utilizando a palavra reservada
        // this, deixando claro que é da classe pai. Nesse caso tambem poderiamos utilizar o super.
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        System.out.println("aplicando desconto no Ebbok");
        return  true;
    }
    /*
    @Override
    public boolean aplicaDesconto(double porcentagem){

        if (porcentagem > 0.15) {
            return false;
        }
        // Usando o super estamos chamando o metodo da classe Livro, se utilizarmos o this estariamos
        // chamando o proprio metodo aplicadoDesconto da classe Ebook, e o codigo entraria em um loop.
        return super.aplicaDesconto(porcentagem);
    }*/
}
