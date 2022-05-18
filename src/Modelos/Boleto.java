/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Marcela Alzate
 */
public class Boleto {
    String _id;
    double valor;
    String tipo;

    public Boleto(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public String get_id() {
        return _id;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
