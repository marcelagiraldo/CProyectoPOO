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
public class Sala {
    String _id;
    String nombre;
    boolean efectosEspeciales;

    public Sala(String nombre, boolean efectosEspeciales) {
        this.nombre = nombre;
        this.efectosEspeciales = efectosEspeciales;
    }

    public String get_id() {
        return _id;
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
}
