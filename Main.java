public class Main 
{

	public static void main(String[] args) 
	{

		AplicacaoLivraria livraria = new AplicacaoLivraria();
			
		Livro livro1 = new Livro(
				"Java Básico",
				"Carlos Silva",
				"Tech Books",
				"Livro introdutório de Java",
				100
		);

		livraria.adicionarLivro(livro1);

		livraria.criarLivroDidatico(
				"História Geral",
				"Ana Souza",
				"Editora Brasil",
				"Resumo de história mundial",
				120,
				"História"
		);

		livraria.criarRevista(
				"Revista Tech",
				"Editora Tech",
				30,
				"Mensal"
		);

		livraria.criarRevista(
				"Ciência Hoje",
				"Editora Tech",
				40,
				"Semanal"
		);

		System.out.println("\nResumo do livro:");
		System.out.println(livro1.consultarResumo());

		Revista r1 = new Revista("A", "Editora X", 10, "Mensal");
		Revista r2 = new Revista("B", "Editora X", 20, "Semanal");

		System.out.println("\nMesma editora? " + r1.mesmaEditora(r2));

		livraria.listarLivros();
		livraria.listarRevistas();

		livraria.comprar(livro1, 2);

		LivroDidatico didatico = new LivroDidatico(
				"Matemática",
				"João Pedro",
				"Educação LTDA",
				"Livro de matemática",
				150,
				"Exatas"
		);

		livraria.comprar(didatico, 1);

		Revista revista = new Revista(
				"Games",
				"Game Editora",
				25,
				"Mensal"
		);

		livraria.comprarRevista(revista, 3);
	}
}
