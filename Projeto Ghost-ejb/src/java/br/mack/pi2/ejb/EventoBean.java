/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;


import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.EventoRemote;
import br.mack.pi2.jpa.Evento;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
            em.flush();
            Evento.setLastIdGen(evento.getIdEvento());
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

    @Override
    public List<Evento> getDetalhesEvento(int idEvento) {

        List<Evento> oList;
        Query query = em.createQuery("SELECT e FROM Evento e JOIN e.idLocal a  where e.idEvento=" 
                + idEvento);
        oList = (List<Evento>) query.getResultList();
         /* 
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRENCH);
        String dtIniFormat = oList.get(0).getDtInicio().toString();
        try {
            oList.get(0).setDtInicio(df.parse(dtIniFormat));
        } catch (ParseException ex) {
            System.out.println("ERRO PARSE DATA - DETALHE EVENTO" + ex);
        }
         */
        return oList;
    }

    @Override
    public boolean verificaDataEvento(Evento evento) {
       boolean bRet;
       
       List<Evento> oList;
       Date dtTolerancia = (Date) evento.getDtInicio();
       long t=dtTolerancia.getTime();
       
       Date dtafterAdd=new Date(t - (30 * 60000));
       Query query = em.createQuery("SELECT e FROM Evento e JOIN e.idLocal a where (e.dtInicio=" + evento.getDtInicio() + " and a.idLocal=" + evento.getIdLocal().getIdLocal()
               + ") and  ( e.dtFim > " + dtafterAdd + " and a.idLocal=" + evento.getIdLocal().getIdLocal() + ")"
               + "and (e.dtInicio < " + evento.getDtFim() + " and  a.idLocal=" + evento.getIdLocal().getIdLocal() + ")");
       oList = (List<Evento>)query.getResultList();
       bRet = oList.size() > 0;
       return bRet;
    }
    
}
