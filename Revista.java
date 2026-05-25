public class Revista extends Titulo {
    private String periodicidade;

    public Revista(String nome, String editora, double preco, String periodicidade) 
    {
        super(nome, editora, preco);
        this.periodicidade = periodicidade;
    }

    public boolean temMesmaEditora(Revista outra) 
    {
        return this.getEditora().equalsIgnoreCase(outra.getEditora());
    }

    @Override
    public double getPercentualDesconto() 
    {
        return 0.02;
    }

    @Override
    public String toString() 
    {
        return super.toString() + " | Periodicidade: " + periodicidade;
    }
}
