package br.com.falloutdey.bank.presentation.menu;

import br.com.falloutdey.bank.domain.service.ContaService;
import br.com.falloutdey.bank.infrastructure.input.ConsoleInput;

public class MenuPrincipal {
    
    private ContaService contaService;
    private ConsoleInput input;

    // public MenuPrincipal() {
    //     this.contaService = contaService;
    //     this.input = input;
    // }

    public void exibirMenu() {
        System.out.println("Menu Principal");
        System.out.println("1. Criar Conta");
        System.out.println("2. Sair");
        int opcao = input.lerInt("Escolha uma opção: ");

        switch(opcao) {
            case 1:
                String nome = input.lerString("Digite seu Nome: ");
                String email = input.lerString("Digite seu E-mail: ");
                String senha = input.lerString("Digite sua senha: ");
                int tipoConta = input.lerInt("Escolha o tipo de conta:\n1. Corrente\n 2. Poupança\n>> ");
                if (tipoConta == 1) {
                    contaService.criarConta(nome, email, senha, "Corrente");
                    System.out.println("Conta Corrente criada com Sucesso!");
                }
                else if (tipoConta == 2) {
                    contaService.criarConta(nome, email, senha, "Poupança");
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
