// Nome, Idade, CPF

package com.example;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;

    // Construtor
    public Pessoa(String nome, int idade, String cpf) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
    }
    
    // Getters e Setters    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método
    public String imprimir() {
        String saida = "";
        saida += "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nCPF: " + this.getCpf();
        return saida;
    }

}