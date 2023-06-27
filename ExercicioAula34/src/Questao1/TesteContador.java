package Questao1;

public class TesteContador {
	static public void imprimirValor() {
		System.out.println(Contador.mostarContador());
	}
	public static void main(String[] args) {
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		Contador c4 = new Contador();
		
		imprimirValor();
		Contador.zerar();
		imprimirValor();
		
		Contador c5 = new Contador();
		Contador c6 = new Contador();
		Contador c7 = new Contador();
		Contador c8 = new Contador();
		imprimirValor();
		

	}

}
