/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.controller;

import br.mack.pi2.ejb.interfaces.GenericDAO;
import br.mack.pi2.jpa.Infraestrutura;
import java.util.List;

/**
 *
 * @author alvarowf
 */
public class InfraEstruturaManager {
    
    private GenericDAO<Infraestrutura, Long> infraEstruturaDAO;
    
     public List<Infraestrutura>getAllInfraEstrutura(){
        return this.infraEstruturaDAO.getAll();
    }
    
    public Infraestrutura createInfraEstrutura(Infraestrutura infraEstrutura){
        return this.infraEstruturaDAO.create(infraEstrutura);
    }
    
    public Infraestrutura updateInfraEstrutura(Infraestrutura infraEstrutura){
        return this.infraEstruturaDAO.save(infraEstrutura);
    }
    
    public Infraestrutura findInfraEstrutura(Long id){
        return this.infraEstruturaDAO.findById(id);
    }
    
    public void deleteInfraEstrutura(Long id){
         this.infraEstruturaDAO.delete(findInfraEstrutura(id));
    }
    
    public List<Infraestrutura> findAllInfraEstrutura(){
        return this.infraEstruturaDAO.getAll();
    }
    
    public void setInfraEstruturaDAO(GenericDAO<Infraestrutura, Long> infraEstruturaDAO){
        this.infraEstruturaDAO = infraEstruturaDAO;
    }
}
