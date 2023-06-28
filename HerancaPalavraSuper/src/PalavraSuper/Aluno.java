package PalavraSuper;

public class Aluno extends Pessoa{
	private String cursos;
	private String notas[];
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
	
	}

	public void metodoQualquer() {
		super.setCpf("9999");
		
		this.setCpf("88822");
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
