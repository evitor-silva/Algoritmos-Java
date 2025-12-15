package EstruturaDeDados;

import Interfaces.NodeInterface;
import Node.No;

//Lista linkada com 2 ponteiros
public class ListLinked implements NodeInterface {
	private No root;
	private No tail;

	// Método adicionar Lista linkada
	public void add(Integer value) {
		No node = new No();
		node.value = value;

		if (root == null) {
			tail = node;
			root = node;
			return;
		}

		No temp = root;

		while (temp.right != null) {
			temp = temp.right;
		}

		node.left = tail;
		temp.right = node;

		tail = node;
	}

	@Override
	public void peek() {

		System.out.print(root.value);
	}

	// Remove ultimo nó do root
	public Integer pop() {
		No temp = root;

		if (temp == null)
			return null;

		if (temp.right == null) {
			root = null;
			return null;
		}

	
		while (temp.right != null) {
			temp = temp.right;
		}

		tail = temp.left;
		temp.left.right = null;
		return tail.value;

	}

	@Override
	public void get() {
		if (root == null) {
			return;
		}

		No temp = root;

		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.right;
		}

	}

}
