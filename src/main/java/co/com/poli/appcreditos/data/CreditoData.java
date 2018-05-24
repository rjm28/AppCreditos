/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.data;

import co.com.poli.appcreditos.model.Credito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sala312
 */
public class CreditoData 



{
    
    private static List<Credito> listaCredito;
    
    static{
        
        listaCredito = new ArrayList<Credito>(){
            {
                add(new Credito("123","1035","Ronald Jaramillo","500","Independiente","Libre inversion",0));
                add(new Credito("124","1036","Camila Jimenez","1500","Dependiente","Vivienda",0));
                add(new Credito("125","1037","Cristian Mejia","3000","Dependiente","Vivienda",0));
                add(new Credito("126","1038","Arturo Villa","1000","Independiente","Libre inversion",0));
                add(new Credito("127","1039","Nicolas Ochoa","700","Independiente","Libre inversion",0));
                
                                
            }
        };
    }

    public static List<Credito> getListaCredito() {
        return listaCredito;
    }

    public static void setListaCreditos(List<Credito> aListaCredito) {
        listaCredito = aListaCredito;
    }
    
    
    
}
