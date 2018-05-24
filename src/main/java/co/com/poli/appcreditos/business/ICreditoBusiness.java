/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.business;

import co.com.poli.appcreditos.model.Credito;
import java.util.List;

/**
 *
 * @author giovanny
 */
public interface ICreditoBusiness {
    
    List<Credito> obtenerListaUsuarios();
    Credito obtenerUsuario(String documento);
    String crearUsuario(Credito credito);
    String modificarUsuario(Credito credito);
    String eliminarUsuario( String documento);
    Credito obtenerUsuario(String email, String clave);
    
}
