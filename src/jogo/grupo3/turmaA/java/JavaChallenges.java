package jogo.grupo3.turmaA.java;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public abstract class JavaChallenges {
    protected final List<Supplier<Boolean>> challenges = new ArrayList<>();
    protected final List<String> hints = new ArrayList<>();
    protected final Random random = new Random();
    protected int challengeLevel;


    public JavaChallenges() {
        addChallenges();
    }

    protected abstract void addChallenges();

    public boolean executeRandomChallenge(int challengeLevel) {
        if (challenges.isEmpty()) {
            System.out.println("Não há mais desafios disponíveis.");
            return false;
        }

        this.challengeLevel = challengeLevel;

        int index = random.nextInt(challenges.size());
        Supplier<Boolean> challenge = challenges.get(index);
        String hint = hints.get(index);

        int attempts = 0;
        boolean challengeSolved = false;

        do {
            System.out.println("Desafio necessário a resolver para poder utilizar a magia:");
            boolean challengeResponse = challenge.get();
            if (challengeResponse) {
                challengeSolved = true;
                System.out.println("Desafio resolvido com sucesso!");
            } else {
                attempts++;
                System.out.println("Resposta incorreta. Tente novamente.");
                if (attempts > 3) {
                    System.out.printf("Dica: %s%n", hint);
                }
            }
        } while (!challengeSolved && attempts < 5);

        if (attempts == 5) {
            System.out.println("Desafio fracassado!");
        }

        challenges.remove(index);
        hints.remove(index);
        return challengeSolved;
    }

    public String getUserCode() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder userCode = new StringBuilder();
        String line;

        System.out.println("Digite seu código e finalize com duas linhas em branco:");
        while (!(line = scanner.nextLine()).isEmpty()) {
            userCode.append(line).append("\n");
        }

        return userCode.toString();
    }

    public char getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha uma opção (A, B, C ou D): ");
        String input = scanner.nextLine().trim().toUpperCase();
        return input.isEmpty() ? ' ' : input.charAt(0);
    }

    public @NotNull String getString(String code) {
        String userCode = getUserCode();
        System.out.println("Código que usara como base!");
        System.out.println(code);
        return code.formatted(userCode);
    }

}
