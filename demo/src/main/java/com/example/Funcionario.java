// Salário, Carga Horária

package com.example;

public class Funcionario {
    
    private double salario;
    private double carga_horaria;
    
    // Construtor
    public Funcionario(double salario, double carga_horaria) {
        this.salario = salario;
        this.carga_horaria = carga_horaria;
    }

    // Getters and Setters
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getCarga_horaria() {
        return carga_horaria;
    }
    public void setCarga_horaria(double carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    // Método
    public String imprimir() {
        String saida = "";
        saida += "\nSalario: " + this.getSalario() + "\nCarga Horaria: " + this.getCarga_horaria();
        return saida;
    }

}
