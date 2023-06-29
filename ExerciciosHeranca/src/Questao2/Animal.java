package Questao2;

public class Animal {
	private String nome;
	private String cor;
	private String ambiente;
	private double comprimento;
	private double velocidade;
	private int qntPatas;
	
	@Override
	public String toString() {
		String s = "---------------";
		s += "\nAnimal: " + this.nome;
		s += "\nCor: " + this.cor;
		s += "\nAmbiente: " + this.ambiente;
		s += "\nComprimento: " + this.comprimento;
		s += "\nVelocidade: " + this.velocidade;
		s += "\nQuantidade de Patas: " + this.qntPatas;
		
		return s;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public int getQntPatas() {
		return qntPatas;
	}

	public void setQntPatas(int qntPatas) {
		this.qntPatas = qntPatas;
	}

}
