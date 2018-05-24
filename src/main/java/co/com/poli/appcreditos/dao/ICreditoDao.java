/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.dao;

import co.com.poli.appcreditos.model.Credito;
import java.util.List;

/**
 *
 * @author sala312
 */
public interface ICreditoDao
{
    
    List<Credito> obtenerListaCredito();
    Credito obtenerCredito(String numeroCredito);
    String crearUsuario(Credito credito);
    String modificarUsuario(Credito credito);
    String eliminarUsuario( String documento);
    Credito obtenerUsuario(String email, String clave);
    
}
