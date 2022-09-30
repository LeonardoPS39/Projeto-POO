package com.example;

public class Compatibilidade {

    private String codigoSaco;
    private String cpfRecebedor;

    
    public Compatibilidade(String codigoSaco, String cpfRecebedor) {
        this.codigoSaco = codigoSaco;
        this.cpfRecebedor = cpfRecebedor;
    }

    public String getCodigoSaco() {
        return codigoSaco;
    }
    public void setCodigoSaco(String codigoSaco) {
        this.codigoSaco = codigoSaco;
    }

    public String getCpfRecebedor() {
        return cpfRecebedor;
    }
    public void setCpfRecebedor(String cpfRecebedor) {
        this.cpfRecebedor = cpfRecebedor;
    }
    
    public void verCompatibilidade() {
        
    }

}
