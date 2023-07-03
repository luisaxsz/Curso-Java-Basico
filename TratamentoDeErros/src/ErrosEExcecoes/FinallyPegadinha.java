package ErrosEExcecoes;

public class FinallyPegadinha {
	public static void main(String[] args) {
		int[] numeros = {4, 8 , 16, 32,64,128};
		int[] denomi = {2, 0 , 4 , 8, 0};
		
		for (int i = 0; i <numeros.length; i++) {
			try {
			System.out.println(numeros[i] + "/" + denomi[i] + "=" + (numeros[i]/denomi[i]));
			}catch(ArithmeticException e) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posicao do array invalida");
				System.exit(0);
			}finally{
				System.out.println("Essa linha e impressa sempre apos try e catch");
			}
		}
	}
}
