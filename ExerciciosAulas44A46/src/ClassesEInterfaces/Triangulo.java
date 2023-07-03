package ClassesEInterfaces;

public class Triangulo extends Figura2D implements DimensaoSuperficial {
	private double base;
	private double altura;

	@Override
	public void calcularArea() {
		double area = (base * altura) / 2;
		System.out.println("Area: " + area);

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
