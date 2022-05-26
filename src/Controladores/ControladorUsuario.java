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
            System.out.println("Error al buscar" + e);
            respuesta = null;
        }
        return respuesta;
    }
    public LinkedList<Usuario>listar(){
        LinkedList<Usuario> respuesta = new LinkedList<>();
        try {
            String endPoint = this.subUrl;
            String resultado = this.miServicio.GET(endPoint);
            JSONParser parser = new JSONParser();
            JSONArray usuariosJS = (JSONArray) parser.parse(resultado);
            for (Object actual : usuariosJS) {
                JSONObject usuarioJS= (JSONObject) actual;
                Usuario nuevoUsuario=new Usuario();
                nuevoUsuario=reArmar(usuarioJS);
                respuesta.add(nuevoUsuario);
            }
        } catch (Exception e) {
            System.out.println("Error al listar " + e);
            respuesta = null;
        }
        return respuesta;
    }
    public Usuario reArmar(JSONObject objetoJS){
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setId((String)objetoJS.get("_id"));
        nuevoUsuario.setCedula((String)objetoJS.get("cedula"));
        nuevoUsuario.setNombre((String)objetoJS.get("nombre"));
        nuevoUsuario.setEmail((String)objetoJS.get("email"));
        nuevoUsuario.setAioNacimiento((Long)objetoJS.get("aioNacimiento"));
        return nuevoUsuario;
    }
    public Usuario procesarJSON(String jsonString){
        Usuario nuevoUsuario = new Usuario();
        try {
            JSONParser parser=new JSONParser();
            JSONObject usuarioJS=(JSONObject)parser.parse(jsonString);
            nuevoUsuario=reArmar(usuarioJS);
        } catch (Exception e) {
            System.out.println("Error al procesar usuario: "+e);
            nuevoUsuario = null;
        }
        return nuevoUsuario;
    }
    
    
}
