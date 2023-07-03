package ErrosEExcecoes;

public class ExcecoesSimiliares {

	public static void main(String[] args) {
		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denomi = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denomi[i] + "=" + (numeros[i] / denomi[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException exeption) {
				System.out.println("Ocorreu um erro");
			} 
		}	

	}

}
