/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetores;

/**
 *
 * @author maria
 */
public class Vetores {

    public static void main(String[] args) {
        int arrayA[] = new int [5];
        int arrayB[] = new int[5];
        arrayB[0] = 1; 
        arrayB[1] = 2;
        arrayB[2] = 3;
        arrayB[3] = 4;
        arrayB[4] = 5;
        
        arrayA[] = arrayB[]; 
        
        for (int i = 0 ; i <=5 ; i++){
          System.out.println(arrayA[i]);
        }
    }
}
