package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import EstruturaDeDados.BinaryTree;

class BinaryTreeTest {

	private final BinaryTree tree = new BinaryTree();

	@Test
	void test() {
		tree.add(10);
		tree.add(20);
		tree.add(30);

		// tree.get();
		tree.pop();
		tree.get();
	}

}
