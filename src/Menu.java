import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        boolean continuar = true;

        while (continuar) {
            limparTela(100);

            System.out.println("=== Menu Principal ===");
            System.out.println("1. Iniciar Jogo");
            System.out.println("2. Carregar Jogo");
            System.out.println("3. Configurações");
            System.out.println("4. Créditos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    iniciarJogo();
                    break;
                case 2:
                    carregarJogo();
                    break;
                case 3:
                    configurations();
                    break;
                case 4:
                    credits();
                    break;
                case 0:
                    System.out.println("Saindo do jogo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
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
            System.out.println("*************************************************");
            System.out.println("*              Senac SP - Santo Amaro           *");
            System.out.println("*   Curso Analise e Desenvolvimento de Sistemas *");
            System.out.println("*                                               *");
            System.out.println("*  1º Semestre - Projeto Integrador - Turma A   *");
            System.out.println("*                    Grupo 3                    *");
            System.out.println("*                                               *");
            System.out.println("*                 Integrantes:                  *");
            System.out.println("*  - Gilvan Matos                               *");
            System.out.println("*  - Gustavo Rego                               *");
            System.out.println("*  - Kaynan Castro                              *");
            System.out.println("*  - Raul Soares                                *");
            System.out.println("*************************************************");
            voltar = voltarMenu();
        }
    }

    private boolean voltarMenu() {
        limparTela(1);
        boolean response = false;
        int exitOption = 0;
        System.out.printf("Pressione %d para voltar ao menu principal.%n", exitOption);
        int input = scanner.nextInt();
        if (input == exitOption) {
            response = true;
        } else {
            System.out.println("Opção inválida, tente novamente.");
        }
        return response;
    }

    private void limparTela(int quantidadeDeLinhas) {
        for (int i = 0; i < quantidadeDeLinhas; i++) {
            System.out.println();
        }
    }
}
