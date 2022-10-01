package com.example;

public class Acompanhante extends Cliente {
    private boolean permicao;

    public boolean getPermicao() {
        return this.permicao;
    }

    public void setPermicao() {
        if (this.getIdade() < 18){
            this.permicao = false;
        }else{
            this.permicao = true;
        }
        
    }
}
