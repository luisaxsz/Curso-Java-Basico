package ContaCorrente;

public class AtributosContaCorrente {
	public static void main(String[] args) {
		ContaCorrente maria = new ContaCorrente();
		maria.saldo = 700.0;
		maria.codConta = 123;
		maria.limite = 800.0;
		maria.status = "Simples";
		
		System.out.println(maria.escolherAcao(0));
	}
}
