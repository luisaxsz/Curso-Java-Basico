/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseLampada;

/**
 *
 * @author maria
 */
public class testeLampada {
    public void main(String[] args){
        Lampada led = new Lampada();
        led.marca = "Avant";
        led.tipo = "Led";
        led.vidaUtil = 50;
        led.preco = 4.5;
        
        System.out.println("Marca: " + led.marca + led.vidaUtil + "Horas de vida util" );
        System.out.println("Valor: " + led.preco);
    }
}
