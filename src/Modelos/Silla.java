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
public class Silla {
    String _id;
    String letra;
    int numero;

    public Silla(String letra, int numero) {
        this.letra = letra;
        this.numero = numero;
    }

    public String get_id() {
        return _id;
    }

    public String getLetra() {
        return letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
