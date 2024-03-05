package Programa_Banco;

import java.util.Stack;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarLivro(pilhaLivros, scanner);
                    break;
                case 2:
                    listarLivros(pilhaLivros);
                    break;
                case 3:
                    retirarLivro(pilhaLivros);
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
        System.out.println("1: Adicionar um novo livro na pilha.");
        System.out.println("2: Listar todos os livros da Pilha.");
        System.out.println("3: Retirar um livro da pilha.");
        System.out.println("0: Sair do programa.");
    }

    private static void adicionarLivro(Stack<String> pilhaLivros, Scanner scanner) {
        System.out.print("\nDigite o nome do livro: ");
        String nomeLivro = scanner.nextLine();
        pilhaLivros.push(nomeLivro);
        System.out.println("\nLivro adicionado!");
    }

    private static void listarLivros(Stack<String> pilhaLivros) {
        System.out.println("\nLista de Livros na Pilha:");
        for (String livro : pilhaLivros) {
            System.out.println(livro);
        }
    }

    private static void retirarLivro(Stack<String> pilhaLivros) {
        if (pilhaLivros.isEmpty()) {
            System.out.println("\nA Pilha está vazia!");
        } else {
            String livroRetirado = pilhaLivros.pop();
            System.out.println("\nUm Livro foi retirado da pilha!");
        }
    }
}
