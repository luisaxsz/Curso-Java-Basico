package Questao1;

import java.util.Calendar;
import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria{
	private int diaRendimento;
	
	public void criarConta(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira seu nome:  ");
		setNomeCliente(scan.nextLine());
		System.out.println("Insira o numero da sua conta:  ");
		setNumConta(scan.nextInt());
		System.out.println("Insira o dia do seu rendimento:  ");
		setDiaRendimento(scan.nextInt());
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if(getDiaRendimento() == hoje.get(Calendar.DAY_OF_MONTH)) {
			//saldo += saldo * taxaRendimento
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = "ContaPoupanca";
		s += "\nNome Cliente: " + super.getNomeCliente();
		s += "\nNumero da Conta: " + super.getNumConta();
		s +=  "\nSaldo:" + super.getSaldo();
		s += "\nDia do Rendimento: " + this.diaRendimento;
		return s;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	
	

	
	
	
}
