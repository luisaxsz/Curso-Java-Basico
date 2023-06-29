package Questao2;

public class Peixes extends Animal{
	private String caracteristicas;

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracteristicas: " + this.getCaracteristicas();
		s += "\n---------------";
		
		return s;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	
}
