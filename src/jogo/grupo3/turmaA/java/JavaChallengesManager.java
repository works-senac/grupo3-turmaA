package jogo.grupo3.turmaA.java;

import jogo.grupo3.turmaA.java.challenges.Difficult;
import jogo.grupo3.turmaA.java.challenges.Intermediate;
import jogo.grupo3.turmaA.java.challenges.Simple;
import org.jetbrains.annotations.NotNull;

public class JavaChallengesManager {

    private final Simple simple;
    private final Intermediate intermediate;
    private final Difficult difficult;

    public JavaChallengesManager() {
        this.simple = new Simple();
        this.intermediate = new Intermediate();
        this.difficult = new Difficult();
    }

    public void executeRandomChallenge(@NotNull String difficulty) {
        switch (difficulty.toLowerCase()) {
            case "simple" -> simple.executeRandomChallenge();
            case "intermediate" -> intermediate.executeRandomChallenge();
            case "difficult" -> difficult.executeRandomChallenge();
            default -> throw new IllegalArgumentException("Nível de dificuldade inválido.");
        }
    }

    // public static void main(String[] args) {
    //     JavaChallengesManager manager = new JavaChallengesManager();
    //
    //     // Testa executando desafios de diferentes níveis
    //     System.out.println("Desafio simples:");
    //     manager.executeRandomChallenge("simple");
    //
    //     System.out.println("\nDesafio intermediário:");
    //     manager.executeRandomChallenge("intermediate");
    //
    //     System.out.println("\nDesafio difícil:");
    //     manager.executeRandomChallenge("difficult");
    // }
}
