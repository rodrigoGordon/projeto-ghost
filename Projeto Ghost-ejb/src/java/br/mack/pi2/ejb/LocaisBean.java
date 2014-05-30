/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;


import br.mack.pi2.ejb.interfaces.LocalRemote;
import br.mack.pi2.jpa.Locais;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "locaisDAO", name = "locaisDAO")
public class LocaisBean implements LocalRemote {
   
    private Locais local;
    private List<Locais>localList;

    EntityManagerFactory  factory;
    
    EntityManager em;
   
    
     @Override
     public void setUp() {
        factory = Persistence.createEntityManagerFactory("Projeto_Ghost-ejbPU");
        em = factory.createEntityManager();
    }

    @Override
    public List<Locais> Carregar() {
        Query query = em.createQuery("SELECT e FROM Locais e");
        localList = (List<Locais>) query.getResultList();

        return localList;
    }

    /**
     * @return the local
     */
    public Locais getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(Locais local) {
        this.local = local;
    }
    
  
}
