package br.com.falloutdey.bank.presentation.menu;

import br.com.falloutdey.bank.domain.service.ContaService;
import br.com.falloutdey.bank.infrastructure.input.ConsoleInput;

public class MenuPrincipal {
    
    private ContaService contaService;
    private ConsoleInput input;

    public MenuPrincipal(ConsoleInput input) {
        this.input = input;
        this.contaService = new ContaService();
    }

    public void exibirMenu() {
        System.out.println("Menu Principal");
        System.out.println("1. Criar Conta");
        System.out.println("2. Listar Contas");
        System.out.println("3. Sair");
        int opcao = input.lerInt("Escolha uma opção: ");

        while(opcao != 3) {
            if(opcao == 1) {
                String nome = input.lerString("Digite seu Nome: ");
                String email = input.lerString("Digite seu E-mail: ");
                String senha = input.lerString("Digite sua senha: ");
                int tipoConta = input.lerInt("Escolha o tipo de conta:\n1. Corrente\n2. Poupança\n>> ");
                if (tipoConta == 1) {
                    contaService.criarConta(nome, email, senha, "Corrente");
                    System.out.println("Conta Corrente criada com Sucesso!");
                    break;
                }
                else if (tipoConta == 2) {
                    contaService.criarConta(nome, email, senha, "Poupança");
                    System.out.println("Conta Poupança criada com Sucesso!");
                    break;
                }
                else {
                    System.out.println("Opção Inválida.");
                }
            } else if(opcao == 2) {
                contaService.ListarContas();
                break;
            } else if(opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção Inválida.");
            }
        }
    }
}
