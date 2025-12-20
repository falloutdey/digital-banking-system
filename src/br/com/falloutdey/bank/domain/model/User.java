package br.com.falloutdey.bank.domain.model;
public class User {
    private String nome;
    private String email;
    private String senha;

    public User(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    /** 
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /** 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /** 
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /** 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * @return String
     */
    public String getSenha() {
        return senha;
    }

    /** 
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}


