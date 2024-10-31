package jogo.grupo3.turmaA.characters.hero;

import java.util.Scanner;

public class Hero {
    public static void main(String[] args) {
        Scanner hero = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String name = hero.next();
        System.out.println(
                name + "Ve sua vila infectada, porém como ainda era um jovem aprendiz de curandeiro ele acaba não conseguindo fazer nada.");
        System.out.println("Seus amigos te chamam com urgência, você vai ou não?");
        System.out.println("SIM = 1 ou NÃO = 2");
        int decision1 = hero.nextInt();

        if (decision1 == 1) {
            System.out.println("Você corre com eles até sua casa, e se depara com uma cena lamentável.");
        }

        hero.close();
    }
}