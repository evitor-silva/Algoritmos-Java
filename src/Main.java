import java.util.Scanner;

import Algoritmos.ListLinked;
import Algoritmos.Stack;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);

        System.out.println("===== SELECIONE A ESTRUTURA =====");
        System.out.println("1 - Usar Stack (Pilha)");
        System.out.println("2 - Usar ListLinked (Lista Ligada)");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();
        sc.nextLine();

     
        Stack stack = null;
        ListLinked list = null;

        if (escolha == 1) {
            stack = new Stack();
            System.out.println("Você escolheu: Stack (Pilha)");
        } else if (escolha == 2) {
            list = new ListLinked();
            System.out.println("Você escolheu: ListLinked (Lista Ligada)");
        } else {
            System.out.println("Opção inválida. Encerrando...");
            sc.close();
            return;
        }

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar elemento");
            System.out.println("2 - Remover elemento (pop)");
            System.out.println("3 - Mostrar elemento atual (topo/get)");
            System.out.println("4 - Mostrar todos os elementos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor: ");
                    String valor = sc.nextLine();
                    if (stack != null) {
                        stack.add(valor);
                    } else {
                        list.add(valor);
                    }
                    System.out.println("Elemento \"" + valor + "\" adicionado!");
                    break;

                case 2:
                    if (stack != null) {
                          System.out.println("Removido: ");
                          stack.pop();
              
                    } else {
                    	System.out.println("Removido: ");
                    	list.pop();
                    }
                    break;

                case 3:
                    if (stack != null) {
                        //  System.out.println("Topo da pilha: " + stack.peek());
                
                    } else {
             
                    }
                    break;

                case 4:
                    if (stack != null) {
                        System.out.println("Elementos da pilha: " );
                        stack.get();
                    } else {
                        System.out.println("Elementos da lista: " );
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
