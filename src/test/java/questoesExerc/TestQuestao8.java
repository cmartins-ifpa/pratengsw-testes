package questoesExerc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class TestQuestao8 {

	@Test
	public void test1() {
		LinkedList list = mock(LinkedList.class);
		when(list.size()).thenReturn(10);
		assertEquals(10, list.size());
	}

	@Test
	public void test2() {
		LinkedList list = mock(LinkedList.class);
		when(list.get(0)).thenReturn("Engenharia");
		when(list.get(1)).thenReturn("Software");
		String result = list.get(0) + " " + list.get(1);
		assertEquals("Engenharia Software", result);
	}

}
