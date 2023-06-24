
package ClasseLampada;

public class testeLampada {
    public static void main(String[] args){
        Lampada led = new Lampada();
        led.marca = "Avant";
        led.tipo = "Led";
        led.vidaUtil = 50;
        led.preco = 4.5;
        
        System.out.println("Marca: " + led.marca + " "+ led.vidaUtil + " Horas de vida util" );
        System.out.println("Valor: " + led.preco);
    }
}
