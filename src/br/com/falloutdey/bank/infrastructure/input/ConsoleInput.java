package br.com.falloutdey.bank.infrastructure.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleInput {
    private final BufferedReader reader;

    public ConsoleInput(BufferedReader reader) {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public lerString(String Mensagem) {
        System.out.print(Mensagem);
        try {
            return reader.readLine();
        } catch (Exception e) {
            System.out.println("Erro ao ler a mensagem.");
            return reader.readLine();
        }
    }
}
