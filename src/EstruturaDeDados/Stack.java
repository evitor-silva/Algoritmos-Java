package EstruturaDeDados;

import Interfaces.NodeInterface;
import Node.No;

//Lifo
public class Stack implements NodeInterface {
	private No root;

	// Método adicionar Pilha
	public void add(Integer value) {
		No node = new No();
		node.value = value;

		// node.right coloque o node raiz
		node.right = root;

		// Coloca o novo node como root
		this.root = node;

	}

	// Remove o root atual e coloca anterior
	public void pop() {
		if (root == null) {
			return;
		}
		// Deixa como root o nó anterior
		root = root.right;
	}

	@Override
	public void get() {
		No temp = root;

		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.right;
		}

	}

	@Override
	public void peek() {
		if (root == null) {
			return;
		}
		// retorna valor atual do nó
		System.out.print(root.value);
	}

}
