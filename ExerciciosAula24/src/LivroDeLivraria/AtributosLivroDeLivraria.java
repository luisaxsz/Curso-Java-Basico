package LivroDeLivraria;

import Livro.Livro;

public class AtributosLivroDeLivraria {

	public static void main(String[] args) {
		LivroDeLivraria romance = new LivroDeLivraria();
		
		romance.nome = "Os sete maridos de evelyn hugo";
		romance.autor = "Taylor Jenkins Reid";
		romance.editoraLancamento = "Paralela";
		romance.anoLancamento = 2019;
		romance.qntPaginas = 360;
		romance.preco = 39.32;
		romance.disponibilidade = true;
		
		System.out.println("Nome do Livro: " + romance.nome);
		System.out.println("Autora: " + romance.autor);
		System.out.println( "Ano Lançamento: " + romance.anoLancamento);
		System.out.println("Editora: " + romance.editoraLancamento);
		System.out.println("Quantidade de Paginas: " + romance.qntPaginas);
		System.out.println("Preço: " + romance.preco);
		System.out.println("Disponibilidade: " + romance.disponibilidade);
		
		

	}

}
