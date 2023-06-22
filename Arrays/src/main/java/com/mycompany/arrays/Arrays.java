/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Arrays {

    public static void main(String[] args) {
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        
        /*//Questao 1 - aula 19
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
        }*/
        
        //Questao 19 - aula 19
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
        
        
        
    }
}
