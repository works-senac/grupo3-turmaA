package jogo.grupo3.turmaA;

import jogo.grupo3.turmaA.utils.Utils;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        boolean continuar = true;

        while (continuar) {
            Utils.limparTela(100);
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
                    ║ 2. Instruções    ║
                    ║ 3. Créditos      ║
                    ║ 4. História      ║
                    ║ 0. Sair          ║
                    ╚══════════════════╝
                    """);
            int option = (int) Utils.verifyEntry("Sua escolha: ", scanner, "int");
            switch (option) {
                case 1 -> iniciarJogo();
                case 2 -> gameInstructions();
                case 3 -> credits();
                case 4 -> contarHistoria();
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
        Utils.limparTela(100);
        boolean voltar = false;
        while (!voltar) {
            System.out.println("Escolha uma dificuldade para os desafios: ");
            System.out.println("1. Normal");
            System.out.println("2. Difícil");
            int input = (int) Utils.verifyEntry("", scanner, "int");
            Utils.limparTela(100);
            History history = new History(input);
            System.out.println("Carregando jogo...");
            Utils.sleepTiming(5000);
            Utils.limparTela(100);
            history.showGame();
            voltar = Utils.returnScreen(scanner, 0);
        }
    }

    public void gameInstructions() {
        boolean voltar = false;
        while (!voltar) {
            Utils.limparTela(100);
            System.out.println("""
                    ╔════════════════════════════════════════════════╗
                    ║                Instruções de Jogo              ║
                    ╠════════════════════════════════════════════════╣
                    ║      Bem-vindo(a) ao mundo de Silverhollow!    ║
                    ║                                                ║
                    ║   Objetivo:                                    ║
                    ║   . Salvar a vila de Silverhollow da ameaça.   ║
                    ║                                                ║
                    ║   Controles:                                   ║
                    ║   . Use as teclas numéricas para selecionar    ║
                    ║     opções e tomar decisões.                   ║
                    ║                                                ║
                    ║   Dicas Iniciais:                              ║
                    ║   . Explore todas as opções e prepare-se para  ║
                    ║     enfrentar desafios.                        ║
                    ║   . Use seu livro de magias com sabedoria para ║
                    ║     aumentar suas chances de sucesso.          ║
                    ╚════════════════════════════════════════════════╝
                    """);
            voltar = Utils.returnScreen(scanner, 0);
        }
    }

    public void credits() {
        boolean voltar = false;
        while (!voltar) {
            Utils.limparTela(100);
            System.out.print("""
                    ╔════════════════════════════════════════════════╗
                    ║              Senac SP - Santo Amaro            ║
                    ╠════════════════════════════════════════════════╣
                    ║   Curso Analise e Desenvolvimento de Sistemas  ║
                    ║   1º Semestre - Projeto Integrador - Turma A   ║
                    ║                   Grupo 3                      ║
                    ║                                                ║
                    ║                 Integrantes:                   ║
                    ║ - Gustavo Rego                                 ║
                    ║ - Kaynan Castro                                ║
                    ║ - Raul Soares                                  ║
                    ╚════════════════════════════════════════════════╝
                    """);
            voltar = Utils.returnScreen(scanner, 0);
        }
    }

    public void contarHistoria() {
        boolean voltar = false;
        while (!voltar) {
            Utils.limparTela(100);
            System.out.print("""
                    ╔══════════════════════════════════════════════════════════════════╗
                    ║                     A Lenda de Silverhollow                      ║
                    ╠══════════════════════════════════════════════════════════════════╣
                    ║   Um jovem chamado Merlin vivia na vila de Silverhollow, um      ║
                    ║   lugar de paz e tranquilidade até que um vírus nulo surgiu,     ║
                    ║   trazendo caos e desespero. Merlin, um curandeiro em formação,  ║
                    ║   agora parte em uma jornada perigosa em busca da cura que       ║
                    ║   salvará sua vila.                                              ║
                    ╠══════════════════════════════════════════════════════════════════╣
                    ║                     Você será Merlin, o herói.                   ║
                    ║      Prepare-se para explorar, enfrentar desafios e salvar       ║
                    ║                 Silverhollow neste RPG épico!                    ║
                    ╚══════════════════════════════════════════════════════════════════╝
                    """);
            voltar = Utils.returnScreen(scanner, 0);
        }
    }
}