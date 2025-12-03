package Algoritmos;
import Interfaces.NodeInterface;
import Node.No;

public class ListLinked implements NodeInterface{
	private No root;
	
	// Método adicionar Lista linkada
	@Override
	public void add(String value) {
		No node = new No();
		node.value = value;

		if(root == null) {
			root = node;
			return;
		}
		
		No temp = root;
		while(temp.right != null) {
			temp = temp.right;
		}
		
		temp.right = node;
		node.left = temp;
	
	}
	
	
	@Override
	public void get() {
		if(root == null) {
			return;
		}
		
		// Cria uma nova variavel nó temporária
		No temp = root;
		
		while(temp != null) {
			System.out.print(temp.value+ " ");
			temp = temp.right;
		}
	}


	@Override
	public void pop() {
		if(root == null) {
			return;
		}
		
	}

}
