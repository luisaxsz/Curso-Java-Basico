package Questao1;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria {
	private double limite;
	
	// @override
	public String sacar(double valorSaque) {
		// Scanner
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual valor voce deseja sacar? ");
		valorSaque = scan.nextDouble();
		if (limite < valorSaque) {
			return "Valor indisponivel";
		} else {
			limite -= valorSaque;
			return "Saque de " + valorSaque + " feito com sucesso";
		}
	}
	
	@Override
	public String toString() {
		String s = "ContaEspecial";
		s += "\nNome Cliente: " + super.getNomeCliente();
		s += "\nNumero da Conta: " + super.getNumConta();
		s +=  "\nSaldo:" + super.getSaldo();
		s += "\nLimite da Conta: " + this.limite;
		return s;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
