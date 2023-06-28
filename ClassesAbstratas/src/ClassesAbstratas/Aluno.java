package ClassesAbstratas;

public class Aluno extends Pessoa{
	private String cursos;
	private String notas[];
	
	public String obterEtiquetaEnd() {
		String s = "Endereco aluno: ";
		s += this.getEndereco();
		
		return s;
	}
	public  void imprimirEtiquetaEnd() {
		System.out.println("Imprimindo End professor");
		System.out.println(this.obterEtiquetaEnd());
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
