package questoesExerc;

public class Fibonacci {
	/**
	 * Versão recursiva da função "fibonacci" fib(n)
	 * 
	 * @param n
	 * @return
	 */
	static long fib(int n) {
		return (n < 2) ? n : fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		// teste manual do programa. Imprime os 30 primeiros termos
		for (int i = 0; i < 30; i++) {
			System.out.println("fib(" + i + "):" + Fibonacci.fib(i) + "\t");
		}

	}
}
