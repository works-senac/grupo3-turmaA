package jogo.grupo3.turmaA.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static void limparTela(int quantidadeDeLinhas) {
        for (int i = 0; i < quantidadeDeLinhas; i++) {
            System.out.println();
        }
    }

    public static Object verifyEntry(String inputText, Scanner scanner, String tipoEntrada) {
        Object option = null;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(inputText);
                option = switch (tipoEntrada) {
                    case "int" -> scanner.nextInt();
                    case "byte" -> scanner.nextByte();
                    case "double" -> scanner.nextDouble();
                    case "float" -> scanner.nextFloat();
                    case "long" -> scanner.nextLong();
                    default -> throw new IllegalArgumentException("Tipo de entrada inválido!");
                };
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.printf("Valor inválido! Por favor, insira um %s válido.%n", tipoEntrada);
                scanner.next();
            }
        }
        return option;
    }

    public static boolean returnScreen(Scanner scanner, int exitOption) {
        boolean response = false;
        int input = (int) verifyEntry(String.format("Pressione %d para voltar ao menu principal.%n", exitOption), scanner, "int");
        if (input == exitOption) {
            response = true;
        }
        return response;
    }
}
