/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.servlet;

import br.mack.pi2.ServiceLocator.ServiceLocator;
import br.mack.pi2.ejb.interfaces.AlunoRemote;
import br.mack.pi2.jpa.Aluno;
import br.mack.pi2.jpa.Unidade_Academica;
import java.io.IOException;
import java.io.PrintWriter;
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
 * @author MichelOh
 */
public class AlunoTest extends HttpServlet {

    AlunoRemote alunoejb;
    Aluno aluno = new Aluno();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            alunoejb = ServiceLocator.getinstance().getAluno();
        } catch (NamingException ex) {
            Logger.getLogger(AlunoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Unidade_Academica ua = new Unidade_Academica();
        aluno.setTIA(1);
        aluno.setNomeAluno("Michel");
        aluno.setId_UA(ua);
        aluno.setPeriodo("Noturno");
        aluno.setCurso("Sistemas");
        try {
            alunoejb.insereAluno(aluno);
        } catch (Exception ex) {
            Logger.getLogger(AlunoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("/alunoteste.jsp").forward(request, response);
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
