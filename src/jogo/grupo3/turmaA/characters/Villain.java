package jogo.grupo3.turmaA.characters;

import jogo.grupo3.turmaA.java.JavaChallengesManager;
import jogo.grupo3.turmaA.utils.Utils;

import java.util.Scanner;

public class Villain {
    private final String villainName;
    private final JavaChallengesManager challengeManager = new JavaChallengesManager();
    private final Scanner scanner = new Scanner(System.in);
    private int dragonHealth = 100; // Saúde do dragão
    private int heroHealth = 100; // Saúde do Herói
    public boolean historyFinal;
    public int challengeLevel;

    public Villain(String villainName, int challengeLevel) {
        this.challengeLevel = challengeLevel;
        this.villainName = villainName;
    }

    public void startFinalBattle() {
        System.out.println("Após dias de jornada, o herói finalmente encontra a caverna onde a flor milagrosa se esconde.");
        Utils.sleepTiming(1000);
        System.out.println("Ao colher a flor, um brilho intenso surge e eu, " + villainName + ", apareço novamente.");
        Utils.sleepTiming(1000);
        System.out.println(villainName + ": - Você não deveria ter pego isso, jovem!");
        Utils.sleepTiming(1000);
        System.out.println("Transformo-me em um grande dragão, minhas escamas reluzindo como o fogo, e começo a rugir, fazendo a terra tremer!");
        Utils.sleepTiming(1000);
        battleWithHero();
    }

    private void battleWithHero() {
        boolean battleContinues = true;

        while (battleContinues && (heroHealth > 0 && dragonHealth > 0)) {
            System.out.println("=== Batalha Final em Curso ===");
            System.out.println("Saúde do Herói: " + heroHealth);
            System.out.println("Saúde do Dragão: " + dragonHealth);
            System.out.println("Escolha uma ação:");
            System.out.println("""
                    ╔════════════════════════════════╗
                    ║ 1. Lançar Ataque Mágico        ║
                    ║ 2. Usar Ataque Físico          ║
                    ║ 3. Lançar Ataque Especial      ║
                    ║ 4. Contra-atacar               ║
                    ║ 5. Usar Item                   ║
                    ╚════════════════════════════════╝
                    """);
            int choice = (int) Utils.verifyEntry("Digite o número da sua escolha: ", scanner, "int");

            switch (choice) {
                case 1 -> {
                    System.out.println(villainName + " lança uma magia poderosa!");
                    if (Utils.executarDesafio("difficult", challengeLevel, challengeManager, scanner)) {
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
                case 5 -> useItem();
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
        System.out.println("""
                ╔═════════════════════════════════════════════════════════════╗
                ║ 1. Poção de cura (Recupera 20 HP)                           ║
                ║ 2. Bomba mágica (Causa 25 de dano ao herói)                 ║
                ║ 3. Escudo mágico (Protege contra o próximo ataque do herói) ║
                ╚═════════════════════════════════════════════════════════════╝
                """);

        int itemChoice = (int) Utils.verifyEntry("Digite o número da sua escolha: ", scanner, "int");

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
        historyFinal = !heroDefeated;
    }
}
