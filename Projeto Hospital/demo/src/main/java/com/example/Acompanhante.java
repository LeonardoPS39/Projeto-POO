package com.example;

public class Acompanhante extends Cliente {
    private boolean permissao;

    public boolean getPermissao() {
        return this.permissao;
    }

    public void setPermissao() {
        if (this.getIdade() < 18){
            this.permissao = false;
        }else{
            this.permissao = true;
        }
        
    }
}
