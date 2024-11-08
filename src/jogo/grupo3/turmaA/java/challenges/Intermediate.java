package jogo.grupo3.turmaA.java.challenges;

import jogo.grupo3.turmaA.java.JavaChallenges;
import jogo.grupo3.turmaA.utils.CodeInput;

import java.util.*;

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
        if (challengeLevel == 1) {
            System.out.println("Contador de vogais em uma string.");
            System.out.println("Digite o código para contar as vogais:");

            String code = """
                    String texto = "exemplo";
                    int contadorVogais = 0; // Complete o código para contar vogais
                    %s
                    if (contadorVogais == 3) {
                        System.out.println("Desafio concluído com sucesso! Número de vogais: " + contadorVogais);
                    } else {
                        System.out.println("O código não contou as vogais corretamente. Valor obtido: " + contadorVogais);
                    }
                    """;
            String userCode = getString(code);
            return CodeInput.codeTeste("Challenge5", userCode);
        } else if (challengeLevel == 2) {
            System.out.println("Escolha a opção correta para contar as vogais na string 'exemplo':");

            List<String> options = new ArrayList<>();
            options.add("for (char c : texto.toLowerCase().toCharArray()) { if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { contadorVogais++; } }"); // Certa
            options.add("for (int i = 0; i < texto.length(); i++) { if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e') { contadorVogais++; } }");
            options.add("contadorVogais = texto.length() - texto.replaceAll(\"[aeiou]\", \"\").length();");
            options.add("for (int i = 1; i < texto.length(); i++) { contadorVogais += i; }");

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
            String correctAnswer = "for (char c : texto.toLowerCase().toCharArray()) { if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { contadorVogais++; } }";

            return optionMap.get(userChoice).equals(correctAnswer);
        }

        return false;
    }

    private boolean challenge2() {
        if (challengeLevel == 1) {
            System.out.println("Verifique se uma string é um palíndromo.");
            System.out.println("Digite o código para verificar o palíndromo:");

            String code = """
                    String palavra = "radar";
                    boolean isPalindromo = true; // Complete o código para verificar se é palíndromo
                    %s
                    System.out.println("É palíndromo? " + isPalindromo);
                    """;
            String userCode = getString(code);
            return CodeInput.codeTeste("Challenge5", userCode);
        } else if (challengeLevel == 2) {
            System.out.println("Escolha a opção correta para verificar se a string 'radar' é um palíndromo:");

            List<String> options = new ArrayList<>();
            options.add("for (int i = 0; i < palavra.length() / 2; i++) { if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) { isPalindromo = false; break; } }"); // Certa
            options.add("for (int i = 0; i < palavra.length(); i++) { if (palavra.charAt(i) != palavra.charAt(i + 1)) { isPalindromo = false; break; } }");
            options.add("isPalindromo = palavra.equals(new StringBuilder(palavra).reverse().toString());");
            options.add("isPalindromo = palavra.charAt(0) == palavra.charAt(palavra.length() - 1);");

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
            String correctAnswer = "for (int i = 0; i < palavra.length() / 2; i++) { if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) { isPalindromo = false; break; } }";
            return optionMap.get(userChoice).equals(correctAnswer);
        }
        return false;
    }

    private boolean challenge3() {
        if (challengeLevel == 1) {
            System.out.println("Converter número decimal para binário.");
            System.out.println("Digite o código para a conversão:");

            String code = """
                    int decimal = 10;
                    String binario = ""; // Complete o código para a conversão
                    %s
                    System.out.println("Binário: " + binario);
                    """;
            String userCode = getString(code);
            return CodeInput.codeTeste("Challenge6", userCode);
        } else if (challengeLevel == 2) {
            System.out.println("Escolha a opção correta para converter o número 10 para binário:");

            List<String> options = new ArrayList<>();
            options.add("while (decimal > 0) { binario = (decimal % 2) + binario; decimal = decimal / 2; }"); // Certa
            options.add("while (decimal > 0) { binario = binario + (decimal % 2); decimal = decimal / 2; }");
            options.add("while (decimal > 0) { binario = (decimal / 2) + binario; decimal = decimal - 2; }");
            options.add("binario = Integer.toBinaryString(decimal);");

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
            String correctAnswer = "while (decimal > 0) { binario = (decimal % 2) + binario; decimal = decimal / 2; }";

            return optionMap.get(userChoice).equals(correctAnswer);
        }
        return false;
    }

    private boolean challenge4() {
        if (challengeLevel == 1) {
            System.out.println("Contador de palavras em um parágrafo.");
            System.out.println("Digite o código para contar as palavras:");

            String code = """
                    String paragrafo = "A lenda de SilverHollow";
                    // Complete o código para contar as palavras e exibir as contagens
                    %s
                    """;
            String userCode = getString(code);
            return CodeInput.codeTeste("Challenge7", userCode);
        } else if (challengeLevel == 2) {
            System.out.println("Escolha a opção correta para contar as palavras no parágrafo 'A lenda de SilverHollow':");

            List<String> options = new ArrayList<>();
            options.add("contadorPalavras = paragrafo.split(\"\\s+\").length;"); // Certa
            options.add("contadorPalavras = paragrafo.length() - paragrafo.replaceAll(\" \", \"\").length();");
            options.add("contadorPalavras = paragrafo.split(\",\").length;");
            options.add("contadorPalavras = paragrafo.split(\" \").length;");

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
            String correctAnswer = "contadorPalavras = paragrafo.split(\"\\s+\").length;";

            return optionMap.get(userChoice).equals(correctAnswer);
        }
        return false;
    }

    private boolean challenge5() {
        if (challengeLevel == 1) {
            System.out.println("Verificar se uma matriz é quadrada.");
            System.out.println("Digite o código para verificar:");

            String code = """
                    int[][] matriz = {{1, 2}, {3, 4}};
                    boolean isQuadrada = true; // Complete o código para verificar
                    %s
                    System.out.println("É quadrada? " + isQuadrada);
                    """;
            String userCode = getString(code);
            return CodeInput.codeTeste("Challenge8", userCode);
        } else if (challengeLevel == 2) {
            System.out.println("Escolha a opção correta para verificar se a matriz {{1, 2}, {3, 4}} é quadrada:");

            List<String> options = new ArrayList<>();
            options.add("isQuadrada = matriz.length == matriz[0].length;"); // Certa
            options.add("isQuadrada = matriz.length == matriz[0].length - 1;");
            options.add("isQuadrada = matriz[0].length == 2;");
            options.add("isQuadrada = matriz.length == matriz.length;");

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
            String correctAnswer = "isQuadrada = matriz.length == matriz[0].length;";
            return optionMap.get(userChoice).equals(correctAnswer);
        }

        return false;
    }

}
