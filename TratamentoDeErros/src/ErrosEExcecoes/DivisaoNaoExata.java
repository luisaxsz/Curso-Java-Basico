package ErrosEExcecoes;

public class DivisaoNaoExata extends Exception  {
	private int num;
	private int denomi;
	
	
	
	public DivisaoNaoExata(int num, int denomi) {
		super();
		this.num = num;
		this.denomi = denomi;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + denomi + "nao e inteiro";
	}
	
	
}
