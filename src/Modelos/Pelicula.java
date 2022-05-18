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
public class Pelicula {
    String _id;
    String nombre;
    int aio;
    String tipo;

    public Pelicula(String nombre, int aio, String tipo) {
        this.nombre = nombre;
        this.aio = aio;
        this.tipo = tipo;
    }

    public String get_id() {
        return _id;
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
    
}
