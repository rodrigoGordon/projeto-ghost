/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.servlet;


import br.mack.pi2.ejb.interfaces.EventoRemote;
import br.mack.pi2.jpa.Evento;
import br.mack.pi2.jpa.Locais;
import br.mack.pi2.jpa.Usuario;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 41180283
 */
public class cadastroEventoGhostServlet extends HttpServlet {


    
    @EJB EventoRemote oEventoCRUD;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {

        Evento oEvento = new Evento();

        oEvento.setNomeEvento(request.getParameter("nomeEvento"));
        oEvento.setDescEvento(request.getParameter("descEvento"));
        
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
       
        try {
          
            oEvento.setDtInicio(new java.sql.Date(df.parse(request.getParameter("from")).getTime()));
            oEvento.setDtFim(new java.sql.Date(df.parse(request.getParameter("to")).getTime()));
        } catch (ParseException e) {
            System.out.println("ERRO COM DATA" + e);
            response.sendRedirect("homeGhost.jsp");
        }
	

        Locais oLocal = new Locais();
        oLocal.setIdLocal(Integer.parseInt(request.getParameter("cmbLocalEvento")));
        oEvento.setIdLocal(oLocal);
        
        Usuario oUsuarioResponsavel = new Usuario();
        oUsuarioResponsavel.setIdUser(1);
        oEvento.setResponsavel(oUsuarioResponsavel);
        
        //Verifica resp sim(0) ou nao(1)
        oEvento.setInscricao((Integer.parseInt((String)request.getParameter("bInscricao")) < 1));
        oEvento.setItemAdd((Integer.parseInt((String)request.getParameter("bItensAdicionais")) < 1));
        oEvento.setPrivado((Integer.parseInt((String)request.getParameter("bEventoExclusivo")) < 1));
        try{
           oEventoCRUD.insereEvento(oEvento);
        }catch(Exception e)
        {
          System.out.println("ERRO DE CAD   " + e);
          response.sendRedirect("homeGhost.jsp");  
        }
        //inserir Restricao Evento com if
       if((Integer.parseInt((String)request.getParameter("bEventoExclusivo")) < 1))
           {
            System.out.println("Almost there");
            response.sendRedirect("pesquisaEventos.jsp");
           }
         
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(cadastroEventoGhostServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(cadastroEventoGhostServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
