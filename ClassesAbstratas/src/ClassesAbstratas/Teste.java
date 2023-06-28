package ClassesAbstratas;

public class Teste {

	public static void main(String[] args) {
		
		//Nao é possivel instanciar pois esta como abstract
		//Pessoa aluno = new Pessoa();
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		aluno.setEndereco("Rua 1");
		professor.setEndereco("Rua 2");
		
		aluno.imprimirEtiquetaEnd();
		professor.imprimirEtiquetaEnd();
	}

}
