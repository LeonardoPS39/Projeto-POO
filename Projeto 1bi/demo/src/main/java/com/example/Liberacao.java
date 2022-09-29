package com.example;

public class Liberacao {
    
    private String cpfAdm;
    private String senhaAdm;

    
    public Liberacao(String cpfAdm, String senhaAdm) {
        this.cpfAdm = cpfAdm;
        this.senhaAdm = senhaAdm;
    }

    public String getCpfAdm() {
        return cpfAdm;
    }
    public void setCpfAdm(String cpfAdm) {
        this.cpfAdm = cpfAdm;
    }
    public String getSenhaAdm() {
        return senhaAdm;
    }
    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }

    public void login() {
        /* this.cpfAdm;
         * this.senhaAdm;
         */
    }


}
