package Algoritmos;
import Interfaces.NodeInterface;
import Node.No;

public class List implements NodeInterface{
	private No root;
	
	// Método adicionar Pilha
	@Override
	public void add(String value) {
		No node = new No();
		node.value = value;
		
		// Caso não exista o root coloque o node
		if(root == null) {
			root = node;
		}else {
			// Laço, caso não exista o root.next coloque o node
			while(root.next == null) {
				root.next = node;
			}
			// Coloca o novo node como root
			root = node;
		}
		
	}
}
