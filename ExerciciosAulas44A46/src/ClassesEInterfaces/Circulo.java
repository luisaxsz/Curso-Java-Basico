package ClassesEInterfaces;

public class Circulo  extends Figura2D implements DimensaoSuperficial{
	private double pi = 3.14;
	private double raio;
	@Override
	public void calcularArea() {
		double area = pi*Math.pow(raio,2);
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

}
