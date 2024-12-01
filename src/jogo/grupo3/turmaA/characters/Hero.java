package jogo.grupo3.turmaA.characters;

import jogo.grupo3.turmaA.java.JavaChallengesManager;
import jogo.grupo3.turmaA.utils.Utils;

import java.util.Scanner;

import static jogo.grupo3.turmaA.utils.ConsoleColors.*;

public class Hero {
    private final String heroName;
    private final JavaChallengesManager magicBook = new JavaChallengesManager();
    private final Scanner scanner = new Scanner(System.in);
    private final int challengeLevel;

    public Hero(String heroName, int challengeLevel) {
        this.challengeLevel = challengeLevel;
        this.heroName = heroName;
    }

    // Antes disso aqui precisa chamar a base da história
    public boolean startHeroHistory() {
        boolean continuar;
        boolean textHistory = true;
        do {
            if (textHistory) {
                System.out.println(heroName + ", ve sua vila infectada, porém como ainda era um jovem aprendiz de curandeiro ele acaba não conseguindo fazer nada.");
                Utils.sleepTiming(1000);
                System.out.println(heroName + " estava no seu treinamento de curandeiro, no hospital da vila, quando de repente...");
                Utils.sleepTiming(1000);
                System.out.println("Seus amigos te chamam apavorados!");
                Utils.sleepTiming(1000);
                System.out.println("Amigos: - " + heroName + " precisamos que você venha com a gente AGORA!!");
                Utils.sleepTiming(1000);
                System.out.println();
            }
            System.out.println("Escolha uma ação:");
            System.out.println("1. Correr até sua casa com seus amigos");
            System.out.println("2. Ficar no treinamento de curandeiro");
            int d = (int) Utils.verifyEntry("Digite o número da sua escolha: ", scanner, "int");

            switch (d) {
                case 1 -> {
                    return firstDecision();
                }
                case 2 -> {
                    Utils.limparTela(100);
                    Utils.sleepTiming(1000);
                    System.out.println("Você não vai com eles e fica no treinamento de curandeiro.");
                    Utils.sleepTiming(1000);
                    System.out.println("Sua mãe chega infectada pelo vírus, quase sem vida.");
                    Utils.sleepTiming(1000);
                    System.out.println("Porém o seu mestre não estava no momento, e você não conseguiu fazer nada.");
                    Utils.sleepTiming(1000);
                    System.out.println(RED_BOLD_BRIGHT + "Fim do jogo." + RESET);
                    Utils.sleepTiming(1000);
                    continuar = Utils.retryAgain(scanner);
                    textHistory = Utils.showHistoryTextAgain(scanner);
                    System.out.println(textHistory);
                    Utils.limparTela(100);
                }
                default -> continuar = true;
            }
        } while (continuar);

        return false;
    }

    public boolean firstDecision() {
        boolean continuar;
        boolean textHistory = true;
        Utils.limparTela(100);
        do {
            if (textHistory) {
                System.out.println("Você corre com eles até sua casa, e se depara com uma cena lamentável.");
                Utils.sleepTiming(2000);
                System.out.println("Sua mãe contraiu o vírus!");
                Utils.sleepTiming(1000);
                System.out.println(heroName + " faz os primeiros socorros e pede ao amigo para encontrar seu mestre!");
                Utils.sleepTiming(1000);
                System.out.println("Seu mestre chega e usa seus poderes para salvá-la momentaneamente.");
                Utils.sleepTiming(1000);
                System.out.println(heroName + " estava injuriado com o ocorrido.");
                Utils.sleepTiming(1000);
                System.out.println(heroName + ": - Mestre! Preciso fazer algo para resolver essa situação, a vila toda está morrendo!");
                Utils.sleepTiming(1000);
                System.out.println("Mestre: - " + heroName + ", existe um jeito de conseguir salvar sua mãe e essa vila! ");
                Utils.sleepTiming(1000);
                System.out.println(heroName + ": - Como mestre? Diga-me para que possamos resolver isso de uma vez por todas!");
                Utils.sleepTiming(1000);
                System.out.println("Mestre: - " + heroName + ", Existe uma lenda de uma flor curandeira que pode curar qualquer tipo de doença! ");
                Utils.sleepTiming(1000);
                System.out.println(heroName + ": - Então tomei minha decisão! Irei atrás da flor mágica, mestre, peço que cuide de minha mãe e da vila até eu encontra-la!");
                Utils.sleepTiming(1000);
                System.out.println("Mestre: - " + "Mas calma garoto, você precisará disso para os desafios no caminho!");
                Utils.sleepTiming(1000);
                System.out.println("Mestre entrega o livro de mágias para " + heroName);
                Utils.sleepTiming(1000);
                System.out.println("Mestre: - Pronto agora você terá como encontrar a flor mágica , boa sorte em sua jornada, estaremos te esperando.");
                Utils.sleepTiming(1000);
                System.out.println("Oh não! " + heroName + " encontra o primeiro monstro! Pelo visto é um tipo de monstro de fogo! ");
                Utils.sleepTiming(1000);
                System.out.println();
            }
            System.out.println("Escolha uma ação:");
            System.out.println("1. Abrir o livro de mágias e usar suas mágias");
            System.out.println("2. Correr e se esconder");
            int d = (int) Utils.verifyEntry("Digite o número da sua escolha: ", scanner, "int");

            switch (d) {
                case 1 -> {
                    return secondDecision();
                }
                case 2 -> {
                    Utils.limparTela(100);
                    System.out.println(heroName + " corre e se esconde no arbusto!");
                    Utils.sleepTiming(1000);
                    System.out.println("Um " + RED + "monstro" + RESET + " o encontra, e tenta te atacar.");
                    Utils.sleepTiming(1000);
                    System.out.println(heroName + " corre, e ao tentar olhar para trás, cai de um penhasco!");
                    Utils.sleepTiming(1000);
                    System.out.println(RED_BOLD_BRIGHT + "Fim do jogo." + RESET);
                    Utils.sleepTiming(1000);
                    continuar = Utils.retryAgain(scanner);
                    textHistory = Utils.showHistoryTextAgain(scanner);
                    Utils.limparTela(100);
                }
                default -> continuar = true;
            }
        } while (continuar);
        return false;
    }

