import java.util.Scanner;

class Utils {
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }   
    }

    public static Object checkInput(String prompt, Scanner scanner, String type) {
        System.out.print(prompt);
        if (type.equals("int")) {
            return scanner.nextInt();
        }
        return null; // Outros tipos podem ser adicionados conforme necessário
    }
}
