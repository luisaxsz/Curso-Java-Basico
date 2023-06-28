package Questao1;

public class Fibonacci {
	public static int fibonacci(int num) {
		if (num < 2) {
			return num;
		}
		return fibonacci(num-1) + fibonacci(num-2);
	}
}
