package com.cinema;

public class Ingresso {
    int id;
    //Sassão sessão;
    Pedido pedido;
    String tipo;
    double valor;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
