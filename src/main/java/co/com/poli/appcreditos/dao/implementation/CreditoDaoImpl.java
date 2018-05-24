/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.dao.implementation;

import co.com.poli.appcreditos.dao.ICreditoDao;
import co.com.poli.appcreditos.data.CreditoData;
import co.com.poli.appcreditos.model.Credito;

import java.util.List;

/**
 *
 * @author sala312
 */
public class CreditoDaoImpl implements ICreditoDao
{
    

    @Override
    public List<Credito> obtenerListaCredito() {
        return CreditoData.getListaCredito();
    }

    @Override
    public Credito obtenerCredito(String numeroCredito) {
       Credito credito = null;
        List<Credito> listaCreditos = CreditoData.getListaCredito();
        for (Credito creditoLista : listaCreditos) {
            if(creditoLista.getNumeroCredito().equals(numeroCredito))
            {
                credito = creditoLista;
            }
        }
        return credito;
    }
    

    public String crearCredito(Credito credito) {
        List<Credito> listaCreditos = CreditoData.getListaCredito();
        listaCreditos.add(credito);
        CreditoData.setListaCreditos(listaCreditos);
        return "Credito Creado";
        
        
        
    }

    @Override
    public String modificarUsuario(Credito credito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminarUsuario(String documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Credito obtenerUsuario(String email, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String crearUsuario(Credito credito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
