/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;


import br.mack.pi2.ejb.interfaces.EventoRemote;
import br.mack.pi2.jpa.Evento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
    EntityManager em;

        public String execute() throws Exception {
        
        return "*";
    }
    
    public String add(){
        
        return "*";
    }
    
    public String delete(){
      
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
        factory = Persistence.createEntityManagerFactory("Projeto_Ghost-ejbPU");
        em = factory.createEntityManager(); 
    }

    @Override
    public void insereEvento(Evento evento) throws Exception {
        System.out.print("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
