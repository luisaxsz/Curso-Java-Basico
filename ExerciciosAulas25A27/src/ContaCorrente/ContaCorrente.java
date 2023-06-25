package ContaCorrente;

import java.util.Scanner;

public class ContaCorrente {
	int codConta;
	double saldo;
	String status;
	double limite;
	
	double escolherAcao(int acao) {
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
	
	double sacarDinheiro(double valorSaque) {
		//Scanner 
		Scanner scan = new Scanner(System.in);
		//Ação
		System.out.println("Digite o valor que você deseja retirar:");
		valorSaque = scan.nextDouble();
		
		if (valorSaque < saldo) {
			saldo = saldo - valorSaque;
			System.out.println("Voce sacou R$");
			return valorSaque;
		}else {
			System.out.println("Saldo indisponivel");
			System.out.println("Voce tem apenas R$");
			return saldo;
		}
	}
	
	double consultarSaldo() {
		System.out.println("Seu saldo e R$ ");
		return saldo;
	}
	
	double depositarDinheiro(double deposito) {
		//Scanner
		Scanner scan = new Scanner(System.in);
		//Ação
		System.out.println("Qual valor voce deseja depositar?");
		deposito = scan.nextDouble();
		
		saldo = saldo + deposito;
		System.out.println("Voce depositou R$ " + deposito);
		System.out.println("Seu saldo agora e de R$");
		return saldo;
	}
	
}

	
