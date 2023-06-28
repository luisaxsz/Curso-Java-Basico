package Questao3;

import java.util.Scanner;

public class Fatorial {
	private static int num;
	private static int resultado;
	
	public static void fatorial() {
		//Scanner 
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha um numero: ");
		num = scan.nextInt();
		System.out.println(calculoFatorial());
	}
	
	private static int calculoFatorial() {
		resultado = 1;
		for (int i = num; i > 1; i--) {
			resultado *= i;
		}
		return resultado;
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
