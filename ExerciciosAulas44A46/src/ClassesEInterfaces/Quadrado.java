package ClassesEInterfaces;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

	private double lado;

	@Override
	public void calcularArea() {
		double area = Math.pow(lado, 2);
		System.out.println("Area: " + area);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
