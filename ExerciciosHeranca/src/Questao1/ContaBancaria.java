package Questao1;

import java.util.Scanner;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	public void criarConta(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira seu nome:  ");
		setNomeCliente(scan.nextLine());
		System.out.println("Insira o numero da sua conta:  ");
		setNumConta(scan.nextInt());
	}
	
	public String sacar(double valorSaque) {
		// Scanner
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual valor voce deseja sacar? ");
		valorSaque = scan.nextDouble();
		if (saldo < valorSaque) {
			return "Valor indisponivel";
		} else {
			saldo -= valorSaque;
			return "Saque de " + valorSaque + " feito com sucesso";
		}
	}

	public String depositar(double valorDeposito) {
		// Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual valor voce deseja depositar?");
		valorDeposito = scan.nextDouble();
		saldo += valorDeposito;
		
		return "Voce depositou: " + valorDeposito;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	@Override
	public String toString() {
		return "\nNome do cliente: " + nomeCliente + "\nNumero da conta: " + numConta + "\nSaldo: " + saldo;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
