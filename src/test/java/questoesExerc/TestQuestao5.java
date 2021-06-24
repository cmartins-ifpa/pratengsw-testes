package questoesExerc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestQuestao5 {
	List<Integer> s = null;

	@Test
	void test1() {
		s = new ArrayList<Integer>();
		assertTrue(s.isEmpty());
	}

	@Test
	public void test2() {
		s = new ArrayList<Integer>();
		s.add(1);
		assertFalse(s.isEmpty());
	}

	@Test
	public void test3() {
		s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		assertEquals(3, s.size());
		assertEquals(1, s.get(0).intValue());
		assertEquals(2, s.get(1).intValue());
		assertEquals(3, s.get(2).intValue());
	}

	@Test
	public void test4() {
		s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		int elem = s.remove(2);
		assertEquals(3, elem);
		assertEquals(1, s.get(0).intValue());
		assertEquals(2, s.get(1).intValue());
	}

	@Test
	public void test5() {
		s = new ArrayList<Integer>();
		s.add(1);
		s.remove(0);
		assertEquals(0, s.size());
		assertTrue(s.isEmpty());
	}

	@Test // na versao JUnit 4 usar (expected = IndexOutOfBoundsException.class)
	public void test6() {
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			s = new ArrayList<Integer>();
			s.add(1);
			s.add(2);
			s.remove(2);
		});
	}

}
