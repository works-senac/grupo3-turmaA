package jogo.grupo3.turmaA.java.challenges;

import jogo.grupo3.turmaA.java.JavaChallenges;
import jogo.grupo3.turmaA.utils.CodeInput;

public class Intermediate extends JavaChallenges {

    public Intermediate() {
        super();
    }

    @Override
    protected void addChallenges() {
        challenges.add(this::challenge1);
        hints.add("Use um loop para contar as vogais na string.");

        challenges.add(this::challenge2);
        hints.add("Um palíndromo lê o mesmo de trás para frente; verifique em ambas as direções.");

        challenges.add(this::challenge3);
        hints.add("Divida por 2 e concatene o resto em cada iteração.");

        challenges.add(this::challenge4);
        hints.add("Percorra os números e armazene a contagem em um Map.");

        challenges.add(this::challenge5);
        hints.add("Multiplique os elementos da matriz, subtraia 1 para cada linha e coluna.");

    }

    private boolean challenge1() {
        System.out.println("Contador de vogais em uma string.");
        System.out.println("Digite o código para contar as vogais:");
        String userCode = getUserCode();
        String code = """
                String texto = "exemplo";
                int contadorVogais = 0; // Complete o código para contar vogais
                %s
                System.out.println("Número de vogais: " + contadorVogais);
                """.formatted(userCode);
        return CodeInput.codeTeste("Challenge4", code);
    }

    private boolean challenge2() {
        System.out.println("Verifique se uma string é um palíndromo.");
        System.out.println("Digite o código para verificar o palíndromo:");
        String userCode = getUserCode();
        String code = """
                String palavra = "radar";
                boolean isPalindromo = true; // Complete o código para verificar se é palíndromo
                %s
                System.out.println("É palíndromo? " + isPalindromo);
                """.formatted(userCode);
        return CodeInput.codeTeste("Challenge5", code);
    }

    private boolean challenge3() {
        System.out.println("Converter número decimal para binário.");
        System.out.println("Digite o código para a conversão:");
        String userCode = getUserCode();
        String code = """
                int decimal = 10;
                String binario = ""; // Complete o código para a conversão
                %s
                System.out.println("Binário: " + binario);
                """.formatted(userCode);
        return CodeInput.codeTeste("Challenge6", code);
    }

    private boolean challenge4() {
        System.out.println("Contador de palavras em um parágrafo.");
        System.out.println("Digite o código para contar as palavras:");
        String userCode = getUserCode();
        String code = """
                String paragrafo = "um teste um teste";
                // Complete o código para contar as palavras e exibir as contagens
                %s
                """.formatted(userCode);
        return CodeInput.codeTeste("Challenge7", code);
    }

    private boolean challenge5() {
        System.out.println("Verificar se uma matriz é quadrada.");
        System.out.println("Digite o código para verificar:");
        String userCode = getUserCode();
        String code = """
                int[][] matriz = {{1, 2}, {3, 4}};
                boolean isQuadrada = true; // Complete o código para verificar
                %s
                System.out.println("É quadrada? " + isQuadrada);
                """.formatted(userCode);
        return CodeInput.codeTeste("Challenge8", code);
    }

}
