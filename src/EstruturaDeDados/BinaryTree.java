package EstruturaDeDados;

import Interfaces.NodeInterface;
import Node.No;

public class BinaryTree implements NodeInterface {

	private No root;

	public void add(Integer value) {
		root = recursivo(root, value);
	}

	private No recursivo(No root, Integer value) {
		No node = new No();
		node.value = value;

		if (root == null) {
			return root = node;
		}

		if (value > root.value) {
			root.right = recursivo(root.right, value);
		} else if (value < root.value) {
			root.left = recursivo(root.left, value);
		}

		return root;
	}

	public void printRecursivo(No root) {
		// caso base
		if (root != null) {
			System.out.print(root.value + " ");
			printRecursivo(root.left);
			printRecursivo(root.right);
		}

	}

	// Remove menor valor da folha
	public No removerRecursivo(No root) {
		// caso base
		if (root == null)
			return null;

		if (root.left == null && root.right == null)
			return null;
		if (root.left != null) {
			root.left = removerRecursivo(root.left);
		} else {
			root.right = removerRecursivo(root.right);
		}

		return root;
	}

	private int findMin(No node) {
		while (node.left != null) {
			node = node.left;
		}
		return node.value;
	}

	@Override
	public void pop() {
		if (root == null) {
			return;
		}
		removerRecursivo(root);
	}

	@Override
	public void peek() {
		if (root == null) {
			return;
		}
		// TODO Auto-generated method stub
		System.out.print(root.value);
	}

	@Override
	public void get() {
		printRecursivo(root);
	}

}
