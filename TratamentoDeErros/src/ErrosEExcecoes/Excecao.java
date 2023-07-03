package ErrosEExcecoes;

public class Excecao {
	public static void main(String[] args) {
		try {
			int[] vetor = new int[4];
			

			System.out.println("Antes exception");
			
			vetor[4] = 1; 
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceçao ao acessar o indicie do vetor que nao existe");
		}
		
		System.out.println("Esse texto sera impresso apos exeption");
	}
}
