import java.util.Scanner;

public class Villain {
    private final String villainName;
    private final ChallengeManager challengeManager = new ChallengeManager();
    private final Scanner scanner = new Scanner(System.in);
    private int dragonHealth = 100; // Saúde do dragão

    public Villain(String villainName) {
        this.villainName = villainName;
    }

    public void startFinalBattle() {
        System.out.println("Após dias de jornada, o herói finalmente encontra a caverna onde a flor milagrosa se esconde.");
        Utils.sleep(1000);
        System.out.println("Ao colher a flor, um brilho intenso surge e eu, " + villainName + ", apareço novamente.");
        Utils.sleep(1000);
        System.out.println(villainName + ": - Você não deveria ter pego isso, jovem!");
        Utils.sleep(1000);
        System.out.println("Transformo-me em um grande dragão, minhas escamas reluzindo como o fogo, e começo a rugir, fazendo a terra tremer!");
        Utils.sleep(1000);

        battleWithHero();
    }

    private void battleWithHero() {
        boolean battleContinues = true;
        int heroHealth = 100; // Saúde do herói

        while (battleContinues && (heroHealth > 0 && dragonHealth > 0)) {
            System.out.println("=== Batalha em Curso ===");
            System.out.println("Saúde do Herói: " + heroHealth);
            System.out.println("Saúde do Dragão: " + dragonHealth);
            System.out.println("Escolha uma ação:");
            System.out.println("╔════════════════════════════════╗");
            System.out.println("║ 1. Lançar Ataque Mágico       ║");
            System.out.println("║ 2. Usar Ataque Físico         ║");
            System.out.println("║ 3. Lançar Ataque Especial      ║");
            System.out.println("║ 4. Contra-atacar               ║");
            System.out.println("║ 5. Usar Item                   ║");
            System.out.println("╚════════════════════════════════╝");

            int choice = (int) Utils.checkInput("Digite o número da sua escolha: ", scanner, "int");

            switch (choice) {
                case 1 -> {
                    System.out.println(villainName + " lança uma magia poderosa!");
                    if (executeChallenge("avançado")) {
                        System.out.println("A magia acerta o herói, que grita de dor!");
                        heroHealth -= 30; // Dano causado ao herói
                    } else {
                        System.out.println("O herói desvia do ataque e contra-ataca!");
                        dragonHealth -= 10; // Dano ao dragão por contra-ataque
                    }
                }
                case 2 -> {
                    System.out.println(villainName + " ataca fisicamente!");
                    if (Math.random() > 0.3) {
                        System.out.println("O ataque é bem-sucedido! O herói leva 20 pontos de dano.");
                        heroHealth -= 20;
                    } else {
                        System.out.println("O herói se esquiva do ataque!");
                    }
                }
                case 3 -> {
                    System.out.println(villainName + " prepara um ataque especial!");
                    if (Math.random() > 0.5) {
                        System.out.println("Um poderoso ataque de fogo atinge o herói!");
                        heroHealth -= 40; // Dano crítico
                    } else {
                        System.out.println("O herói consegue se proteger do ataque!");
                    }
                }
                case 4 -> {
                    System.out.println(villainName + " tenta contra-atacar!");
                    if (Math.random() > 0.4) {
                        System.out.println("Você atinge o herói com um golpe rápido!");
                        dragonHealth -= 15;
                    } else {
                        System.out.println("O herói se prepara e desvia do seu ataque!");
                    }
                }
                case 5 -> {
                    useItem();
                }
                default -> System.out.println("Escolha inválida. Tente novamente.");
            }

            if (heroHealth <= 0) {
                System.out.println("O herói foi derrotado! Eu venci!");
                battleContinues = false;
                endGame(true);
            } else {
                // O herói contra-ataca
                System.out.println("=== O Herói Ataca! ===");
                System.out.println("O herói tenta um ataque!");
                if (Math.random() > 0.4) {
                    System.out.println("O ataque do herói acerta o dragão!");
                    dragonHealth -= 20; // Dano ao dragão
                } else {
                    System.out.println("O dragão se esquiva do ataque!");
                }
            }

            if (dragonHealth <= 0) {
                System.out.println("Eu fui derrotado!");
                battleContinues = false;
                endGame(false);
            }
        }
    }

    private void useItem() {
        System.out.println("Escolha um item para usar:");
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║ 1. Poção de cura (Recupera 20 HP) ║");
        System.out.println("║ 2. Bomba mágica (Causa 25 de dano ao herói) ║");
        System.out.println("║ 3. Escudo mágico (Protege contra o próximo ataque do herói) ║");
        System.out.println("╚════════════════════════════════╝");

        int itemChoice = (int) Utils.checkInput("Digite o número da sua escolha: ", scanner, "int");

        switch (itemChoice) {
            case 1 -> {
                System.out.println(villainName + " usa uma poção de cura!");
                dragonHealth += 20; // Recupera vida
            }
            case 2 -> {
                System.out.println(villainName + " lança uma bomba mágica!");
                System.out.println("A bomba atinge o herói, causando 25 de dano!");
            }
            case 3 -> {
                System.out.println(villainName + " ativa um escudo mágico!");
                System.out.println("O próximo ataque do herói será reduzido pela metade.");
            }
            default -> System.out.println("Item inválido!");
        }
    }

    private void endGame(boolean heroDefeated) {
        if (heroDefeated) {
            System.out.println("Com a vitória sobre o herói, eu, " + villainName + ", mantenho meu domínio sobre a vila.");
            System.out.println("Os moradores continuam a sofrer com a doença, enquanto eu me escondo na escuridão.");
        } else {
            System.out.println("Após a derrota do dragão, (Usuário) encontrou um livro de magias entre os pertences do Ancião.");
            Utils.sleep(1000);
            System.out.println("(Usuário) desesperado, leu a fórmula que prometia curar a doença que assolava a vila.");
            Utils.sleep(1000);
            System.out.println("Retornando à vila, (Usuário) recitou as palavras mágicas, e todos os moradores começaram a se recuperar gradualmente.");
            Utils.sleep(1000);
            System.out.println("A vila de Arvoredo voltou a ser um lugar de paz e alegria, e (Usuário) foi celebrado como um herói.");
            Utils.sleep(1000);
            System.out.println("Sua coragem e determinação não apenas salvaram sua vila, mas também ensinaram a todos uma lição valiosa sobre esperança e perseverança.");
            Utils.sleep(1000);
            System.out.println("Os moradores agora olham para (Usuário) com gratidão, sabendo que sua luta contra as trevas não foi em vão.");
        }
    }

    private boolean executeChallenge(String challengeLevel) {
        return challengeManager.executeRandomChallenge(challengeLevel);
    }

    public boolean tryAgain() {
        System.out.println("Deseja tentar novamente?");
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║ 1. Sim                        ║");
        System.out.println("║ 0. Não                        ║");
        System.out.println("╚════════════════════════════════╝");
        int input = (int) Utils.checkInput("Qual será sua escolha: ", scanner, "int");
        return input != 1;
    }

    public static void main(String[] args) {
        Villain villain = new Villain("Ancião"); // Nome do vilão alterado para "Ancião"
        villain.startFinalBattle();
    }
}
