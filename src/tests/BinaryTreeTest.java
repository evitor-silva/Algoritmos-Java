package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import EstruturaDeDados.BinaryTree;

class BinaryTreeTest {

	private BinaryTree tree;

	@BeforeEach
	void setUp() {
		tree = new BinaryTree();
	}

	@Test
	void testAddAndGet() {
		tree.add(10);
		tree.add(20);
		tree.add(30);

	}

	@Test
	void testPopRemovesElement() {
		tree.add(10);
		tree.add(20);
		tree.add(30);

		Integer remove = tree.pop(20);
		assertEquals(20, remove);
		tree.get();

	}

	@Test
	void testEmptyTree() {

	}
}
