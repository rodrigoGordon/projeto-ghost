/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.servlet;

import br.mack.pi2.Services.ServiceLocator;
import br.mack.pi2.ejb.interfaces.InfraRemote;
import br.mack.pi2.ejb.interfaces.LocalRemote;
import br.mack.pi2.jpa.Infraestrutura;
import br.mack.pi2.jpa.Locais;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 41180283
 */
public class CarregaLocalInfraServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @EJB InfraRemote oInfraCRUD;
    Infraestrutura oInfra;
    @EJB LocalRemote oLocalCRUD;
    Locais oLocal;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           try {
            //oInfraCRUD = ServiceLocator.getinstance().getInfra();
            oLocalCRUD = ServiceLocator.getinstance().getLocal();
        } catch (NamingException ex) {
           System.out.println("Erro __________________ : " + ex);
        }
        
         
         // request.setAttribute("infras", oInfraCRUD.Carregar());
          request.setAttribute("locais", oLocalCRUD.Carregar());
          response.sendRedirect("cadEvento.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
