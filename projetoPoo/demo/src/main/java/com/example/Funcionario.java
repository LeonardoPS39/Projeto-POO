package com.example;

public abstract class Funcionario extends Pessoa {
    private float cHoraria;
    private float salario;


    public float getCHoraria() {
        return this.cHoraria;
    }
    public void setCHoraria(float cHoraria) {
        this.cHoraria = cHoraria;
    }


    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
        
    }
    
}
