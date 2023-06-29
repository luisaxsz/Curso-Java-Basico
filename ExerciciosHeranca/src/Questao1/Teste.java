package Questao1;

public class Teste {
	public static void main(String[] args) {
		ContaBancaria  contaSimples = new ContaBancaria();
		contaSimples.setSaldo(800);
		
		contaSimples.criarConta();
		System.out.println(contaSimples.sacar(0));
		contaSimples.depositar(0);
		System.out.println(contaSimples.toString());
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaPoupanca.setSaldo(600);
		
		contaPoupanca.criarConta();
		contaPoupanca.calcularNovoSaldo(0.5);
		System.out.println(contaPoupanca.toString());
		
		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaEspecial.setSaldo(1000);
		contaEspecial.setLimite(3000);
		
		contaEspecial.criarConta();
		
		System.out.println(contaEspecial.sacar(0));
		System.out.println(contaEspecial.toString());
		
		
		
		
		
	}
}
