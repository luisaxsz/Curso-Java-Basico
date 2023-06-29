package CastingEInstanceOf;

public class Teste02 {

	public static void main(String[] args) {
		Object obj1 = obterString();
		
		String s1 = (String) obj1;//DownCasting
		
		Object obj2 = "Minha String";
		String s2 = (String) obj2;
		
		Object obj3 = new  Object();
		String s3 = (String) obj3; //=> vai falhar em tempo de execução -> não referencia a String

	}
	
	public static String obterString() {
		return "Minha String";
	}

}
