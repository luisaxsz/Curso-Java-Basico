/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leituradados;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class LeituraDados {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = scan.nextLine();
        System.out.println(nome);
    }
}
