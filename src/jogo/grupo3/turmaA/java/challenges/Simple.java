package jogo.grupo3.turmaA.java.challenges;

import jogo.grupo3.turmaA.java.JavaChallenges;
import jogo.grupo3.turmaA.utils.CodeInput;

import java.util.*;

public class Simple extends JavaChallenges {

    public Simple() {
        super();
    }

    @Override
    protected void addChallenges() {
        challenges.add(this::challenge1);
        hints.add("Percorra de trás para frente um laço for.");

        challenges.add(this::challenge2);
        hints.add("Percorra o array e compare cada valor com o maior número encontrado até o momento.");

        challenges.add(this::challenge3);
        hints.add("Para o fatorial, use uma função recursiva ou um loop multiplicativo.");
    }

    private boolean challenge1() {
        if (challengeLevel == 1) {

            System.out.println("Escolha a opção correta para inverter a string 'A-Lenda-De-SilverHollow':");

            List<String> options = new ArrayList<>();
            options.add("for (int i = original.length() - 1; i >= 0; i--) { reversed += original.charAt(i); }"); // Certa
            options.add("for (int i = 0; i < original.length(); i++) { reversed += original.charAt(i); }");
            options.add("reversed = new StringBuilder(original).reverse().toString();");
            options.add("reversed = original;");

            for (int i = 1; i <= 4; i++) {
                Collections.shuffle(options, new Random());
            }

            Map<Character, String> optionMap = new HashMap<>();
            char letter = 'A';
            for (String option : options) {
                optionMap.put(letter, option);
                System.out.println(letter + ": " + option);
                letter++;
            }

            char userChoice = getUserChoice();

            String correctAnswer = "for (int i = original.length() - 1; i >= 0; i--) { reversed += original.charAt(i); }";

            return optionMap.get(userChoice).equals(correctAnswer);
        } else if (challengeLevel == 2) {
            System.out.println("Complete a função que inverta uma string, utilizando laços de repetição.");
            System.out.println("Digite o código para inverter uma string:");

            String code = """
                    String original = "A-Lenda-De-SilverHollow";
                    String reversed = ""; // Complete aqui para inverter 'original'
                    %s
                    System.out.println("Invertido: " + reversed);
                    """;
            String userCode = getString(code);

            return CodeInput.codeTeste("Challenge1", userCode);
        }
        return false;
    }

    private boolean challenge2() {
        if (challengeLevel == 1) {
            System.out.println("Escolha a opção correta para encontrar o maior número no array {1, 5, 3, 9, 2}:");

            List<String> options = new ArrayList<>();
            options.add("for (int num : numbers) { if (num > max) { max = num; } }"); // Certa
            options.add("for (int i = 1; i < numbers.length; i++) { max += numbers[i]; }");
            options.add("max = numbers[0]; for (int num : numbers) { max = Math.max(max, num); }");
            options.add("for (int i = 0; i < numbers.length; i++) { max *= numbers[i]; }");

            for (int i = 1; i <= 4; i++) {
                Collections.shuffle(options, new Random());
            }


            Map<Character, String> optionMap = new HashMap<>();
            char letter = 'A';
            for (String option : options) {
                optionMap.put(letter, option);
                System.out.println(letter + ": " + option);
                letter++;
            }

            char userChoice = getUserChoice();

            String correctAnswer = "for (int num : numbers) { if (num > max) { max = num; } }";
            return optionMap.get(userChoice).equals(correctAnswer);
        } else if (challengeLevel == 2) {
            System.out.println("Crie uma função que encontre o maior número em um array.");
            System.out.println("Digite o código para encontrar o maior número:");
            String code = """
                    int[] numbers = {1, 5, 3, 9, 2};
                    int max = Integer.MIN_VALUE; // Complete aqui para encontrar o maior número
                    %s
                    if (max == 9) {
                        System.out.println("Desafio concluído com sucesso! Maior número: " + max);
                    } else {
                        System.out.println("O código não encontrou o maior número corretamente. Valor obtido: " + max);
                    }
                    """;
            String userCode = getString(code);
            return CodeInput.codeTeste("Challenge2", userCode);
        }

        return false;
    }

    private boolean challenge3() {
        if (challengeLevel == 1) {
            System.out.println("Escolha a opção correta para calcular o fatorial de 'n' = 5:");

            List<String> options = new ArrayList<>();
            options.add("for (int i = 1; i <= n; i++) { fatorial *= i; }"); // Certa
            options.add("for (int i = 0; i < n; i++) { fatorial += i; }");
            options.add("fatorial = n * (n - 1);");
            options.add("fatorial = Math.pow(n, 2);");

            for (int i = 1; i <= 4; i++) {
                Collections.shuffle(options, new Random());
            }


            Map<Character, String> optionMap = new HashMap<>();
            char letter = 'A';
            for (String option : options) {
                optionMap.put(letter, option);
                System.out.println(letter + ": " + option);
                letter++;
            }

            char userChoice = getUserChoice();
            String correctAnswer = "for (int i = 1; i <= n; i++) { fatorial *= i; }";
            return optionMap.get(userChoice).equals(correctAnswer);
        } else if (challengeLevel == 2) {
            System.out.println("Crie uma função que calcule o fatorial de um número.");
            System.out.println("Digite o código para calcular o fatorial:");

            String code = """
                    int n = 5;
                    int fatorial = 1; // Complete aqui para calcular o fatorial de 'n'
                    %s
                    System.out.println("Fatorial de " + n + ": " + fatorial);
                    """;
            String userCode = getString(code);

            return CodeInput.codeTeste("Challenge3", userCode);
        }
        return false;
    }
}
