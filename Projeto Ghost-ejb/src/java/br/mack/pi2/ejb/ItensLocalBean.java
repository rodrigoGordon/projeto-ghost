/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.ItensLocalRemote;
import br.mack.pi2.jpa.Itens_Local;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "itenslocDAO", name = "itenslocDAO")
public class ItensLocalBean implements ItensLocalRemote {

    private EntityManager em;
    
    public ItensLocalBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean insereItemLocal(Itens_Local item) {
        if(em.find(Itens_Local.class, item.getIdItensLocal()) == null) {
            em.getTransaction().begin();
            em.persist(item);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaItemLocal(Itens_Local item) {
        em.getTransaction().begin();
        em.merge(item);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaItemLocal(Itens_Local item) {
        em.getTransaction().begin();
        em.remove(item);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Itens_Local getItemLocal(int id) {
        return em.find(Itens_Local.class, id);
    }

    @Override
    public List<Itens_Local> getAllItensLocal() {
        return em.createNamedQuery("ItensLocal.getAll", Itens_Local.class).getResultList();
    }
    
}
