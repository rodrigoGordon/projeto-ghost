/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.servlet;
import br.mack.pi2.ejb.interfaces.UsuarioRemote;
import br.mack.pi2.jpa.Aluno;
import br.mack.pi2.jpa.Permissao;
import br.mack.pi2.jpa.Professor;
import br.mack.pi2.jpa.Unidade_Academica;
import br.mack.pi2.jpa.Usuario;
import java.io.IOException;
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
public class registrarUsuarioGhostServlet extends HttpServlet {

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
    
    @EJB UsuarioRemote oUsuario;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        
        Usuario user = new Usuario();
        
        user.setNomeUser(request.getParameter("nomeUsuario"));
        user.setEmail(request.getParameter("emailUsuario"));
        user.setPass(request.getParameter("nomeUsuario"));
        user.setRg(Integer.parseInt(request.getParameter("nomeUsuario")));
        
        String tipoPerm = request.getParameter("bMackenzista");
        if ("A".equals(tipoPerm))
        {
            Unidade_Academica ua = new Unidade_Academica();
            ua.setNome_UA(request.getParameter("ua"));
            
            Aluno aluno = new Aluno();
            aluno.setCurso(request.getParameter("curso"));
            aluno.setNomeAluno(request.getParameter("nomeUsuario"));
            aluno.setPeriodo(request.getParameter("periodo"));
            aluno.setTIA(Integer.parseInt(request.getParameter("identMackenzista")));
            aluno.setId_UA(ua);
            
            Permissao perm = new Permissao();
            perm.setDescUser("Aluno");
            
            user.setAluno(aluno);
            user.setTipo_user(perm);
            
        } else {
            
            Unidade_Academica ua = new Unidade_Academica();
            ua.setNome_UA(request.getParameter("ua"));
            
            Professor prof = new Professor();
            prof.setNomeProf(request.getParameter("nomeUsuario"));
            prof.setDrt(Integer.parseInt(request.getParameter("identMackenzista")));
            prof.setTipoProf(request.getParameter("tipo"));
            
            Permissao perm = new Permissao();
            perm.setDescUser("Professor");
            
            user.setProfessor(prof);
            user.setTipo_user(perm);
            
        }
        
        try{
           oUsuario.insereUsuario(user);
           response.sendRedirect("homeGhost.jsp");
        }catch(IOException e)
        {
          System.out.println("ERRO DE CADASTRO   " + e);
          request.getSession().setAttribute("msgErroEventoCadastro", "Ops... algo parece estar errado, já temos uma equipe de ninjas trabalhando nisso. Clique em voltar para tentar novamente.");
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
            Logger.getLogger(registrarUsuarioGhostServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(registrarUsuarioGhostServlet.class.getName()).log(Level.SEVERE, null, ex);
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
