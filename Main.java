public class Main {
    public static void main(String[] args) {

        // 1. Criando livros instanciando diretamente
        Livro livro1 = new Livro(
                "Java Básico",
                "Carlos Silva",
                "Tech Books",
                "Livro introdutório de Java",
                100
        );

        // 2. Usando os métodos estáticos de fábrica da AplicacaoLivraria e salvando em variáveis
        LivroDidatico didatico = AplicacaoLivraria.criarLivroDidatico(
                "História Geral",
                "Ana Souza",
                "Editora Brasil",
                "Resumo de história mundial",
                120,
                "História"
        );

        Revista r1 = AplicacaoLivraria.criarRevista("A", "Editora X", 10, "Mensal");
        Revista r2 = AplicacaoLivraria.criarRevista("B", "Editora X", 20, "Semanal");

        // 3. Testando as consultas (Nomes dos métodos corrigidos)
        System.out.println("\nResumo do livro:");
        System.out.println(livro1.getResumo()); // Corrigido

        System.out.println("\nMesma editora? " + r1.temMesmaEditora(r2)); // Corrigido

        // 4. Testando o método polimórfico de comprar (Nomes dos métodos corrigidos)
        AplicacaoLivraria.comprar(livro1, 2);
        AplicacaoLivraria.comprar(didatico, 1);
        AplicacaoLivraria.comprar(r1, 3); // Substitui o 'comprarRevista'
    }
}
