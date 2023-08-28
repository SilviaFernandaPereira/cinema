package com.cinema;

public class Funcionario extends Pessoa {
    String funcao;
    int ctps;

 

    public Funcionario(int id, String nome, String cpf, Endereco endereco, int datanasncimento, String funcao) {
        super(id, nome, cpf, endereco, datanasncimento);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }
    
}
