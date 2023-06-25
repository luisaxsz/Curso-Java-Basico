package Aluno;

public class AtributosAluno {

	public static void main(String[] args) {
		Aluno joao = new Aluno();
		
		joao.requisitarAluno();
		joao.requisitarNotasDisciplinas();
		joao.mostrarInfo();
		joao.situacao(0);
	}

}
