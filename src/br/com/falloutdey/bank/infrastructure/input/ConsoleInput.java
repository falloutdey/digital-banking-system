package br.com.falloutdey.bank.infrastructure.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.function.Function;

public class ConsoleInput {
    private final BufferedReader reader;

    public ConsoleInput(BufferedReader reader) {
        this.reader = reader;
    }

    public <T> T input(String input, Function<String, T> conversor, String erro) {
        while(true) {
            System.out.print(input);
            try {
                String linha =  reader.readLine();
                return conversor.apply(linha);
            } catch (IOException e) {
                System.out.println("Erro ao ler a entrada.");
            } catch (Exception e) {
                System.out.println(erro);
            }
        }
    }

    public String lerString(String input) {
        return input(input, Linha -> Linha, "Input Inválido");
    }

    public int lerInt(String input) {
        return input(input, Integer::parseInt, "Valor Inválido. Digite um número inteiro.");
    }

    public double lerDouble(String input) {
        return input(input, Double::parseDouble, "Valor Inválido. Digite um número decimal.");
    }
}
