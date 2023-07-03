package ClassesEInterfaces;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
	
	private double pi = 3.14;
	private double raio;
	private double altura;

	@Override
	public void calcularVolume() {
		double volume = pi*Math.pow(raio, 2)*altura;
		System.out.println("Volume: " + volume);
	}

	@Override
	public void calcularArea(){
		double area = (2*pi*altura) + (2*pi*Math.pow(raio, 2));
		System.out.println("Area: " + area);
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}



	
	

}
