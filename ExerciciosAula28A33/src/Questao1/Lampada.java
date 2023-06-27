package Questao1;

import java.util.Scanner;

public class Lampada {
	private String marca;
    private String tipo;   
    private int vidaUtil;
    private double preco;
    
    public Lampada(){
    	
    }
    
	public Lampada(String marca, String tipo, int vidaUtil, double preco) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.vidaUtil = vidaUtil;
		this.preco = preco;
	}

	public String escolherModo(int ligarDesligar) {
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
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getVidaUtil() {
		return vidaUtil;
	}
	public void setVidaUtil(int vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
