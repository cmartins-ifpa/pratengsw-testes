package questoesExerc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class StackTest {

	@Test
	public void testEmptyStackException() {
		boolean sucesso = false;
		try {
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(10);
			int r = stack.pop();
			r = stack.pop(); // força a exception=> remove um elemento null
		} catch (EmptyStackException e) {
			sucesso = true;
		}
		assertTrue(sucesso);
	}

	// usando JUnit 4 e com expectativa de exceção
	@org.junit.Test(expected = java.util.EmptyStackException.class)
	public void testEmptyStackException2() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		int result = stack.pop();
		result = stack.pop(); // força a exception
	}

	// Usando JUnit 5
	@org.junit.jupiter.api.Test
	void testExpectedException() {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);

		// Primeiro argumento - especifica a exceção esperada.
		// "() ->" Aguarda que o bloco de código lance a Exception
		// Segundo argumento - é o bloco de código executável ou expressão lambda
		Assertions.assertThrows(java.util.EmptyStackException.class, () -> {
			int result = stack.pop();
			result = stack.pop(); // força a exception
		});

	}
}
