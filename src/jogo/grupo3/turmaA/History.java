package jogo.grupo3.turmaA;

import jogo.grupo3.turmaA.characters.Hero;
import jogo.grupo3.turmaA.characters.Villain;
import jogo.grupo3.turmaA.utils.Utils;

import java.util.Scanner;

import static jogo.grupo3.turmaA.utils.ConsoleColors.*;

public class History {
    public final int challengeLevel;
    private final String villainName = "Ancião";
    private final Scanner scanner = new Scanner(System.in);

    public History(int challengeLevel) {
        this.challengeLevel = challengeLevel;
    }

    public void showGame() {
        System.out.println("Antes de iniciarmos a sua jornada no incrível mundo da pequena cidade de SilverHollow,");
        System.out.println("precisamos saber o nome que você escolhera para seu Herói.");
        String heroName = (String) Utils.verifyEntry("Qual sua escolha: ", scanner, "next");
        Utils.sleepTiming(1000);
        Utils.limparTela(100);
        history1(heroName);
        Utils.sleepTiming(5000);
        Utils.limparTela(100);

        Hero hero = new Hero(heroName, challengeLevel);

        if (hero.startHeroHistory()) {
            Villain villain = new Villain(villainName, challengeLevel);
            villain.startFinalBattle();

            if (villain.historyFinal) {
                finalBom(heroName);
            } else {
                finalRuim(heroName);
            }
        } else {
            Utils.limparTela(100);
            Utils.sleepTiming(1000);
            System.out.println("Infelizmente sua jornada acaba por aqui!.");
            System.out.println(RED_BOLD_BRIGHT + "Fim do jogo." + RESET);
            System.out.println(BLUE_BOLD_BRIGHT + "Obrigado por Jogar." + RESET);
            Utils.limparTela(100);
        }

    }

    public void history1(String heroName) {
        System.out.printf("Um jovem chamado %s vivia na pequena vila de SilverHollow, rodeada por densas florestas e imponentes montanhas.%n", heroName);
        Utils.sleepTiming(1000);
        System.out.println("A vila, famosa por sua paz e beleza natural, foi abalada quando um ser misterioso disseminou um vírus nulo entre os residentes,");
        Utils.sleepTiming(1000);
        System.out.println("causando doenças que se espalhavam rápido e imprevisível, como um círculo infinito.");
        Utils.sleepTiming(1000);
        System.out.println("Os residentes, que costumavam ser calmos, agora estavam desanimados e sem solução para seus problemas devido ao caos causado pelas exceções.");
        Utils.sleepTiming(1000);
        System.out.printf("%s, que estava aprendendo a ser um curandeiro, viu sua própria família e amigos morrerem de doença.%n", heroName);
        Utils.sleepTiming(1000);
        System.out.println(GREEN_BOLD_BRIGHT + "E é aqui que sua jornada começa:" + RESET);
        Utils.sleepTiming(1000);
    }

    public void finalBom(String heroName) {
        Utils.limparTela(100);
        System.out.printf("Após a derrota do dragão, %s encontrou um livro de magias entre os pertences do Ancião.%n", heroName);
        Utils.sleepTiming(1000);
        System.out.printf("%s desesperado, leu a fórmula que prometia curar a doença que assolava a vila.%n", heroName);
        Utils.sleepTiming(1000);
        System.out.printf("Retornando à vila, %s recitou as palavras mágicas, e todos os moradores começaram a se recuperar gradualmente.%n", heroName);
        Utils.sleepTiming(1000);
        System.out.printf("A vila de Arvoredo voltou a ser um lugar de paz e alegria, e %s foi celebrado como um herói.%n", heroName);
        Utils.sleepTiming(1000);
        System.out.println("Sua coragem e determinação não apenas salvaram sua vila, mas também ensinaram a todos uma lição valiosa sobre esperança e perseverança.");
        Utils.sleepTiming(1000);
        System.out.printf("Os moradores agora olham para %s com gratidão, sabendo que sua luta contra as trevas não foi em vão.%n", heroName);
        Utils.sleepTiming(2000);
        Utils.limparTela(100);
        System.out.printf("E com isso sua jornada chega ao final junto com a derrota do %s e a salvação da sua vila %n", villainName);
        Utils.sleepTiming(1000);
        System.out.println(GREEN_BOLD_BRIGHT + "Fim do jogo." + RESET);
        System.out.println(BLUE_BOLD_BRIGHT + "Obrigado por Jogar." + RESET);
        Utils.limparTela(100);
    }

    public void finalRuim(String heroName) {
        Utils.limparTela(100);
        System.out.println("Com a vitória sobre o herói, eu, " + villainName + ", mantenho meu domínio sobre a vila.");
        Utils.sleepTiming(1000);
        System.out.println("Os moradores continuam a sofrer com a doença, enquanto eu me escondo na escuridão.");
        Utils.sleepTiming(2000);
        Utils.limparTela(100);
        System.out.printf("E com isso sua jornada chega ao final junto com a derrota do %s e a destruição da sua vila e mundo. %n", heroName);
        Utils.sleepTiming(1000);
        System.out.println(RED_BOLD_BRIGHT + "Fim do jogo." + RESET);
        System.out.println(BLUE_BOLD_BRIGHT + "Obrigado por Jogar." + RESET);
        Utils.limparTela(100);
    }
}
