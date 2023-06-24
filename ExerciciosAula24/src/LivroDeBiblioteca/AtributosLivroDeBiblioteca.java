package LivroDeBiblioteca;

public class AtributosLivroDeBiblioteca {
	public static void main(String[] args) {
		LivroDeBiblioteca romance = new LivroDeBiblioteca();
		
		romance.nome = "Os sete maridos de evelyn hugo";
		romance.autor = "Taylor Jenkins Reid";
		romance.editoraLancamento = "Paralela";
		romance.anoLancamento = 2019;
		romance.qntPaginas = 360;
		romance.numeroDaEdicao = 1;
		romance.cod = 97885;
		
		System.out.println("Nome do Livro: " + romance.nome);
		System.out.println("Autora: " + romance.autor);
		System.out.println( "Ano Lançamento: " + romance.anoLancamento);
		System.out.println("Editora: " + romance.editoraLancamento);
		System.out.println("Quantidade de Paginas: " + romance.qntPaginas);
		System.out.println("Edição: " + romance.numeroDaEdicao);
		System.out.println("Código do livro: " + romance.cod);
	}
}
