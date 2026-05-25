public abstract class Titulo 
{
    private String nome;
    private String editora;
    private double preco;

    public Titulo(String nome, String editora, double preco) 
    {
        this.nome = nome;
        this.editora = editora;
        this.preco = preco;
    }

    public abstract double getPercentualDesconto();

    public String getNome() { return nome; }
    public String getEditora() { return editora; }
    public double getPreco() { return preco; }

    @Override
    public String toString() 
    {
        return "Nome: " + nome + " | Editora: " + editora + " | Preço Base: R$ " + preco;
    }
}
