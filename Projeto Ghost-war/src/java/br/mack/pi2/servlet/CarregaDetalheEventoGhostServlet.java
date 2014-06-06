/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.servlet;

import br.mack.pi2.ejb.interfaces.EventoRemote;
import br.mack.pi2.jpa.Evento;
import br.mack.pi2.jpa.Locais;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mr.John Smith
 */
public class CarregaDetalheEventoGhostServlet extends HttpServlet {

    @EJB EventoRemote oEventoCRUD;
    int idEventoParam = 0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      try{  
      idEventoParam = Integer.parseInt(request.getParameter("id"));
      }catch(NumberFormatException e){
          System.out.println("ERRO DE CONVERESAO" + e);
      }
      if(idEventoParam > 0){
      request.getSession().setAttribute("eventoDetalhe", oEventoCRUD.getDetalhesEvento(idEventoParam));
      response.sendRedirect("detalhesEventoGhost.jsp");
      }
      else
      {
          // colocar send redirect para pagina msg
          request.getSession().setAttribute("msgErroEventoDetalhe", "Ops... algo parece estar errado, já temos uma equipe de ninjas trabalhando nisso. Clique em voltar para tentar novamente.");
          response.sendRedirect("PaginaMensagemGhost.jsp");
      }
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
