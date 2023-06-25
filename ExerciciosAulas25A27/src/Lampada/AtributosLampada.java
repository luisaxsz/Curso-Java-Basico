package Lampada;

public class AtributosLampada {

	public static void main(String[] args) {
		Lampada led = new Lampada();
		led.marca = "Avant";
		led.tipo = "Led";
		led.vidaUtil = 50;
		led.preco = 4.5;
		
	
		System.out.println(led.escolherModo(0));
		
		
	}

}
