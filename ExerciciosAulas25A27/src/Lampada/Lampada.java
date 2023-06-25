package Lampada;

import java.util.Scanner;

public class Lampada {
    String marca;
    String tipo;   
    int vidaUtil;
    double preco;
    
   String escolherModo(int ligarDesligar) {
	   //Scanner 
	   Scanner scan = new Scanner(System.in);
	   //Acoes
	   System.out.println("Para ligar a lampada digite [1]");
	   System.out.println("Para desligar a lampada digite[2]");
	   
	   ligarDesligar = scan.nextInt();
	   
	   if (ligarDesligar == 1) {
		   return "A lampada esta ligada!";
	   }else {
		   return "A lampada esta desligada";
	   }
   }
}
