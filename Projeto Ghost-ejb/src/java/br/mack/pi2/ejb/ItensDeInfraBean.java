/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.ItensDeInfraRemote;
import br.mack.pi2.jpa.Itens_de_infra;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "itensinfDAO", name = "itensinfDAO")
public class ItensDeInfraBean implements ItensDeInfraRemote {

    private EntityManager em;
    
    public ItensDeInfraBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean insereItemInfra(Itens_de_infra item) {
        if(em.find(Itens_de_infra.class, item.getId()) == null) {
            em.getTransaction().begin();
            em.persist(item);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaItemInfra(Itens_de_infra item) {
        em.getTransaction().begin();
        em.merge(item);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaItemInfra(Itens_de_infra item) {
        em.getTransaction().begin();
        em.remove(item);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Itens_de_infra getItemInfra(int id) {
        return em.find(Itens_de_infra.class, id);
    }

    @Override
    public List<Itens_de_infra> getAllItensInfra() {
        return em.createNamedQuery("ItensInfra.getAll", Itens_de_infra.class).getResultList();
    }
    
}
