package Programa_Banco;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarCliente(filaClientes, scanner);
                    break;
                case 2:
                    listarClientes(filaClientes);
                    break;
                case 3:
                    chamarCliente(filaClientes);
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1: Adicionar um novo Cliente na fila.");
        System.out.println("2: Listar todos os Clientes na fila.");
        System.out.println("3: Chamar (retirar) uma pessoa da fila.");
        System.out.println("0: Sair do programa.");
    }

    private static void adicionarCliente(Queue<String> filaClientes, Scanner scanner) {
        System.out.print("\nDigite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        filaClientes.add(nomeCliente);
        System.out.println("\nCliente Adicionado!");
    }

    private static void listarClientes(Queue<String> filaClientes) {
        System.out.println("\nLista de Clientes na Fila: ");
        for (String cliente : filaClientes) {
            System.out.println(cliente);
        }
    }

    private static void chamarCliente(Queue<String> filaClientes) {
        if (filaClientes.isEmpty()) {
            System.out.println("\nA Fila está vazia!");
        } else {
            String clienteChamado = filaClientes.poll();
            System.out.println("\nO Cliente foi Chamado!");
        }
    }
}

