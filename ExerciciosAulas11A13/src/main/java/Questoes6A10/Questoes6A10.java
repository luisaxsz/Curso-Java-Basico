/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questoes6A10;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Questoes6A10 {
    public static void main(String[] args){
        //Scanner
        Scanner scan = new Scanner (System.in);
        
        //Questao 6 
        System.out.println("Digite o tamanho do raio do circulo:\t");
        double raio = scan.nextDouble();
        double areaRaio = 3.14*Math.pow(raio,2);
        System.out.println("A área do seu circulo é de:\t" + areaRaio);
        
        //Questao 7 
        System.out.println("Calcule a área do quadrado");
        System.out.println("Digite o tamanho do lado do quadrado:\t");
        double lado = scan.nextDouble();
        double area = Math.pow(lado,2);
        System.out.println("A área do quadrado é: " + area);
        double areaDobro = area*2;
        System.out.println("O dobro dessa área é de: " + areaDobro);
       
        //Questao 8
        System.out.println("Quanto você ganha por hora? ");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalhou nesse mês?");
        double horasTrabalhadas = scan.nextDouble();
        double salario = valorHora*horasTrabalhadas;
        System.out.println("Seu salário é de: " + salario);
        
        //Questao 9
        System.out.println("Conversão de farenheit para celcius");
        System.out.println("Insira o valor em farenheit: ");
        double farenheit = scan.nextDouble();
        double celcius =(farenheit - 32)*5/9 ;
        System.out.println("O valor " + farenheit +" em farenheit é igual a " + celcius + " em celcius");
        
        //Questao 10 
        System.out.println("Conversão de celcius para farenheit");
        System.out.println("Insira o valor da temperatura em celcius: ");
        double celcius02 = scan.nextDouble();
        double farenheit02 = (celcius02*9/5)+32;
        System.out.println("O valor " + celcius02 + " em celcius é igual a " + farenheit02 + " em farenheit" );
    }
}
