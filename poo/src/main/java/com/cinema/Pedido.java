package com.cinema;

public class Pedido {
   int id;
   Cliente idCliente;
   Funcionario idFuncionário;
   String data;
   String hora;
   double valorTotal;

   
public Pedido(int id, Cliente idCliente, Funcionario idFuncionário, String data, String hora, double valorTotal) {
    this.id = id;
    this.idCliente = idCliente;
    this.idFuncionário = idFuncionário;
    this.data = data;
    this.hora = hora;
    this.valorTotal = valorTotal;
}


public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public Cliente getIdCliente() {
    return idCliente;
}
public void setIdCliente(Cliente idCliente) {
    this.idCliente = idCliente;
}
public Funcionario getIdFuncionário() {
    return idFuncionário;
}
public void setIdFuncionário(Funcionario idFuncionário) {
    this.idFuncionário = idFuncionário;
}
public String getData() {
    return data;
}
public void setData(String data) {
    this.data = data;
}
public String getHora() {
    return hora;
}
public void setHora(String hora) {
    this.hora = hora;
}
public double getValorTotal() {
    return valorTotal;
}
public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
}
    
}
