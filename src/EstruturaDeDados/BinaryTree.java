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
	public No removerRecursivo(No root, int value) {
		// caso base
		if (root == null)
			return null;

		if (value < root.value) {
			root.left = removerRecursivo(root.left, value);
		} else if (value > root.value) {
			root.right = removerRecursivo(root.right, value);
		} else {
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;

			int minValue = new No().findMin(root.right);
			root.value = minValue;
			root.right = removerRecursivo(root.right, minValue);
		}
		return root;
	}



	@Override
	public void peek() {
		if (root == null) {
			return;
		}

		System.out.print(root.value);
	}

	@Override
	public void get() {
		printRecursivo(root);
	}

	public Integer pop(int value) {
		Integer min = new No().findValue(root, value);
		root = removerRecursivo(root, value);
		return min;
	}

}
