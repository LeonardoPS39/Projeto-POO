package com.example;

public class Coleta {

    private int quantidadeDoada;
    private int codigoDoacao;
    private String cpfDoador;
    private String data;
    
    
    public Coleta(int quantidadeDoada, String cpfDoador, String data) {
        this.quantidadeDoada = quantidadeDoada;
        this.cpfDoador = cpfDoador;
        this.data = data;
    }
    
    public int getQuantidadeDoada() {
        return this.quantidadeDoada;
    }
    public void setQuantidadeDoada(int quantidadeDoada) {
        this.quantidadeDoada = quantidadeDoada;
    }

    public String getCpfDoador() {
        return cpfDoador;
    }
    public void setCpfDoador(String cpfDoador) {
        this.cpfDoador = cpfDoador;
    }

    public int getCodigoDoacao() {
        return this.codigoDoacao;
    }
    public void setCodigoDoacao(int codigoDoacao) {
        this.codigoDoacao = codigoDoacao;
    }

    public String getData() {
        return this.data;
    }
    public void setData(String data) {
        this.data = data;
    }


    public void gerarCodigoISBT(){

    }


}
