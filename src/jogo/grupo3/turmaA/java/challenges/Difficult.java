package jogo.grupo3.turmaA.java.challenges;

import jogo.grupo3.turmaA.java.JavaChallenges;
import jogo.grupo3.turmaA.utils.CodeInput;

public class Difficult extends JavaChallenges {

    public Difficult() {
        super();
    }

    @Override
    protected void addChallenges() {
        challenges.add(this::challenge1);
        hints.add("Use laços de repetição para adicionar elementos na árvore.");

        challenges.add(this::challenge2);
        hints.add("Divida o problema em 3 passos e use recursão para movê-los.");
    }

    private boolean challenge1() {
        System.out.println("Implementar uma árvore binária de busca.");
        System.out.println("Digite o código para adicionar e buscar na árvore:");
        String userCode = getUserCode();
        String code = """
                // Crie uma classe Node com valor e nós da esquerda e direita
                %s
                System.out.println("Árvore binária implementada.");
                """.formatted(userCode);
        return CodeInput.codeTeste("Challenge9", code);
    }

    private boolean challenge2() {
        System.out.println("Resolva o problema das Torres de Hanói.");
        System.out.println("Digite o código para resolver as Torres de Hanói:");
        String userCode = getUserCode();
        String code = """
                int discos = 5;
                // Complete o código para resolver Torres de Hanói
                %s
                """.formatted(userCode);
        return CodeInput.codeTeste("Challenge10", code);
    }
}
