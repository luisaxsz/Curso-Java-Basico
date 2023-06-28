package PalavraSuper;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Maria");
		
		Professor professor = new Professor();
		professor.setEndereco("Belem");
		
		System.out.println(aluno.getNome());
		System.out.println(professor.getEndereco());
		
		//Fica apenas disponivel os atributos da pessoa -> polimorfismo
		Pessoa aluno1 = new Aluno();
		
		
		
		
	}

}
