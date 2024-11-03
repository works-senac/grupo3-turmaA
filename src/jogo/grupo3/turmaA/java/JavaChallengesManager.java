package jogo.grupo3.turmaA.java;

import jogo.grupo3.turmaA.java.challenges.Difficult;
import jogo.grupo3.turmaA.java.challenges.Intermediate;
import jogo.grupo3.turmaA.java.challenges.Simple;
import org.jetbrains.annotations.NotNull;

public class JavaChallengesManager {
    private final Simple simple = new Simple();
    private final Intermediate intermediate = new Intermediate();
    private final Difficult difficult = new Difficult();

    public void executeRandomChallenge(@NotNull String difficulty) {
        switch (difficulty.toLowerCase()) {
            case "simple" -> simple.executeRandomChallenge();
            case "intermediate" -> intermediate.executeRandomChallenge();
            case "difficult" -> difficult.executeRandomChallenge();
            default -> throw new IllegalArgumentException("Nível de dificuldade inválido.");
        }
    }
}
