/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questoes11A14;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Questoes11A14 {
    public static void main(String[] args){
        //Scanner
        Scanner scan = new Scanner(System.in);
        
        //Questao 11
        System.out.println("Digite o primeiro numero inteiro: ");
        int valor1 = scan.nextInt();
        System.out.println("Digite segundo numero inteiro: ");
        int valor2 = scan.nextInt();
        System.out.println("Digite qualquer numero real: ");
        double valor3 = scan.nextDouble();
        double resultado01 = (valor1*2)*(valor2/2);
        System.out.println("O produto do dobro do primeiro valor com metade do segundo valor é de: " + resultado01);
        double resultado02 = (valor1*3)+valor3;
        System.out.println("A soma do triplo do primeiro com o terceiro é de: " + resultado02);
        double resultado03 = Math.pow(valor3,3);
        System.out.println("O terceiro valor elevado ao cubo é: " + resultado03);
        
        //Questao 12
        System.out.println("**Calculo de peso ideal***");
        System.out.println("Insira sua altura: ");
        double altura = scan.nextDouble();
        double calculoDePeso = (72.7*altura)-58;
        System.out.println("Seu peso ideal é de: " + calculoDePeso);
        
        //Questao 13
        System.out.println("***Calculo de peso ideal baseado no seu sexo***");
        System.out.println("Qual sua altura? ");
        double altura02 = scan.nextDouble();
        System.out.println("Qual seu sexo? Digite [1] masculino  e [2] para feminino:\n");
        int sexo = scan.nextInt();
        if (sexo == 1){
            double pesoIdeal = (72.7*altura02)-58;
            System.out.println("Seu peso ideal é de: " + pesoIdeal);
        }else{
            double pesoIdeal = (62.1*altura02)-44.7;
            System.out.println("Seu peso ideal é de: " + pesoIdeal);
        } 
        
        //Questao 14
        System.out.println("***Sistema de rendimento de trabalho***");
        System.out.println("Insira o peso do peixe: ");
        double pesoPeixe = scan.nextDouble();
        if (pesoPeixe > 50){
            double pesoExcedente = pesoPeixe - 50;
            double calculoMulta = pesoExcedente*4;
            System.out.println("A multa foi de: " + calculoMulta);
        }else{
            System.out.println("A multa foi de: ZERO");
        }    
    }
}
