package ClasseFinal;

public class Professor{
	private String departamento;
	private String nomeCurso;
	private double salario;
	
	public String obterEtiquetaEnd() {
		String s = "Endereco aluno: ";
		//s += this.getEndereco();
		
		return s;
	}

	public void imprimirEtiquetaEnd() {
		System.out.println("Imprimindo End professor");
		System.out.println(this.obterEtiquetaEnd());
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularSalarioLiquido() {
		return 0;
	}
}
