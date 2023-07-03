package ClassesEInterfaces;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
	private double areaBase;
	private double base;
	private double altura;
	

	@Override
	public void calcularVolume() {
		double volume = (areaBase*altura)/3;
		System.out.println("Volume: " + volume);
	}

	@Override
	public void calcularArea() {
		areaBase = base * altura;
		double area = (base*altura)/2;
		System.out.println("Area: "+ area);
	}

	public double getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(double areaBase) {
		this.areaBase = areaBase;
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
