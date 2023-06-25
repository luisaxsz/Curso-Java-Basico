package Aluno;

import java.util.Scanner; 

public class Aluno {
	String nome;
	String curso;
	String[] disciplinas = new String[3];
	double[][] notas = new double[3][3];
	int codAluno;
	
	void requisitarAluno() {
		//Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.println("Digite seu codigo: ");
		codAluno = scan.nextInt();
		scan.nextLine();
		System.out.println("Digite o nome do seu curso: ");
		curso = scan.nextLine();
	}
	void requisitarNotasDisciplinas() {
		//Scanner
		Scanner scan = new Scanner(System.in);
		//Requesitar disciplinas
		for (int i = 0 ; i < disciplinas.length; i++) {
			System.out.println("Digite o nome da sua disciplina: " );
			disciplinas[i] = scan.nextLine();
		}
		//Requesitar Notas
		for (int i = 0 ; i < notas.length; i++) {
			for(int j = 0; j < notas.length; j++) {
				System.out.println("Digite sua nota: ");
				notas[i][j] = scan.nextDouble(); 
			}
		}
	}
	
	void situacao(int indicie) {
		double soma = 0;
		for (int i = 0; i <notas[indicie].length;i++) {
			soma+= notas[indicie][i];
		}
		double media = soma/3;
		
		if(media >= 7) {
			System.out.println("Voce foi aprovado");
		}else {
			System.out.println("Voce foi reprovado");
		}
}
	
	void mostrarInfo() {
		System.out.println("Aluno: " + nome);
		System.out.println("Matricula: " + codAluno);
		System.out.println("Curso: " + curso);
		
		for(int n  = 0; n < notas.length; n++) {
			System.out.println("Nome da disciplina: " + disciplinas[n]);
			for (int m = 0 ; m < notas.length ; m++) {
				System.out.print(notas[n][m] + "\t");
			}
			System.out.println("");
		}
	}
	
	
}
