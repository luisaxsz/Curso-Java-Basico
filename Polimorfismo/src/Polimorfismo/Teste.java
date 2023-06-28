package Polimorfismo;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua 1, num1");
		aluno.setEndereco("Rua 2, num1");
		professor.setEndereco("Rua 3, num1");
		
		//Herda metodos da super classe pessoa
		System.out.println(pessoa.obterEtiquetaEnd());
		System.out.println(aluno.obterEtiquetaEnd());
		System.out.println(professor.obterEtiquetaEnd());
		
	}

}
