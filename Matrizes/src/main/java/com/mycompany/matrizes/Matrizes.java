/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.matrizes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Matrizes {

    public static void main(String[] args) {
        //Scanner e Random
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        //Questão 1 - Aula 20 
        int[][] matriz01 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz01[i][j] = rand.nextInt(9) + 0;
                System.out.print(matriz01[i][j]);
            }
            System.out.println("");
        }

        //Questao 2 - Aula 20
        int matriz02[][] = new int[3][3];
        int countPares = 0;
        int countImpares = 0;
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.println("Insira um valor: ");
                matriz02[k][l] = scan.nextInt();
                if (matriz02[k][l] % 2 == 0) {
                    countPares++;
                } else {
                    countImpares++;
                }
            }
        }
        System.out.println("======Matriz======");
        for (int i = 0; i < matriz02.length; i++) {
            for (int j = 0; j < matriz02.length; j++) {
                System.out.print(matriz02[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("A quantidade de numeros pares é: " + countPares);
        System.out.println("A quantidade de numeros impares é: " + countImpares);
    }
}
