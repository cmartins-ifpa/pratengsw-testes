package questoesExerc;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
	private ArrayList<T> elements = new ArrayList<T>();
	public int size = 0;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	// empilha
	public void push(T elem) {
		elements.add(elem);
		size++;
	}

	// recupera/remove 
	public T pop() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException();
		T elem = elements.get(size - 1);
		size--;
		return elem;
	}
}
