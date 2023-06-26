package Construtores;

public class TesteConstrutores {
	public static void main(String[] args) {

		Construtores van = new Construtores();
		van.marca = "fiat";
		van.modelo = "ducato";
		//van.numPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		Construtores van2 = new Construtores("toyota", "civic");
		System.out.println(van.numPassageiros);
		
		System.out.println(van.marca);
		System.out.println(van2.marca + van2.modelo);
	}
}
