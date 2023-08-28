package com.cinema;

public class Pessoa {
    int id;
    String nome;
    String cpf;
    Endereco endereco;
    int datanasncimento;
    Contato contato;

    public Pessoa(int id, String nome, String cpf, Endereco endereco, int datanasncimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.datanasncimento = datanasncimento;
    }

    public Pessoa(int id, String nome, Contato contato) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;

    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getDatanasncimento() {
        return datanasncimento;
    }

    public void setDatanasncimento(int datanasncimento) {
        this.datanasncimento = datanasncimento;
    }

    public static boolean validaCpf (String cpf) {
           if (cpf.length ()== 11){
            return true;
           } else {
            return false;
        }

    }

}
