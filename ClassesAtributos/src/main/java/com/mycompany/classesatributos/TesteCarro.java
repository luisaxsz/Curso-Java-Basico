/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classesatributos;

/**
 *
 * @author maria
 */
public class TesteCarro {
    public static void main(String[] args){
        ClassesAtributos van = new ClassesAtributos(); 
        van.marca = "fiat";
        van.modelo = "ducato";
        van.numPassageiros = 10;
        van.capacidadeCombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        ClassesAtributos fusca = new ClassesAtributos();
        fusca.marca = "volkswagen";
        fusca.modelo = "fusca";
        fusca.numPassageiros = 4;
        fusca.capacidadeCombustivel = 1.2;
        
        System.out.println(fusca.marca);
        System.out.println(fusca.numPassageiros);
    }
}
