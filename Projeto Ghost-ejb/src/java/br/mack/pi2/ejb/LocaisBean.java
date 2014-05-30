/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;


import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.LocaisRemote;
import br.mack.pi2.jpa.Locais;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "locaisDAO", name = "locaisDAO")
public class LocaisBean implements LocaisRemote {
   
    EntityManager em;
    
    public LocaisBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean insereLocal(Locais local) {
        
        if(em.find(Locais.class, local.getIdLocal()) == null) {
            em.getTransaction().begin();
            em.persist(local);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaLocal(Locais local) {
        em.getTransaction().begin();
        em.merge(local);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaLocal(Locais local) {
        em.getTransaction().begin();
        em.remove(local);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Locais getLocal(int id) {
        return em.find(Locais.class, id);
    }

    @Override
    public List<Locais> getAllLocais() {
        return em.createNamedQuery("Locais.getAll", Locais.class).getResultList();
    }
    
}
