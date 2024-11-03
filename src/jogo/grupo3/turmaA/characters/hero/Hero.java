package jogo.grupo3.turmaA.characters.hero;

import java.util.Scanner;

public class Hero {
    public static void main(String[] args) throws InterruptedException {
        Scanner hero = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String name = hero.next();
        System.out.println(
                name + ", ve sua vila infectada, porém como ainda era um jovem aprendiz de curandeiro ele acaba não conseguindo fazer nada.");
        System.out
                .println(name + " estava no seu treinamneto de curandeiro, no hospital da vila, quando derrepente...");
        System.out.println("Seus amigos te chamam apavorados!");
        System.out.println("Amigos: - " + name + " precisamos que você venha com a gente AGORA!!");
        int decision1;

        while (true) {
            System.out.println("Escolha uma ação:");
            System.out.println("1. Correr até sua casa com seus amigos");
            System.out.println("2. Ficar no treinamento de curandeiro");
            System.out.println("3. Sair");
            System.out.print("Digite o número da sua escolha: ");
            decision1 = hero.nextInt();

            switch (decision1) {
                case 1:
                    System.out.println("Você corre com eles até sua casa, e se depara com uma cena lamentável.");
                    System.out.println("Sua mãe contraiu o vírus!");
                    System.out.println(name + " faz os primeiros socorros e pede ao amigo para encontrar seu mestre!");
                    System.out.println("Seu mestre chega e usa seus poderes para salvá-la momentaneamente.");
                    System.out.println(name + " estava injuriado com o ocorrido.");
                    System.out.println(name
                            + ": - Mestre! Preciso fazer algo para resolver essa situação, a vila toda está morrendo!");
                    System.out.println(
                            "Mestre: - " + name + ", existe um jeito de conseguir salvar sua mãe e essa vila! ");
                    System.out.println(
                            name + ": - Como mestre? Diga-me para que possamos resolver isso de uma vez por todas!");
                    System.out.println(
                            "Mestre: - " + name
                                    + ", Existe uma lenda de uma flor curandeira que pode curar qualquer tipo de doença! ");
                    System.out.println(name
                            + ": - Então tomei minha decisão! Irei atrás da flor mágica, mestre, peço que cuide de minha mãe e da vila até eu encontra-la!");
                    System.out.println(
                            "Mestre: - " + "Mas calma garoto, você precisará disso para os desafios no caminho!");
                    System.out.println("Mestre entrega o livro de mágias para " + name);
                    System.out.println(
                            "Mestre: - Pronto agora você terá como encontrar a flor mágica , boa sorte em sua jornada, estaremos te esperando.");

                    System.out.println("Oh não! " + name
                            + " encontra o primeiro monstro! Pelo visto é um tipo de monstro de fogo! ");
                    int decision2;

                    while (true) {
                        System.out.println("Escolha uma ação:");
                        System.out.println("1. Abrir o livro de mágias e usar os golpes");
                        System.out.println("2. Correr e se esconder");
                        System.out.println("3. Sair");
                        System.out.print("Digite o número da sua escolha: ");
                        decision2 = hero.nextInt();

                        switch (decision2) {
                            case 1:

                                System.out.println("Abre o livro de mágias, qual mágia você usará?");
                                // pegar as magias no outro código e usar aqui
                                // Fazer um if, caso a mágia esteja certa ou errada.

                                // Caso correta
                                System.out.println(name + ", ataca! ");
                                System.out.println("O monstro cai e você finaliza.");
                                System.out.println(
                                        name + ": - Ufaa! Ainda bem que consegui pegar certo, se não eu ia de ralo.");
                                System.out.println(name + "Continua sua jornada em busca da flor!");
                                System.out.println(name + " encontra uma placa");
                                // usar o modelo de texto com tabelas

                                System.out.println("Caminhos rochosos <--");
                                System.out.println("Penhasco de Prata -->");
                                System.out.println("Escolha uma ação:");
                                System.out.println("1. Caminhos rochosos ");
                                System.out.println("2. Penhasco de Prata ");
                                System.out.print("Digite o número da sua escolha: ");
                                int decision3 = hero.nextInt();
                                switch (decision3) {

                                    case 1:

                                        System.out.println(name + ", segue pelos caminhos rochosos.");
                                        System.out.println("E então" + name + " escuta um estrondo!!!");

                                        // ╔═════════════════════════════════════════╗
                                        // ║ ___ __ ____ ____ ____ ____ ___ ║
                                        // ║ / _ )/ / / / / / / / / / / / / |/ / ║
                                        // ║ / _ / /_/ / /_/ / /_/ / /_/ / /|_/ / ║
                                        // ║/____/\____/\____/\____/\____/_/ /_/ ║
                                        // ╚═════════════════════════════════════════╝

                                        System.out.println("O montro de pedra surge em sua frente");
                                        System.out.println(name
                                                + ": - Esse é muito maior que o outro! Será que terei poder suficiente.");
                                        System.out.println(name + " abre o livro de mágias");
                                        // Usar o livro de magias
                                        // Caso mágia correta
                                        System.out.println(name + ", usa mágia correta!");
                                        System.out.println("O monstro desvia!");
                                        System.out.println(name + ": - Droga, como esse bicho desviou desse ataque?");
                                        // tenta de novo
                                        System.out.println(name + ", tenta novamente!");
                                        Thread.sleep(1000);
                                        System.out.print(".");
                                        Thread.sleep(1000);
                                        System.out.print(".");
                                        Thread.sleep(1000);
                                        System.out.print(".");
                                        System.out.println("Sucesso!");
                                        System.out
                                                .println("O monstro se esfarela e " + name + " continua seu caminho.");

                                }

                                break;
                            case 2:

                                break;
                            case 3:
                                hero.close();
                                return;
                            default:
                                System.out.println("Você inseriu um valor errado, tente novamente.");
                        }

                        // Pergunta ao usuário se ele quer voltar ao menu ou sair
                        System.out.println("Deseja voltar ao menu ou sair? (v para voltar / s para sair)");
                        String escolha = hero.next().toLowerCase();

                        if (escolha.equals("s")) {
                            System.out.println("Saindo do jogo. Até mais!");
                            break;
                        }
                    }

                    break;
                case 2:
                    System.out.println("Você não vai com eles e fica no treinamento de curandeiro.");
                    System.out.println("Sua mãe chega infectada pelo vírus, quase sem vida.");
                    System.out.println("Porém o seu mestre não estava no momento, e você não conseguiu fazer nada.");
                    break;
                case 3:
                    System.out.println("Era sua mãe infectada pelo vírus necessitando dos primeiros socorros.");
                    System.out.println("Ela acaba não suportando!");
                    hero.close();
                    return;
                default:
                    System.out.println("Você inseriu um valor errado, tente novamente.");
            }

            // Pergunta ao usuário se ele quer voltar ao menu ou sair
            System.out.println("Deseja voltar ao menu ou sair? (v para voltar / s para sair)");
            String escolha = hero.next().toLowerCase();

            if (escolha.equals("s")) {
                System.out.println("Saindo do jogo. Até mais!");
                break;
            }
        }
        hero.close();
    }
}