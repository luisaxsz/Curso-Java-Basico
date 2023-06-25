package MetodoRetorno;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	double obterAutonomia() {
		System.out.println("Metodo chamado");
		return capacidadeCombustivel * consumoCombustivel;
	}
}
