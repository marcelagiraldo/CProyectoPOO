/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Funcion;
import Modelos.Silla;
import Servicios.Servicio;
import org.json.simple.JSONObject;

/**
 *
 * @author Marcela Alzate
 */
public class ControladorSilla {
    Servicio miServicio;
    String subUrl;

    public ControladorSilla(String server, String subUrl) {
        this.miServicio = new Servicio(server);
        this.subUrl = subUrl;
    }
    
    public Silla reArmar(JSONObject objetoJS){
        Silla nuevaSilla = new Silla();
        nuevaSilla.setId((String)objetoJS.get("_id"));
        nuevaSilla.setLetra((String)objetoJS.get("letra"));
        nuevaSilla.setNumero(((Long)objetoJS.get("nuemero")).intValue());
        return nuevaSilla;
    }
}
