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
    public void setSalario() {
        if (this.cHoraria <= 4) {
            this.salario = 4000;
        } else {
            this.salario = 8000;
        }
    }

    public void adjustSalario(int multiplicador) {
        this.salario = this.getSalario() * multiplicador;
    }
    
}
