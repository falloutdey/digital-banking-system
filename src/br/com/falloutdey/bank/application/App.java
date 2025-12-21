package br.com.falloutdey.bank.application;

import br.com.falloutdey.bank.presentation.menu.MenuPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        MenuPrincipal menu = new MenuPrincipal();
        menu.exibirMenu();
    }
}
