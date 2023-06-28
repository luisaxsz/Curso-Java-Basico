package ClasseObject;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setCursos("Computação");
		double[] notas = {7.5 , 9, 8};
		aluno.setNotas(notas);
		
		System.out.println(aluno.toString());
		
		String txt1 = "aaa";
		String txt2 = "aaa";
		
		System.out.println(txt1.equals(txt2)); 
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCursos("Computação");
		double[] notas2 = {7.5 , 9, 8};
		aluno2.setNotas(notas2);
		
		//compara referencia
		//System.out.println(aluno == aluno2);
		
		//Compara atributos
		System.out.println(aluno.equals(aluno2));
		

	}

}
