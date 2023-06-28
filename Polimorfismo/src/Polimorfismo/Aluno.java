package Polimorfismo;

public class Aluno extends Pessoa{
	private String cursos;
	private String notas[];
	
	//Sobrepondo metodo da classe pessoa
	public String obterEtiquetaEnd() {
		String s = "Endereco aluno: ";
		s += this.getEndereco();
		
		return s;
	}
	
	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	public String[] getNotas() {
		return notas;
	}
	public void setNotas(String[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	 
	public boolean verificarAprovado() {
		return true;
	}
}
