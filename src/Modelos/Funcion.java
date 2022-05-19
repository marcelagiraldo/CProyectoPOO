/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;
import org.json.simple.JSONObject;

/**
 *
 * @author Marcela Alzate
 */
public class Funcion {
    private String _id;
    int hora;
    int dia;
    int mes;
    int aio;
    private LinkedList<Boleto>misBoletos;
    private Pelicula miPelicula;
    private Sala miSala;

    public Funcion() {
    }
    

    public Funcion(int hora, int dia, int mes, int aio) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.aio = aio;
        this.misBoletos = new LinkedList<>();
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
    

    /**
     * @return the misBoletos
     */
    public LinkedList<Boleto> getMisBoletos() {
        return misBoletos;
    }

    /**
     * @param misBoletos the misBoletos to set
     */
    public void setMisBoletos(LinkedList<Boleto> misBoletos) {
        this.misBoletos = misBoletos;
    }

    /**
     * @return the miPelicula
     */
    public Pelicula getMiPelicula() {
        return miPelicula;
    }

    /**
     * @param miPelicula the miPelicula to set
     */
    public void setMiPelicula(Pelicula miPelicula) {
        this.miPelicula = miPelicula;
    }

    /**
     * @return the miSala
     */
    public Sala getMiSala() {
        return miSala;
    }

    /**
     * @param miSala the miSala to set
     */
    public void setMiSala(Sala miSala) {
        this.miSala = miSala;
    }
    public JSONObject toJSON(){
        JSONObject respuesta = new JSONObject();
        respuesta.put("hora", this.getHora());
        respuesta.put("dia", this.getDia());
        respuesta.put("mes", this.getMes());
        respuesta.put("aio", this.getAio());
        return respuesta;
    }

    /**
     * @return the _id
     */
    public String getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(String _id) {
        this._id = _id;
    }
    
}
