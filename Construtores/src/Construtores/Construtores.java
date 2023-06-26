package Construtores;

public class Construtores {
	String marca;
	String modelo;
	int numPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	//construtor = new carro()
	Construtores(){
		System.out.println("Carro instânciada");
		numPassageiros = 4;
		
	}
	
	Construtores(String  marca_, String modelo_){
		marca = marca_;
		modelo = modelo_;
	}
}
