package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import EstruturaDeDados.ListLinked;

class ListLinkedTest {

	private final ListLinked list = new ListLinked();

	@Test
	void test() {
		list.add(10);
		list.add(20);
		list.add(30);

		Integer remove = list.pop();
		assertEquals(20, remove);

		list.get();
	}

}
