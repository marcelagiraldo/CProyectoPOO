/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Modelos.Funcion;
import Servicios.Servicio;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author Marcela Alzate
 */
public class ControladorFuncion {
    Servicio miServicio;
    String subUrl;

    public ControladorFuncion(String server, String subUrl) {
        this.miServicio = new Servicio(server);
        this.subUrl = subUrl;
    }
    public LinkedList<Funcion>listar(){
        LinkedList<Funcion>funciones = new LinkedList<>();
        try {
            String endPoint = this.subUrl;
            String resultado = this.miServicio.GET(endPoint);
            JSONParser parser = new JSONParser();
            JSONArray funcionesJS = (JSONArray) parser.parse(resultado);
            for (Object actual : funcionesJS) {
                JSONObject funcionJS= (JSONObject) actual;
                Funcion nuevaFuncion=new Funcion();
                nuevaFuncion=reArmar(funcionJS);
                funciones.add(nuevaFuncion);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
            funciones = null;
        }
        return funciones;
    }
    public Funcion reArmar(JSONObject objetoJS){
        Funcion nuevaFuncion = new Funcion();
        nuevaFuncion.setId((String)objetoJS.get("_id"));
        nuevaFuncion.setHora(((Long)objetoJS.get("hora")).intValue());
        nuevaFuncion.setDia(((Long)objetoJS.get("dia")).intValue());
        nuevaFuncion.setMes(((Long)objetoJS.get("mes")).intValue());
        nuevaFuncion.setAio(((Long)objetoJS.get("aio")).intValue());
        return nuevaFuncion;
    }
    public Funcion procesarJSON(String jsonString){
        Funcion nuevaFuncion = new Funcion();
        try {
            JSONParser parser=new JSONParser();
            JSONObject funcionJS=(JSONObject)parser.parse(jsonString);
            nuevaFuncion=reArmar(funcionJS);
        } catch (Exception e) {
            System.out.println("Error: "+e);
            nuevaFuncion = null;
        }
        return nuevaFuncion;
    }
    public String[] funciones(LinkedList<Funcion>misFunciones){
        String funciones[] = new String[misFunciones.size()];
        for(int i=0;i<misFunciones.size();i++){
            funciones[i]=misFunciones.get(i).getMiSala().getNombre()+": "+misFunciones.get(i).getMiPelicula().getNombre()+
                    " -Hora: "+misFunciones.get(i).getHora()+" Fecha: "+misFunciones.get(i).getDia()+"-"+
                    misFunciones.get(i).getMes()+misFunciones.get(i).getAio();
        }
        return funciones;
    }
    
}
