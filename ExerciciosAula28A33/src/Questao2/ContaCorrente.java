package Questao2;

import java.util.Scanner;

public class ContaCorrente {
	private int codConta;
	private double saldo;
	private String status;
	private double limite;
	
	public ContaCorrente(){
		
	}
	public ContaCorrente(int codConta, double saldo, String status, double limite) {
		super();
		this.codConta = codConta;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}
	
	public double escolherAcao(int acao) {
		//Scanner
		Scanner scan = new Scanner(System.in);
		//Ações
		System.out.println("Digite [1] para saque");
		System.out.println("Digite [2] para verificar saldo");
		System.out.println("Digite [3] para deposito");
		
		acao = scan.nextInt();
		
		if (acao == 1) {
			return sacarDinheiro(0);
		}else if (acao == 2) {
			return consultarSaldo();
		}else {
			return depositarDinheiro(0);
		}
		
	}
	
	public double sacarDinheiro(double valorSaque) {
		//Scanner 
		Scanner scan = new Scanner(System.in);
		//Ação
		System.out.println("Digite o valor que você deseja retirar:");
		valorSaque = scan.nextDouble();
		
		if (valorSaque < this.saldo) {
			this.saldo = this.saldo - valorSaque;
			System.out.println("Voce sacou R$");
			return valorSaque;
		}else {
			System.out.println("Saldo indisponivel");
			System.out.println("Voce tem apenas R$");
			return this.saldo;
		}
	}
	
	public double consultarSaldo() {
		System.out.println("Seu saldo e R$ ");
		return this.saldo;
	}
	
	public double depositarDinheiro(double deposito) {
		//Scanner
		Scanner scan = new Scanner(System.in);
		//Ação
		System.out.println("Qual valor voce deseja depositar?");
		deposito = scan.nextDouble();
		
		this.saldo = this.saldo + deposito;
		System.out.println("Voce depositou R$ " + deposito);
		System.out.println("Seu saldo agora e de R$");
		return this.saldo;
	}

	public int getCodConta() {
		return codConta;
	}
	public void setCodConta(int codConta) {
		this.codConta = codConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
}
