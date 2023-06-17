/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questoes1A5;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Questoes1A5 {
    public static void main(String[] args){      
        //scanner
        Scanner scan = new Scanner(System.in);
        
        //Questao 1
        
        System.out.println("Alo Mundo!");
        
        //Questão 2
        System.out.println("Digite um número: ");
        int number = scan.nextInt();
        System.out.println("O número informado foi: " + number);
        
        //Questao 3
        System.out.println("Digite o primeiro valor: ");
        int value1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int value2 = scan.nextInt();
        int result = value1 + value2;
        System.out.println("O valor da soma de " + value1 + " + " + value2 + " é igual a: " + result);
        
        //Questão 4
        System.out.println("Caucule sua média");
        System.out.println("Digite sua nota do primeiro bimestre: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite sua nota do segundo bimestre: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite sua nota do terceiro bimestre: ");
        double nota3 = scan.nextDouble();
        System.out.println("Digite sua nota do quarto bimestre: ");
        double nota4 = scan.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("Sua média foi de: " + media);
        
        //Questao 5
        System.out.println("Conversão de metros para centimetros");
        System.out.println("Insira o valor que você deseja converter (Metros): ");
        double metros = scan.nextDouble();
        double conversao = metros * 100;
        System.out.println("O valor de " + metros + " metros em centimetros fica: " + conversao);
    }
}
