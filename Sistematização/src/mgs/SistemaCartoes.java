package mgs;

import java.util.Scanner;

public class SistemaCartoes {
    private static GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Buscar Funcionário");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 1) {
                adicionarFuncionario();
            } else if (opcao == 2) {
                buscarFuncionario();
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    private static void adicionarFuncionario() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Identificador: ");
        String identificador = scanner.nextLine();
        System.out.print("Alergias: ");
        String alergias = scanner.nextLine();
        System.out.print("Problemas Médicos: ");
        String problemasMedicos = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, identificador, alergias, problemasMedicos, telefone, email);
        gerenciador.adicionarFuncionario(funcionario);
        System.out.println("Funcionário adicionado com sucesso!\n");
    }

    private static void buscarFuncionario() {
        System.out.print("Identificador do Funcionário: ");
        String identificador = scanner.nextLine();
        Funcionario funcionario = gerenciador.buscarFuncionario(identificador);

        if (funcionario != null) {
            System.out.println("\nInformações do Funcionário:");
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}