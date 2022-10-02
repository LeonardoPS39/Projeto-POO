package com.example;

public abstract class Cliente extends Pessoa {

    private String dataRegistro;
    private String idRegistro;


    public String getDataRegistro() {
        return dataRegistro;
    }
    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    public String getIdRegistro() {
        return idRegistro;
    }
    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    

}
