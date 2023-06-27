package Questao2;

public class TesteCalculadora {
	public static void imprimirResultado() {
		System.out.println(Calculadora.mostrarResultado());
	}
	public static void main(String[] args) {
		Calculadora.somar(0, 0);
		imprimirResultado();
		
		Calculadora.subtracao(0, 0);
		imprimirResultado();
		
		Calculadora.multiplicacao(0,0);
		imprimirResultado();
		
		Calculadora.divisao(0, 0);
		imprimirResultado();
		
		Calculadora.potenciacao(0, 0);
		imprimirResultado();
	}
}
