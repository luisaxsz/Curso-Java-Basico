/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Arrays {

    public static void main(String[] args) {
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        //Questao 1 - aula 19
        System.out.println("=====Vetores com mesmos valores=====");
        int inteirosA[] = new int[5];
        int inteirosB[] = new int[5];

        inteirosA[0] = 10;
        inteirosA[1] = 20;
        inteirosA[2] = 30;
        inteirosA[3] = 40;
        inteirosA[4] = 50;
        
        for (int i = 0; i < inteirosA.length; i++) {
            inteirosB[i] = inteirosA[i];
            System.out.println(inteirosB[i]);
        }
        
        //Questao 19 - aula 19
        System.out.println("=====Armarzenamento de notas e médias=====");
        double notas1[] = new double [10];
        double notas2[] = new double [10];
        double medias[] = new double [10];
        
        for (int j = 0 ; j < notas1.length; j++){
            System.out.println("Digite sua primeira nota: "); 
            notas1[j] = scan.nextDouble();
            System.out.println("===========================");
            System.out.println("Digite sua segunda nota: ");
            notas2[j] = scan.nextDouble();
            medias[j] = (notas1[j] + notas2[j])/2;
            if (medias[j] < 7){
                System.out.println("Sua media foi: " + medias[j]);
                System.out.println("Reprovado");
            }else {
                System.out.println("Sua media foi: " + medias[j]);
                System.out.println("Aprovado");
            }
        }
        
        //Questão 20 - aula 19 
        System.out.println("=====Conversão reais em dolar=====");
        double conversao[] = new double[21];
        
        for (int h = 1; h < conversao.length;h++){
            conversao[h] = h*4.77;
            System.out.println("O valor R$" + h + " em dolars é: " + conversao[h]);
        }
        
        //Questao 23 - Aula 19 
        System.out.println("=====Vetores Pares=====");
        int numeros[] = new int[10];
        
        for (int n = 0 ; n < numeros.length; n++){
            System.out.println("Digite um numero: ");
            numeros[n] = scan.nextInt();
            
            if(numeros[n]%2 == 0){
                System.out.println(numeros[n]);
            }else{
                break;
            }
        }
        
        /*//Questao 24 - Aula 16 
        System.out.println("=====Palídromos=====");
        int numeros02[] = new int[4];
        
        for (int m = 0 ; m < numeros02.length; m++){
            Random rand = new Random();
            numeros02[m] = rand.nextInt(500) + 0;*  
        }*/
           
            
        
    }
}
