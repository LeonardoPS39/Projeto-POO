package com.example;

public class Medico extends Funcionario {
    private String especializacao;

    public Medico(String nome, int idade, int cpf, int cHoraria, String especializacao) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.setCHoraria(cHoraria);
        this.setEspecializacao(especializacao);

        this.setSalario(10000);
        

        
    }

    public String getEspecializacao() {
        return this.especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;

        
    }

    public void situacao(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Cpf: " + this.getCpf());
        System.out.println("Carga Horaria: " + this.getCHoraria());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Especializacao: " + this.getEspecializacao());
    }
}
