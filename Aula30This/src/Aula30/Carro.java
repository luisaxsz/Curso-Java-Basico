package Aula30;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 valores");
	}
	
	public Carro(String marca , String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando o construtor com 2 parametros");
	}
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}



	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + "KM");
	}
}
