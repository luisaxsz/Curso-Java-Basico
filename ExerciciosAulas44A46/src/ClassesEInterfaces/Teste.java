package ClassesEInterfaces;

public class Teste {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		quadrado.setNome("Quadrado");
		quadrado.setCor("Amarelo");
		quadrado.setLado(2);
		
		Triangulo triangulo = new Triangulo();
		triangulo.setNome("Triangulo");
		triangulo.setCor("Verde");
		triangulo.setAltura(3);
		triangulo.setBase(3);
		
		Piramide piramide = new Piramide();
		piramide.setNome("Piramide");
		piramide.setCor("Azul");
		piramide.setAltura(4);
		piramide.setBase(4);
		
		Cubo cubo = new Cubo();
		cubo.setNome("Cubo");
		cubo.setCor("Vermelho");
		cubo.setLado(4);
		
		Circulo circulo = new Circulo();
		circulo.setNome("Circulo");
		circulo.setCor("Marrom");
		circulo.setRaio(2);
		
		Cilindro cilindro = new Cilindro();
		cilindro.setNome("Cilindro");
		cilindro.setCor("Laranja");
		cilindro.setRaio(4);
		cilindro.setAltura(3);
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0] = quadrado;
		figuras[1] = triangulo;
		figuras[2] = circulo;
		figuras[3] = cubo;
		figuras[4] = piramide;
		figuras[5] = cilindro;
		
		for (FiguraGeometrica figura : figuras) {
			System.out.println("-----------------");
			System.out.println(figura.getNome());
			
			if(figura instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figura;
				f2d.calcularArea();
			}
			
			if(figura instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figura;
				f3d.calcularArea();
				f3d.calcularVolume();
			}
		}
		
		
		

	}

}
