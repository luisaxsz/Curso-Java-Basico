package ErrosEExcecoes;

public class Generico {
	public static void main(String[] args) {
		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denomi = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denomi[i] + "=" + (numeros[i] / denomi[i]));
			} catch (ArithmeticException exeption) {
				System.out.println("Erro ao dividir por zero");
			} catch (Throwable exeption) {
				System.out.println("Posicao do array invalida");
			}
		}
	}
}
