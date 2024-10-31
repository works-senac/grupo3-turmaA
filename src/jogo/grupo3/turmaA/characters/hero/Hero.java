package jogo.grupo3.turmaA.characters.hero;

import java.util.Scanner;

public class Hero {
    public static void main(String[] args) {
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
                            "Mestre: - " + name + ", existe um jeito de conseguir salvar sua mãe e essa vila! ");

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