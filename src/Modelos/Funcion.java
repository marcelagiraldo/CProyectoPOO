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
public class Funcion {
    String _id;
    int hora;
    int dia;
    int mes;
    int aio;

    public Funcion(int hora, int dia, int mes, int aio) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.aio = aio;
    }

    public String get_id() {
        return _id;
    }

    public int getHora() {
        return hora;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAio() {
        return aio;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAio(int aio) {
        this.aio = aio;
    }
}
