/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.servlet;

import br.mack.pi2.ejb.interfaces.EventoRemote;
import br.mack.pi2.jpa.Evento;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;


public class CarregaEventosJson extends HttpServlet {

    @EJB EventoRemote oEvento;
    List<Evento> oEventoList = null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        oEventoList = (List<Evento>)oEvento.getAllEvento();
        }catch(Exception e)
        {
         System.out.println("Erro de Leitura : " + e);   
        }
        
        JSONObject json = new JSONObject();
        String relativeWebPath = "json/eventosMack.json";
        String absoluteDiskPath = getServletContext().getRealPath(relativeWebPath);
        
        absoluteDiskPath = absoluteDiskPath.replace("\\", "/");
        absoluteDiskPath = absoluteDiskPath.replace("/build", "");

        
        File fileTeste;

        fileTeste = new File(absoluteDiskPath);
        fileTeste.createNewFile();
        FileWriter fileWriter = new FileWriter(fileTeste);
        BufferedWriter bw = new BufferedWriter( fileWriter );
        bw.write("[");
        bw.newLine();
        if (oEventoList.size() > 0) {
            int i = oEventoList.size();
            for (Evento oEventoItem : oEventoList) {
                String testeDT = String.valueOf(oEventoItem.getDtInicio().getTime()) ;
                json.put("date", testeDT);
                json.put("type", "meeting");
                json.put("title", oEventoItem.getNomeEvento());
                json.put("description", oEventoItem.getDescEvento());
                testeDT = String.valueOf(oEventoItem.getIdEvento()) ;
                json.put("id", "CarregaEventoServlet?"+testeDT);

                try {

                     if(i > 1){
                     bw.write(json.toString() + ",");
                     bw.newLine();
                     i--;
                     }else
                     {
                      bw.write(json.toString());
                      bw.newLine();   
                     }
 
                } catch (IOException e) {
                   System.out.println("Erro de gravacao : " + e);
                }

            }
           
            bw.newLine();
            bw.write("]");
            bw.close();
            fileWriter.close();
        }
  
        
        response.sendRedirect("pesquisaEventos.jsp");
        
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
