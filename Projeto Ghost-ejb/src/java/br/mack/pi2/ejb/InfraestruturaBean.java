/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;


import br.mack.pi2.ejb.interfaces.InfraRemote;
import br.mack.pi2.jpa.Infraestrutura;
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
@Stateless (mappedName = "infraDAO", name = "infraDAO")
public class InfraestruturaBean implements InfraRemote {
    
    private Infraestrutura infraEstrutura;
    private List<Infraestrutura> infraEstruturaList;
    

    EntityManagerFactory  factory;
    
    
    EntityManager em;
   
        public String execute() throws Exception {
       
        return "*";
    }
    
    public String add(){
       
        return "*";
    }
    
    public String delete(){
        
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

 
    @Override
    public void setUp() {
        factory = Persistence.createEntityManagerFactory("Projeto_Ghost-ejbPU");
        em = factory.createEntityManager(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Infraestrutura> Carregar() {
    
      Query query = em.createQuery("SELECT e FROM Infraestrutura e");
      infraEstruturaList = (List<Infraestrutura>) query.getResultList();
        
      return infraEstruturaList ;
    }
}
