package br.com.falloutdey.bank.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import br.com.falloutdey.bank.infrastructure.input.ConsoleInput;
import br.com.falloutdey.bank.presentation.menu.MenuPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ConsoleInput consoleInput = new ConsoleInput(input);
        MenuPrincipal menu = new MenuPrincipal(consoleInput);
        menu.exibirMenu();
    }
}
