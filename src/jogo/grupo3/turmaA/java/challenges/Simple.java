package jogo.grupo3.turmaA.java.challenges;

import jogo.grupo3.turmaA.java.JavaChallenges;

public class Simple extends JavaChallenges {

    public Simple() {
        super();
    }

    @Override
    protected void addChallenges() {
        challenges.add(this::challenge1);
        hints.add("1");
        challenges.add(this::challenge2);
        hints.add("2");
        challenges.add(this::challenge3);
        hints.add("3");
    }

    private boolean challenge1() {
        System.out.println("Desafio Simples 1: Crie uma função que inverta uma string.");
        return false;
    }

    private boolean challenge2() {
        System.out.println("Desafio Simples 2: Crie uma função que encontre o maior número em um array.");
        return false;
    }

    private boolean challenge3() {
        System.out.println("Desafio Simples 3: Crie uma função que calcule o fatorial de um número.");
        return false;
    }
}
