package com.example;

public class Enfermeiro extends Funcionario {
    private String atuacao;

    public Enfermeiro(String nome, int idade, int cpf, int cHoraria,String atuacao) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.setCHoraria(cHoraria);
        this.setAtuacao(atuacao);

        this.setSalario();
    }

    public String getAtuacao() {
        return this.atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}
