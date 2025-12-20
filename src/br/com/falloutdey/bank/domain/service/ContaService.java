package br.com.falloutdey.bank.domain.service;

import br.com.falloutdey.bank.domain.model.User;
import br.com.falloutdey.bank.domain.model.Conta;

public class ContaService {
    
    public static void criarConta(String nome, String email, String senha, String tipoConta) {

        User usuario = new User(nome, email, senha);
        Conta conta = new Conta(tipoConta);
    }
}
