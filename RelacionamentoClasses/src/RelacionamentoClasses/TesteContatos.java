package RelacionamentoClasses;

public class TesteContatos {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("tyrion");
		
		//criar objeto endereco
		Endereco end = new Endereco();
		
		end.setNomeRua("caripunas");
		end.setNumero("n/a");
		end.setComplemento("n/a");
		//Setar endereço
		contato.setEndereco(end);
		//mostrar valor
		System.out.println(contato.getEndereco().getComplemento());
		//Deixar mais seguro 
		if(contato.getEndereco() != null && contato != null) {
			System.out.println(contato.getEndereco().getComplemento());
		}
		
		//Setado classe telefone
		Telefone pessoal = new Telefone();
		
		pessoal.setTipo("celular");
		pessoal.setNumero("9999-9999");
		pessoal.setDdd("91");
		
		//contato.setTelefone(tel);
		
		Telefone casa = new Telefone();
		
		casa.setTipo("celular");
		casa.setNumero("7777-7777");
		casa.setDdd("91");
		
		//Colocar em array de telefone
		
		Telefone[] telefones = new Telefone[2];
		
		telefones[0] = pessoal;
		telefones[1] = casa;
		
		contato.setTelefones(telefones);
		
		if (contato.getTelefones() != null && contato != null) {
			for (Telefone tel : contato.getTelefones()) {
				System.out.println(tel.getNumero());
			}
		}
		
		
		

	}

}
