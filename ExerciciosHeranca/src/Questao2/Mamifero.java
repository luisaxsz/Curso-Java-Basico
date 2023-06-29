package Questao2;

public class Mamifero extends Animal{
	private String alimento;
	
	

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracteristicas: " + this.getAlimento();
		s += "\n---------------";
		
		return s;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	
}
