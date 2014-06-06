/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.servlet;

import br.mack.pi2.ejb.interfaces.UsuarioRemote;
import br.mack.pi2.jpa.Usuario;
import java.io.IOException;
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
public class loginGhostServlet extends HttpServlet {

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
     @EJB UsuarioRemote oUsuarioCRUD;
    Usuario oUsuario;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
       oUsuario  = new Usuario();
       //String pagina = "/pesquisaEventos.jsp";
       oUsuario.setNomeUser(request.getParameter("nomeUsuario"));
       oUsuario.setPass((request.getParameter("senhaUsuario")));
       List<Usuario> oListUsuario = null;
       try{
       oListUsuario = oUsuarioCRUD.loginUsuario(oUsuario.getNomeUser(),oUsuario.getPass());
       if(oListUsuario.size() > 0){
       request.getSession().setAttribute("usuario", oListUsuario);
       
       response.sendRedirect("homeGhost.jsp");
       }else
       {
       request.getSession().setAttribute("erroLoginMsg", "Login e/ou senha inválidos.");
       response.sendRedirect("loginGhost.jsp");  
       }
       }catch(Exception e)
       {
           System.out.println("ERRO DE LOGIN" + e);
          request.getSession().setAttribute("msgErroEventoLogin", "Ops... algo parece estar errado, já temos uma equipe de ninjas trabalhando nisso. Clique em voltar para tentar novamente.");
          response.sendRedirect("PaginaMensagemGhost.jsp");
           
       }
       
       
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
         try {
             processRequest(request, response);
         } catch (Exception ex) {
             Logger.getLogger(loginGhostServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
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
         try {
             processRequest(request, response);
         } catch (Exception ex) {
             Logger.getLogger(loginGhostServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
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
