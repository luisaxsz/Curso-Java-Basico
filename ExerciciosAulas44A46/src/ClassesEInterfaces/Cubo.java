package ClassesEInterfaces;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
	private double lado;
	@Override
	public void calcularVolume() {
		double volume = Math.pow(lado, 3);
		System.out.println("Volume: " + volume);
		
	}

	@Override
	public void calcularArea() {
		double areaQuadrado = Math.pow(lado, 2);
		double area = areaQuadrado*6;
		System.out.println("Area: " + area);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
