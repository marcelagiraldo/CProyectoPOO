/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Funcion;
import Modelos.Silla;
import Servicios.Servicio;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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
    public LinkedList<Silla>listar(){
        LinkedList<Silla>sillas = new LinkedList<>();
        try {
            String endPoint = this.subUrl;
            String resultado = this.miServicio.GET(endPoint);
            JSONParser parser = new JSONParser();
            JSONArray sillasJS = (JSONArray) parser.parse(resultado);
            for (Object actual : sillasJS) {
                JSONObject sillaJS= (JSONObject) actual;
                Silla nuevaSilla=new Silla();
                nuevaSilla=reArmar(sillaJS);
                sillas.add(nuevaSilla);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
            sillas = null;
        }
        return sillas;
    }
    
    public Silla reArmar(JSONObject objetoJS){
        Silla nuevaSilla = new Silla();
        nuevaSilla.setId((String)objetoJS.get("_id"));
        nuevaSilla.setLetra((String)objetoJS.get("letra"));
        nuevaSilla.setNumero(((Long)objetoJS.get("numero")).intValue());
        return nuevaSilla;
    }
}
