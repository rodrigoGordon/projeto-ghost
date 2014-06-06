/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.servlet;


import br.mack.pi2.ejb.interfaces.EventoRemote;
import br.mack.pi2.ejb.interfaces.RestricaoEventoRemote;
import br.mack.pi2.jpa.Evento;
import br.mack.pi2.jpa.Locais;
import br.mack.pi2.jpa.Restricao_evento;
import br.mack.pi2.jpa.Unidade_Academica;
import br.mack.pi2.jpa.Usuario;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
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
    @EJB RestricaoEventoRemote oRestricaoCRUD;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {

        Evento oEvento = new Evento();

        oEvento.setNomeEvento(request.getParameter("nomeEvento"));
        oEvento.setDescEvento(request.getParameter("descEvento"));
        
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm"); 
       
        try {
          
            oEvento.setDtInicio(new java.sql.Date(df.parse(request.getParameter("from") + " " + request.getParameter("horarioInicioH") + ":" + request.getParameter("horarioInicioM")).getTime()));
            oEvento.setDtFim(new java.sql.Date(df.parse(request.getParameter("to") + " " + request.getParameter("horarioFimH") + ":" + request.getParameter("horarioFimH")).getTime()));
        } catch (ParseException e) {
            System.out.println("ERRO COM DATA" + e);
            response.sendRedirect("homeGhost.jsp");
        }
	

        Locais oLocal = new Locais();
        oLocal.setIdLocal(Integer.parseInt(request.getParameter("cmbLocalEvento")));
        oEvento.setIdLocal(oLocal);
        
    
        List<Usuario> listUsuario = (List<Usuario>)request.getSession().getAttribute("usuario");
        int idUsuario = listUsuario == null ? 1 : listUsuario.get(0).getIdUser();


        Usuario oUsuarioResponsavel = new Usuario();
        oUsuarioResponsavel.setIdUser(idUsuario);
        oEvento.setResponsavel(oUsuarioResponsavel);
        
        //Verifica resp sim(0) ou nao(1)
        oEvento.setInscricao((Integer.parseInt((String)request.getParameter("bInscricao")) < 1));
        oEvento.setItemAdd((Integer.parseInt((String)request.getParameter("bItensAdicionais")) < 1));
        oEvento.setPrivado((Integer.parseInt((String)request.getParameter("bEventoExclusivo")) < 1));
        if(!oEventoCRUD.verificaDataEvento(oEvento)){
        try{
           oEventoCRUD.insereEvento(oEvento);
           if((Integer.parseInt((String)request.getParameter("bEventoExclusivo")) < 1))
           {
            Unidade_Academica oUnidadeAcademica = new Unidade_Academica();
            Restricao_evento oRestricaoEvento = new Restricao_evento();
            oUnidadeAcademica.setId_UA(request.getParameter("cmbGrupoSelecionado"));
            oEvento.setIdEvento(Evento.getLastIdGen());
            oRestricaoEvento.setIdEvento(oEvento);
            oRestricaoEvento.setId_UA(oUnidadeAcademica);
          //  try{
            //oRestricaoCRUD.insereRestricao(oRestricaoEvento);
          //  }catch(Exception e)
          //  {
         //       System.out.println("ERRO NO CAD RESTRICAO - " + e);
          //s  }
            
           }
           response.sendRedirect("CarregaEventosJson");
        }catch(IOException | NumberFormatException e)
        {
          System.out.println("ERRO DE CAD   " + e);
          response.sendRedirect("homeGhost.jsp");  
        }
 
        }
        else
        {
            request.getSession().setAttribute("erroConcorrencia", "Data e local já reservados.");
            response.sendRedirect("cadEvento.jsp");
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
