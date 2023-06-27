package Questao2;

public class TesteContaCorrente {
	public static void main(String[] args) {
		ContaCorrente joao = new ContaCorrente(123,350.5,"Cheque especial", 500 );
		
		System.out.println(joao.escolherAcao(0));
	}
	
	
}
