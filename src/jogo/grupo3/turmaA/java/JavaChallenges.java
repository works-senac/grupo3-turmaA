package jogo.grupo3.turmaA.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public abstract class JavaChallenges {
    protected final List<Supplier<Boolean>> challenges = new ArrayList<>();
    protected final List<String> hints = new ArrayList<>();
    protected final Random random = new Random();


    public JavaChallenges() {
        addChallenges();
    }

    protected abstract void addChallenges();

    public void executeRandomChallenge() {
        if (challenges.isEmpty()) {
            System.out.println("Não há mais desafios disponíveis.");
            return;
        }

        int index = random.nextInt(challenges.size());
        Supplier<Boolean> challenge = challenges.get(index);
        String hint = hints.get(index);

        int attempts = 0;
        boolean challengeSolved = false;

        do {
            System.out.println("Desafio:");
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
}
