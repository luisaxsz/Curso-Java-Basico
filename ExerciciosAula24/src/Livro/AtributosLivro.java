package Livro;

public class AtributosLivro {
	public static void main(String[] args) {
		Livro romance = new Livro();
		
		romance.nome = "Os sete maridos de evelyn hugo";
		romance.autor = "Taylor Jenkins Reid";
		romance.editoraLancamento = "Paralela";
		romance.anoLancamento = 2019;
		romance.qntPaginas = 360;
		
		System.out.println("Nome do Livro: " + romance.nome);
		System.out.println("Autora: " + romance.autor);
		System.out.println( "Ano Lançamento: " + romance.anoLancamento);
		System.out.println("Editora: " + romance.editoraLancamento);
		System.out.println("Quantidade de Paginas: " + romance.qntPaginas);
		
	}
}
