package Interfaces;

public class Cachorro  extends Mamifero implements AnimalEstimacao{
	private int tamanho;
	private String raca;

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void amamentar() {
	
	}

	@Override
	public void emitirSom() {
		
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void passear() {
		// TODO Auto-generated method stub
		
	}

}
