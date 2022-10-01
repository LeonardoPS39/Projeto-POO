package com.example;

public class Paciente extends Cliente {
    private boolean urgente;
    private boolean temPlano;
    private float pagamento;


    public Paciente(String nome, int idade, int cpf, boolean urgente, boolean temPlano) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.setUrgente(urgente);
        this.setTemPlano(temPlano);
        
    }


    public boolean getUrgente() {
        return this.urgente;
    }
    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public boolean getTemPlano() {
        return this.temPlano;
    }
    public void setTemPlano(boolean temPlano) {
        this.temPlano = temPlano;
    }

    public float getPagamento() {
        return this.pagamento;
    }
    public void setPagamento() {
        if (this.getTemPlano()){
            this.pagamento = 0;
        }else{
            this.pagamento = 1000;
        }
    }


    public void situacao(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Cpf: " + this.getCpf());
        System.out.println("É urgente? " + this.getUrgente());
        System.out.println("Tem plano? " + this.getTemPlano());
    }
}
