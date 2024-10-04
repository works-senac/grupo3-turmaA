package jogo.grupo3.turmaA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        boolean continuar = true;

        while (continuar) {
            limparTela(100);
            // https://patorjk.com/software/taag/#p=display&f=Small%20Slant&t=A%20Lenda%20de%20Silverhollow
            System.out.println("""
                    ╔═════════════════════════════════════════════════════════════════════════════════════════════════╗
                    ║                                                                                                 ║
                    ║     ___       __            __          __       _____ __             __        ____            ║
                    ║    / _ |     / /__ ___  ___/ /__ _  ___/ /__    / __(_) /  _____ ____/ /  ___  / / /__ _    __  ║
                    ║   / __ |    / / -_) _ \\/ _  / _ `/ / _  / -_)  _\\ \\/ / / |/ / -_) __/ _ \\/ _ \\/ / / _ \\ |/|/ /  ║
                    ║  /_/ |_|   /_/\\__/_//_/\\_,_/\\_,_/  \\_,_/\\__/  /___/_/_/|___/\\__/_/ /_//_/\\___/_/_/\\___/__,__/   ║
                    ║                                                                                                 ║
                    ║                                                                                                 ║
                    ╚═════════════════════════════════════════════════════════════════════════════════════════════════╝
                    """);
            // https://ozh.github.io/ascii-tables/
            System.out.print("""
                    ╔══════════════════╗
                    ║  Menu Principal  ║
                    ╠══════════════════╣
                    ║ 1. Iniciar Jogo  ║
                    ║ 2. Carregar Jogo ║
                    ║ 3. Configurações ║
                    ║ 4. Créditos      ║
                    ║ 5. História      ║
                    ║ 0. Sair          ║
                    ╚══════════════════╝
                    """);
            int option = verifyIntEntry("Sua escolha: ");
            switch (option) {
                case 1 -> iniciarJogo();
                case 2 -> carregarJogo();
                case 3 -> configurations();
                case 4 -> credits();
                case 0 -> {
                    System.out.println("Saindo do jogo...");
                    continuar = false;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
        scanner.close();
    }

    public void iniciarJogo() {
        limparTela(100);
        System.out.println("Jogo iniciado!");
    }

    public void carregarJogo() {
        boolean voltar = false;
        while (!voltar) {
            limparTela(100);
            System.out.println("Carregando jogo...");
            voltar = voltarMenu();
        }
    }

    public void configurations() {
        boolean voltar = false;
        while (!voltar) {
            limparTela(100);
            System.out.println("Abrindo configurações...");
            voltar = voltarMenu();
        }
    }

    public void credits() {
        boolean voltar = false;
        while (!voltar) {
            limparTela(100);
            System.out.print("""
                    ╔════════════════════════════════════════════════╗
                    ║              Senac SP - Santo Amaro            ║
                    ╠════════════════════════════════════════════════╣
                    ║   Curso Analise e Desenvolvimento de Sistemas  ║
                    ║   1º Semestre - Projeto Integrador - Turma A   ║
                    ║                   Grupo 3                      ║
                    ║                                                ║
                    ║                 Integrantes:                   ║
                    ║ - Gilvan Matos                                 ║
                    ║ - Gustavo Rego                                 ║
                    ║ - Kaynan Castro                                ║
                    ║ - Raul Soares                                  ║
                    ╚════════════════════════════════════════════════╝
                    """);
            voltar = voltarMenu();
        }
    }

    private boolean voltarMenu() {
        boolean response = false;
        int exitOption = 0;
        int input = verifyIntEntry(String.format("Pressione %d para voltar ao menu principal.%n", exitOption));
        if (input == exitOption) {
            response = true;
        }
        return response;
    }

    private void limparTela(int quantidadeDeLinhas) {
        for (int i = 0; i < quantidadeDeLinhas; i++) {
            System.out.println();
        }
    }

    private int verifyIntEntry(String inputText) {
        int option = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(inputText);
                option = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Por favor, insira um número válido.");
                scanner.next();
            }
        }
        return option;
    }
}
