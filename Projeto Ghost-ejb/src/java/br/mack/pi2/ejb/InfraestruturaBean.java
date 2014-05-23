/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.controller.InfraEstruturaManager;
import br.mack.pi2.ejb.interfaces.InfraRemote;
import br.mack.pi2.jpa.Infraestrutura;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "infraDAO", name = "infraDAO")
public class InfraestruturaBean implements InfraRemote {
    
    private Infraestrutura infraEstrutura;
    private List<Infraestrutura> infraEstruturaList;
    private InfraEstruturaManager infraEstruturaManager;
    
    EntityManager entity;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
        public String execute() throws Exception {
        try {
            this.setInfraEstruturaList(getInfraEstruturaManager().findAllInfraEstrutura());
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return "*";
    }
    
    public String add(){
        try{
            infraEstruturaManager.createInfraEstrutura(getInfraEstrutura());
        } catch (Exception e){
            e.printStackTrace();
        }
        
        try{
            this.infraEstruturaList = infraEstruturaManager.findAllInfraEstrutura();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return "*";
    }
    
    public String delete(){
        try{
            infraEstruturaManager.deleteInfraEstrutura((long)infraEstrutura.getIdEstrutura());
        } catch(Exception e){
            e.printStackTrace();
        }
        return "*";
    }

    /**
     * @return the infraEstrutura
     */
    public Infraestrutura getInfraEstrutura() {
        return infraEstrutura;
    }

    /**
     * @param infraEstrutura the infraEstrutura to set
     */
    public void setInfraEstrutura(Infraestrutura infraEstrutura) {
        this.infraEstrutura = infraEstrutura;
    }

    /**
     * @return the infraEstruturaList
     */
    public List<Infraestrutura> getInfraEstruturaList() {
        return infraEstruturaList;
    }

    /**
     * @param infraEstruturaList the infraEstruturaList to set
     */
    public void setInfraEstruturaList(List<Infraestrutura> infraEstruturaList) {
        this.infraEstruturaList = infraEstruturaList;
    }

    /**
     * @return the infraEstruturaManager
     */
    public InfraEstruturaManager getInfraEstruturaManager() {
        return infraEstruturaManager;
    }

    /**
     * @param infraEstruturaManager the infraEstruturaManager to set
     */
    public void setInfraEstruturaManager(InfraEstruturaManager infraEstruturaManager) {
        this.infraEstruturaManager = infraEstruturaManager;
    }

    @Override
    public void setUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Infraestrutura> Carregar() {
        return this.infraEstruturaManager.getAllInfraEstrutura(); //To change body of generated methods, choose Tools | Templates.
    }
}
