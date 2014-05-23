/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.controller;

import br.mack.pi2.ejb.interfaces.GenericDAO;
import br.mack.pi2.jpa.Locais;

import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;

/**
 *
 * @author 41180283
 */
public class LocalManager {
    
    private GenericDAO<Locais, Long>localDAO;
    
    public List<Locais>getAllContacts(){
        return this.localDAO.getAll();
    }
    
    public Locais createLocal(Locais local){
        return this.localDAO.create(local);
    }
    
    public Locais updateLocal(Locais local){
        return this.localDAO.save(local);
    }
    
    public Locais findLocal(Long id){
        return this.localDAO.findById(id);
    }
    
    public void deleteLocal(Long id){
         this.localDAO.delete(findLocal(id));
    }
    
    public List<Locais> findAllLocals(){
        return this.localDAO.getAll();
    }
    
    public void setLocalDAO(GenericDAO<Locais, Long> localDAO){
        this.localDAO = localDAO;
    }
    
}