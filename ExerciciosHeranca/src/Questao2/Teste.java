package Questao2;

public class Teste {
	public static void main(String[] args) {
		Peixes peixe = new Peixes();
		
		peixe.setNome("Tubarao");
		peixe.setCor("Cinzento");
		peixe.setAmbiente("Mar");
		peixe.setComprimento(300);
		peixe.setVelocidade(1.5);
		peixe.setQntPatas(0);
		peixe.setCaracteristicas("Barbatanas e cauda");
		
		System.out.println(peixe.toString());
		
		Mamifero mamifero = new Mamifero();
		
		mamifero.setNome("Urso");
		mamifero.setCor("Marrom");
		mamifero.setAmbiente("Terra");
		mamifero.setComprimento(180);
		mamifero.setVelocidade(0.5);
		mamifero.setQntPatas(4);
		mamifero.setAlimento("Mel");
		
		System.out.println(mamifero.toString());
		
		
	}
}
