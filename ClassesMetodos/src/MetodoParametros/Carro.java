package MetodoParametros;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	double calcularCombustivel(double km) {
		double qntCombustivel = km/consumoCombustivel;
		return qntCombustivel;
	}
}
