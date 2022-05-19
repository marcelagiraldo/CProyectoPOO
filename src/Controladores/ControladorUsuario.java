/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Modelos.Boleto;
import Modelos.Usuario;
import Servicios.Servicio;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author Marcela Alzate
 */
public class ControladorUsuario {
    Servicio miServicio;
    String subUrl;

    public ControladorUsuario(String server, String subUrl) {
        this.miServicio = new Servicio(server);
        this.subUrl = subUrl;
    }
    public Usuario buscarPorCedula(String cedula) {
        Usuario respuesta = new Usuario();
        try {
            String endPoint = this.subUrl + "/cedula/" + cedula;
            String resultado = this.miServicio.GET(endPoint);
            respuesta = procesarJSON(resultado);
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
    
    
}
