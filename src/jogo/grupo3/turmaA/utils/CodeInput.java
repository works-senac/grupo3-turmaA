package jogo.grupo3.turmaA.utils;

import org.jetbrains.annotations.NotNull;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class CodeInput {
    public static void codeTeste(String className, String code) {
        File sourceFile = createCodeFile(className, code);

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int compilationResult = compiler.run(null, null, null, sourceFile.getPath());

        if (compilationResult == 0) {
            System.out.println("Código compilado com sucesso!");

            try {
                ProcessBuilder processBuilder = new ProcessBuilder("java", className);
                processBuilder.directory(new File("."));
                Process process = processBuilder.start();

                BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String output;
                while ((output = in.readLine()) != null) {
                    System.out.println(output);
                }

                int exitCode = process.waitFor();
                if (exitCode != 0) {
                    System.out.printf("Processo terminou com código de erro: %d%n", exitCode);
                }

            } catch (Exception e) {
                System.out.printf("Erro durante a execução: %s%n", e);
            }

        } else {
            System.out.println("Falha na compilação.");
        }

        deleteFile(sourceFile);
        deleteFile(new File("%s.class".formatted(className)));
    }

    private static void deleteFile(File file) {
        try {
            Path path = file.toPath();
            Files.delete(path);
            System.out.printf("Arquivo %s deletado com sucesso.%n", file.getName());
        } catch (Exception e) {
            System.out.printf("Erro ao tentar deletar o arquivo %s: %s%n", file.getName(), e);
        }
    }

    private static @NotNull File createCodeFile(String className, String code) {

        String classContent = """
                public class %s {
                    public static void main(String[] args) {
                        %s
                    }
                }
                """.formatted(className, code);

        File sourceFile = new File("%s.java".formatted(className));
        try (FileWriter writer = new FileWriter(sourceFile)) {
            writer.write(classContent);
        } catch (Exception e) {
            System.out.printf("Error ao criar o arquivo: %s%n", e);
        }
        return sourceFile;
    }
}
