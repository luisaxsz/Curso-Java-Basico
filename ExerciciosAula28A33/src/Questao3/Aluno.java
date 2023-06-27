package Questao3;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private String curso;
	private String[] disciplinas = new String[3];
	private double[][] notas = new double[3][3];
	private int codAluno;

	public Aluno(String nome, String curso, String[] disciplinas, double[][] notas, int codAluno) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
		this.codAluno = codAluno;
	}

	public Aluno() {

	}

	public void requisitarAluno() {
		// Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.println("Digite seu codigo: ");
		codAluno = scan.nextInt();
		scan.nextLine();
		System.out.println("Digite o nome do seu curso: ");
		curso = scan.nextLine();
	}

	public void requisitarNotasDisciplinas() {
		// Scanner
		Scanner scan = new Scanner(System.in);
		// Requesitar disciplinas
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Digite o nome da sua " + (i+1) + " disciplina: ");
			disciplinas[i] = scan.nextLine();
		}
		// Requesitar Notas
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Digite sua nota: ");
				notas[i][j] = scan.nextDouble();
			}
		}
	}

	private String situacao(int indicie) {
		double soma = 0;
		for (int i = 0; i < notas[indicie].length; i++) {
			soma += notas[indicie][i];
		}
		double media = soma / 3;

		if (media >= 7) {
			return "Voce foi aprovado";
		} else {
			return "Voce foi reprovado";
		}
	}
	
	public void mostrarInfo() {
		System.out.println("Aluno: " + nome);
		System.out.println("Matricula: " + codAluno);
		System.out.println("Curso: " + curso);
		
		for(int n  = 0; n < notas.length; n++) {
			System.out.println("Nome da disciplina: " + disciplinas[n]);
			for (int m = 0 ; m < notas.length ; m++) {
				System.out.print(notas[n][m] + "\t");
			}
			System.out.println("");
			System.out.println(situacao(0));
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public int getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

}
