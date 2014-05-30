/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;


import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.EventoRemote;
import br.mack.pi2.jpa.Evento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "eventoDAO", name = "eventoDAO")
public class EventoBean implements EventoRemote {

    private EntityManager em;
    
    public EventoBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean insereEvento(Evento evento) {
        
        if(em.find(Evento.class, evento.getIdEvento()) == null) {
            em.getTransaction().begin();
            em.persist(evento);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaEvento(Evento evento) {
        em.getTransaction().begin();
        em.merge(evento);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaEvento(Evento evento) {
        em.getTransaction().begin();
        em.remove(evento);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Evento getEvento(int id) {
        return em.find(Evento.class, id);
    }

    @Override
    public List<Evento> getAllEvento() {
        return em.createNamedQuery("Evento.getAll", Evento.class).getResultList();
    }
    
}
