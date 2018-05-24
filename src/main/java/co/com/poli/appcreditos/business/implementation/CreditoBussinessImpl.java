/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.business.implementation;

import co.com.poli.appcreditos.dao.implementation.CreditoDaoImpl;
import co.com.poli.appcreditos.model.Credito;
import java.util.List;

/**
 *
 * @author sala312
 */
public class CreditoBussinessImpl {
    
    
    
    private CreditoDaoImpl  creditoDaoImpl = new CreditoDaoImpl();

    public List<Credito> obtenerListaCredito() {
        return creditoDaoImpl.obtenerListaCredito();
    }

    public Credito obtenerCredito(String documento) {
        return creditoDaoImpl.obtenerCredito(documento);
    }

    public String crearCredito(Credito credito) {
        String respuesta = "Credito ya existe";
        Credito cred = obtenerCredito(credito.getNumeroCredito());
        if (cred == null) {
            respuesta = creditoDaoImpl.crearCredito(credito);
        }
        return respuesta;
    }

   
    

   
    
}
