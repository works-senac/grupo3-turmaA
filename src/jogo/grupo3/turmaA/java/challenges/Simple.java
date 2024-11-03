package jogo.grupo3.turmaA.java.challenges;

import jogo.grupo3.turmaA.java.JavaChallenges;
import jogo.grupo3.turmaA.utils.CodeInput;

public class Simple extends JavaChallenges {

    public Simple() {
        super();
    }

    @Override
    protected void addChallenges() {
        challenges.add(this::challenge1);
        hints.add("Use StringBuilder para inverter a string ou percorra de trás para frente.");

        challenges.add(this::challenge2);
        hints.add("Percorra o array e compare cada valor com o maior número encontrado até o momento.");

        challenges.add(this::challenge3);
        hints.add("Para o fatorial, use uma função recursiva ou um loop multiplicativo.");
    }

    private boolean challenge1() {
        System.out.println("Crie uma função que inverta uma string.");
        System.out.println("Digite o código para inverter uma string:");

        String userCode = getUserCode();
        String code = """
                String original = "exemplo";
                String reversed = ""; // Complete aqui para inverter 'original'
                %s
                System.out.println("Invertido: " + reversed);
                """.formatted(userCode);

        return CodeInput.codeTeste("Challenge1", code);
    }

    private boolean challenge2() {
        System.out.println("Crie uma função que encontre o maior número em um array.");
        System.out.println("Digite o código para encontrar o maior número:");

        String userCode = getUserCode();
        String code = """
                int[] numbers = {1, 5, 3, 9, 2};
                int max = Integer.MIN_VALUE; // Complete aqui para encontrar o maior número
                %s
                System.out.println("Maior número: " + max);
                """.formatted(userCode);
        return CodeInput.codeTeste("Challenge2", code);
    }

    private boolean challenge3() {
        System.out.println("Crie uma função que calcule o fatorial de um número.");
        System.out.println("Digite o código para calcular o fatorial:");

        String userCode = getUserCode();
        String code = """
                int n = 5;
                int fatorial = 1; // Complete aqui para calcular o fatorial de 'n'
                %s
                System.out.println("Fatorial de " + n + ": " + fatorial);
                """.formatted(userCode);

        return CodeInput.codeTeste("Challenge3", code);
    }
}
