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



	@Override
	public void peek() {
		if (root == null) {
			return;
		}
		System.out.print(root.value);
	}

	@Override
	public void get() {
		No temp = root;

		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.right;
		}
		
	}


	// Remove o root atual e coloca anterior
	public Integer pop() {
		if (root == null) {
			return null;
		}
		root = root.right;
		return root.value;
	}

}
