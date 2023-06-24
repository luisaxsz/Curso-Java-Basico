package Contato;

public class AtributoContato {
	public static void main(String[] args) {
		Contato fabiola = new Contato();
		
		fabiola.nome = "Fabiola";
		fabiola.numero = 11347829;
		
		System.out.println("Numero: " + fabiola.numero);
		System.out.println("Nome  do Contato: " + fabiola.nome);
	}
}
