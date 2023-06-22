/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questoes15A18;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Questoes15A18 {
   public static void main(String[] args){
       //Scanner
       Scanner scan = new Scanner(System.in);
       
       //Questao 15
       System.out.println("Quantas horas você trabalhou no mês?");
       double horasTrabalhadas = scan.nextDouble();
       System.out.println("Quanto você ganha por hora trabalhada?");
       double valorPorHoraTrabalhada = scan.nextDouble();
       double salario = valorPorHoraTrabalhada*horasTrabalhadas;
       System.out.println("Seu salario é de: " + salario);
       double pagoInss = salario*8/100;
       double restoSalario = salario - pagoInss;
       System.out.println("Você pagou ao INSS: " + pagoInss);
       double pagoImpostoDeRenda = restoSalario*11/100;
       restoSalario = restoSalario - pagoImpostoDeRenda;
       System.out.println("Você pagou para o imposto de renda: " + pagoImpostoDeRenda);
       double pagoSindicato = restoSalario*5/100;
       restoSalario = restoSalario - pagoSindicato;
       System.out.println("Você pagou ao Sindicato: " + pagoSindicato);
       double salarioLiquido = restoSalario;
       System.out.println("Seu salario liquido é de: " + salarioLiquido);
       
       //Questao 16 
       System.out.println("***Loja de tinta***");
       System.out.println("Qual tamanho da area a ser pintada? ");
       double areaAPintar = scan.nextDouble();
       double litros = areaAPintar/3;
       double latas = Math.round(litros/18);
       double valorFinal = latas * 80;
       System.out.println("Você precisa de " + latas + " latas");
       System.out.println("O valor final é de: R$" + valorFinal); 
       
       //Questão 17 
       System.out.println("***Loja de tinta***");
       System.out.println("Qual tamanho da area a ser pintada? ");
       double areaAPintar02 = scan.nextDouble();
       double litros02 = areaAPintar02/6;
       System.out.println("Voce precisa de: " + litros02 + " litros");
       System.out.println("Para comprar em galões de 3,6 Litros digite [1]");
       System.out.println("Para comprar em galões de 18 Litros digite [2]");
       int tipoGalao = scan.nextInt();
       
       if (tipoGalao == 1){
        double latas02 = litros02/3.6;
        double valorFinal02 = latas02 * 25;
        System.out.println("Você precisa de " + latas02 + " latas");
        System.out.println("O valor final é de: R$" + valorFinal02);  
       }else {
        double latas02 = litros02/18;
        double valorFinal02 = latas02 * 80;
        System.out.println("Você precisa de " + latas02 + " latas");
        System.out.println("O valor final é de: R$" + valorFinal02);  
       }
      
   }
   
}
