/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.RestricaoEventoRemote;
import br.mack.pi2.jpa.Restricao_evento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "restricaoDAO", name = "restricaoDAO")
public class RestricaoEventoBean implements RestricaoEventoRemote {

    private EntityManager em;
    
    public RestricaoEventoBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean insereRestricao(Restricao_evento re) {
        if(em.find(Restricao_evento.class, re.getIdRestricaoEvento()) == null) {
            em.getTransaction().begin();
            em.persist(re);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaRestricao(Restricao_evento re) {
        em.getTransaction().begin();
        em.merge(re);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaRestricao(Restricao_evento re) {
        em.getTransaction().begin();
        em.remove(re);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Restricao_evento getRestricao(int id) {
        return em.find(Restricao_evento.class, id);
    }

    @Override
    public List<Restricao_evento> getAllRestricao() {
        return em.createNamedQuery("Restricao.getAll", Restricao_evento.class).getResultList();
    }
}
