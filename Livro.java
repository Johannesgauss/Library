public class Livro extends Titulo {
    private String autorPrincipal;
    private String resumo;

    public Livro(String nome, String autorPrincipal, String editora, String resumo, double preco) 
    {
        super(nome, editora, preco);
        this.autorPrincipal = autorPrincipal;
        this.resumo = resumo;
    }

    public String getResumo() { return this.resumo; }

    @Override
    public double getPercentualDesconto() 
    {
        return 0.03;
    }

    @Override
    public String toString() 
    {
        return super.toString() + " | Autor: " + autorPrincipal + " | Resumo: " + resumo;
    }
}
