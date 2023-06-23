/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.matrizes;

import java.util.Random;

/**
 *
 * @author maria
 */
public class Matrizes {

    public static void main(String[] args) {
        //Questão 1 - Aula 20 
        int[][] matriz01 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Random rand = new Random();
                matriz01[i][j] = rand.nextInt(9) + 0;
                System.out.print(matriz01[i][j]);
            }
            System.out.println("");
        }
    }
}
