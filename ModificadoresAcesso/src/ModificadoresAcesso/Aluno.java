package ModificadoresAcesso;

public class Aluno extends Pessoa{
	private String cursos;
	private String notas[];
	
	public void verificarAcesso() {
		this.nomeVisibilidade = "";
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
