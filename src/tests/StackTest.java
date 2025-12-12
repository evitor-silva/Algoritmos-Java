package tests;

import EstruturaDeDados.Stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	private final Stack stack = new Stack();

	@Test
	void test() {

		stack.add(10);
		stack.add(20);
		stack.add(30);

		// stack.get();
		stack.pop();
		stack.get();
	}

}
