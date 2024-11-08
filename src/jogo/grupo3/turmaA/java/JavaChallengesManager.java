package jogo.grupo3.turmaA.java;

import jogo.grupo3.turmaA.java.challenges.Difficult;
import jogo.grupo3.turmaA.java.challenges.Intermediate;
import jogo.grupo3.turmaA.java.challenges.Simple;
import org.jetbrains.annotations.NotNull;

public class JavaChallengesManager {
    private final Simple simple = new Simple();
    private final Intermediate intermediate = new Intermediate();
    private final Difficult difficult = new Difficult();

    public boolean executeRandomChallenge(@NotNull String difficulty, int challengeLevel) {
        switch (difficulty.toLowerCase()) {
            case "simple" -> {
                return simple.executeRandomChallenge(challengeLevel);
            }
            case "intermediate" -> {
                return intermediate.executeRandomChallenge(challengeLevel);
            }
            case "difficult" -> {
                return difficult.executeRandomChallenge(challengeLevel);
            }
            default -> throw new IllegalArgumentException("Nível de dificuldade inválido.");
        }
    }
}
