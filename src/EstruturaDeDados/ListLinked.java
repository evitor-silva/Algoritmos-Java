package Algoritmos;
import Interfaces.NodeInterface;
import Node.No;

//Lista linkada com 2 ponteiros
public class ListLinked implements NodeInterface{
	private No root;
	private No tail;
	
	// Método adicionar Lista linkada
	@Override
	public void add(String value) {
		No node = new No();
		node.value = value;

		if(root == null) {
			tail = node;
			root = node;
			return;
		}

		No temp = root;

		while(temp.right != null) {
			temp = temp.right;
		}

		node.left = tail;
		temp.right = node;

		tail = node;
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


	//Remove ultimo nó do root
	@Override
	public void pop() {
		No temp = root;
		
		if(temp == null)
			return;
		
		if(temp.right == null) {
			System.out.print(root.value);
			root = null;
			return;
		}

		//percorre até o ultimo nó
		while(temp.right != null) {
			temp = temp.right;
		}
		
		tail = temp.left;
		System.out.print(tail.right.value);
		temp.left.right = null;
		
	}

}
