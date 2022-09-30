package com.example;

public class Devolucao {

    private String cpfDevolver;
    private String codigoBolsaDevolver;


    public Devolucao(String cpfDevolver, String codigoBolsaDevolver) {
        this.cpfDevolver = cpfDevolver;
        this.codigoBolsaDevolver = codigoBolsaDevolver;
    }

    public String getCpfDevolver() {
        return cpfDevolver;
    }
    public void setCpfDevolver(String cpfDevolver) {
        this.cpfDevolver = cpfDevolver;
    }

    public String getCodigoBolsaDevolver() {
        return codigoBolsaDevolver;
    }
    public void setCodigoBolsaDevolver(String codigoBolsaDevolver) {
        this.codigoBolsaDevolver = codigoBolsaDevolver;
    }

    public void devolver() {
        
    }
    
}
