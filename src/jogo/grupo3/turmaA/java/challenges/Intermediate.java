package jogo.grupo3.turmaA.java.challenges;

import jogo.grupo3.turmaA.java.JavaChallenges;

public class Intermediate extends JavaChallenges {

    public Intermediate() {
        super();
    }

    @Override
    protected void addChallenges() {
        challenges.add(this::challenge1);
        hints.add("1");
        challenges.add(this::challenge2);
        hints.add("2");
        challenges.add(this::challenge3);
        hints.add("4");
    }

    private boolean challenge1() {
        System.out.println("Desafio Intermediário 1: Ordene um array usando o algoritmo de bubble sort.");
        return true;
    }

    private boolean challenge2() {
        System.out.println("Desafio Intermediário 2: Verifique se uma string é um palíndromo.");
        return true;
    }

    private boolean challenge3() {
        System.out.println("Desafio Intermediário 3: Gere os primeiros n números da sequência de Fibonacci.");
        return true;
    }
}
