/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;


import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.InfraestruturaRemote;
import br.mack.pi2.jpa.Infraestrutura;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "infraDAO", name = "infraDAO")
public class InfraestruturaBean implements InfraestruturaRemote {
    
    private EntityManager em;
    
    public InfraestruturaBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean insereInfra(Infraestrutura infra) {
        if(em.find(Infraestrutura.class, infra.getIdEstrutura()) == null) {
            em.getTransaction().begin();
            em.persist(infra);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaInfra(Infraestrutura infra) {
        em.getTransaction().begin();
        em.merge(infra);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaInfra(Infraestrutura infra) {
        em.getTransaction().begin();
        em.remove(infra);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Infraestrutura getInfra(int idInfra) {
        return em.find(Infraestrutura.class, idInfra);
    }

    @Override
    public List<Infraestrutura> getAllInfra() {
        return em.createNamedQuery("Infraestrutura.getAll", Infraestrutura.class).getResultList();
    }
}