    public boolean secondDecision() {
        boolean continuar;
        boolean textHistory = true;
        Utils.limparTela(100);
        do {
            if (textHistory) {
                System.out.println("Abre o livro de mágias, qual mágia você usará?");
                Utils.executarDesafio("simple", challengeLevel, magicBook, scanner);
                Utils.sleepTiming(1000);
                System.out.println(heroName + ", ataca!");
                Utils.sleepTiming(2000);
                System.out.println("O monstro cai e você finaliza.");
                Utils.sleepTiming(1000);
                System.out.println(heroName + ": - Ufa! Ainda bem que consegui pegar certo, se não eu ia de ralo.");
                Utils.sleepTiming(1000);
                System.out.println(heroName + " continua sua jornada em busca da flor!");
                Utils.sleepTiming(1000);
            }
            System.out.println(heroName + " encontra uma placa");
            Utils.sleepTiming(1000);
            System.out.println("<-- Caminhos rochosos | Penhasco de Prata -->");
            System.out.println("Escolha uma ação:");
            System.out.println("1. Caminhos rochosos ");
            System.out.println("2. Penhasco de Prata ");
            int d = (int) Utils.verifyEntry("Digite o número da sua escolha: ", scanner, "int");

            switch (d) {
                case 1 -> continuar = caminhoRochoso();
                case 2 -> {
                    return caminhoDePrata();
                }
                default -> {
                    System.out.println("Escolha inválida! Tente novamente.");
                    continuar = true;
                    textHistory = Utils.showHistoryTextAgain(scanner);
                    Utils.limparTela(100);
                }
            }
        } while (continuar);
        return false;
    }

    public boolean caminhoRochoso() {
        System.out.println(heroName + ", segue pelos caminhos rochosos.");
        System.out.println("E então " + heroName + " escuta um estrondo!!!");
        Utils.sleepTiming(2000);
        System.out.println("O monstro de pedra surge em sua frente");
        Utils.sleepTiming(1000);
        System.out.println(heroName + ": - Esse é muito maior que o outro! Será que terei poder suficiente?");
        Utils.sleepTiming(1000);

        // Primeiro desafio
        System.out.println(heroName + " abre o livro de mágias");
        if (Utils.executarDesafio("simple", challengeLevel, magicBook, scanner)) {
            return false;
        }
        System.out.println(heroName + ", usa mágia correta!");
        Utils.sleepTiming(2000);

        // Segundo desafio
        System.out.println("O monstro desvia!");
        System.out.println(heroName + ": - Droga, como esse bicho desviou desse ataque?");
        Utils.sleepTiming(1000);
        if (Utils.executarDesafio("simple", challengeLevel, magicBook, scanner)) {
            return false;
        }
        System.out.println(heroName + ", tenta novamente!");
        Utils.sleepTiming(1000);

        System.out.print(".");
        Utils.sleepTiming(1000);
        System.out.print(".");
        Utils.sleepTiming(1000);
        System.out.print(".");
        System.out.println("Sucesso!");
        Utils.sleepTiming(1000);
        System.out.println("O monstro se esfarela e " + heroName + " continua seu caminho.");
        Utils.sleepTiming(1000);
        System.out.println("Entretanto, não tinha saída o caminha e " + heroName + " retorna na divisória do Penhasco de Prata e Caminhos Rochosos.");
        return true;
    }

