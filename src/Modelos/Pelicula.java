/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;

/**
 *
 * @author Marcela Alzate
 */
public class Pelicula {
    private String _id;
    String nombre;
    int aio;
    String tipo;
    private LinkedList<Funcion>misFunciones;

    public Pelicula(String nombre, int aio, String tipo) {
        this.nombre = nombre;
        this.aio = aio;
        this.tipo = tipo;
        this.misFunciones = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getAio() {
        return aio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAio(int aio) {
        this.aio = aio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the misFunciones
     */
    public LinkedList<Funcion> getMisFunciones() {
        return misFunciones;
    }

    /**
     * @param misFunciones the misFunciones to set
     */
    public void setMisFunciones(LinkedList<Funcion> misFunciones) {
        this.misFunciones = misFunciones;
    }
    
}
