package MetodoParametros;

public class AtributosCarro {
	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "fiat";
		van.modelo = "ducato";
		van.numPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println("A quantidade de combustivel por km e: " + van.calcularCombustivel(10));
	}
}
