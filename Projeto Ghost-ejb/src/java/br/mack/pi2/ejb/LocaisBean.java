/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.controller.LocalManager;
import br.mack.pi2.ejb.interfaces.LocalRemote;
import br.mack.pi2.jpa.Locais;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "locaisDAO", name = "locaisDAO")
public class LocaisBean implements LocalRemote {
    private Locais local;
    private List<Locais>localList;

    private LocalManager localManager;
    
    EntityManagerFactory  factory;
    
    @PersistenceContext EntityManager em;
     
   
     @Override
     public void setUp() {
        factory = Persistence.createEntityManagerFactory("Projeto_Ghost-ejbPU");
        em = factory.createEntityManager();
    }

    @Override
    public List<Locais> Carregar() {
        return localManager.getAllContacts(); //To change body of generated methods, choose Tools | Templates.
    }
    
  
}
