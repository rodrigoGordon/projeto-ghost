/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.controller;

import br.mack.pi2.ejb.interfaces.GenericDAO;
import br.mack.pi2.jpa.Evento;
import java.util.List;

/**
 *
 * @author alvarowf
 */
public class EventoManager {
    
    private GenericDAO<Evento, Long>eventoDAO;
    
    public List<Evento>getAllEventos(){
        return this.eventoDAO.getAll();
    }
    
    public Evento createContact(Evento evento){
        return this.eventoDAO.create(evento);
    }
    
    public Evento updateEvento(Evento evento){
        return this.eventoDAO.save(evento);
    }
    
    public Evento findEvento(Long id){
        return this.eventoDAO.findById(id);
    }
    
    public void deleteEvento(Long id){
         this.eventoDAO.delete(findEvento(id));
    }
    
    public List<Evento> findAllEventos(){
        return this.eventoDAO.getAll();
    }
    
    public void setEventoDAO(GenericDAO<Evento, Long> eventoDAO){
        this.eventoDAO = eventoDAO;
    }
}
