package br.com.falloutdey.bank.presentation.menu;

import br.com.falloutdey.bank.domain.service.ContaService;
import br.com.falloutdey.bank.infrastructure.input.ConsoleInput;

public class MenuPrincipal {
    
    private ContaService contaService;
    private ConsoleInput input;

    public MenuPrincipal(ContaService contaService, ConsoleInput input) {
        this.contaService = contaService;
        this.input = input;
    }

    public void exibirMenu() {
        System.out.println("Menu Principal");
        System.out.println("1. Criar Conta");
        System.out.println("2. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = Integer.parseInt(input.readLine());

        switch(opcao) {
            case 1:
                String nome = input.readLine("Digite seu nome: ");
                String email
                System.out.println("Escolha o tipo de conta:\n1. Corrente\n 2. Poupança");
                int tipoConta = Integer.parseInt(input.readLine());
                if (tipoConta == 1) {
                    System.out.println("Conta Corrente criada com Sucesso!");
                }
                else if (tipoConta == 2) {
                    System.out.println("Conta Poupança criada com Sucesso!");
                }
                else {
                    System.out.println("Opção Inválida.");
                }
                break;
            case 2:
                System.out.println("Saindo...");
                break;
        }
    }
}
