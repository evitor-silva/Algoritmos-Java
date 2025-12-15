import java.util.Scanner;

import EstruturaDeDados.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===== SELECIONE A ESTRUTURA =====");
		System.out.println("1 - Usar Stack (Pilha)");
		System.out.println("2 - Usar ListLinked (Lista Ligada)");
		System.out.println("3 - Usar Árvore binária");
		System.out.print("Escolha: ");
		int escolha = sc.nextInt();
		sc.nextLine();

		Stack stack = null;
		ListLinked list = null;
		BinaryTree tree = null;

		if (escolha == 1) {
			stack = new Stack();
			System.out.println("Você escolheu: Stack (Pilha)");
		} else if (escolha == 2) {
			list = new ListLinked();
			System.out.println("Você escolheu: ListLinked (Lista Ligada)");
		} else if (escolha == 3) {
			tree = new BinaryTree();
			System.out.println("Você escolheu: Árvore binária");
		} else {
			System.out.println("Opção inválida. Encerrando...");
			sc.close();
			return;
		}

		int opcao;
		do {
			System.out.println("\n===== MENU =====");
			System.out.println("1 - Adicionar elemento");
			System.out.println("2 - Remover ultimo elemento (pop)");
			System.out.println("3 - Mostrar elemento atual (peek)");
			System.out.println("4 - Mostrar todos os elementos");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o valor: ");
				int valor = sc.nextInt();
				if (stack != null) {
					stack.add(valor);
				} else if (list != null) {
					list.add(valor);
				} else {
					tree.add(valor);
				}
				System.out.println("Elemento \"" + valor + "\" adicionado!");
				break;

			case 2:
				System.out.println("Removido: ");
				if (stack != null) {
					System.out.println(stack.pop());
				} else if (list != null) {
					System.out.println(list.pop());
				} else {
					System.out.print("Digite o valor: ");
					int remov = sc.nextInt();
					System.out.println(tree.pop(remov));
				}
				break;

			case 3:
				if (stack != null) {

					System.out.println("Topo da pilha: ");
					stack.peek();

				} else if (list != null) {
					list.peek();
				} else {
					System.out.println("Topo da pilha: ");
					tree.peek();
				}
				break;

			case 4:
				if (stack != null) {
					System.out.println("Elementos da pilha: ");
					stack.get();
				} else if (tree != null) {
					tree.get();
				} else {
					System.out.println("Elementos da lista: ");
					list.get();
				}
				break;

			case 0:
				System.out.println("Encerrando...");
				break;

			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 0);

		sc.close();

	}
}
