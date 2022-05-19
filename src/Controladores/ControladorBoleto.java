/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Modelos.Boleto;
import Modelos.Usuario;
import Servicios.Servicio;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author Marcela Alzate
 */
public class ControladorBoleto {
    Servicio miServicio;
    String subUrl;

    public ControladorBoleto(String server, String subUrl) {
        this.miServicio = new Servicio(server);
        this.subUrl = subUrl;
    }
    public Boleto crear(Boleto nuevoBoleto){
        Boleto respuesta = new Boleto();
        try {
            String resultado=this.miServicio.POST(this.subUrl, nuevoBoleto.toJSON());
            respuesta = procesarJSON(resultado);
        } catch (Exception e) {
            System.out.println("Error: "+e);
            respuesta = null;
        }
        return respuesta;
    }
    public Boleto procesarJSON(String jsonString){
        Boleto nuevoBoleto = new Boleto();
        try {
            JSONParser parser=new JSONParser();
            JSONObject boletoJS=(JSONObject)parser.parse(jsonString);
            nuevoBoleto=reArmar(boletoJS);
        } catch (Exception e) {
            System.out.println("Error: "+e);
            nuevoBoleto = null;
        }
        return nuevoBoleto;
    }
    public LinkedList<Boleto>listar(){
        LinkedList<Boleto> respuesta = new LinkedList<>();
        try {
            String endPoint = this.subUrl;
            String resultado = this.miServicio.GET(endPoint);
            JSONParser parser = new JSONParser();
            JSONArray boletosJS = (JSONArray) parser.parse(resultado);
            for (Object actual : boletosJS) {
                JSONObject boletoJS= (JSONObject) actual;
                Boleto nuevoBoleto=new Boleto();
                nuevoBoleto=reArmar(boletoJS);
                respuesta.add(nuevoBoleto);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
            respuesta = null;
        }
        return respuesta;
    }
    public Boleto reArmar(JSONObject objetoJS){
        Boleto nuevoBoleto = new Boleto();
        nuevoBoleto.setId((String)objetoJS.get("_id"));
        nuevoBoleto.setValor((Double)objetoJS.get("valor"));
        nuevoBoleto.setTipo((String)objetoJS.get("tipo"));
        return nuevoBoleto;
    }
    
    
}
