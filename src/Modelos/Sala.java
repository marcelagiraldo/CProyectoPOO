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
public class Sala {
    private String _id;
    String nombre;
    boolean efectosEspeciales;
    private LinkedList<Silla>misSillas;
    private LinkedList<Funcion>misFunciones;

    public Sala() {
    }
    

    public Sala(String nombre, boolean efectosEspeciales) {
        this.nombre = nombre;
        this.efectosEspeciales = efectosEspeciales;
        this.misSillas = new LinkedList<>();
        this.misFunciones = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEfectosEspeciales() {
        return efectosEspeciales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEfectosEspeciales(boolean efectosEspeciales) {
        this.efectosEspeciales = efectosEspeciales;
    }

    /**
     * @return the misSillas
     */
    public LinkedList<Silla> getMisSillas() {
        return misSillas;
    }

    /**
     * @param misSillas the misSillas to set
     */
    public void setMisSillas(LinkedList<Silla> misSillas) {
        this.misSillas = misSillas;
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
