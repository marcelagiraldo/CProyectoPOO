/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import org.json.simple.JSONObject;

/**
 *
 * @author Marcela Alzate
 */
public class Boleto {
    private String _id;
    double valor;
    String tipo;
    private Silla miSilla;
    private Funcion funcion;
    private Usuario usuario;

    public Boleto() {
    }
    

    public Boleto(double valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
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

    /**
     * @return the miSilla
     */
    public Silla getMiSilla() {
        return miSilla;
    }

    /**
     * @param miSilla the miSilla to set
     */
    public void setMiSilla(Silla miSilla) {
        this.miSilla = miSilla;
    }
    public JSONObject toJSON(){
        JSONObject respuesta = new JSONObject();
        respuesta.put("_id", this.getId());
        respuesta.put("valor", this.getValor());
        respuesta.put("tipo", this.getTipo());
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

    /**
     * @return the funcion
     */
    public Funcion getFuncion() {
        return funcion;
    }

    /**
     * @param funcion the funcion to set
     */
    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
