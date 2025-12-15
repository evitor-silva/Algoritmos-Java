package tests;

import EstruturaDeDados.Stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	private final Stack stack = new Stack();

	@Test
	void test() {

		stack.add(40);
		stack.add(20);
		stack.add(30);

	}
	
	@Test
	void testPopRemovesElement() {
		stack.add(10);
		stack.add(20);
		stack.add(30);

		Integer remove = stack.pop();
		assertEquals(20, remove);
		stack.get();

	}

}
