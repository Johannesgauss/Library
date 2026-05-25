public class aplicacaoLivraria {
    public static String nomeLivraria = "Livraria Tech Central"; 

    public static Revista criarRevista(String nome, String editora, double preco, String periodicidade) 
    {
        return new Revista(nome, editora, preco, periodicidade);
    }

    public static LivroDidatico criarLivroDidatico(String nome, String autor, String editora, String resumo, double preco, String area) 
    {
        return new LivroDidatico(nome, autor, editora, resumo, preco, area);
    }

    public static void comprar(Titulo titulo, int quantidade) 
    {
        double precoBrutoTotal = titulo.getPreco() * quantidade;
        
        double descontoTotalPercentual = titulo.getPercentualDesconto() + 0.0005;
        double valorDesconto = precoBrutoTotal * descontoTotalPercentual;
        double precoFinal = precoBrutoTotal - valorDesconto;

        System.out.println("\n=== NOTA FISCAL ===");
        System.out.println("Livraria: " + aplicacaoLivraria.nomeLivraria);
        System.out.println("Título: " + titulo.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço Final com Descontos: R$ " + String.format("%.2f", precoFinal));
        System.out.println("===================\n");
    }

    public static void main(String[] args) 
    {
        Revista r1 = criarRevista("Mundo Estranho", "Abril", 15.00, "Mensal");
        Revista r2 = criarRevista("Quatro Rodas", "Abril", 20.00, "Mensal");
        LivroDidatico ld = criarLivroDidatico("Java Como Programar", "Deitel", "Pearson", "Livro excelente de Java", 150.00, "Informática");

        System.out.println("Resumo do Livro: " + ld.getResumo());

        System.out.println("r1 e r2 são da mesma editora? " + r1.temMesmaEditora(r2));

        comprar(r1, 3);
        comprar(ld, 1);
    }
}
