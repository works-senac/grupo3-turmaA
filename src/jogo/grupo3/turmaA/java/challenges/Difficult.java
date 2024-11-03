package jogo.grupo3.turmaA.java.challenges;

import jogo.grupo3.turmaA.java.JavaChallenges;

public class Difficult extends JavaChallenges {

    public Difficult() {
        super();
    }

    @Override
    protected void addChallenges() {
        challenges.add(this::challenge7);
        hints.add("1");
        challenges.add(this::challenge8);
        hints.add("2");
        challenges.add(this::challenge9);
        hints.add("3");
    }

    private boolean challenge7() {
        System.out.println("Desafio Difícil 1: Resolva o problema da mochila (Knapsack Problem).");
        return true;
    }

    private boolean challenge8() {
        System.out.println("Desafio Difícil 2: Encontre o caminho mínimo em um grafo usando o algoritmo de Dijkstra.");
        return true;
    }

    private boolean challenge9() {
        System.out.println("Desafio Difícil 3: Resolva o problema das torres de Hanói.");
        return true;
    }
}
