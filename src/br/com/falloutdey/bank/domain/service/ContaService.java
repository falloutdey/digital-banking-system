package br.com.falloutdey.bank.domain.service;

import br.com.falloutdey.bank.domain.model.User;
import br.com.falloutdey.bank.domain.model.Conta;

import java.util.HashMap;
import java.util.Map;

public class ContaService {

    private static Map<String, User> usuarios = new HashMap<>();
    
    public static void criarConta(String nome, String email, String senha, String tipoConta) {

        if(usuarios.containsKey(email)) {
            System.out.println("Conta já existente.");
        }
        else {
            User usuario = new User(nome, email, senha);
            Conta conta = new Conta(tipoConta);
            
            System.out.println("Conta criada com sucessso!");
        }
    }
}
