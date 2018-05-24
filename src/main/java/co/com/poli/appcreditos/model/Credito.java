/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.model;

import java.util.Objects;

/**
 *
 * @author sala312
 */
public class Credito

{
    
    
    private String numeroCredito;
    private String numeroDocumento;
    private String nombreCompleto;
    private String montoPrestamo;
    private String tipoEmpleado;
    private String tipoCredito;
    private int    trabajaSiNo;
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.numeroCredito);
        hash = 37 * hash + Objects.hashCode(this.numeroDocumento);
        hash = 37 * hash + Objects.hashCode(this.nombreCompleto);
        hash = 37 * hash + Objects.hashCode(this.montoPrestamo);
        hash = 37 * hash + Objects.hashCode(this.tipoEmpleado);
        hash = 37 * hash + Objects.hashCode(this.tipoCredito);
        hash = 37 * hash + this.trabajaSiNo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Credito other = (Credito) obj;
        if (this.trabajaSiNo != other.trabajaSiNo) {
            return false;
        }
        if (!Objects.equals(this.numeroCredito, other.numeroCredito)) {
            return false;
        }
        if (!Objects.equals(this.numeroDocumento, other.numeroDocumento)) {
            return false;
        }
        if (!Objects.equals(this.nombreCompleto, other.nombreCompleto)) {
            return false;
        }
        if (!Objects.equals(this.montoPrestamo, other.montoPrestamo)) {
            return false;
        }
        if (!Objects.equals(this.tipoEmpleado, other.tipoEmpleado)) {
            return false;
        }
        if (!Objects.equals(this.tipoCredito, other.tipoCredito)) {
            return false;
        }
        return true;
    }

    public Credito(String numeroCredito, String numeroDocumento, String nombreCompleto, String montoPrestamo, String tipoEmpleado, String tipoCredito, int trabajaSiNo) {
        this.numeroCredito = numeroCredito;
        this.numeroDocumento = numeroDocumento;
        this.nombreCompleto = nombreCompleto;
        this.montoPrestamo = montoPrestamo;
        this.tipoEmpleado = tipoEmpleado;
        this.tipoCredito = tipoCredito;
        this.trabajaSiNo = trabajaSiNo;
    }
    

    public String getNumeroCredito() {
        return numeroCredito;
    }

    public void setNumeroCredito(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(String montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public int getTrabajaSiNo() {
        return trabajaSiNo;
    }

    public void setTrabajaSiNo(int trabajaSiNo) {
        this.trabajaSiNo = trabajaSiNo;
    }
    
    
    
    
    
    
}
