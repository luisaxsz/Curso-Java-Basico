/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosrepeticao;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class ExerciciosRepeticao {

    public static void main(String[] args) {
        System.out.println("Exercicios de Repetição");
        
        //Scanner
        Scanner scan = new Scanner(System.in);
        
        //Questao 12 - Aula 16 17
        System.out.println("Digite um numero : ");
        int numero = scan.nextInt();
        if (numero > 0 && numero <= 10){
            for (int i = 0 ; i <= 10 ; i++ ){
               int multiplicacao = numero * i;
                System.out.println(numero + " X " + i + " "
                        + "= " +multiplicacao);
            }
        }
        
        //Questao 14 - Aula 16 17 
        System.out.println("***Fibonacci**");
        System.out.println("Digite até qual termo quer ir: ");
        int termo = scan.nextInt();
        System.out.println("*******************");
        int valorAnterior = 0;
        int proximoValor = 1;
        for (int j = 1; j <= termo;j++){
            int n = valorAnterior + proximoValor;
            valorAnterior = proximoValor;
            proximoValor = n;
            
            System.out.println(n);
        }
        
        //Questao 16 - Aula 16 
        System.out.println("***Fibonacci 002**");
        int valorAnterior02 = 0;
        int proximoValor02 = 1;
        int n02 = 0;
        while(n02 < 500){
            n02 = valorAnterior02 + proximoValor02;
            valorAnterior02 = proximoValor02;
            proximoValor02 = n02;
            System.out.println(n02);
        }
    }
}
