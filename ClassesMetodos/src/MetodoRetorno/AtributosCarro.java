package MetodoRetorno;

public class AtributosCarro {
	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "fiat";
		van.modelo = "ducato";
		van.numPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		van.obterAutonomia();
		
		double autonomia = van.obterAutonomia();
		
		System.out.println("A autonomia do carro é: " + autonomia);

		
	}
}
