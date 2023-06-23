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
        int[][] matriz04 = new int[10][10];

        for (int i = 0; i < matriz04.length; i++) {
            for (int j = 0; j < matriz04.length; j++) {
                matriz04[i][j] = rand.nextInt(9) + 0;
                System.out.print(matriz04[i][j] + "\t");
            }
            System.out.println("");
        }

        int maiorL5 = 0;
        int menorL5 = Integer.MAX_VALUE;
        for (int j = 0; j < matriz04[5].length; j++) {
            if (matriz04[5][j] > maiorL5) {
                maiorL5 = matriz04[5][j];
            }
            if (matriz04[5][j] < menorL5) {
                menorL5 = matriz04[5][j];
            }
        }

        System.out.println("O maior da linha 5 é : " + maiorL5);
        System.out.println("O menor da linha 5 é : " + menorL5);

        int maiorC7 = 0;
        int menorC7 = Integer.MAX_VALUE;

        for (int i = 0; i < matriz04.length; i++) {
            for (int j = 0; j < matriz04[i][7]; j++) {
                if (matriz04[i][7] > maiorC7) {
                    maiorC7 = matriz04[i][7];
                }
                if (matriz04[i][7] < menorC7) {
                    menorC7 = matriz04[i][7];
                }
            }
        }

        System.out.println("O maior da coluna 7 é : " + maiorC7);
        System.out.println("O menor da coluna 7 é : " + menorC7);


        //Questao 3 - Aula 20
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

        
        //Questao  4 - Aula 20
        System.out.println("====Agenda Pessoal====");
        String [][] matriz03 = new String[2][3];
        
        for (int i = 0; i < matriz03.length ; i++){
            for(int j = 0 ; j < matriz03.length; j++){
                System.out.println("Adicione um compromisso: ");
                String compromisso = scan.nextLine();            
            }
        }
    }
}
