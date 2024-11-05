package jogo.grupo3.turmaA.utils;

import jogo.grupo3.turmaA.java.JavaChallengesManager;

import java.util.InputMismatchException;
import java.util.Scanner;

import static jogo.grupo3.turmaA.utils.ConsoleColors.*;

public class Utils {
    public static void limparTela(int quantidadeDeLinhas) {
        for (int i = 0; i < quantidadeDeLinhas; i++) {
            System.out.println();
        }
    }

    public static boolean executarDesafio(String challengeLevel, JavaChallengesManager magicBook, Scanner scanner) {
        boolean continuar = false;
        while (!continuar) {
            continuar = magicBook.executeRandomChallenge(challengeLevel);

            if (!continuar) {
                System.out.println("O " + RED + "monstro" + RESET + " te ataca e consegue te ferir fatalmente.");
                Utils.sleepTiming(1000);
                System.out.println(RED_BOLD_BRIGHT + "Fim do jogo." + RESET);
                continuar = retryAgain(scanner);
                if (!continuar) {
                    System.exit(0);
                }
            }
        }
        return continuar;
    }

    public static boolean retryAgain(Scanner scanner) {
        System.out.println("Deseja tentar novamente?");
        System.out.println("""
                ╔═════════╗
                ║ 1. Sim  ║
                ║ 0. Não  ║
                ╚═════════╝
                """);
        int input = (int) Utils.verifyEntry("Qual será sua escolha: ", scanner, "int");
        return input != 1;
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
                    case "next" -> scanner.next();
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
        int input = (int) verifyEntry(String.format("Pressione %d para voltar ao menu principal.%n", exitOption),
                scanner, "int");
        if (input == exitOption) {
            response = true;
        }
        return response;
    }

    public static void sleepTiming(int sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.err.println("A thread foi interrompida: " + e.getMessage());
        }
    }
}
