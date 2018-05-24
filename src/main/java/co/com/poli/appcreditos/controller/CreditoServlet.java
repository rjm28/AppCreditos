/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.controller;

import co.com.poli.appcreditos.business.implementation.CreditoBussinessImpl;

import co.com.poli.appcreditos.model.Credito;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author sala312
 */
public class CreditoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * CreditoServlet
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    
    {
        
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        CreditoBussinessImpl cBusinessImpl = new CreditoBussinessImpl();
        String accion = request.getParameter("accion");
        switch (accion) {
            case "crear":
                String numeroCredito = request.getParameter("txtNumeroCredito");
                String numeroDocumento = request.getParameter("txtNumDoc");
                String nombreCompleto = request.getParameter("txtNombreCompleto");
                String montoPrestamo = request.getParameter("txtMontoPrestamo");
                String tipoEmpleado = request.getParameter("txtTipoEmpleado");
                String tipoCredito = request.getParameter("txtTipoCredito");
                int    trabajaSiNo = Integer.parseInt(request.getParameter("txtTrabajaSiNo"));

                Credito credito = new Credito(numeroCredito, numeroDocumento, nombreCompleto, montoPrestamo, tipoEmpleado, tipoCredito, trabajaSiNo);
               

                String mensaje = cBusinessImpl.crearCredito(credito);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            case "creditoMasUtilizado":
                 
                break;
            case "AcumuladoMayor":
                break;
                case "personasPrestan":
                break;
            case "listar":
                List<Credito> listaUsuarios = cBusinessImpl.obtenerListaCredito();
                session.setAttribute("LISTADO", listaUsuarios);
                rd = request.getRequestDispatcher("/view/creditoslista.jsp");
                break;
            default:
                break;
        }
        rd.forward(request, response);
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
