package com.cinema;

public class Cliente extends Pessoa {
    int numCartãoFidelidade;
    static int geradorCartãoFidelidade = 1000;




    
    public Cliente(int id, String nome, String cpf, Endereco endereco, int datanasncimento, int numCartãoFidelidade) {
        super(id, nome, cpf, endereco, datanasncimento);
        this.numCartãoFidelidade = numCartãoFidelidade;
    }


    public int getNumCartãoFidelidade() {
        return numCartãoFidelidade;
    }
    public void setNumCartãoFidelidade(int numCartãoFidelidade) {
        this.numCartãoFidelidade = numCartãoFidelidade;
    }
    public static int getGeradorCartãoFidelidade() {
        return geradorCartãoFidelidade;
    }
    public static void setGeradorCartãoFidelidade(int geradorCartãoFidelidade) {
        Cliente.geradorCartãoFidelidade = geradorCartãoFidelidade;
    }  
    
}
