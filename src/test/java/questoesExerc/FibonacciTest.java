package questoesExerc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonacciTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testFib0a4() {
		assertEquals(0, Fibonacci.fib(0));
		assertEquals(1, Fibonacci.fib(1));
		assertEquals(1, Fibonacci.fib(2));
		assertEquals(2, Fibonacci.fib(3));
		assertEquals(3, Fibonacci.fib(4));
	}

}
