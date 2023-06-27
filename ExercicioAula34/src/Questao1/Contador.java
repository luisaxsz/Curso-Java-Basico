package Questao1;

public class Contador {
	static int  count;
	
	public Contador() {
		count++;
	}
	
	public static void zerar() {
		count = 0;
	}
	
	public static int mostarContador() {
		return count;
	}
}
