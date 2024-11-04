package jogo.grupo3.turmaA;

import jogo.grupo3.turmaA.characters.Hero;
import jogo.grupo3.turmaA.characters.Villain;
import jogo.grupo3.turmaA.utils.Utils;

import java.util.Scanner;

import static jogo.grupo3.turmaA.utils.ConsoleColors.GREEN_BOLD_BRIGHT;
import static jogo.grupo3.turmaA.utils.ConsoleColors.RESET;

public class History {
    public final int challengeLevel;
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
        Hero hero = new Hero(heroName);
        hero.startHeroHistory();
        Villain villain = new Villain("Ancião");
        villain.startFinalBattle();
    }

    public void history1(String heroName) {
        System.out.printf("Um jovem chamado %s vivia na pequena vila de Silverhollow, rodeada por densas florestas e imponentes montanhas.%n", heroName);
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
}
