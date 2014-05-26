/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.controller.EventoManager;
import br.mack.pi2.ejb.interfaces.EventoRemote;
import br.mack.pi2.jpa.Evento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "eventoDAO", name = "eventoDAO")
public class EventoBean implements EventoRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private Evento evento;
    private List<Evento> eventoList;
    EntityManagerFactory  factory;
    private EventoManager eventoManager;

        public String execute() throws Exception {
        try {
            this.setEventoList(eventoManager.findAllEventos());
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return "*";
    }
    
    public String add(){
        try{
            eventoManager.createEvento(getEvento());
        } catch (Exception e){
            e.printStackTrace();
        }
        
        try{
            this.eventoList = eventoManager.findAllEventos();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return "*";
    }
    
    public String delete(){
        try{
            eventoManager.deleteEvento((long)evento.getIdEvento());
        } catch(Exception e){
            e.printStackTrace();
        }
        return "*";
    }
    
    
    
    
    /**
     * @return the evento
     */
    public Evento getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    /**
     * @return the eventoManager
     */
    public EventoManager getEventoManager() {
        return eventoManager;
    }

    /**
     * @param eventoManager the eventoManager to set
     */
    public void setEventoManager(EventoManager eventoManager) {
        this.eventoManager = eventoManager;
    }

    /**
     * @return the eventoList
     */
    public List<Evento> getEventoList() {
        return eventoList;
    }

    /**
     * @param eventoList the eventoList to set
     */
    public void setEventoList(List<Evento> eventoList) {
        this.eventoList = eventoList;
    }

    @Override
    public void setUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insereEvento(Evento evento) throws Exception {
        System.out.print("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
