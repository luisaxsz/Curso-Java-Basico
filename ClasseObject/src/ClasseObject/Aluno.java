package ClasseObject;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
	private String cursos;
	private double notas[];
	
	public String obterEtiquetaEnd() {
		String s = "Endereco aluno: ";
		//s += this.getEndereco();
		
		return s;
	}
	public  void imprimirEtiquetaEnd() {
		System.out.println("Imprimindo End professor");
		System.out.println(this.obterEtiquetaEnd());
	}
	
	/*public String toString() {
		String s = "Curso" + "\n";
		for (double nota : notas) {
			s += nota + "\t";
		}
		
		return s;
	}*/
	
	@Override
	public String toString() {
		return "Aluno [cursos=" + cursos + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Aluno other = (Aluno) obj;
		if (cursos.equalsIgnoreCase(other.getCursos())) {
			return true;
		}
		return false;
	}
	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double calcularMedia() {
		return 0;
	}
	 
	public boolean verificarAprovado() {
		return true;
	}
}
