/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arrays;

/**
 *
 * @author maria
 */
public class Arrays {

    public static void main(String[] args) {
        int inteirosA[] = new int[5];
        int inteirosB[] = new int[5];

        inteirosA[0] = 1;
        inteirosA[1] = 2;
        inteirosA[2] = 3;
        inteirosA[3] = 4;
        inteirosA[4] = 5;

        for (int i = 0; i < 5; i++) {
            inteirosB[i] = inteirosA[i];
            System.out.println(inteirosB[i]);
        }
    }
}
