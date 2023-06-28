package Questao5;

import java.util.Scanner;

public class ConversaoVolume {
	private static double litros;
	private static double metrosCubicos;
	private static double galaoAmericano;
	private static double conversao;

	public static void escolhaConversao(int escolha) {
		System.out.println("Escolha o tipo de conversao: ");
		System.out.println("[1] Litros para centimetros cubicos");
		System.out.println("[2] Metros cubicos para litros");
		System.out.println("[3] Metros cubicos para pes cubicos");
		System.out.println("[4] galao americano para polegadas cubicas");
		System.out.println("[5] galao americano para litros");
		Scanner scan = new Scanner(System.in);
		escolha = scan.nextInt();

		switch (escolha) {
		case 1:
			System.out.println(conversaoLitroCentimetrosCubicos(0));
			break;
		case 2:
			System.out.println(conversaoMetroCubicoLitros(0));
			break;
		case 3:
			System.out.println(conversaoMetrosCubicosPesCubicos(0));
			break;
		case 4:
			System.out.println(conversaoGalaoAmericanoPolegadasCubicas(0));
			break;
		case 5:
			System.out.println(conversaoGalaoAmericanoLitros(0));
			;
			break;
		default:
			System.out.println("Digite um valor valido");
			;
			break;
		}
	}
	
	private static String conversaoLitroCentimetrosCubicos(double centimetrosCubicos) {
		centimetrosCubicos = 1000;

		System.out.println("Digite o valor que voce quer converter: ");
		Scanner scan = new Scanner(System.in);
		litros = scan.nextDouble();

		conversao = litros * centimetrosCubicos;

		return conversao + " Centimetros Cubicos";
	}

	private static String conversaoMetroCubicoLitros(double litros) {
		litros = 1000;

		System.out.println("Digite o valor que voce quer converter: ");
		Scanner scan = new Scanner(System.in);
		metrosCubicos = scan.nextDouble();

		conversao = metrosCubicos * litros;

		return conversao + " Litros";
	}

	private static String conversaoMetrosCubicosPesCubicos(double pesCubicos) {
		pesCubicos = 35.32;

		System.out.println("Digite o valor que voce quer converter: ");
		Scanner scan = new Scanner(System.in);
		metrosCubicos = scan.nextDouble();

		conversao = metrosCubicos * pesCubicos;

		return conversao + " Pes Cubicos";
	}

	private static String conversaoGalaoAmericanoPolegadasCubicas(double polegadasCubicas) {
		polegadasCubicas = 231;

		System.out.println("Digite o valor que voce quer converter: ");
		Scanner scan = new Scanner(System.in);
		galaoAmericano = scan.nextDouble();

		conversao = galaoAmericano * polegadasCubicas;

		return conversao + " Polegadas Cubicas";
	}

	private static String conversaoGalaoAmericanoLitros(double litros) {
		litros = 3785;

		System.out.println("Digite o valor que voce quer converter: ");
		Scanner scan = new Scanner(System.in);
		galaoAmericano = scan.nextDouble();

		conversao = galaoAmericano * litros;

		return conversao + " Litros";
	}

	public static double getLitro() {
		return litros;
	}

	public static void setLitro(double litro) {
		ConversaoVolume.litros = litro;
	}

	public static double getMetroCubico() {
		return metrosCubicos;
	}

	public static void setMetroCubico(double metroCubico) {
		ConversaoVolume.metrosCubicos = metroCubico;
	}

	public static double getConversao() {
		return conversao;
	}

	public static void setConversao(double conversao) {
		ConversaoVolume.conversao = conversao;
	}

	public static double getGalaoAmericano() {
		return galaoAmericano;
	}

	public static void setGalaoAmericano(double galaoAmericano) {
		ConversaoVolume.galaoAmericano = galaoAmericano;
	}
}
