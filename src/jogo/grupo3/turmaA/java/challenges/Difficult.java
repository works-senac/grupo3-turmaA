package jogo.grupo3.turmaA.java.challenges;

import jogo.grupo3.turmaA.java.JavaChallenges;
import jogo.grupo3.turmaA.utils.CodeInput;

import java.util.*;

public class Difficult extends JavaChallenges {

    public Difficult() {
        super();
    }

    @Override
    protected void addChallenges() {
        challenges.add(this::challenge1);
        hints.add("Dica: Utilize o conceito de dividir a lista ao meio, comparando o valor central com o valor de busca e ajustando os limites conforme necessário.");

        challenges.add(this::challenge2);
        hints.add("Divida o problema em 3 passos e use recursão para movê-los.");
    }

    private boolean challenge1() {
        if (challengeLevel == 1) {
            System.out.println("Escolha a opção correta para a implementação da busca binária em uma lista ordenada:");

            List<String> options = new ArrayList<>();
            options.add("while (inicio <= fim) { int meio = (inicio + fim) / 2; if (lista[meio] == valorBusca) { indice = meio; break; } else if (lista[meio] < valorBusca) { inicio = meio + 1; } else { fim = meio - 1; } }"); // Certa
            options.add("for (int i = 0; i < lista.length; i++) { if (lista[i] == valorBusca) { indice = i; break; } }");
            options.add("indice = lista[valorBusca];");
            options.add("indice = valorBusca;");

            Collections.shuffle(options, new Random());

            Map<Character, String> optionMap = new HashMap<>();
            char letter = 'A';
            for (String option : options) {
                optionMap.put(letter, option);
                System.out.println(letter + ": " + option);
                letter++;
            }

            char userChoice = getUserChoice();
            String correctAnswer = "while (inicio <= fim) { int meio = (inicio + fim) / 2; if (lista[meio] == valorBusca) { indice = meio; break; } else if (lista[meio] < valorBusca) { inicio = meio + 1; } else { fim = meio - 1; } }";

            return optionMap.get(userChoice).equals(correctAnswer);
        } else if (challengeLevel == 2) {

            System.out.println("Implementar a busca binária em uma lista ordenada.");
            System.out.println("Digite o código para realizar a busca binária:");

            String code = """
                    // A lista de números deve estar ordenada
                    int[] lista = {1, 3, 5, 7, 9, 11, 13, 15, 17};
                    int valorBusca = 7;
                    int indice = -1;
                    
                    // Complete o código para implementar a busca binária
                    %s
                    
                    if (indice != -1) {
                        System.out.println("Valor encontrado no índice: " + indice);
                    } else {
                        System.out.println("Valor não encontrado.");
                    }
                    """;
            String userCode = getString(code);
            return CodeInput.codeTeste("Challenge6", userCode);
        }
        return false;
    }

    private boolean challenge2() {
        if (challengeLevel == 1) {
            System.out.println("Escolha a opção correta para implementar a solução para as Torres de Hanói:");

            List<String> options = new ArrayList<>();
            options.add("for (int i = 1; i <= discos; i++) { System.out.println(\"Mover disco \" + i + \" de \" + origem + \" para \" + destino); }"); // Certa
            options.add("for (int i = 1; i <= discos; i++) { System.out.println(\"Mover disco \" + i + \" de \" + destino + \" para \" + origem); }");
            options.add("for (int i = 1; i <= discos; i++) { System.out.println(\"Mover disco \" + i + \" de \" + origem + \" para \" + auxiliar); }");
            options.add("for (int i = 1; i <= discos; i++) { System.out.println(\"Mover disco \" + i + \" de \" + auxiliar + \" para \" + destino); }");

            Collections.shuffle(options, new Random());

            Map<Character, String> optionMap = new HashMap<>();
            char letter = 'A';
            for (String option : options) {
                optionMap.put(letter, option);
                System.out.println(letter + ": " + option);
                letter++;
            }

            char userChoice = getUserChoice();
            String correctAnswer = "for (int i = 1; i <= discos; i++) { System.out.println(\"Mover disco \" + i + \" de \" + origem + \" para \" + destino); }";

            return optionMap.get(userChoice).equals(correctAnswer);
        } else if (challengeLevel == 2) {
            System.out.println("Resolva o problema das Torres de Hanói.");
            System.out.println("Digite o código para resolver as Torres de Hanói:");

            String code = """
                    int discos = 5;
                    char origem = 'A';
                    char destino = 'C';
                    char auxiliar = 'B';
                    
                    %s
                    
                    System.out.println("Torres de Hanói resolvido.");
                    """;
            String userCode = getString(code);
            return CodeInput.codeTeste("Challenge10", userCode);
        }
        return false;
    }
}
