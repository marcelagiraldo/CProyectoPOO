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
public class Usuario {
    private String _id;
    String cedula;
    String nombre;
    String email;
    Long aioNacimiento;
    private LinkedList<Boleto>misBoletos;

    public Usuario() {
    }
    
    
    public Usuario(String cedula, String nombre, String email, Long aioNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.aioNacimiento = aioNacimiento;
        this.misBoletos = new LinkedList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public Long getAioNacimiento() {
        return aioNacimiento;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAioNacimiento(Long aioNacimiento) {
        this.aioNacimiento = aioNacimiento;
    }
    
    public LinkedList<Boleto> getMisBoletos() {
        return misBoletos;
    }
    
    
    public void setMisBoletos(LinkedList<Boleto> misBoletos) {
        this.misBoletos = misBoletos;
    }
    public JSONObject toJSON(){
        JSONObject respuesta = new JSONObject();
        respuesta.put("cedula", this.getCedula());
        respuesta.put("nombre", this.getNombre());
        respuesta.put("email", this.getEmail());
        respuesta.put("aioNacimiento", this.getAioNacimiento());
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
