package Questao2;

import java.util.Scanner;

public class Calculadora {
	static int resultado = 0;
	
	static int somar(int num1, int num2){
		//Scanner 
		Scanner scan = new Scanner(System.in);
		System.out.println("==SOMAR==");
		System.out.println("Insira o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.println("Insira o segundo valor");
		num2 = scan.nextInt();
		
		resultado = num1 + num2;
		
		return resultado;
	}
	
	static int subtracao(int num1, int num2) {
		//Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("==SUBTRACAO==");
		System.out.println("Insira o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.println("Insira o segundo valor");
		num2 = scan.nextInt();
		
		resultado = num1 - num2;
		
		return resultado;
		
	}
	static int multiplicacao(int num1, int num2) {
		//Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("==MULTIPLICACAO==");
		System.out.println("Insira o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.println("Insira o segundo valor");
		num2 = scan.nextInt();
		
		resultado = num1 - num2;
		
		return resultado;
		
	}
	
	static int divisao(int num1, int num2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("==DIVISAO==");
		System.out.println("Insira o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.println("Insira o segundo valor");
		num2 = scan.nextInt();
		
		resultado = num1/num2;
		
		return resultado;
	}
	
	static int potenciacao(int num1, int num2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("==POTENCIACAO==");
		System.out.println("Insira o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.println("Insira o segundo valor");
		num2 = scan.nextInt();
		
		resultado = (int) Math.pow(num1, num2);
		
		return resultado;
		
	}
	
	public static double mostrarResultado() {
		return resultado;
	}
	
}