    public boolean caminhoDePrata() {
        boolean continuar;
        boolean textHistory = true;
        Utils.limparTela(100);
        do {
            if (textHistory) {
                System.out.println(heroName + ", segue pelo Penhasco de Prata!");
                Utils.sleepTiming(1000);
                System.out.println("Seguindo seu caminho, ele sente um cheiro desagradável!");
                Utils.sleepTiming(1000);
                System.out.println("Um bicho brilhante estava devorando uma vaca!");
                Utils.sleepTiming(1000);
                System.out.println(heroName + ": - Um bicho feito totalmente de prata?");
                Utils.sleepTiming(1000);
                System.out.println(heroName + ": - Como posso derrota-lo? Já sei precisarei de ataque do tipo fogo!");
                Utils.sleepTiming(1000);
                System.out.println(heroName + ": - Assim poderei derrete-lo para continuar!");
                Utils.sleepTiming(1000);
                System.out.println(heroName + ", abre o livro de mágia.");
                Utils.sleepTiming(1000);
                if (Utils.executarDesafio("intermediate", challengeLevel, magicBook, scanner)) {
                    return false;
                }
                Utils.sleepTiming(1000);
                System.out.println(heroName + " usa o ataque do tipo fogo!");
                System.out.print(".");
                Utils.sleepTiming(1000);
                System.out.print(".");
                Utils.sleepTiming(1000);
                System.out.print(".");
                Utils.sleepTiming(1000);
                System.out.println(" O monstro cai!");
                Utils.sleepTiming(1000);
                System.out.println(heroName + ": - Receba seu doce!");
                Utils.sleepTiming(1000);
                System.out.println(heroName + ", após vencer o monstro de prata segue seu caminho.");
                Utils.sleepTiming(1000);
            }
            System.out.println("Continuando sua jornada, " + heroName + " encontra o penhasco, porém ele encontra uma ponte!");
            System.out.println(heroName + " : - Droga! essa ponte me parece meio bamba, será que devo arriscar?");
            System.out.println("Escolha uma ação:");
            System.out.println("1. Atravessar a ponte");
            System.out.println("2. Tentar dar a volta");
            int d = (int) Utils.verifyEntry("Digite o número da sua escolha: ", scanner, "int");

            switch (d) {
                case 1 -> {
                    return atravessarPonte();
                }
                case 2 -> {
                    Utils.limparTela(100);
                    System.out.println(heroName + " esta tentando dar a volta na montanha!");
                    Utils.sleepTiming(1000);
                    System.out.println(heroName + " ao estar rodeando a montanha, ele escorrega em uma das pedras e cai da montanha!");
                    Utils.sleepTiming(1000);
                    System.out.println(RED_BOLD_BRIGHT + "Fim do jogo." + RESET);
                    Utils.sleepTiming(1000);
                    continuar = Utils.retryAgain(scanner);
                    textHistory = Utils.showHistoryTextAgain(scanner);
                    Utils.limparTela(100);
                }
                default -> continuar = true;
            }
        } while (continuar);

        return false;
    }

    public boolean atravessarPonte() {
        Utils.limparTela(100);
        System.out.println(heroName + ", atravessa a ponte!");
        Utils.sleepTiming(1000);
        System.out.println(heroName + ": - UoU! Quase que eu caio.");
        Utils.sleepTiming(1000);
        System.out.println("Uma madeira quebrou, quase rompendo a corda!");
        Utils.sleepTiming(1000);

        boolean continuar = true;

        do {
            System.out.println("Escolha uma ação:");
            System.out.println("1. Consertar a madeira");
            System.out.println("2. Seguir sem arrumar a corda");
            int d = (int) Utils.verifyEntry("Digite o número da sua escolha: ", scanner, "int");

            switch (d) {
                case 1 -> {
                    Utils.sleepTiming(1000);
                    System.out.println(heroName + ", conserta a madeira e segue seu caminho.");
                    Utils.sleepTiming(1000);
                    System.out.println(heroName + ", para para descansar do outro lado do penhasco.");
                    Utils.sleepTiming(1000);
                    System.out.println("Armou a sua fogueira e parou para descansar.");
                    Utils.sleepTiming(1000);
                    System.out.println("Quando de repente...");
                    Utils.sleepTiming(1000);
                    System.out.println("Uma mão encosta em seus ombros.");
                    Utils.sleepTiming(1000);
                    System.out.println("Um velho ancião senta ao seu lado e lhe pergunta o que está fazendo por ali.");
                    Utils.sleepTiming(1000);
                    System.out.println(heroName + ": - Estou à procura de uma flor lendária capaz de curar o meu vilarejo e minha família!");
                    Utils.sleepTiming(1000);
                    System.out.println("Ancião: - Meu rapaz, você sabe que isso pode ser só uma lenda.");
                    Utils.sleepTiming(1000);
                    System.out.println(heroName + ": - Eu sei, meu senhor, mas preciso ir atrás.");
                    Utils.sleepTiming(1000);
                    System.out.println("Ancião: - Jovem, existem muitos perigos com essa lenda. Se eu fosse você, deixaria de ir atrás.");
                    Utils.sleepTiming(1000);
                    Utils.limparTela(100);
                    return true;
                }
                case 2 -> {
                    Utils.sleepTiming(1000);
                    System.out.println(heroName + ", segue e cai da ponte.");
                    Utils.sleepTiming(1000);
                    System.out.println(RED_BOLD_BRIGHT + "Fim do jogo." + RESET);
                    continuar = Utils.retryAgain(scanner);
                    Utils.sleepTiming(1000);
                }
                default -> {
                    System.out.println("Opção inválida. Tente novamente.");
                    Utils.sleepTiming(1000);
                }
            }
        } while (continuar);

        return false;
    }
}