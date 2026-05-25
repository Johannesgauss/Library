public class LivroDidatico extends Livro {
    private String area;

    public LivroDidatico(String nome, String autorPrincipal, String editora, String resumo, double preco, String area) {
        super(nome, autorPrincipal, editora, resumo, preco);
        this.area = area;
    }

    @Override
    public double getPercentualDesconto() {
        return 0.10;
    }

    @Override
    public String toString() {
        return super.toString() + " | Área: " + area;
    }
}
