package com.example;

public class Cadastro {
    
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String tipo;
    private String sexo;
    private int id;

    public Cadastro(String nome, String cpf, String dataNascimento, String endereco, String tipo, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    // public void CadastrarBD() {

    // }

}
