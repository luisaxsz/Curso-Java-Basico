package Questao4;

import java.util.Scanner;

public class ConversaoDeUnidadesDeArea {
	private static double metro;
	private static double peQuadrado;
	private static double milha;
	private static double acre;
	private static double conversao;

	public static void escolhaConversao(int escolha) {
		System.out.println("Escolha o tipo de conversao: ");
		System.out.println("[1] Metros quadrados para pes quadrados");
		System.out.println("[2] pe quadrado para centimetros quadrados");
		System.out.println("[3] milha quadrada para acres");
		System.out.println("[4] acre para pes quadrados");
		Scanner scan = new Scanner(System.in);
		escolha = scan.nextInt();

		switch (escolha) {
		case 1:
			System.out.println(conversaoMetrosPes());
			break;
		case 2:
			System.out.println(conversaoPeCentimetros());
			break;
		case 3:
			System.out.println(conversaoMilhaAcres());
			break;
		case 4:
			System.out.println(conversaoAcresPesQuadrados());
			break;
		default:
			System.out.println("Digite um valor valido");
			;
			break;
		}
	}

	private static double conversaoMetrosPes() {
		double pesQuadrados = 10.76;

		System.out.println("Digite o valor que voce quer converter: ");
		Scanner scan = new Scanner(System.in);
		metro = scan.nextDouble();

		conversao = metro * pesQuadrados;

		return conversao;
	}

	private static double conversaoPeCentimetros() {
		double centimetrosQuadrados = 929;

		System.out.println("Digite o valor que voce quer converter: ");
		Scanner scan = new Scanner(System.in);
		peQuadrado = scan.nextDouble();

		conversao = peQuadrado * centimetrosQuadrados;

		return conversao;
	}

	private static double conversaoMilhaAcres() {
		double acres = 640;

		System.out.println("Digite o valor que voce quer converter: ");
		Scanner scan = new Scanner(System.in);
		milha = scan.nextDouble();

		conversao = milha * acres;

		return conversao;
	}

	private static double conversaoAcresPesQuadrados() {
		double pesQuadrados = 43.560;

		System.out.println("Digite o valor que voce quer converter: ");
		Scanner scan = new Scanner(System.in);
		acre = scan.nextDouble();

		conversao = acre * pesQuadrados;

		return conversao;
	}

	public static double getMetro() {
		return metro;
	}

	public static void setMetro(double metro) {
		ConversaoDeUnidadesDeArea.metro = metro;
	}

	public static double getPeQuadrado() {
		return peQuadrado;
	}

	public static void setPeQuadrado(double peQuadrado) {
		ConversaoDeUnidadesDeArea.peQuadrado = peQuadrado;
	}

	public static double getMilha() {
		return milha;
	}

	public static void setMilha(double milha) {
		ConversaoDeUnidadesDeArea.milha = milha;
	}

	public static double getAcre() {
		return acre;
	}

	public static void setAcre(double acre) {
		ConversaoDeUnidadesDeArea.acre = acre;
	}

	public static double getConversao() {
		return conversao;
	}

	public static void setConversao(double conversao) {
		ConversaoDeUnidadesDeArea.conversao = conversao;
	}
}
