/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.NotificacaoRemote;
import br.mack.pi2.jpa.Notificacao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "notifDAO", name = "notifDAO")
public class NotificacaoBean implements NotificacaoRemote {

    private EntityManager em;
    
    public NotificacaoBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean insereNotificacao(Notificacao msg) {
        if(em.find(Notificacao.class, msg.getIdNotificacao()) == null) {
            em.getTransaction().begin();
            em.persist(msg);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaNotificacao(Notificacao msg) {
        em.getTransaction().begin();
        em.merge(msg);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaNotificacao(Notificacao msg) {
        em.getTransaction().begin();
        em.remove(msg);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Notificacao getNotificacao(int id) {
        return em.find(Notificacao.class, id);
    }

    @Override
    public List<Notificacao> getAllNotificacao() {
        return em.createNamedQuery("Notificacao.getAll", Notificacao.class).getResultList();
    }
    
}
